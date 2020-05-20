public class DisKaplama extends DisAksam {

    private Dron dron;

    protected DisKaplama(Dron dron) {
        this.dron = dron;
    }

    @Override
    public String getDescription() {
        return dron.getDescription() + "Dis kaplama olusturuldu!";
    }

    @Override
    public double cost() {
        return 250.00 + dron.cost();
    }
}
