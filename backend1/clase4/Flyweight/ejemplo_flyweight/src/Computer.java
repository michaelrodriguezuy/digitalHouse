public class Computer {
    private String brand;

    private HardwareConfiguration hardware;

    public Computer(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public HardwareConfiguration getHardware() {
        return hardware;
    }

    public void setHardware(HardwareConfiguration hardware) {
        this.hardware = hardware;
    }
}
