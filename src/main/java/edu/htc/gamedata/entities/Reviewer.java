package edu.htc.gamedata.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reviewer {

    @Id
    private String userName;

    private String name;
    private int age;
    private String gender;
    private String comments;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Game> favoriteGames;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
