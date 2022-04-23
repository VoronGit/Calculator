import java.util.Scanner;
import java.io.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strF = str.split(" ");
        try {
            double first_num = Double.parseDouble(strF[0]);
            String type = String.valueOf(strF[1]);
            double second_num = Double.parseDouble(strF[2]);
            if (type.equals("+")) {
                System.out.print(first_num + second_num);
            } else if (type.equals("-")) {
                System.out.print(first_num - second_num);
            } else if (type.equals("*")) {
                System.out.print(first_num * second_num);
            } else if (type.equals("/")) {
                System.out.print(second_num != 0 ? first_num / second_num : "Error! Division by zero");
            } else {
                System.out.print("Operation Error!");
            }
        }
        catch (Exception e) {
            System.out.print("Error! Not number");
        }
    }
}