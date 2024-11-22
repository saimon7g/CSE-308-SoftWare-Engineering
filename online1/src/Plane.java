public class Plane {
    private String engine;
    private String manufacturingCompany;
    private String wing;

    public Plane(String engine, String manufacturingCompany, String wing) {
        this.engine = engine;
        this.manufacturingCompany = manufacturingCompany;
        this.wing = wing;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public void print() {
        System.out.println(" Manufacturer : "+this.getManufacturingCompany());
        System.out.println(" Engine type : "+this.getEngine());
        System.out.println(" Wing Type: "+this.getWing());
    }
}
