package lessonJavaCore;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting; ");
       int a= scanner.nextInt();
       if (a%2==0) {
           System.out.println(a+" Sonimiz juft son!");
       }else {
           System.out.println(a+" Sonimiz toq son!");
       }
//       if (a<100) {
//           System.out.println("Sonimiz 100 da kichik");
//       }else {
//           System.out.println("Sonimiz 100 da katta");
       }
    }

