package backend;
import java.util.*;

public class courseManagement {
    
    // Instructor creates a course
    public void createCourse(Course c) {
        JsonDataBaseManager.getCourses().add(c);
        JsonDataBaseManager.addCourse(c);
    }

    public void editCourse(String courseId, String title, String description) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                c.setTitle(title);
                c.setDescription(description);
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }

    public void addLesson(String courseId, Lesson l) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                c.getLessons().add(l);
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }

    public List<Lesson> getLessonsByCourse(String courseId) {
        for (Course c : JsonDataBaseManager.getCourses())
            if (c.getCourseId().equals(courseId))
                return c.getLessons();
        return new ArrayList<>();
    }

    public void enrollStudent(String courseId, String studentId) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                if (!c.getStudents().contains(studentId)) {
                    c.getStudents().add(studentId);
                    JsonDataBaseManager.updateCourse(c);
                }
                return;
            }
        }
    }
}
