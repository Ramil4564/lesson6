package ru.khamidullin.ramil.lesson04;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>0){
            System.out.println("положительное");}
        else{
            System.out.println("отрицательное");
        }
        if (a%2==0){
            System.out.println("четное");}
        else{
            System.out.println("нечетное");}
    }
}
