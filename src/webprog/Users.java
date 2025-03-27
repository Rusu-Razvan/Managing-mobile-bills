package webprog;

public class Users {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String role;

    public Users() {
    }

    public Users(String username, String name, String surname, String role,String password) {
        setUsername(username);
        setName(name);
        setSurname(surname);
        setRole(role);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
   public void register() {
        System.out.println("User " + this.username + " registered successfully!");
    }

    public void login() {
        System.out.println("User " + this.username + " logged in successfully!");
    }

    public void logout() {
        System.out.println("User " + this.username + " logged out successfully!");
    }
}
    
    
    
 
