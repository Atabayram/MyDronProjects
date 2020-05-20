public class MultiratorDrone extends Dron {

    PlaceBehaviour placeBehaviour;
    double price;

    public MultiratorDrone(PlaceBehaviour placeBehaviour) {
        this.placeBehaviour = placeBehaviour;
        description = "Multirator dron yapılanman " + placeBehaviour.description();
    }

    public void setPrice(double price) {
        this.price = placeBehaviour.addingForAltitude(price);
    }

    @Override
    public double cost() {
        return price + 150.99;

    }
}

