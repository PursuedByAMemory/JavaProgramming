public class Car {
    private String make;
    private String model;
    private String color;
    private boolean convertible;

    public void describeCar(){
        System.out.println("Make" + make + "Model" + model +
                "color"+ color+"convertible"+convertible);
    }

    public static void main(String[] args){
        Car c = new Car();
        c.describeCar();
        c.make = "Porsche";
        c.model = "Carrera";
    }
}
