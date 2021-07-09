package com.mycompany.school;

public class Teacher extends SchoolMember 
{
    private double salary;
    private String hiringDate;
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public void setHiringDate(String hiringDate)
    {
        this.hiringDate = hiringDate;
    }
    
    public String getHiringDate()
    {
        return this.hiringDate;
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Status: Teacher");
        System.out.println("Salary: " + salary + "$");
        System.out.println("Hiring Date: " + hiringDate);
    }
    
}
