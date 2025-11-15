/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;

/**
 *
 * @author 20115
 */
public class Student {
      private String role = "Student";
      private List <Course>  courses;
      private Map<Course, Map<Lesson, LessonStatus>> progress;
      //**********************************************************************//
    public Student(int id, String name, String email, String pass,List <Course>  courses,(Map<Course, Map<Lesson, LessonStatus>> progress)) 
    {
        super(id, name, email, pass);
        this.courses = courses;
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
    this.courses = courses;
    }   
    public Map<Course, Map<Lesson, LessonStatus>> getProgress() 
    {
    return new HashMap<>(progress);
    }
    public void setProgress(Map<Course, Map<Lesson, LessonStatus>> progress) 
    {
    this.progress = new HashMap<>(progress);
}

/*   
    public int enrollcourse (Student s,Course c)
    {
        for(int i=0;i<courses.size(),i++)
        {
            if(courses.get(i).equel(c))
                return 0;
        }
        
        List datacourses =  JSONDataBaseManager.courses;
        
        for(int i=0; i<datacourses.size();i++)
        {
            if(datacourses.get(i).equel(c))
            {
                datacourses.get(i).students.add(s);
                s.courses.add(datacourses.get(i));
                
                JSONDataBaseManager.updateCourse(datacourses.get(i));
                JSONDataBaseManager.updateUser(s);
                return 1;
            }
        }
        return 0;
        
    }
    
    public void accessLesson (Student s,Course c,Lesson l)
    {
        
    Map<Lesson, LessonStatus> courseProgress = s.getProgress().get(c);
    if (courseProgress.get(l) == LessonStatus.NOT_STARTED) 
    {
        courseProgress.put(l, LessonStatus.IN_PROGRESS);
    }  
    JSONDataBaseManager.updateUser(s);
    
    }*/
}