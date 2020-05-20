public class AlcakIrtıfa implements PlaceBehaviour {
    @Override
    public double addingForAltitude(double currentPrice) {
        return currentPrice + 999.999;
    }

    @Override
    public String description() {
        return "Dusuk irtifa modeli secildi!";
    }
}
