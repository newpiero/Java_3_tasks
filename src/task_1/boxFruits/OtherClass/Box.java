package task_1.boxFruits.OtherClass;


import java.util.ArrayList;

public class Box <T extends Fruit> {


    private ArrayList<T> fruitArrayList;
    private float boxWeight;


    public Box() {
        this.fruitArrayList = new ArrayList<>();
    }

    public float getBoxWeight() {
        return boxWeight;
    }

    public void addFruit(T fruit) {
        boxWeight += fruit.getWeight();

    }


    public boolean compare(Box<T> obj) {

        return (this.getBoxWeight() == obj.boxWeight);
    }
}




