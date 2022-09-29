package ru.dnsbo.models;

public class Referee {
    private Integer id;
    private String secondName;
    private String firstName;
    private String email;
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
}