package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Trung", "Than", "Dai", "Binh", "Thai", "Nam", "Van"};
        System.out.println("Nhap ten hoc sinh");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vi tri cua hoc sinh " + students[i] + " trong danh sach la " + (i + 1));
                check = true;
                break;
            }

            }if(!check){
            System.out.println("Khong tim duoc");

        }
    }
}
