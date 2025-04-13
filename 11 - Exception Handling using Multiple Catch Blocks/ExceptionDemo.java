import java.util.*;

public class ExceptionDemo {
    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("\nPLEASE ENTER TWO NUMBER FOR DIVISION : ");
        a = in.nextInt();
        b = in.nextInt();
        try {
            System.out.println("I AM IN TRY BLOCK 1");
            c = a / b;
            System.out.println("\nDIVISION OF TWO NUMBER IS : " + c);
        } catch (InputMismatchException e) {
            System.out.println("\nI AM IN CATCH BLOCK 1");
            System.out.println("\n CHECK INPUT \n");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("\nI AM IN CATCH BLOCK 1");
            System.out.println("\nDIVISION BY ZERO IS NOT POSSIBLE\n");
            System.out.println(e);
        }
        System.out.println("\nEND OF ARITHMETIC EXCEPTION CONCEPT");
        in.close();
    }
}
