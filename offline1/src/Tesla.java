public class Tesla implements Company{
    private String originCountry;
    @Override
    public Car getCar() {

        Car car=new Car("White","Electtric",originCountry,"All Wheel","Tesla");
        return car;
    }

    public Tesla() {
        this.originCountry ="USA";
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
