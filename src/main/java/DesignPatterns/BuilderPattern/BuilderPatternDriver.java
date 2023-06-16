package DesignPatterns.BuilderPattern;

public class BuilderPatternDriver {

    public static void main(String[] args ){

        VehicleBuilderDesignPattern vehicle = new VehicleBuilderDesignPattern
            .VehicleBuilder()
            .setAirbags(true)
            .setPrice(200)
            .setName("BuilderPattern.car")
            .build();
    }
}
