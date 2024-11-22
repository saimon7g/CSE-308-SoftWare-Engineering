public class Safran implements Company{
    @Override
    public Plane getPlane() {
        Plane p=null;
        p=new Plane("Safran Engine","Safran","Safran wing");
        return p;
    }
}
