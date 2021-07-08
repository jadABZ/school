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
}
