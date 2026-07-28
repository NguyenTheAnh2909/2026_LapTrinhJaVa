/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlhomestay;

/**
 *
 * @author My Nitro
 */
public class StandardRoom extends Room {
    private boolean hasBalcony;
    
    public StandardRoom(String roomID, String roomName, double pricePerNight, String status) throws RoomException {
        super(roomID, roomName, pricePerNight, status);
        
 
    }
    
    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
    
    @Override
    public double calculatePrice(int nights) {
        return getPricePerNight() * nights;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" Ban công: %-5s |\n", (hasBalcony ? "Có" : "Không"));
    }
}
