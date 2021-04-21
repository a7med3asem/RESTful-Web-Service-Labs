package com.ahmed.rest.model;

import java.io.Serializable;
import javax.persistence.*;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@XmlRootElement
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlAttribute
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
}
