public class Carrot extends Pet{
    String name;


    public Carrot(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.print("Я попуга ");
    }


}
