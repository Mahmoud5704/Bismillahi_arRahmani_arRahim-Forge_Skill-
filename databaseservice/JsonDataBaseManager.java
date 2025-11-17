package databaseservice;
import backend.Course;
import backend.Instructor;
import backend.Lesson;
import backend.Student;
import backend.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class JsonDataBaseManager {
    private static List<User> users = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static final String USERJSON_PATH = "users.json";
    private static final String COURSEJSON_PATH = "courses.json";
    public static final String MAIN_PATH = "src/img/main.png";
    public static final String LOGIN_PATH = "src/img/login.jpeg";
    public static final String INSTRUCTOR_PATH = "src/img/Instructor.jpg";
    
    private static Gson getGSON(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder = gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson;
    }
    private static void readUsers(){
        Gson gson = getGSON();
        users = new ArrayList<>();
        String json = "";
        try (Scanner fscanner = new Scanner(new File(USERJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            return;
        }
        JsonElement jelement = JsonParser.parseString(json);
        JsonArray jarray = jelement.getAsJsonArray();
        for(int i = 0; i < jarray.size(); i++){
            JsonObject jobj = jarray.get(i).getAsJsonObject();
            String role = jobj.get("role").getAsString();
            if(role.equals(UserService.StudentRole))
                users.add(gson.fromJson(jobj, Student.class));
            else if(role.equals(UserService.InstructorRole))
                users.add(gson.fromJson(jobj, Instructor.class));
        }
    }
    private static void readCourses(){
        Gson gson = getGSON();
        String json = "";
        courses = new ArrayList<>();
        try (Scanner fscanner = new Scanner(new File(COURSEJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            return;
        }
        Course[] userArray = gson.fromJson(json, Course[].class);
        courses = new ArrayList<>(Arrays.asList(userArray));
    }
    public static void saveCourses(){
        Gson gson = getGSON();
        String json = gson.toJson(courses);
        System.out.println(json);
        try (FileWriter fwriter = new FileWriter(COURSEJSON_PATH)) {
            fwriter.write(json);
        } catch (IOException e) {
            System.out.println("IO exception found!");
        }
    }
    private static void saveUsers(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder = gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        String json = gson.toJson(users);
        System.out.println(json);
        
        try (FileWriter fwriter = new FileWriter(USERJSON_PATH)) {
            fwriter.write(json);
        } catch (IOException e) {
            System.out.println("IO exception found!");
        }
    }
    public static void addUser(User u){
        users.add(u);
        saveUsers();
    }
public static void addCourse(Course c) {
    // Generate ID if missing
    if (c.getId() == null) {
        c.setId("C" + (courses.size() + 1));
    }
    // Set instructorId if missing (you need to pass it from GUI)
    if (c.getInstructorId() == null) {
        c.setInstructorId("default_instructor"); // Or get from logged in user
    }
    
    courses.add(c);
    saveCourses();
}
    public static void updateUser(User u){
        String UID = u.getUserId();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserId().equals(UID)){
                users.set(i, u);       
                saveUsers();
                return;
            }
        }
        saveUsers();
    }
    public static void updateCourse(Course c){
        String CID = c.getId();
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getId().equals(CID)){
                courses.set(i, c);
                saveCourses();
                return;
            }
        }
        saveCourses();
    }
public static void deleteCourse(String courseId) {
    List<Course> allCourses = getCourses();
    allCourses.removeIf(c -> c.getId() != null && c.getId().equals(courseId));
    saveCourses();
}
public static void deleteLesson(String courseId, String lessonId) {
    List<Course> allCourses = getCourses();
    //System.out.println("=== DEBUG deleteLesson ===");
    
    for (Course course : allCourses) {
        //System.out.println("Checking course: " + course.getTitle() + " | ID: " + course.getId());
        if (course.getId() != null && course.getId().equals(courseId)) {
            course.getLessons().removeIf(lesson -> 
                lesson.getId() != null && lesson.getId().equals(lessonId));
            saveCourses();
            return;
        }
    }
}
public static void addLesson(String courseId, Lesson lesson) {
    List<Course> allCourses = getCourses();
    for (Course course : allCourses) {
        if (course.getId() != null && course.getId().equals(courseId)) {
            // Generate lesson ID if missing
            if (lesson.getId() == null) {
                lesson.setId("L" + (course.getLessons().size() + 1));
            }
            course.getLessons().add(lesson);
            saveCourses();
            return;
        }
    }
}
    public static void removeUser(User u){
        users.remove(u);
        saveUsers();
    }
    public static void removeCourse(Course c){
        courses.remove(c);
        saveCourses();
    }
    public static List<User> getUsers(){
        readUsers();
        return users;
    }
    public static List<Course> getCourses(){
        readCourses();
        return courses;
    }
}
