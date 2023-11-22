public abstract class Pet {
    //Створіть клас Pet та трьох його нащадків (Кіт, Пес, Папуга на ваш вибір). Ці класи мають якимось чином
    // надавати опис себе (наприклад “Я кіт”). Створіть мапу, де ключем виступає ім’я тваринки, а значенням
    // клас Pet. Додайте до мапи різних тварин. Виведіть про них інформацію на екран
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getWhoAmI(){

    };
}
