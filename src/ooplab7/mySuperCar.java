package ooplab7;

import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> myCarList = new ArrayList<>();
        SuperCar s1 = new SuperCar();
        s1.getCarbrand();
        s1.getCarcolor();
        s1.getCarenginesize();
        s1.getMaxspeed();
        s1.getCountryoforgin();

        SuperCar su = new SuperCar();
        su = inputData(su);
    }//main

    private static SuperCar inputData(SuperCar su) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your Supercar info: ");
        System.out.print("Brand: ");
        su.setCarbrand(scanner.nextLine());
        System.out.print("Color: ");
        su.setCarcolor(scanner.nextLine());
        System.out.print("Engine Size: ");
        su.setCarenginesize(scanner.nextLine());
        System.out.print("Max Speed: ");
        su.setMaxspeed(scanner.nextLine());
        System.out.print("Country of origin: ");
        su.setCountryoforgin(scanner.nextLine());
        System.out.println(su.toString());
        return su;
    }//inputdata
}//class
