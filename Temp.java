import java.util.*;;

public class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int B = scan.nextInt();
        int w = scan.nextInt();
        int i = scan.nextInt();
        int r = scan.nextInt();
        int j = scan.nextInt();

        System.out.println(B + w * (i + r * j));
    }
}
