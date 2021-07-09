package com.mycompany.school;

public class Student extends SchoolMember
{
    private String className, section;
    
    public void setClassName(String className)
    {
        this.className = className;
    }
    
    public void setSection(String section)
    {
        this.section = section;
    }
    
    public String getClassName()
    {
        return this.className;
    }
    
    public String getSection()
    {
        return this.section;
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Status: Student");
        System.out.println("Class: " + className);
        System.out.println("Section: " + section);
    }
}
