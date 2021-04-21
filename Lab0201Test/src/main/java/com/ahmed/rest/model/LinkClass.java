package com.ahmed.rest.model;

import lombok.Data;

import jakarta.xml.bind.annotation.adapters.*;
import jakarta.xml.bind.annotation.*;

@Data
@XmlRootElement

public class LinkClass {
    String relation;
    String link;
}