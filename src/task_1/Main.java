package task_1;


//        1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//        2. Написать метод, который преобразует массив в ArrayList;
//        3. Большая задача:
//         a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//         b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//         c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//         d. Сделать метод getBoxWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//         e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//         f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//         g. Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        arrayElementSwap();
        arrayTransformArrayList();


    }


    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    static void arrayElementSwap() {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Persik");
        cats[2] = new Cat("Listik");

        Cat catTemp1;
        Cat catTemp2;
        catTemp1 = cats[0];
        catTemp2 = cats[2];
        cats[2] = catTemp1;
        cats[0] = catTemp2;

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName());

        }
    }

    //2. Написать метод, который преобразует массив в ArrayList;

    static void arrayTransformArrayList() {
        Cat[] catNumber = new Cat[3];
        catNumber[0] = new Cat("Cat1");
        catNumber[1] = new Cat("Cat2");
        catNumber[2] = new Cat("Cat3");

        ArrayList<Cat> listCatsName = new ArrayList<>();

        for (int i = 0; i < catNumber.length; i++) {
            listCatsName.add(catNumber[i]);
            System.out.println(listCatsName.get(i).getName());
        }


    }
}
