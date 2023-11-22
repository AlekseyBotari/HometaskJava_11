import java.util.HashSet;
import java.util.Set;

public class Union {

    public static void union(Set<Integer> integerNum1, Set<Integer> integerNum2){
        //Створіть метод union. Який приймає у якості параметрів дві множини цілих чисел.
        // Поєднати множини в одну. Мають залишитись тільки унікальні дані. Для перевірки у методі мейн
        // передайте цьому методу дві множини та роздрукуйте інформацію.

        Set<Integer> integerNum3 = new HashSet<>();

        integerNum3.addAll(integerNum1);
        integerNum3.addAll(integerNum2);

        System.out.println(integerNum3);

    }
}
