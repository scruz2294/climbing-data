package com.exscruzme.rest.model;

/**
 * Created by stephaniecruz on 10/2/16.
 * This is the Routes class, the main object for this app
 */

public class Route {
    private String name;
    private String climbAarea;
    private String location;
    private String grade;
    private int rating;

    public Route() {
        this.name = "Default";
        this.climbAarea = "Area";
        this.location = "USA";
        this.grade = "0.0";
        this.rating = 0;
    }

    public Route(String name, String climbArea, String location, String grade, int rating) {
        this.name = name;
        this.climbAarea = climbArea;
        this.location = location;
        this.grade = grade;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimbAarea() {
        return climbAarea;
    }

    public void setClimbAarea(String climbAarea) {
        this.climbAarea = climbAarea;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
