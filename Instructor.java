/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;
import java.util.List;
import java.io.*;
import java.util.*;
public class Instructor extends User {
    private String role = "instructor";
    private List <Course>  courses;

    public Instructor (int id,String name,String email,String pass,List <Course>  courses)
    {
        super(id,name,email,pass);
        this.courses =  new ArrayList<>(courses);

    }
    //************************************************************************//
    public String getRole()
    {
              return role;
    }
    public List<Course> getCourses()
    {
    return new ArrayList<>(courses); 
    }
    //************************************************************************//
    public void setCourses(List<Course> courses) 
    {
    this.courses = new ArrayList<>(courses);
    }

}
