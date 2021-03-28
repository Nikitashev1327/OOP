public class Dot3D extends Dot{
    private double x,y,z;
    public Dot3D (double a_x, double a_y, double a_z){
        super(a_x, a_y);
        z = a_z;
    }
    public void setZ (double a_z){
        z = a_z;
    }
    public double getZ (){
        return z;
    }
    public boolean equal(Dot3D a){
        if ((a.getX() == x)&&(a.getY() == y)&&(a.getZ() == z)) {
            return true;
        }else{
            return false;
        }
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public double distanceTo(Dot3D a){
        return round(Math.sqrt(Math.pow(a.getX()-x, 2)+Math.pow(a.getY()-y, 2)+Math.pow(a.getZ()-z, 2)), 2);
    }
}
