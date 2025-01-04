package gr.aueb.cf.ch12;

/**
 *  Data class.
 *  POJO (Plain Old Java Object)
 *  JAva Bean.
 *
 */

public class Student {
    int id;
    String firstname;
    String lastname;

    // Default Constructor
    public Student() {
    }

    // Overloaded Constructor
    public Student(int id, String fristname, String lastname){
        this.id = id;
        this.firstname = fristname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}



