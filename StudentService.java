/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;

/**
 *
 * @author 20115
 */
public class StudentService 
{
    private List <Student> studentlist;
    //************************************************************************//
    public StudentService(List <Student> studentlist)
    {
          this.studentlist = new ArrayList<>(studentlist);
    }
    //************************************************************************//
    public StudentService()
    {
        this.studentlist =  JSONDataBaseManager.readStudentsFromFile();
    }  
    //************************************************************************//
    public int studentEnrollment(Student s,Course c)
    {
        if(s.getCourses().contains(c))
            return 0;
        s.courses.add(c);
        
        c.students.add(s);
        
        JSONDataBaseManager.updateStudent(s);
        JSONDataBaseManager.updateCourses(c);
        return 1;
    }
    //************************************************************************//
    public int lessonAccess(Student s, Course c, Lesson l)
{
    
    if (!s.getCourses().contains(c)) 
    {
        return 0;
    }

   
    Map<Course, Map<Lesson, LessonStatus>> progress = s.getProgress();

  
    Map<Lesson, LessonStatus> lessonMap = progress.get(c);

    if (lessonMap == null || !lessonMap.containsKey(l)) {
        return 0; 
    }

  
    lessonMap.put(l, LessonStatus.VIEWED);
    
    s.setProgress(progress);
    
    JSONDataBaseManager.updateStudent(s);
    
    return 1;  
}

}
