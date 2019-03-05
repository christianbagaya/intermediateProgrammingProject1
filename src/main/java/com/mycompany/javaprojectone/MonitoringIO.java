/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprojectone;
import java.util.*;
import java.lang.*;

/**
 *
 * @author tony.chisenga
 */
public class MonitoringIO {
    public static void main(String[] args){
        Scanner obstryData = new Scanner(System.in);
        System.out.print("Enter Observatory Name: ");
        String obName = obstryData.nextLine();
        System.out.print("Enter country: ");
        String obCountry = obstryData.nextLine();
        System.out.print("Enter start year: ");
        String obStartYear = obstryData.nextLine();
        System.out.print("Enter area in square kilometers: ");
        String areaString = obstryData.nextLine();
        System.out.print("How many galamsey events occured: ");
        String eventNumStr = obstryData.nextLine();
        double areaDouble = Double.parseDouble(areaString);
        int eventNum = Integer.parseInt(eventNumStr);
        ArrayList<String> events = new ArrayList<String>();
        String eventInput;
        for(int i = 1; i<=eventNum;i++){
            System.out.print("Enter event " + i + ": ");
            eventInput = obstryData.nextLine();
            events.add(eventInput);
            
        }
        System.out.print("Enter vegitation colour: ");
        String vColor = obstryData.nextLine();
        System.out.print("Enter colour value: ");
        String colorValueStr = obstryData.nextLine();
        System.out.print("Enter position(Latitude/Longitude): ");
        String position = obstryData.nextLine();
        System.out.print("Enter year of the event: ");
        String eventYear = obstryData.nextLine();
        int colorValue = Integer.parseInt(colorValueStr);
        
        
    }
    
}
