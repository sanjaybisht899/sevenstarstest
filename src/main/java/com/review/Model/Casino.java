package com.review.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Casino{
    @Id
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
