public class YuksekIrtifa implements PlaceBehaviour {


    @Override
    public double addingForAltitude(double currentPrice) {
        return currentPrice + 2000;
    }

    @Override
    public String description() {
        return "Yüksek istifa modeli secildi!";
    }
}
