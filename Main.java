import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double he = sc.nextDouble();
        double we = sc.nextDouble();
        double b = we/(he * he);
        System.out.println(Math.round(b * 100)/100.0);
    }
}
