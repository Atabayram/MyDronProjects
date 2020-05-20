public class IcMekanizma extends IcAksam {

    private Dron dron;

    public IcMekanizma(Dron dron) {
        this.dron = dron;
    }

    @Override
    public String getDescription() {
        return dron.getDescription() + "Konektörler olusturuldu!";
    }

    @Override
    public double cost() {
        return 5.030 + dron.cost();
    }
}
