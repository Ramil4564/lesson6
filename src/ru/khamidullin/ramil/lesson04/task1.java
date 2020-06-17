package ru.khamidullin.ramil.lesson04;

public class task1{
    public static int min(int a, int b){
        if (a>b){
            return b;
        }
        else{
            return a;
        }
    }

    public static void main(String[] args){
        System.out.println( min(1,2) );
    }
}
