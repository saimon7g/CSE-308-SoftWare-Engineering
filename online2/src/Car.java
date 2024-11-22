public class Car {
    String type;
    int visit;
    int price_per_day;

    public Car(String type) {
        this.type = type;
        visit=0;
        price_per_day=500;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public int getPricing(int days){
        visit++;
        double rent=0;
        if(type.equalsIgnoreCase("Premium")){
            rent=days*(price_per_day+200);
        }
        else if(type.equalsIgnoreCase("regular")){
            rent=days*price_per_day;
        }
        if(days>30){
            rent=rent*(0.9);
        }
        double loyalty;
        if (visit>1){
            loyalty=((visit)/5.0)*5;
            loyalty/=100;
            loyalty=1-loyalty;
            rent=rent*(loyalty);
        }



return (int)rent;




    }
}
