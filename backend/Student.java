package backend;
import databaseservice.UserService;
import java.util.List;
import java.util.*;
public class Student extends User {
      private List<Course> courses;
      private List<progress> progressList;
      //**********************************************************************//
   public Student(String id, String name, String email, String pass,List<Course> courses, List<progress> progressList) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>(courses);
        this.progressList = progressList;
    }
   public Student(String id, String name, String email, String pass) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>();
        this.progressList = new ArrayList<>();
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