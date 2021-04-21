package com.ahmed.rest.model;

import java.io.Serializable;
import javax.persistence.*;

import jakarta.xml.bind.annotation.adapters.*;
import jakarta.xml.bind.annotation.*;
import lombok.Data;
import java.util.*;
import jakarta.ws.rs.core.*;

@Entity
@Table(name = "employee")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
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

    @Transient
    private List<LinkClass> links;
    
}
