package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 1, max = 100)
    @NotBlank(message = "Please enter a valid description")
    private String description;

    public Skill(List<Job> jobs, @Size(min = 1, max = 100) @NotBlank(message = "Please enter a valid description") String description) {
        this.description = description;
        this.jobs = jobs;

    }

    public Skill () {

    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}