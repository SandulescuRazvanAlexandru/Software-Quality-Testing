public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 1);
        Rezervare rezervare2 = new Rezervare(2, 1);
        Rezervare rezervare3 = new Rezervare(3, 1);

        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

        flyWeightFactory.getClient("123456").printeaza(rezervare1);
        flyWeightFactory.getClient("987654").printeaza(rezervare2);
        flyWeightFactory.getClient("123456").printeaza(rezervare3);
    }
}