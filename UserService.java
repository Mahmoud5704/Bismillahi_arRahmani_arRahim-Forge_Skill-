package backend;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import static java.util.Objects.hash;

public class UserService {
    
    public static User login(String username, String password){
        List<User> users = JsonDataBaseManager.getUsers();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getPassword().equals(encrypt(password)) && users.get(i).getUsername().equals(username)){
                return users.get(i);
            }
        }
        return null; //user not found
    }
    public static User signup(String username, String email, String password, String role){
        List<User> users = JsonDataBaseManager.getUsers();
        
    }
    public static void test(String test){
        encrypt(test);
    }
    private static void encrypt(String password){
        try {
            MessageDigest digest;
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            System.out.println(hash.length);
            String hash_str = "";
            for(int i = 0; i < hash.length ; i++){
                System.out.print(hash[i]);
                hash_str += String.format("%02x", hash[i]);
            }
            System.out.println("");
            System.out.println(hash_str);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("no such algorithm exception found!");
        }
    }
}
