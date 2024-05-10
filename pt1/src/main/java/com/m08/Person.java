package com.m08;

/**
 * Class representing a person entity.
 */
public class Person {
    protected String name;
    protected String identifier;
    
    /**
     * Retrieves the name of the person.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the person.
     * @param name The name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the identifier of the person.
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Sets the identifier of the person.
     * @param identifier The identifier to be set.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    /**
     * Constructs a person with the given name and identifier.
     * @param name The name of the person.
     * @param identifier The identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    /**
     * Returns a string representation of the person object.
     * @return A string representation of the person object.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", identifier=" + identifier + "]";
    }
    
    /**
     * Default constructor.
     */
    public Person() {
    }
}
