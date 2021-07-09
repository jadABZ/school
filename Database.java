package com.mycompany.school;
import java.util.ArrayList;

public class Database 
{
    public static ArrayList<SchoolMember> schoolMembers = new ArrayList<>();
    
    public static void addMember(SchoolMember newMember)
    {
        for(SchoolMember i : schoolMembers)
            if(newMember.getPhone().equals(i.getPhone()))
                throw new ArithmeticException("This phone number already exists");
        
        schoolMembers.add(newMember);
    }
    
    public static void removeMember(SchoolMember firedMember)
    {
        schoolMembers.remove(firedMember);
    }
    
    public static void searchMember(String phone)
    {
        for(SchoolMember m : schoolMembers)
        {
            if(phone.equals(m.getPhone()))
            {
                m.printInfo();
                return;
            } 
        }
        
        System.out.println("Phone number does not belong to any existing member");
    }
}

