package com.m08;

import java.time.LocalDate;

/**
 * Class that defines a manager, derived from the Person class.
 */
public class Manager extends Person {
    private LocalDate startDate;
    private int experience;
    
    /**
     * Gets the manager's start date in the company.
     * @return The manager's start date.
     */
    public LocalDate getStartDate() {
        return startDate;
    }
    
    /**
     * Assigns a start date to the manager.
     * @param startDate The start date to assign.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Gets the number of years of experience the manager has.
     * @return The manager's years of experience.
     */
    public int getExperience() {
        return experience;
    }
    
    /**
     * Sets the years of experience for the manager.
     * @param experience The years of experience to set.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    /**
     * Constructor to create a manager with a name, ID, start date, and experience.
     * @param name The manager's name.
     * @param identifier The manager's ID.
     * @param startDate The manager's start date.
     * @param experience The manager's years of experience.
     */
    public Manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }
    
    /**
     * Constructor to create a manager with a start date and experience.
     * @param startDate The manager's start date.
     * @param experience The manager's years of experience.
     */
    public Manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }
    
    /**
     * Provides a string representation of the manager's details.
     * @return A string detailing the manager's information.
     */
    @Override
    public String toString() {
        return "Manager [startDate=" + startDate + ", experience=" + experience + "]";
    }
}