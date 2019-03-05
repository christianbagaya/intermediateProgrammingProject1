/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprojectone;

import java.util.Objects;

/**
 *
 * @author tony.chisenga
 */
public class Galamsey {
    String vegColour;
    int colourValue;
    String year;
    String position;
    
    public Galamsey(){
        this.vegColour = null;
        this.colourValue = 0;
        this.year = null;
        this.position = null;    
    }
    
    public Galamsey(String vegColour, int colourValue, String year, String position){
        this.vegColour = vegColour;
        this.colourValue = colourValue;
        this.year = year;
        this.position = position;    
        
    }
    
    public String getVegColour(){
        return this.vegColour;
    }
    
    public int getColourValue(){
        return this.colourValue;
    }
    
    public String getYear(){
        return this.year;
    }
        
    public String getPosition(){
        return this.position;
    }
    
    public void setVegColour(String colour){
        this.vegColour = colour;        
    }
    
    public void setColourValue(int value){
        this.colourValue = value;
    }
    
    public void setYear(String y){
        this.year = y;
    }
    
    public void setPosition(String pos){
        this.position = pos;
    } 

    @Override
    public String toString() {
        return "Galamsey{" + "vegColour=" + vegColour + ", colourValue=" + 
                colourValue + ", year=" + year + ", position=" + position + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Galamsey other = (Galamsey) obj;
        if (!Objects.equals(this.vegColour, other.vegColour)) {
            return false;
        }
        if (this.colourValue != other.colourValue) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return true;
    }
}
