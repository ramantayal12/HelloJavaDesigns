public class BuilderPatternDriver {

    public static void main(String[] args ){

        VehicleBuilderDesignPattern vehicle = new VehicleBuilderDesignPattern
                .VehicleBuilder ("Car", 1000 )
                .setAirbags (true)
                .build ();
    }
}
