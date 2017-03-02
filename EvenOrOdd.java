import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //User input request
         System.out.print("Type a number:");
         int a = reader.nextInt();
        
        //"Algorithm"
         int sum = a%2;

        //Return
         if (sum == 0) {
             System.out.println ("Number " + a + " is even");
         } else {
             System.out.println ("Number " + a + " is odd");
         }
    }
}
