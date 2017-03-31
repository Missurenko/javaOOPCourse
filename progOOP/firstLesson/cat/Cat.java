package com.bogdan.education.progOOP.firstLesson.cat;

/**
 * Created by Admin on 25.03.17.
 */
public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private int numberWin;

    public Cat() {
        super();
    }

    public Cat(String name, String color, int age, double weight) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberWin() {
        return numberWin;
    }

    public void setNumberWin(int numberWin) {
        this.numberWin = numberWin;
    }



}
