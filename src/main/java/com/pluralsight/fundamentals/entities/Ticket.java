package com.pluralsight.fundamentals.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String title;

    private  String description;

    private String status;

    @ManyToOne
    @JoinColumn(name="application_id")
    private Application application;

    @ManyToOne
    @JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name = "ticket_id"), inverseJoinColumns = @JoinColumn(name = "release_id"))
    private Release release;

    public Ticket(){}

    public Ticket(String title, String description, String status, Application application, Release release){
        this.setApplication(application);
        this.setTitle(title);
        this.setDescription(description);
        this.setStatus(status);
        this.setRelease(release);
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }


}
