package ru.khamidullin.ramil.lesson04;

public class Inkap {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Imya";
        person1.age = 12;
    }
    }
    class Person {
        String name;
        int age;

        int calculateTo() {
            int years = 65 - age;
            return years;
        }

        void speak() {
            for (int i = 0; i <= 2; i++) {
                System.out.println("Меня зовут" + name + "мне" + age);
            }
        }

    }
