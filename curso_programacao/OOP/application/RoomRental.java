package OOP.application;

import java.util.Scanner;

import OOP.entities.Rooms;

public class RoomRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rooms room[] = new Rooms[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("RENT #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int rm = sc.nextInt();
            room[rm] = new Rooms(name, email);
            sc.nextLine();
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i].toString());
            }
        }
        
        sc.close();
    }
}
