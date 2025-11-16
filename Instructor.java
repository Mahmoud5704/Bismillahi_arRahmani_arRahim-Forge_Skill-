package courseService;

import java.util.*;

public class Instructor extends user {

    private List<String> createdCourses;

    public Instructor() {
        this.role = "instructor";
        createdCourses = new ArrayList<>();
    }

    public List<String> getCreatedCourses() { return createdCourses; }
}
