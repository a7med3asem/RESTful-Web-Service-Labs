package eg.gov.iti.jets.dao;

import javax.persistence.*;
import java.io.*;

@Entity
@Table(name = "employee")
public class Employee implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Employee() {

    }

    // public Employee(String firstName, String lastName) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    // }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
