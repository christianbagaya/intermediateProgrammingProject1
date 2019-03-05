/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprojectone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tony.chisenga
 */
public class Observatory {
    String observatoryName,country,startYear;
    double area;
    ArrayList<Galamsey> galamseyList = new ArrayList<>();

    public Observatory(String observatoryName, String country, String startYear, double area) {
        this.observatoryName = observatoryName;
        this.country = country;
        this.startYear = startYear;
        this.area = area;
    }
    
    /**
     * Getters
     * @return 
     */
    public String getObservatoryName() {
        return observatoryName;
    }

    public String getCountry() {
        return country;
    }

    public String getStartYear() {
        return startYear;
    }

    public double getArea() {
        return area;
    }
    public ArrayList getGalamseyList(){
        return galamseyList;
    }
    
    
    
    public void setObservatoryName(String observatoryName) {
        this.observatoryName = observatoryName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setGalamseyList(Galamsey event){
        this.galamseyList.add(event);
    }

    public int largestColVal(){
        int maxCol = 0;
        for(Galamsey g: this.galamseyList){
            if(g.getColourValue()>maxCol){
                maxCol = g.getColourValue();
            }
        }
        return maxCol;
    }
    
    public double averageVal(){
        int avgVal = 0;
        int count=0;
        for(Galamsey g: this.galamseyList){
         
            
            avgVal=avgVal+ g.getColourValue();
            count+=1;
            
        }
        return avgVal/count;
    }
    public ArrayList<Galamsey> galGreaterArb(int colValue){
        ArrayList<Galamsey> galList= new ArrayList<>();
        for(Galamsey g: this.galamseyList){
            if(g.getColourValue()>colValue){
                galList.add(g);
            }
        }
        return galList;
        
    }
   
   

    @Override
    public String toString() {
        return "Observatory{" + "observatoryName=" + this.getObservatoryName() + 
                ", country=" + this.getCountry() + ", startYear=" + this.getStartYear() + ", area=" + area + ", list of galamsey events=" +this.getGalamseyList()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Observatory other = (Observatory) obj;
        if (!Objects.equals(this.observatoryName, other.observatoryName)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.startYear, other.startYear)) {
            return false;
        }
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        return true;
    }
    
    //methods
    //public int largestColorValue(){};
    //public int avgColorValue(){};
    //public int allGalamsey(){};
        
    public static void main(String[] arg){
        Galamsey g1 = new Galamsey("green", 12, "2018", "2.00,2.066");
        Galamsey g2 = new Galamsey("brown", 85, "2018", "2.00,2.066");
        Galamsey g3 = new Galamsey("yellow", 105, "2018", "2.00,2.066");
        
        Observatory ob = new Observatory("Matata", "Ghana", "2006", 250.62);
        
        ob.setGalamseyList(g1);
        ob.setGalamseyList(g2);
        ob.setGalamseyList(g3);
        Galamsey a = new Galamsey();
        a = (Galamsey) ob.getGalamseyList().get(1);
//        System.out.println(a.getColourValue());
        //System.out.println(ob.largestColVal());
        System.out.print(ob.galGreaterArb(100));
    }
    
}
