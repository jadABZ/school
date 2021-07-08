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
                ViewSchoolMembers.viewMember(m.getName(), m.getPhone(), m.getEmail());
                
                if(m instanceof Student)
                {
                    Student s = (Student) m;
                    ViewSchoolMembers.viewStudent(s.getClassName(), s.getSection());
                }
                
                if(m instanceof Teacher)
                {
                    Teacher t = (Teacher) m;
                    ViewSchoolMembers.viewTeacher(t.getSalary(), t.getHiringDate());
                }
                
                return;
            }    
        }
        
        System.out.println("Phone number does not belong to any existing member");
    }
}
