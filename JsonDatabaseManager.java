package database;

import courseService.Courses;
import courseService.user;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.*;

public class JsonDatabaseManager {

    private static final String USERS_FILE = "users.json";
    private static final String COURSES_FILE = "courses.json";

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    private List<user> users;
    private List<Courses> courses;

    public JsonDatabaseManager() {
        loadUsers();
        loadCourses();
    }

    //goz2 el users: (El students w el instructors)

    private void loadUsers() {
        try {
            File f = new File(USERS_FILE);
            if (!f.exists()) {
                users = new ArrayList<>();
                return;
            }
            Reader r = new FileReader(f);
            users = gson.fromJson(r, new TypeToken<List<user>>() {}.getType());
            r.close();
        } catch (Exception e) {
            users = new ArrayList<>();
        }
    }

    public void saveUsers() {
        try {
            Writer w = new FileWriter(USERS_FILE);
            gson.toJson(users, w);
            w.close();
        } catch (Exception e) {}
    }

    public void addUser(user u) {
        users.add(u);
        saveUsers();
    }

    public user findUserByEmail(String email) {
        for (user u : users)
            if (u.getEmail().equals(email))
                return u;
        return null;
    }

    //goz2 el courses:

    private void loadCourses() {
        try {
            File f = new File(COURSES_FILE);
            if (!f.exists()) {
                courses = new ArrayList<>();
                return;
            }
            Reader r = new FileReader(f);
            Courses[] arr = gson.fromJson(r, Courses[].class);
            courses = new ArrayList<>(Arrays.asList(arr));
            r.close();
        } catch (Exception e) {
            courses = new ArrayList<>();
        }
    }

    public void saveCourses() {
        try {
            Writer w = new FileWriter(COURSES_FILE);
            gson.toJson(courses, w);
            w.close();
        } catch (Exception e) {}
    }

    public List<Courses> getCourses() { return courses; }
}
