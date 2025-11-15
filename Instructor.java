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
        this.courses = courses;

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
    this.courses = courses;
    }
    /*
   
    public void createCourse(Course c)
    {
        JSONDataBaseManager.addCourse(c)
    }
    public void updateCourse(Course updatedc)
    {
        JSONDataBaseManager.updateCourse(updatedc);
    } 
  
    public void deleteLesson(Course c,Lesson l)
    {
        JSONDataBaseManager.removeLesson(c,l);
    }
    public void createLesson(Course c,Lesson l)
    {
        JSONDataBaseManager.addLesson(c,l);
    }
    public void updateLesson(Course c,Lesson updatedl)
    {
        JSONDataBaseManager.updateLesson(c,updatedl);
    }      
    
    public String viewEnrolledStudents()
    {
        String view = "";
        for(int i=0;i<courses.size();i++)
        {
            view = view + "\n" + "the Students in" + courses.get(i).getCourseName() +"course are";
            List<Student>  students=courses.get(i).students;
            for(int j=0;j<students.size();j++)
                    view = view + " " + students.get(j).getUsername();
        }
        return view;
    }*/
}
