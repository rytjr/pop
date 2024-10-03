import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        int count = 1;

        for(int i = 1; i < Num + 1; i++) {
            count *= i;
        }

        System.out.print(count);
    }

}