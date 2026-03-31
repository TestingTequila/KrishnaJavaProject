package day7;

public class TestCar
{
    public static void main(String[] args) {

        System.out.println("===================CAR1==============================");
        Car car1= new Car();
        car1.brandName = "Dodge";
        car1.modelName = "DodgeXUV300";
        car1.color = "Red";
        car1.price = 350000;
        car1.isAutomatic = true;

        System.out.println("Brand Name: " + car1.brandName);
        System.out.println("Model Name: " + car1.modelName);
        System.out.println("Color: " + car1.color);
        System.out.println("Price: " + car1.price);
        System.out.println("Is Automatic: " + car1.isAutomatic);

        System.out.println("===================CAR2==============================");

        Car car2= new Car();
        car2.brandName = "Jeep";
        car2.modelName = "JeepX5T";
        car2.color = "Black";
        car2.price = 245000;
        car2.isAutomatic = false;

        System.out.println("Brand Name: " + car2.brandName);
        System.out.println("Model Name: " + car2.modelName);
        System.out.println("Color: " + car2.color);
        System.out.println("Price: " + car2.price);
        System.out.println("Is Automatic: " + car2.isAutomatic);


    }
}
