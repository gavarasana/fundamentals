package com.pluralsight.fundamentals.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String releaseDate;
    private String description;

    public Release(){}

    public Release (String releaseDate, String description){
        this.setDescription(description);
        this.setReleaseDate(releaseDate);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
