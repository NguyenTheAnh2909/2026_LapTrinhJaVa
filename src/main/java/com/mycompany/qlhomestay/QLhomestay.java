/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlhomestay;

import java.util.ArrayList;

/**
 *
 * @author My Nitro
 */

public class QLhomestay {
    public static void main(String[] args) {
        ArrayList<Room> listRooms = new ArrayList<>();

        // Bắt và xử lý ngoại lệ bằng khối try-catch
        try {
            // 1. Tạo các đối tượng phòng
            StandardRoom r1 = new StandardRoom("P101", "Phòng Đơn 1", 300000, "Trống");
            VIPRoom r2 = new VIPRoom("P201", "Phòng VIP 1", 800000, "Đang thuê", 150000);

            listRooms.add(r1);
            listRooms.add(r2);

            // 2. Hiển thị thông tin
            System.out.println("=== DANH SÁCH PHÒNG HOMESTAY ===");
            for (Room r : listRooms) {
                r.displayInfo();
            }

        } catch (RoomException e) {
            System.out.println("❌ Lỗi dữ liệu phòng: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Đã xảy ra lỗi hệ thống: " + e.getMessage());
        } finally {
            System.out.println("\n>>> Chương trình kết thúc an toàn! <<<");
        }
    }
}
