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
    
}
