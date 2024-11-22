public class Boeing implements Company{
    @Override
    public Plane getPlane() {
        Plane p=new Plane("Boeing Plane","Boeing","Boeing wing");
        return p;
    }
}
