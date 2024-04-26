package com.m08;

/**
 * Class representing a guest, inheriting from Person.
 */
public class Guest extends Person {
    private String nationality;

    /**
     * Retrieves the nationality of the guest.
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     * @param nationality The nationality to be set.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Constructs a guest with the given name, identifier, and nationality.
     * @param name The name of the guest.
     * @param identifier The identifier of the guest.
     * @param nationality The nationality of the guest.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }

    /**
     * Constructs a guest with the given nationality.
     * @param nationality The nationality of the guest.
     */
    public Guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Returns a string representation of the guest object.
     * @return A string representation of the guest object.
     */
    @Override
    public String toString() {
        return "Guest [nationality=" + nationality + "]";
    }
}
