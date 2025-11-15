/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;

import java.util.List;
import java.io.*;
import java.util.*;
public class StudentService 
{
    private List <Student> studentlist;
    //************************************************************************//
    public StudentService(List<Student> studentlist)
    {
          this.studentlist = new ArrayList<>(studentlist);
    }
    //************************************************************************//
    public StudentService()
    {
        this.studentlist =  JSONDataBaseManager.readStudentsFromFile();
    }  
    //************************************************************************//
        public int studentEnrollment(Student s, Course c)
    {
       
        if (s.getCourses().contains(c))
            return 0;

        
        List<Course> currentCourses = s.getCourses();
        currentCourses.add(c);
        s.setCourses(currentCourses);

        
        List<Student> currentStudents = c.getStudents();
        currentStudents.add(s);
        c.setStudents(currentStudents);

        
        Map<Course, Map<Lesson, LessonStatus>> progress = s.getProgress();
        if (!progress.containsKey(c))
        {
            progress.put(c, new HashMap<>());
            s.setProgress(progress);
        }

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

    if (progress == null) 
        return 0;
    
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
