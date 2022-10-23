public class testJava {
    static Car c1 = new Car(2.0,30);
    static Car c2 = new Car(10.0,100);

    public static void main(String[] args) {
        c1.fillUp(30);
        c2.fillUp(100);

        c1.drive(75);
        c2.drive(670);

        System.out.println(c1.getGasLevel());
        System.out.println(c2.getGasLevel());
    }
}
