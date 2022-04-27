package danhba;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileDocGhi {
    public static void writerToFile( List<PhoneDirectory> phoneNumberList) throws IOException {
    File file = new File("Test1.csv");
    FileWriter writer = new FileWriter(file,true);
        PrintWriter printWriter = new PrintWriter(writer);
        String str = "";
        for (PhoneDirectory i: phoneNumberList) {
            str += i.getName() + "," + i.getAddress()+","+ i.getEmail()+","+ i.getFacebook()+","+ i.getSex()+"," + i.getGroup()+","+ i.getBirdth()+","+ i.getPhoneNumber() + "\n";
        }
        printWriter.write(str);
        printWriter.close();

    }
    public static void readFromFile(List<PhoneDirectory> phoneNumberList) throws IOException {
        File file1 = new File("Test1.csv");

        Scanner scanner = new Scanner(file1);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }
}
