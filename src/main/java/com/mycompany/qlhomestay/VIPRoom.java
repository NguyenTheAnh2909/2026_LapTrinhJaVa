/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlhomestay;

/**
 *
 * @author My Nitro
 */
public class VIPRoom extends Room {
    private double serviceFee;

    public VIPRoom(String roomID, String roomName, double pricePerNight, String status, double serviceFee) throws RoomException {
        super(roomID, roomName, pricePerNight, status);
        if (serviceFee < 0) {
            throw new RoomException("Lỗi: Phí dịch vụ VIP không được âm!");
        }
        this.serviceFee = serviceFee;
    }
    
    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    @Override
    public double calculatePrice(int nights) {
        return (getPricePerNight() * nights) + serviceFee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" Phí VIP: %-8.2f |\n", serviceFee);
    }
}
