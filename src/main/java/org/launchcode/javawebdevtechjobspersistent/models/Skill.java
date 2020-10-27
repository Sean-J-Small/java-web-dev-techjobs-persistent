package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Please enter a valid description")
    private String description;

    public Skill(@NotBlank(message = "Please enter a valid description") String description) {
        this.description = description;
    }

    public Skill () {

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}