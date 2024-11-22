public class BMW implements Company{
    private String originCountry;

    @Override
    public Car getCar() {

        Car car=new Car("Black","Electric Engine",originCountry,"Rear Wheel", "BMW");
        return car;
    }

    public BMW() {
        this.originCountry = "Germany";
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
