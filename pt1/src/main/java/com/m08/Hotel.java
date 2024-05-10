package com.m08;

/** 
 * Defines a class for hotel entities.
 */
public class Hotel {
    private String name;
    private String address;
    private String web;
    
    /** 
     * Enumeration for the hotel's star rating.
     */
    private enum HotelCategory {
        OneStar, TwoStars, ThreeStars, FourStars, FiveStars
    }
    
    /**
     * Gets the hotel's name.
     * @return The hotel's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Assigns a name to the hotel.
     * @param name The name to assign.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the hotel's address.
     * @return The hotel's address.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Assigns an address to the hotel.
     * @param address The address to assign.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Gets the hotel's website URL.
     * @return The hotel's website URL.
     */
    public String getWeb() {
        return web;
    }
    
    /**
     * Assigns a website URL to the hotel.
     * @param web The website URL to assign.
     */
    public void setWeb(String web) {
        this.web = web;
    }
    
    /**
     * Constructor to create a hotel with a specified name, address, and web URL.
     * @param name The hotel's name.
     * @param address The hotel's address.
     * @param web The hotel's web URL.
     */
    public Hotel(String name, String address, String web) {
        this.name = name;
        this.address = address;
        this.web = web;
    }
    
    /**
     * Provides a string representation of the hotel entity.
     * @return A string representation of the hotel.
     */
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", address=" + address + ", web=" + web + "]";
    }
}