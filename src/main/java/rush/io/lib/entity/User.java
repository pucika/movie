package rush.io.lib.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 16-12-31.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    private String id;
    private String name;
    private String password;
    private String email;

    public User(){};
    public void setId(String id) {
        this.id = id;
    }
    @Id
    @Column(name = "id", nullable = true, length = 32, unique = true)
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
    @GeneratedValue(generator = "generator")
    public String getId() {
        return id;
    }
    @Column(name = "name", nullable = false, length = 32, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "password", nullable = false, length = 32, unique = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email", nullable = false, length = 32, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
