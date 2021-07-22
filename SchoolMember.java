package com.mycompany.school;

public abstract class SchoolMember 
{
    private String name, email, phone;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public abstract void printInfo();
}
