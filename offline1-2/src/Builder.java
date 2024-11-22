public abstract class Builder {

    public final void buildPC(String processor, int price , String motherBoard, String storage,int price2)
    {
        setProcessor(processor,price);
        setMotherboard(motherBoard);
        setStorage(storage);
        setPrice(price2);
    }

    public abstract void setProcessor(String processor,int price);
    public abstract void setMotherboard(String motherBoard);
    public abstract void setStorage(String storage);
    public abstract void setCooler(String cooler,int price);
    public abstract void setRAM(String RAM,int price);
    public abstract void setGraphicsCard(String graphicsCard,int price);
    public abstract  void setDVD(String s,int price3);
    public abstract void setPrice(int price);
    public abstract void getPrice(int price);
    public abstract PC getReadyPC();

}
