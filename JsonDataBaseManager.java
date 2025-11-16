package backend;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class JsonDataBaseManager {
    private static List<User> users = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static final String USERJSON_PATH = "users.json";
    private static final String COURSEJSON_PATH = "courses.json";
    
    private static Gson getGSON(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder = gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson;
    }
    private static void readUsers(){
        Gson gson = getGSON();
        String json = "";
        try (Scanner fscanner = new Scanner(new File(USERJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
        User[] userArray = gson.fromJson(json, User[].class);
        users = new ArrayList<>(Arrays.asList(userArray));
    }
    private static void readCourses(){
        Gson gson = getGSON();
        String json = "";
        try (Scanner fscanner = new Scanner(new File(COURSEJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
        Course[] userArray = gson.fromJson(json, Course[].class);
        courses = new ArrayList<>(Arrays.asList(userArray));
    }
    private static void saveCourses(){
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
    public static void addCourse(Course c){
        courses.add(c);
        saveCourses();
    }
    public static void updateUser(User u){
        String UID = u.getUserId();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserId().equals(UID)){
                users.set(i, u);
                return;
            }
        }
        saveUsers();
    }
    public static void updateCourse(Course c){
        String CID = c.getID();
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getID().equals(CID)){
                courses.set(i, c);
                return;
            }
        }
        saveCourses();
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
        return users;
    }
    public static List<Course> getCourses(){
        return courses;
    }
}
