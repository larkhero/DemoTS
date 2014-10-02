/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demots;

/**
 *
 * @author chiayin
 */
public class User {
    protected int userId;
    private String name;
    private String password;
    
    private static int nextId = 1;
    
    public User() {
        userId = nextId++;
    }
    
    public User(String name, String password) {
        this.name = name; this.password = password;
        userId = nextId++;
    }
    
    public int getId() {
        return userId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }
    
}
