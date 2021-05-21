import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total=1;
        System.out.print("Taban: ");
        int x = in.nextInt();

        System.out.print("Üs: ");
        int y = in.nextInt();

        for (int i =y; i>0; i--){
            total*=x;
        }
        System.out.println(total);
    }
}
