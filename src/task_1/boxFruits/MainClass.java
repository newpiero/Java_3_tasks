package task_1.boxFruits;

import task_1.boxFruits.OtherClass.Apple;
import task_1.boxFruits.OtherClass.Box;
import task_1.boxFruits.OtherClass.Orange;

public class MainClass {

    public static void main(String[] args) {

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Apple apple1 = new Apple();


        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();


        orangeBox1.addFruit(orange1);
        orangeBox2.addFruit(orange2);
        orangeBox2.addFruit(orange3);
        appleBox.addFruit(apple1);


        System.out.println("Вес коробки апельсинов = " + orangeBox1.getBoxWeight());
        System.out.println("Вес коробки яблок = " + appleBox.getBoxWeight());


        System.out.println(appleBox.compare(orangeBox2)); // не работает с разными типами
        System.out.println(orangeBox1.compare(orangeBox2)); // работает с одинаковым типом
    }








}
