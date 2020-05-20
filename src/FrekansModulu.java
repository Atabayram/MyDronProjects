public class FrekansModulu  extends IcAksam{

    private Dron dron;

    public FrekansModulu(Dron dron) {
        this.dron = dron;
    }

    @Override
    public String getDescription() {
        return dron.getDescription() + "Dron Ic Aksami olusumu Basarili! ";
    }

    @Override
    public double cost() {
        return 1.700 + dron.cost();
    }
}
