public class StringFormatApp {
    public static void main(String[] args) {
        String name = (args[0]);
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        System.out.printf("name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);
        double spaceheight = height * 1.023;
        System.out.printf("My space height would be %.1fcm%n", spaceheight);
        double marsage = age / 1.88;
        System.out.printf("On Mars I would be approximately %.0f years old.%n", marsage);
    }
}
