public class Cat1 extends Pet{
    public Cat1(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.print("Я кіт ");
    }


}
