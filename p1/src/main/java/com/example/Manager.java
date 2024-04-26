package com.m08;

import java.time.LocalDate;

/**
 * Class representing a manager, inheriting from Person.
 */
public class Manager extends Person {
    private LocalDate startDate;
    private int experience;
    
    /**
     * Retrieves the start date of the manager.
     * @return The start date of the manager.
     */
    public LocalDate getStartDate() {
        return startDate;
    }
    
    /**
     * Sets the start date of the manager.
     * @param startDate The start date to be set.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Retrieves the experience of the manager.
     * @return The experience of the manager.
     */
    public int getExperience() {
        return experience;
    }
    
    /**
     * Sets the experience of the manager.
     * @param experience The experience to be set.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    /**
     * Constructs a manager with the given name, identifier, start date, and experience.
     * @param name The name of the manager.
     * @param identifier The identifier of the manager.
     * @param startDate The start date of the manager.
     * @param experience The experience of the manager.
     */
    public Manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }
    
    /**
     * Constructs a manager with the given start date and experience.
     * @param startDate The start date of the manager.
     * @param experience The experience of the manager.
     */
    public Manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }
    
    /**
     * Returns a string representation of the manager object.
     * @return A string representation of the manager object.
     */
    @Override
    public String toString() {
        return "Manager [startDate=" + startDate + ", experience=" + experience + "]";
    }
}
