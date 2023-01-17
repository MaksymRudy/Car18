public class Main {
    public static void main(String[] args) {

        Car18 Zaporozhets1 = new Car18 ();
        Car18 Zaporozhets2 = new Car18 ();

        System.out.println(Zaporozhets1 .getAge());
        System.out.println(Zaporozhets1.calculateIndex());
        System.out.println(Zaporozhets2.power);
        System.out.println(Zaporozhets2.upgradePower(75));
        System.out.println(Zaporozhets2.calculateIndex());
    }
}