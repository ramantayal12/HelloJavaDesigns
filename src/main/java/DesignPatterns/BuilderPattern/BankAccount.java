package DesignPatterns.BuilderPattern;

/**
 * When the complexity of creating object increases,
 * the Builder pattern can separate out the instantiation process by using another object
 * (a builder) to construct the object.
 */
public class BankAccount {

    private final String name;
    private final int price;
    private final Boolean airbags;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public Boolean getAirbags() {
        return airbags;
    }

    // Private constructor to create a Vehicle object using the VehicleBuilder
    private BankAccount(BankAccountBuilder bankAccountBuilder){
        this.name = bankAccountBuilder.name;
        this.price = bankAccountBuilder.price;
        this.airbags = bankAccountBuilder.airbags;
    }

    public static class BankAccountBuilder {

        private String name;
        private int price;
        private Boolean airbags;

        public BankAccountBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BankAccountBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public BankAccountBuilder setAirbags(Boolean airbags) {
            this.airbags = airbags;
            return this;
        }
        public BankAccountBuilder() {}

        // Build the BankAccount object
        public BankAccount build(){
            return new BankAccount(this);
        }


    }
}




