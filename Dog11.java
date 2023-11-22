public class Dog11 extends Pet{
    @Override
    public String getName() {
        return super.getName();
    }

    public Dog11(String name) {
        super(name);
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.print("Я собака ");
    }

}
