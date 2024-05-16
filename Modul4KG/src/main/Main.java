package main;

import books.*;
import data.Admin;
import data.Student;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // menyimpan semua object dalam satu array dengan teknik polymorphism
    public static Book[] addTempBooks = new Book[100]; // array satu dimensi untuk menyimpan buku
    public static ArrayList<Student> addTempStudent = new ArrayList<>();
    public static int i = 0;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addTempBooks[i++] = new StoryBook("BS0O21", "Sangkuriang", 3, "Story", "Anak Hilang");
        addTempBooks[i++] = new HistoryBook("BH001", "WW II : Land Of Prosperity", 2, "History", "Wemade");
        addTempBooks[i++] = new TextBook("BT001", "Overlord", 4, "Text", "Chen Beixuan");

        // Mengisi daftar mahasiswa
        addTempStudent.add(0, new Student("202310370311354", "Ilham", "Teknik","Informatika"));
        addTempStudent.add(1, new Student("202310370311355", "Firman", "Teknik","Informatika"));
        addTempStudent.add(2, new Student("202310370311356", "Lupa", "Teknik","Informatika"));

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih antara (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nimStudent = scanner.next();
                    scanner.nextLine();
                    while(true){
                        if (nimStudent.length() != 15 ) {
                            System.out.print("Nim Harus 15 Digit!!!\n");
                            System.out.print("Masukkan NIM : ");
                            nimStudent = scanner.nextLine();

                        } else if (checkNim(nimStudent)){
                            Student student = new Student(nimStudent);
                            student.login();
                            break;
                        } else {
                            System.out.println("Nim tidak terdaftar!");
                            break;
                        }
                    }
                    break;
                case 2:
                    Admin admin = new Admin();
                    admin.login();
                    break;
                case 3:
                    System.out.println("Terima kasih semoga puas dengan pelayanan kami");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
    public static boolean checkNim(String nim) {
        for (Student student : addTempStudent) {
            if (student.getNim().equals(nim)) {
                return true;
            }
        }
        return false;
    }
}
