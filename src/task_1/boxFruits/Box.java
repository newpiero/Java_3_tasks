package task_1.boxFruits;


public class Box <T extends Fruit>{

    private int boxWeight;

    public Box(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public int getBoxWeight() {
        return boxWeight;
    }


}
