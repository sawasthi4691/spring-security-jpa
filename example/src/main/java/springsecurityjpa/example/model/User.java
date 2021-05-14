package springsecurityjpa.example.model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String username;
    private String password;
    private String role;
    private Boolean active;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
