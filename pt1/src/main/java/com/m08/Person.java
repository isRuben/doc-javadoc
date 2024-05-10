```java
package com.m08;

/**
 * Class that defines an individual's basic information.
 */
public class Person {
    protected String name;
    protected String identifier;
    
    /**
     * Gets the individual's name.
     * @return The individual's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Assigns a name to the individual.
     * @param name The name to assign.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the individual's unique identifier.
     * @return The individual's identifier.
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Assigns a unique identifier to the individual.
     * @param identifier The identifier to assign.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    /**
     * Constructor to initialize an individual with a name and identifier.
     * @param name The individual's name.
     * @param identifier The individual's identifier.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    /**
     * Provides a textual representation of the individual's details.
     * @return A string detailing the individual's information.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", identifier=" + identifier + "]";
    }
    
    /**
     * Default constructor for the Person class.
     */
    public Person() {
    }
}
```