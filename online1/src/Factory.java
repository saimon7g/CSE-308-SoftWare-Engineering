public class Factory {

    public static Company getCompany( String region){
        Company com=null;
        if(region.equalsIgnoreCase("Airbus")){
            com= new Airbus();
        }
        else if(region.equalsIgnoreCase("Boeing")){
            com= new Boeing();
        }
        else if(region.equalsIgnoreCase("Safran")){
            com= new Safran();
        }
        else{
            System.out.println(" No company for your input region");
        }
        return com;
    }
}
