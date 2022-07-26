package BuilderPattern;

public class VehicleBuilderDesignPattern{

    private String name;
    private int price;
    private Boolean airbags;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public Boolean getAirbags() {
        return airbags;
    }

    private VehicleBuilderDesignPattern(VehicleBuilder vehicleBuilder){
        this.name = vehicleBuilder.name;
        this.price = vehicleBuilder.price;
        this.airbags = vehicleBuilder.airbags;
    }

    public static class VehicleBuilder{

        // name and price are the required parameters
        // but airbags is optional parameter
        private String name;
        private int price;
        private Boolean airbags;

        public VehicleBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public VehicleBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public VehicleBuilder setAirbags(Boolean airbags) {
            this.airbags = airbags;
            return this;
        }
        public VehicleBuilder() {}

        public VehicleBuilderDesignPattern build(){
            return new VehicleBuilderDesignPattern (this);
        }


    }
}




