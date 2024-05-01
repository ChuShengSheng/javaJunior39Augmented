package lesson20;

import java.util.Objects;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String groupe;
    private String date;


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(surname, student.surname) && Objects.equals(name, student.name) && Objects.equals(groupe, student.groupe) && Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, groupe, date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", groupe = '" + groupe + '\'' +
                ", date = '" + date + '\'' +
                '}';
    }
}
