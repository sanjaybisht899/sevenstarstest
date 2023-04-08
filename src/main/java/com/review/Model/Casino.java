package com.review.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Casino{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;
    String heading;
    List <String> description;
    int stars;
    String url;
    String refURl;
    String summary;
    List<String> gameTypes;

    //Background Image
    //Image
    //Another Image
    //Customer Review
}
