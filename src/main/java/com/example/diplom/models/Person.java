package com.example.diplom.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "owner")
    private List<Book> books;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name="role")
    private String role;






    // Конструктор по умолчанию нужен для Spring
    public Person() {

    }

    public Person(String fullName, String login, String password) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    @Override
    public String toString(){
        return "Person{"+
                "id="+id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", full name='" + fullName + '\'' +
                '}';
    }
}
