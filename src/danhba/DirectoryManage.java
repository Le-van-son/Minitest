package danhba;

import java.util.ArrayList;
import java.util.List;

public class DirectoryManage{
    List<PhoneDirectory>phoneNumberList = new ArrayList<>();
    public void display(){
        for (int i = 0; i < this.phoneNumberList.size(); i++) {
            System.out.println(this.phoneNumberList.get(i));
        }
    }
    public void add(PhoneDirectory phoneNumber){
        phoneNumberList.add(phoneNumber);
    }
    public int search(int phoneNumber){
        for (int i = 0; i < this.phoneNumberList.size(); i++) {
            if (this.phoneNumberList.get(i).getPhoneNumber()==phoneNumber){
                return i;
            }
        }return -1;
    }
    public void edit(int phoneNumber, PhoneDirectory phoneDirectory){
       int indexOf = search(phoneNumber);
       if (indexOf == -1){
           System.out.println("ko có");
       }else {
           phoneNumberList.set(indexOf,phoneDirectory);
       }
    }
    public void delete(int phoneNumber){
        for (int i = 0; i < this.phoneNumberList.size(); i++) {
            if (search(phoneNumber)!= -1){
                phoneNumberList.remove(search(phoneNumber));
            }else
                System.out.println("Không có");
        }
    }
    public void findByPhoneNumber(int phoneNumber){
        for (int i = 0; i < this.phoneNumberList.size(); i++) {
            if (this.phoneNumberList.get(i).getPhoneNumber()==phoneNumber){
                System.out.println(phoneNumberList.get(i));
            }
        }
    }

}
