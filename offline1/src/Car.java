public class Car {
    private String color;
    private String engine;
    private String manufacturingCountry;
    private String driveTrain;
    private String manufacturingCompany;

    public Car() {
        color=null;
        engine=null;
        manufacturingCountry=null;
        driveTrain=null;
    }
    public Car(String color, String engine, String manufacturingCountry, String driveTrain,String manufacturingCompany) {
        this.color = color;
        this.engine = engine;
        this.manufacturingCountry = manufacturingCountry;
        this.driveTrain = driveTrain;
        this.manufacturingCompany=manufacturingCompany;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }
}
