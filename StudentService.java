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
   
    if (!s.getCourses().contains(c)) {
        return 0;
    }

    
    progress courseProgress = s.getProgressForCourse(c.getCourseId());
    if (courseProgress == null) {
        return 0;
    }

   
    courseProgress.completeLesson(l.getLessonId());

    
    JSONDataBaseManager.updateStudent(s);

    return 1;
}
 //***************************************************************************//
public double getCourseProgressPercentage(Student s, Course c) 
{
 
    if (!s.getCourses().contains(c)) {
        return 0.0;
    }


    progress courseProgress = s.getProgressForCourse(c.getCourseId());

    if (courseProgress == null) {
        return 0.0;
    }

 
    int totalLessons = c.getLessons().size();
    if (totalLessons == 0) {
        return 0.0;
    }

    
    int completed = courseProgress.getCompletedCount();

 
    return (completed * 100.0) / totalLessons;
}
//****************************************************************************//
    
    public Course getCourseById(Student s,int courseId) {
        for (Course c : s.getCourses()) {
            if (c.getCourseId == courseId) {  
                return c;
            }
        }
    
    return null; 
    
    
    
    
}
    public List<Course> getAllAvailableCourses() {
    List<Course> courses = JSONDataBaseManager.readCoursesFromFile();

    if (courses == null)
        return new ArrayList<>();
    
    
    return new ArrayList<>(courses);
}
    
     public Course getCoursebyid(int courseId) {
        List<Course> courses = JSONDataBaseManager.readCoursesFromFile(); 
        for (Course c : courses) {
            if (c.getCourseId() == courseId) {  
                return c;
            }
        }
    
    return null; 
    
    
    
    
}   
    
    


}
