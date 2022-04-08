package kz.iitu.itse1901.mukhamedrassul.Database;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Transactional
public class Users implements Serializable {
    private int user_id;
    private String username;
    private String city;

    public Users() {
    }

    public Users(int user_id, String username, String city) {
        this.user_id = user_id;
        this.username = username;
        this.city = city;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int getUser_id() {
        return user_id;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User id: " + user_id + " username: " + username + " city: " + city;
    }


    //    @PostConstruct
//    public void init() {
//        System.out.println("Initializing User bean");
//        if (username == null) {
//            throw new IllegalArgumentException(
//                    "You must set the NAME property of any beans of type " + Clothes.class);
//        }
//        if (City == null) {
//            throw new IllegalArgumentException(
//                    "You must set the MATERIAL TYPE property of any beans of type " + Clothes.class);
//        }
//    }
}
