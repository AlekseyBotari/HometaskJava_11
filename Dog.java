public class Dog {
    //Створіть клас Пес з полем ім’я, конструктором з цим параметром, а також зробіть гетер
    // для цього поля. У методі мейн додайте три собаки до множини. Роздрукуйте інофрмацію про них.
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
