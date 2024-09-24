public class HomeInterface {

    private Light light;
    private TV tv;
    private AirConditioning airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}