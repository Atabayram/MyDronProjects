public class Pervaneler extends DisAksam {

    private Dron dron;

    protected Pervaneler(Dron dron) {
        this.dron = dron;
    }

    @Override
    public String getDescription() {
        return dron.getDescription() + "Yeni nesil pervaneler eklendi!";
    }

    @Override
    public double cost() {
        return 320.50 + dron.cost();
    }
}
