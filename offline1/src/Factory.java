public class Factory {

    public  Company getCompany( String region){
        Company com=null;
        if(region.equalsIgnoreCase("Asia")){
            com= new Toyota();
        }
        else if(region.equalsIgnoreCase("Europe")){
            com= new BMW();
        }
        else if(region.equalsIgnoreCase("USA")){
            com= new Tesla();
        }
        else{
            System.out.println(" No company for your input region");
        }
        return com;
    }
}
