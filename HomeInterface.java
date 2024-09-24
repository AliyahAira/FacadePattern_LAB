public class HomeInterface {

    private HomeService hsLight;
    private HomeService hsTV;
    private HomeService hsAirConditioning;

    public HomeInterface(HomeService hsLight, HomeService hsTV, HomeService hsAirConditioning) {
        this.hsLight = hsLight;
        this.hsTV = hsTV;
        this.hsAirConditioning = hsAirConditioning;
    }

    public void turnOnAll() {
        hsLight.turnOn();
        hsTV.turnOn();
        hsAirConditioning.turnOn();
    }

    public void turnOffAll() {
        hsLight.turnOff();
        hsTV.turnOff();
        hsAirConditioning.turnOff();
    }
}
