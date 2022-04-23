import java.util.Scanner;
import java.io.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        String str = FileReaderMy("D:\\Users\\ab270599zra\\Desktop\\input.txt");
        String[] strF = str.split(" ");
        try {
            double first_num = Double.parseDouble(strF[0]);
            String type = String.valueOf(strF[1]);
            double second_num = Double.parseDouble(strF[2]);
            switch (type) {
                case "+":
                    FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", String.valueOf(first_num + second_num));
                    break;
                case "-":
                    FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", String.valueOf(first_num - second_num));
                    break;
                case "*":
                    FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", String.valueOf(first_num * second_num));
                    break;
                case "/":
                    FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", String.valueOf(second_num != 0 ? first_num / second_num : "Error! Division by zero"));
                    break;
                default:
                    FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", "Operation Error!");
                    break;
            }
        }
        catch (Exception e) {
            FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", "Error! Not number");
        }
    }

    public static String FileReaderMy(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        return scanner.nextLine();
    }

    public static void FileWriterMy(String filePath, String str) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(str);
    }
}