package at.campus.oop.miniProject;

public class Battery {


    private double voltage;

    public Battery(double voltage) {
        this.voltage = voltage;

    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    //    public double getStatus(double voltageBattery1, double voltageBattery2) {
//        this.status = (voltageBattery1 + voltageBattery2) / 2;
//        return status;
//    }

}
