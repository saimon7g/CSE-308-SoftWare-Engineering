public class PC {
    private String processor;
    private String motherboard;
    private String storage;
    private String cooler;
    private String[] RAM;
    private String[] graphicsCard;
    private String DVD;
    private int processorPrice;
    private int coolerPrice;
    private int[] RAMPrice;
    private int[] GPUPrice;
    private int DVDPrice;
    private int totalPrice;
    private int ramCount;
    private int gpuCount;

    public PC() {
        this.processor="";
        this.motherboard="";
        this.storage="";
        this.cooler="";
        this.RAM= new String[50];
        this.graphicsCard=new String[50];
        this.DVD="";
        this.DVDPrice=0;
        this.processorPrice=0;
        this.coolerPrice=0;
        this.RAMPrice=new int[50];
        this.GPUPrice=new int[50];
        this.totalPrice=0;
        ramCount=0;
        gpuCount=0;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getCooler() {
        return cooler;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public String[] getRAM() {
        return RAM;
    }

    public void setRAM(String RAM){

        this.RAM[ramCount]=RAM;
        System.out.println("RAm Added");
    }

    public String[] getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard[gpuCount] = graphicsCard;
        System.out.println("GPU added");
    }

    public String getDVD() {
        return DVD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    public int getProcessorPrice() {
        return processorPrice;
    }

    public void setProcessorPrice(int processorPrice) {
        this.processorPrice = processorPrice;
    }

    public int getCoolerPrice() {
        return coolerPrice;
    }

    public void setCoolerPrice(int coolerPrice) {
        this.coolerPrice = coolerPrice;
    }

    public int[] getRAMPrice() {
        return RAMPrice;
    }

    public void setRAMPrice(int RAMPrice) {
        this.RAMPrice[ramCount] = RAMPrice;
        ramCount++;
    }

    public int[] getGPUPrice() {
        return GPUPrice;
    }

    public void setGPUPrice(int GPUPrice) {
        this.GPUPrice[gpuCount] = GPUPrice;
        gpuCount++;
    }

    public int getDVDPrice() {
        return DVDPrice;
    }

    public void setDVDPrice(int DVDPrice) {
        this.DVDPrice = DVDPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getRamCount() {
        return ramCount;
    }

    public void setRamCount(int ramCount) {
        this.ramCount = ramCount;
    }

    public int getGpuCount() {
        return gpuCount;
    }

    public void setGpuCount(int gpuCount) {
        this.gpuCount = gpuCount;
    }

    public void print(){


        int total=this.getTotalPrice();

        System.out.println("MotherBoard : "+ this.getMotherboard());
        System.out.println("Storage : "+this.getStorage());
        System.out.println("Base Price :"+ this.getTotalPrice());
        System.out.println("Processor : " + this.getProcessor() + "\t Price : " + this.getProcessorPrice());
        total+=this.getProcessorPrice();
        System.out.println("Cooler : " + this.getProcessor() + "\t Price : " + this.getCoolerPrice());
        total+=this.getCoolerPrice();
        System.out.println("DVD : " + this.getProcessor() + "\t Price : " + this.getDVDPrice());
        total+=this.getDVDPrice();

        String[] arr=this.getRAM();
        int[] arr2=this.getRAMPrice();
        int lim=this.getRamCount();
        for(int i=0;i<lim;i++){
            System.out.println("Extra Ram: "+ arr[i]+ "\t Price : " +arr2[i] );
            total+=arr2[i];
        }
        arr=this.getGraphicsCard();
        arr2=this.getGPUPrice();
        lim=this.getGpuCount();
        for(int i=0;i<lim;i++){
            System.out.println("Extra GPU: "+ arr[i]+ "\t Price : " +arr2[i] );
            total+=arr2[i];
        }
        System.out.println("Total Price : "+ total);

    }
}
