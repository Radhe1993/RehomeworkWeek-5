package homework;
/**
 * Created by Jay Vaghani
 */
import java.util.Locale;
import java.util.Scanner;


;

public class Main
{
    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please first number : ");//input wizard
            int a = scanner.nextInt();
            System.out.println("Please second number :");//input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbole +,-,*,/ : ");// input wizard
            char symbol = scanner.next().charAt(0);
            Program_1 obj = new Program_1();
            obj.calculate(a,b,symbol);
            System.out.println("Would you like to do more calculation please enter ");//input wizard
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while(answer.startsWith("Y"));
        //closing a obj object
        scanner.close();
    }
}
