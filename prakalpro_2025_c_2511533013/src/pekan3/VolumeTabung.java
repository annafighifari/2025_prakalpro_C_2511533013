package pekan3;

import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
       double pi = 3.14;
        
       Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();
        
       System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();
        
       double volume = pi * r * r * t;
        
        System.out.println("Volume tabung = " + volume);
        
        input.close();
    }
}