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
      private Map<Course, Map<Lesson, LessonStatus>> progress;
      //**********************************************************************//
   public Student(int id, String name, String email, String pass,List<Course> courses,Map<Course, Map<Lesson, LessonStatus>> progress) 
    {
        super(id, name, email, pass);
        this.courses =  new ArrayList<>(courses);
        this.progress = progress;
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
    public Map<Course, Map<Lesson, LessonStatus>> getProgress() 
    {
    return new HashMap<>(progress);
    }
    public void setProgress(Map<Course, Map<Lesson, LessonStatus>> progress) 
    {
    this.progress = new HashMap<>(progress);
}
}