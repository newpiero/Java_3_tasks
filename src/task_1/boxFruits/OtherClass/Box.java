package task_1.boxFruits.OtherClass;


import java.util.ArrayList;

public class Box<T extends Fruit> {


    private ArrayList<T> fruitArrayList;


    public Box() {
        this.fruitArrayList = new ArrayList<>();
    }

    public float getBoxWeight() {
        float boxWeight = 0.0f;

        for (T o : fruitArrayList) {
            boxWeight += o.getWeight();
        }
        return boxWeight;
    }

    public void addFruit(T fruit) {
        fruitArrayList.add(fruit);
    }


    public boolean compare(Box<? extends Fruit> obj) {
        return Math.abs(this.getBoxWeight() - obj.getBoxWeight()) < 0.001;
    }
}




