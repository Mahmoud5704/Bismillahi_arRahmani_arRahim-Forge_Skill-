package coursemanagement;

import courseService.Lesson;
import courseService.Courses;
import database.JsonDatabaseManager;
import java.util.*;

public class courseManagement {

    private JsonDatabaseManager db;

    public courseManagement(JsonDatabaseManager db) {
        this.db = db;
    }

    // Instructor creates a course
    public void createCourse(Courses c) {
        db.getCourses().add(c);
        db.saveCourses();
    }

    public void editCourse(String courseId, String title, String description) {
        for (Courses c : db.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                c.setTitle(title);
                c.setDescription(description);
                db.saveCourses();
                return;
            }
        }
    }

    public void addLesson(String courseId, Lesson l) {
        for (Courses c : db.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                c.getLessons().add(l);
                db.saveCourses();
                return;
            }
        }
    }

    public List<Lesson> getLessonsByCourse(String courseId) {
        for (Courses c : db.getCourses())
            if (c.getCourseId().equals(courseId))
                return c.getLessons();
        return new ArrayList<>();
    }

    public void enrollStudent(String courseId, String studentId) {
        for (Courses c : db.getCourses()) {
            if (c.getCourseId().equals(courseId)) {
                if (!c.getStudents().contains(studentId)) {
                    c.getStudents().add(studentId);
                    db.saveCourses();
                }
                return;
            }
        }
    }
}
