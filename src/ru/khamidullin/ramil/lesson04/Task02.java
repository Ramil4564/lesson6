package ru.khamidullin.ramil.lesson04;

public class Task02 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {



            int a = scanner.nextInt();

            if (a == 0) {

                System.out.print("zero");

                return;
            }

            System.out.println(a > 0 ? "positive" : "negative");

            System.out.println(a % 2 == 0 ? "even" : "odd");
        }
    }
}

