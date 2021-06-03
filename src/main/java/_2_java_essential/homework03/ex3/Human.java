package _2_java_essential.homework03.ex3;

import java.util.Random;

class Human implements Moveable, Eatable, Jumpable {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;


    Human(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void move() {
        System.out.println(firstName + " " + lastName + " движеться в Киев.");
    }

    @Override
    public void move(String whereMove) {
        System.out.println(firstName + " " + lastName + " движеться в " + whereMove + ".");
    }


    @Override
    public void eat() {
        System.out.println(firstName + " " + lastName + " сьел лапшу.");
    }

    @Override
    public void eat(String whatEat) {
        System.out.println(firstName + " " + lastName + " сьел " + whatEat + ".");
    }

    @Override
    public void jump() {
        System.out.println(firstName + " " + lastName + " подпрыгнул на высоту " + randJumpHeight() + " метров.");
    }

    private double randJumpHeight(){
        Random rand = new Random();
        int number = rand.nextInt(10) + 5;
        return (double) number / 10;
    }
}
