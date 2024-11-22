public class GamingPCBuilder extends  Builder{
    PC buildingPC;

    public GamingPCBuilder() {
        this.buildingPC = new PC();
    }

    @Override
    public void setProcessor(String processor, int price) {
        buildingPC.setProcessor(processor);
        buildingPC.setProcessorPrice(price);
    }

    @Override
    public void setMotherboard(String motherBoard) {
        buildingPC.setMotherboard(motherBoard);
    }

    @Override
    public void setStorage(String storage) {
        buildingPC.setStorage(storage);

    }

    @Override
    public void setCooler(String cooler, int price) {
        buildingPC.setCooler(cooler);
        buildingPC.setCoolerPrice(price);

    }

    @Override
    public void setRAM(String RAM, int price) {
        buildingPC.setRAM(RAM);
        buildingPC.setRAMPrice(price);

    }

    @Override
    public void setGraphicsCard(String graphicsCard, int price) {
        buildingPC.setGraphicsCard(graphicsCard);
        buildingPC.setGPUPrice(price);
    }

    @Override
    public void setDVD(String s, int price3) {
        buildingPC.setDVD(s);
        buildingPC.setDVDPrice(price3);
    }

    @Override
    public void setPrice(int price) {
        buildingPC.setTotalPrice(price);
    }

    @Override
    public void getPrice(int price) {

    }

    @Override
    public PC getReadyPC() {
        return buildingPC;
    }
}