package at.campus.basics.forloop;
import java.util.Scanner;
import java.util.Random;
public class Training {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String name1 = "Alex";
        for (int i = 0; i < 2; i++) {
            System.out.println("Alex");
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        int salt1 = rnd.nextInt();
        for (int j = 0; j < name1.length(); j++) {
            System.out.println(name1.hashCode()+salt1);
        }
    }
}
