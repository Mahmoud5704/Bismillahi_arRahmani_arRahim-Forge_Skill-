package backend;

import databaseservice.JsonDataBaseManager;
import java.util.*;

public class courseManagement {

    public void createCourse(Course c) {
        JsonDataBaseManager.getCourses().add(c);
        JsonDataBaseManager.addCourse(c);
    }

    public void editCourse(String courseId, String title, String description) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                c.setTitle(title);
                c.setDescription(description);
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }

    public void addLesson(String courseId, Lesson l) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                c.getLessons().add(l);
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }

    public void editLesson(String courseId, String lessonId, String newTitle, String newContent, List<String> newResources) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                Lesson l = c.getLessonById(lessonId); 
                if (l != null) {
                    l.setTitle(newTitle);
                    l.setContent(newContent);
                    l.setResources(newResources);
                    JsonDataBaseManager.updateCourse(c);
                }
                return;
            }
        }
    }

    public List<Course> getCoursesByInstructor(String instructorId) {
        List<Course> instructorCourses = new ArrayList<>();
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getInstructorId().equals(instructorId)) {
                instructorCourses.add(c);
            }
        }
        return instructorCourses;
    }

    public List<Lesson> getLessonsByCourse(String courseId) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                return c.getLessons();
            }
        }
        return new ArrayList<>();
    }

    public void enrollStudent(String courseId, String studentId) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                if (!c.getStudents().contains(studentId)) {
                    c.getStudents().add(studentId);
                    JsonDataBaseManager.updateCourse(c);
                }
                return;
            }
        }
    }
}
