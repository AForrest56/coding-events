package org.launchcode.codingevents.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;
    @NotBlank(message="Name is required.")
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String name;
    @Size(max=500, message="Description too long!")
    private String description;

    @NotBlank(message="Location is required.")
    @Size(min=3, max=100, message="Location must be between 3 and 100 characters.")
    private String location;

    @Positive(message="Number of attendees must me 1 or more.")
    private int numberOfAttendees;

    @NotBlank(message="Email is required.")
    @Email(message="Invalid Email. Try again.")
    private String contactEmail;

    private String registrationRequired;

    public Event(String name, String description, String location, int numberOfAttendees,
                 String contactEmail, String registrationRequired) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
        this.contactEmail = contactEmail;
        this.registrationRequired = registrationRequired;
        this.id = nextId;
        nextId++;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public int getNumberOfAttendees() { return numberOfAttendees; }

    public void setNumberOfAttendees(int numberOfAttendees) { this.numberOfAttendees = numberOfAttendees; }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(String registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
