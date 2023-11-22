import java.util.HashSet;
import java.util.Set;

public class Cat {
    //Нам необхідна котяча множина. Створимо відповідний клас з полем ім’я,
    // конструктором з цим параметром, а також зробіть гетер для цього поля.
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Set<String> createCats(){
        //Реалізуйте метод createCats, який має створювати Set з трьох котів.
        // В методі мейн видаліть одного кота з множини. Створіть метод printCats.
        // Він має роздруковувати усю наявну у нас інформацію про котів.
        Set<String> cats = new HashSet<>();
        cats.add("createCatsCat_1");
        cats.add("createCatsCat_2");
        cats.add("createCatsCat_3");
        return cats;
    }

    public static void printCats(){
        Cat.createCats();
        System.out.println(createCats());
    }
}
