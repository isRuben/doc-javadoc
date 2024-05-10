package com.m08;

/** 
 * Class that represents a hotel entity.
 */
public class Hotel {
    private String name;
    private String address;
    private String web;
    
    /** 
     * Enum representing the category of the hotel.
     */
    private enum HotelCategory {
        OneStar, TwoStars, ThreeStars, FourStars, FiveStars
    }
    
    /**
     * Retrieves the name of the hotel.
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the hotel.
     * @param name The name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the address of the hotel.
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Sets the address of the hotel.
     * @param address The address to be set.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Retrieves the website URL of the hotel.
     * @return The website URL of the hotel.
     */
    public String getWeb() {
        return web;
    }
    
    /**
     * Sets the website URL of the hotel.
     * @param web The website URL to be set.
     */
    public void setWeb(String web) {
        this.web = web;
    }
    
    /**
     * Constructs a hotel with the given name, address, and website URL.
     * @param name The name of the hotel.
     * @param address The address of the hotel.
     * @param web The website URL of the hotel.
     */
    public Hotel(String name, String address, String web) {
        this.name = name;
        this.address = address;
        this.web = web;
    }
    
    /**
     * Returns a string representation of the hotel object.
     * @return A string representation of the hotel object.
     */
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", address=" + address + ", web=" + web + "]";
    }
}
