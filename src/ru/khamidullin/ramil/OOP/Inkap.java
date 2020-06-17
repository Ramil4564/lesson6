package ru.khamidullin.ramil.OOP;

public class Inkap {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("ggg");
        person1.setAge(45);
        System.out.println("main "+person1.getName());
        System.out.println("main "+person1.getAge());
        //person1.speak();
    }
}
    class Person{
        private String name;
        private int age;
        public void setName(String userName){
            if (userName.isEmpty()){
                System.out.println("pustoe imya");
            }else {
            name = userName;}
        }
        public String getName(){
            return name;
        }
        public void setAge(int userAge){
            age = userAge;
        }
        public int getAge(){
            return age;
        }

        int calculateTo(){
            int years = 65-age;
            return years;
        }
        void speak()  {
            for (int i = 0; i<=2; i++)   {
               System.out.println("Меня зовут " + name + " мне " + age);
            }

        }
        void sayHello() {
            System.out.println("Привет");
        }


}
