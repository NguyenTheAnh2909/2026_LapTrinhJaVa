/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlhomestay;

/**
 *
 * @author My Nitro
 */
public class Room {
    private String roomID;
    private String roomName;
    private String roomType;
    private double pricePerNight;
    private String status; // "Trống", "Đang có khách"

    // Hàm khởi tạo (Constructor) đầy đủ tham số
    public Room(String roomID, String roomName, String roomType, double pricePerNight, String status) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.status = status;
    }

    // Các hàm Getter và Setter để đọc/ghi dữ liệu
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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

    // Phương thức hiển thị thông tin phòng
    public void displayInfo() {
        System.out.printf("| %-8s | %-15s | %-10s | %-12.2f | %-15s |\n", 
                roomID, roomName, roomType, pricePerNight, status);
    }
}
