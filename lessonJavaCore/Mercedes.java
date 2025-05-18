package lessonJavaCore;

public class Mercedes {
    public static void main(String[] args) {
        Car bmw =new Car();
        bmw.getColor("red");
        bmw.getModel("Bmw");
        bmw.getPrice("100ming $");
        bmw.getAutomatic("Avtoamat");

        Car malibu = new Car();
        malibu.getColor("green");
        malibu.getModel("malibu");
        malibu.getPrice("30ming $");
        malibu.getAutomatic("Avtoamat");
    }
}
