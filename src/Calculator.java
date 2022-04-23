import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = FileReaderMy("D:\\Users\\ab270599zra\\Desktop\\input.txt");
        for (String str : arrayList) {
            stringBuilder.append(calcMisc(str) + "\n");
        }
        FileWriterMy("D:\\Users\\ab270599zra\\Desktop\\output.txt", stringBuilder.toString());
    }

    public static ArrayList<String> FileReaderMy(String filePath) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            arrayList.add(scanner.nextLine());
        }
        fileReader.close();
        return arrayList;
    }

    public static void FileWriterMy(String filePath, String str) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static String calcMisc(String str) {
        if (str.length() < 1) return "";
        String[] strF = str.split(" ");
        try {
            double first_num = Double.parseDouble(strF[0]);
            String type = String.valueOf(strF[1]);
            double second_num = Double.parseDouble(strF[2]);
            switch (type) {
                case "+":
                    return str + " = " + (first_num + second_num);
                case "-":
                    return str + " = " + (first_num - second_num);
                case "*":
                    return str + " = " + (first_num * second_num);
                case "/":
                    return str + " = " + (second_num != 0 ? first_num / second_num : "Error! Division by zero");
                default:
                    return str + " = " + "Operation Error!";
            }
        }
        catch (Exception e) {
            return str + " = " + "Error! Not number";
        }
    }
}