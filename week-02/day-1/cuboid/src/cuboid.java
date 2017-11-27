public class cuboid {
    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 10;

        double area = 2 * (a*b + b*c + a*c);
        double volume = a * b * c;
        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
