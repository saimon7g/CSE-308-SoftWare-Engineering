public class CustomerServiceAgent {
    private Builder builder=null;

    public void PCType( String type){
        if(type.equalsIgnoreCase("Gaming")){
            builder=new GamingPCBuilder();
        }
        else if(type.equalsIgnoreCase("Regular")){
            builder=new RegularPCBuilder();
        }
        else{
            System.out.println("This type of PC is not available");
        }
    }
    public PC build( String type){
        if(type.equalsIgnoreCase("AMD Ryzen 7 5700X")){
            builder.buildPC("AMD Ryzen 7 5700X",28000,"Regular","1TB HDD",70000);
            builder.setCooler("N/A",0);
            builder.setDVD("N/A",0);
        }
        else if(type.equalsIgnoreCase("i5")){
            builder.buildPC("i5",20000,"Regular","1TB HDD",70000);
            builder.setCooler("CPU cooler",36000);
            builder.setDVD("N/A",0);

        }
        else if(type.equalsIgnoreCase("i7")){
            builder.buildPC("i7",37000,"Regular","1TB HDD",70000);
            builder.setCooler("liquid cooler",17000);
            builder.setDVD("N/A",0);
        }
        else if(type.equalsIgnoreCase("i9")){
            builder.buildPC("i9",65000,"Regular","1TB HDD",70000);
            builder.setCooler("N/A",0);
            builder.setDVD("DVD drive",6000);
        }
        else{
            System.out.println("This Processor is not available");
            return null;
        }
        return builder.getReadyPC();
    }
    public void addRAM(String s, int price) {
        builder.setRAM(s,price);
    }
    public void addGPU(String input, int price) {
        builder.setGraphicsCard(input,price);
    }
}