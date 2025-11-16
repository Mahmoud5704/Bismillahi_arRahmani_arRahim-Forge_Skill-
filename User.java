/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.cloud;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;
public class User {
    protected int userId;
    protected String username;
    protected String email;
    protected String passwordHash;
    
    protected User (int id,String name,String email,String pass)
    {
        userId = id;
        username = name;
        this.email = email;
        passwordHash = sha256(pass);
    }
    
    //************************************************************************//
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    //************************************************************************//
    public void setUserId(int userId) {
        if(validateId(userId))
                this.userId = userId;
    }

    public void setUsername(String username) {
        if(validateUsername(username))
                this.username = username;
    }

    public void setEmail(String email) {
        if(validateEmail(email))
                this.email = email;
    }

    public void setPassword(String password) {
       if(validatePassword(password)) 
                 this.passwordHash = sha256(password);  
    }
    //************************************************************************//
    private String sha256(String input) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

        StringBuilder hex = new StringBuilder();
        for (byte b : hash) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
}
