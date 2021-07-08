package com.mycompany.school;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Student jad = new Student();
        jad.setName("Jad Abou Zeid");
        jad.setPhone("71890870");
        jad.setEmail("jad.abzd01@gmail.com");
        jad.setSection("CCE");
        jad.setClassName("Room B - 4th floor");
        
        Teacher nadim = new Teacher();
        nadim.setName("Nadim Henoud");
        nadim.setPhone("03123456");
        nadim.setEmail("nadim@gmail.com");
        nadim.setSalary(2000);
        nadim.setHiringDate("1-1-2020");
        
        Teacher toufic = new Teacher();
        toufic.setName("Toufic Fakhry");
        toufic.setPhone("03456789");
        toufic.setEmail("toufic@outlook.com");
        toufic.setSalary(1513.651);
        toufic.setHiringDate("1-2-2021");
        
        Database.addMember(nadim);
        Database.addMember(toufic);
        Database.addMember(jad);
        
        System.out.println("Enter a phone number to search for school members: ");
        Scanner scan = new Scanner(System.in);
        String phone = scan.nextLine();
        Database.searchMember(phone);
    } 
}
