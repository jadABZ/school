package com.mycompany.school;

public class ViewSchoolMembers 
{
    public static void viewMember(String name, String phone, String email)
    {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
    
    public static void viewStudent(String className, String section)
    {
        System.out.println("Status: Student");
        System.out.println("Class: " + className);
        System.out.println("Section: " + section);
    }
    
    public static void viewTeacher(double salary, String hiringDate)
    {
        System.out.println("Status: Teacher");
        System.out.println("Salary: " + salary + "$");
        System.out.println("Hiring Date: " + hiringDate);
    }
}
