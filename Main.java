import java.util.*;

public class Main {
    public static void main(String[] args) {


    //Створіть множину (Set). Додайте туди чотири строки.
    // Виведіть інформацію про складову колекції на екран.
    Set<Integer> integerSet = new HashSet<>();
        integerSet.add(34);
        integerSet.add(35);
        integerSet.add(36);
        integerSet.add(64);

        System.out.println(integerSet);
        System.out.println();
    //Додайте до множини шість чисел. Зробіть так, щоби складова виводилась у відсортованому
    // порядку (від меншого до більшого)

    Set<Integer> integerSet1 = new TreeSet<>();
        integerSet1.add(34);
        integerSet1.add(35);
        integerSet1.add(36);
        integerSet1.add(64);

        System.out.println(integerSet1);
        System.out.println();

    //Створіть клас Пес з полем ім’я, конструктором з цим параметром, а також зробіть гетер
    // для цього поля. У методі мейн додайте три собаки до множини. Роздрукуйте інофрмацію про них.
    Dog dog = new Dog("Sam");
    Dog dog1 = new Dog("Din");
    Dog dog2 = new Dog("Bobby");
    Set<String> integerSet2 = new HashSet<>();
        integerSet2.add(dog.getName());
        System.out.println(integerSet2);

    //Реалізуйте метод createCats, який має створювати Set з трьох котів.
    // В методі мейн видаліть одного кота з множини. Створіть метод printCats.
    // Він має роздруковувати усю наявну у нас інформацію про котів.
    Set<String> cats = new HashSet<>();

    //cats.remove(cats.toArray()[0]);

        Cat.printCats();


    //Створіть метод union. Який приймає у якості параметрів дві множини цілих чисел.
    // Поєднати множини в одну. Мають залишитись тільки унікальні дані. Для перевірки у методі мейн
    // передайте цьому методу дві множини та роздрукуйте інформацію.
    Set<Integer> integerNum1 = new HashSet<>();
    Set<Integer> integerNum2 = new HashSet<>();

        integerNum1.add(1);
        integerNum1.add(2);
        integerNum1.add(3);

        integerNum2.add(4);
        integerNum2.add(5);
        integerNum2.add(6);

        Union.union(integerNum1, integerNum2);

    //Створити мапу, де ключем виступає ціле число, а значенням строка. Додайте 5 пар до мапи.
    // Роздрукуйте інформацію про ці пари.
    Map<Integer, String> map = new HashMap<>();

        map.put(212133, "Приклад_1");
        map.put(162348, "Приклад_2");
        map.put(8082871, "Приклад_3");
        map.put(8082781, "Приклад_4");
        map.put(8082791, "Приклад_5");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
        System.out.print(" " + entry.getKey() + " " + entry.getValue());
    }
        System.out.println();
    //Створити мапу, де ключем виступає назва фрукта/овоча/корнеплода, а значенням те, чим він є
    // (наприклад, Кавун - Ягода). Нам необхідно мінімум 10 таких пар. Виведіть про них інформацію на екран

    Map<String, String> map1 = new HashMap<>();

        map1.put("Манго", "Приклад_1");
        map1.put("Мангостан", "Приклад_2");
        map1.put("Гранадилла", "Приклад_3");
        map1.put("Баклажаны", "Овощи");
        map1.put("Броколі", "Овощи");
        map1.put("Морква", "Овощи");

        for (Map.Entry<String, String> entry : map1.entrySet()){
        System.out.print(" " + entry.getKey() + " " + entry.getValue());
    }
        System.out.println();
    //Створити клас Toy. У класі має бути поле, яке дозволяє описати тип іграшки (лялька, солдатик, машинка),
    // конструктор та гетер. У методі мейн створіть мапу, де ключем виступає ім’я іграшки, а значення об’єкт Toy.
    // Виведіть про них інформацію на екран
    Toy toy = new Toy("Soldier", "Car", "Doll");

    Map<String, String> map2 = new HashMap<>();
        map2.put("Clifford Unger", toy.getSolder());
        map2.put("JEEP", toy.getCar());
        map2.put("Sam Porter Bridges", toy.getDoll());

        for (Map.Entry<String, String> entry : map2.entrySet()){
        System.out.print(" " + entry.getKey() + " - " + entry.getValue() + "; ");
    }
        System.out.println();

    //Створіть клас Pet та трьох його нащадків (Кіт, Пес, Папуга на ваш вибір). Ці класи мають якимось чином
    // надавати опис себе (наприклад “Я кіт”). Створіть мапу, де ключем виступає ім’я тваринки, а значенням
    // клас Pet. Додайте до мапи різних тварин. Виведіть про них інформацію на екран
    Dog11 dog3 = new Dog11("Spike");
    Carrot carrot = new Carrot("Plushtrap");
    Cat1 cat1 = new Cat1("Tom");

    Map<String, Pet> map3 = new HashMap<>();
        map3.put(cat1.getName(), cat1);
        map3.put(dog3.getName(), dog3);
        map3.put(carrot.getName(), carrot);

        for(Map.Entry<String, Pet> entry : map3.entrySet() ){
        entry.getValue().getWhoAmI();
        System.out.print(entry.getValue().getName());
        System.out.println();
    }
}
}