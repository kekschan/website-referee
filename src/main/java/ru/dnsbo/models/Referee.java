package ru.dnsbo.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="referee")
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "secondname")
    private String secondName;
    @Column(name = "firstname")
    private String firstName;
    private String email;
    @Column(name = "pass")
    private String password;

    public Referee() {
    }

    public Referee(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Referee(String secondName, String firstName, String email, String password) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Referee referee = (Referee) o;
        return Objects.equals(id, referee.id) && Objects.equals(secondName, referee.secondName) && Objects.equals(firstName, referee.firstName) && Objects.equals(email, referee.email) && Objects.equals(password, referee.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secondName, firstName, email, password);
    }
}