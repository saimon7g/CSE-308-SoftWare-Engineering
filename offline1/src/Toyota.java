public class Toyota implements Company{
    private String originCountry;
    @Override
    public Car getCar() {

        Car car= new Car("Red","Hydrozen Fuel Cell",originCountry,"Rear Wheel","Toyota");
        return car;
    }

    public Toyota() {
        this.originCountry = "Japan";
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
