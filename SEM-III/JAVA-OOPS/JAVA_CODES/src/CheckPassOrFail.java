/* CHECKING PASS OR FAIL WITH CONDITIONALS =>
   1. Prompt the user to enter his marks in the range of 0-100.
   2. Accept the marks obtained by the user.
   3. Compare the marks obtained using a conditional.
   4. If marks obtained >=35, print a message “You passed”.
   5. If marks obtained <35, print a message “You.  */

import java.util.Scanner;

public class CheckPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS(0-100) : ");
        int marks;
        marks = sc.nextInt();
        if (marks >= 35){
            System.out.println("YOU PASSED !");
        }
        else{
            System.out.println("YOU FAILED !");
        }
        sc.close();
    }
}
