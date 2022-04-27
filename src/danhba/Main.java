package danhba;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DirectoryManage directoryManage1 = new DirectoryManage();

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("<-------------Menu-------------->");
            System.out.println("1.Display");
            System.out.println("2.add");
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            System.out.println("5.Find");
            System.out.println("6.Write to file");
            System.out.println("7.Read from file");
            System.out.println("8.Exit");
            System.out.println("Enter your choice: ");
            do {
                if (choice < 1 || choice > 8) {
                    System.out.println("SOS!!!!Không có lựa chọn này, Mời nhập lựa chọn khác: ");
                }
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Only EnterNumber: ");
                    sc.nextLine();
                    choice = -1;
                }
            } while (choice < 1 || choice > 8);

            if (choice == 1) {
                directoryManage1.display();
            }
            if (choice == 2) {
                System.out.println("Enter name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                System.out.println("Enter Facebook: ");
                String facebook = sc.nextLine();
                System.out.println("Enter sex: ");
                String sex = sc.nextLine();
                System.out.println("Group: ");
                String group = sc.nextLine();
                System.out.println("Enter birdth: ");
                String birdth = sc.nextLine();
                System.out.println("Enter phonenumber:");
                int phonenumber = sc.nextInt();
                PhoneDirectory phoneDirectory = new PhoneDirectory(name, address, email, facebook, sex, group, birdth, phonenumber);
                directoryManage1.add(phoneDirectory);
                System.out.println("Add Sucessfull");
            }

            if (choice == 3) {
                System.out.println("Enter phonenumber need edit");
                int phonenumber1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                System.out.println("Enter Facebook: ");
                String facebook = sc.nextLine();
                System.out.println("Enter sex: ");
                String sex = sc.nextLine();
                System.out.println("Group: ");
                String group = sc.nextLine();
                System.out.println("Enter birdth: ");
                String birdth = sc.nextLine();
                System.out.println("Enter phonenumber:");
                int phonenumber = sc.nextInt();
                PhoneDirectory sosua = new PhoneDirectory(name, address, email, facebook, sex, group, birdth, phonenumber);
                directoryManage1.edit(phonenumber1, sosua);
            }
            if (choice == 4) {
                System.out.println("Enter phonenumber need remove");
                int so = sc.nextInt();
                directoryManage1.delete(so);
            }
            if (choice == 5) {
                System.out.println("Enter phonenumber need find");
                int so = sc.nextInt();
                directoryManage1.findByPhoneNumber(so);
            }

            if (choice == 6) {
                FileDocGhi.writerToFile(directoryManage1.phoneNumberList);
            }
            if (choice == 7) {
                FileDocGhi.readFromFile(directoryManage1.phoneNumberList);
            }
        } while (choice != 8);
    }
}
