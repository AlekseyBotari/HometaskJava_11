public class Toy {
    //Створити клас Toy. У класі має бути поле, яке дозволяє описати тип іграшки (лялька, солдатик, машинка),
    // конструктор та гетер. У методі мейн створіть мапу, де ключем виступає ім’я іграшки, а значення об’єкт Toy.
    // Виведіть про них інформацію на екран
    String solder;
    String car;
    String doll;

    public Toy(String solder, String car, String doll) {
        this.solder = solder;
        this.car = car;
        this.doll = doll;
    }

    public String getSolder() {
        return solder;
    }

    public String getCar() {
        return car;
    }

    public String getDoll() {
        return doll;
    }
}
