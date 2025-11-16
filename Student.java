package courseService;

import java.util.*;

public class Student extends user {

    private List<String> enrolledCourses;
    private Map<String, List<String>> progress;

    public Student() {
        this.role = "student";
        enrolledCourses = new ArrayList<>();
        progress = new HashMap<>();
    }

    public List<String> getEnrolledCourses() { return enrolledCourses; }
    public Map<String, List<String>> getProgress() { return progress; }
}
