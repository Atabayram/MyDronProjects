public class GpsModulu extends IcAksam {

    private Dron dron;

    public GpsModulu(Dron dron) {
        this.dron = dron;
    }

    @Override
    public String getDescription() {
        return dron.getDescription() + "GPS Modulu eklendi!";
    }

    @Override
    public double cost() {
        return 2.0 + dron.cost();
    }
}
