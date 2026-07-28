/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlhomestay;

/**
 *
 * @author My Nitro
 */
public abstract class Room implements IAction {
    private String roomID;
    private String roomName;
    private double pricePerNight;
    private String status;

    public Room(String roomID, String roomName, double pricePerNight, String status) throws RoomException {
        if (pricePerNight <= 0) {
            throw new RoomException("Giá phòng phải lớn hơn 0!");
        }
        this.roomID = roomID;
        this.roomName = roomName;
        this.pricePerNight = pricePerNight;
        this.status = status;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Mã phòng: " + roomID 
                + " | Tên phòng: " + roomName 
                + " | Giá: " + pricePerNight 
                + " | Trạng thái: " + status);
    }
}
