/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;

import java.util.List;
import java.io.*;
import java.util.*;
public class Student extends User {
      private String role = "Student";
      private List <Course>  courses;
      private List<progress> progressList;
      //**********************************************************************//
   public Student(int id, String name, String email, String pass,List<Course> courses, List<progress> progressList) 
    {
        super(id, name, email, pass);
        this.courses =  new ArrayList<>(courses);
        this.progressList = progressList;
    }  
    
    public String getRole()
    {
              return role;
    }
    public List<Course> getCourses()
    {
    return new ArrayList<>(courses); 
    }
    
    public void setCourses(List<Course> courses) 
    {
    this.courses =  new ArrayList<>(courses);
    }   
    public  List<progress> getProgress() 
    {
    return  progressList;
    }
    public void setProgress( List<progress> progressList) 
    {
    this.progressList =  progressList;
}
}