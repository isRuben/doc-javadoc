package com.m08;

/**
 * Defines a guest entity, extending the Person class.
 */
public class Guest extends Person {
    private String nationality;

    /**
     * Obtains the guest's nationality.
     * @return The guest's nationality.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Assigns a nationality to the guest.
     * @param nationality The nationality to assign.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Constructor to initialize a guest with specified name, ID, and nationality.
     * @param name The guest's name.
     * @param identifier The guest's ID.
     * @param nationality The guest's nationality.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }

    /**
     * Constructor to initialize a guest with a specific nationality.
     * @param nationality The guest's nationality.
     */
    public Guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Provides a textual representation of the guest.
     * @return A string depiction of the guest.
     */
    @Override
    public String toString() {
        return "Guest [nationality=" + nationality + "]";
    }
}