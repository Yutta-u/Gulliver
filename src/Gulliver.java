import java.util.Scanner;

public class Gulliver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int w = scan.nextInt();

        int h = k *k;
        System.out.println(h * w);
    }
}
