import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pyramid_type = sc.nextInt();
        int keyboard_length = sc.nextInt();
        int number_of_moves = sc.nextInt();

        int result = 0;
        int previous = 0;

        switch (pyramid_type) {
            case 1:
                for (int i = 0; i < number_of_moves; i++) {
                    int key = sc.nextInt();
                    result += Math.abs(previous - key);
                    previous = key;
                }

                break;
            case 2:
                for (int i = 0; i < number_of_moves; i++) {
                    int key = sc.nextInt();
                    int x1 = key % keyboard_length;
                    int y1 = key / keyboard_length;

                    int x2 = previous % keyboard_length;
                    int y2 = previous / keyboard_length;

                    result += Math.abs(x2 - x1) + Math.abs(y2 - y1);
                    previous = key;
                }

                break;
        }

        System.out.println(result);
        sc.close();
    }
}