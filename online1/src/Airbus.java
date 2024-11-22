public class Airbus implements Company{
    @Override
    public Plane getPlane() {
        Plane p=null;
        p=new Plane("Airbus Plane"," Air bus"," Airbus Wing");
        return p;

    }
}
