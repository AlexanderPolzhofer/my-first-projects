package at.campus.oop.CarConfigurator;

public class Engine {

    public enum SETTING {DIESEL, GAS, HYBRID}

    private SETTING setting;
    private int horsePower;
    private double price;

    public Engine(SETTING setting, int horsePower) {
        this.setting = setting;
        this.horsePower = horsePower;

    }

    public SETTING getSetting() {
        return setting;
    }

    public int getHorsePower() {
        if (setting == SETTING.GAS) {
            horsePower = 100;
        }
        if (setting == SETTING.DIESEL) {
            horsePower = 200;
        }
        if (setting == SETTING.HYBRID) {
            horsePower = 300;
        }
        return horsePower;
    }

    public String getInfo() {
        return setting + ", " + horsePower + " hp";
    }

    public double getPrice() {
        if (setting == SETTING.GAS) {
            this.price = 2_055.12;
        }
        if (setting == SETTING.DIESEL) {
            this.price = 2_999.78;
        }
        if (setting == SETTING.HYBRID) {
            this.price = 4_012.39;
        }

        return this.price;
    }
}
