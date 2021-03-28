import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.function.DoubleToIntFunction;

class Lab2{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First dot coordinates: ");
        String raw1 = in.nextLine();
        System.out.print("Second dot coordinates: ");
        String raw2 = in.nextLine();
        System.out.print("Third dot coordinates: ");
        String raw3 = in.nextLine();
        String[] split1 = raw1.split(" ");
        String[] split2 = raw2.split(" ");
        String[] split3 = raw3.split(" ");
        Dot3D a = new Dot3D(Double.parseDouble(split1[0]),Double.parseDouble(split1[1]),Double.parseDouble(split1[2]));
        Dot3D b = new Dot3D(Double.parseDouble(split2[0]),Double.parseDouble(split2[1]),Double.parseDouble(split2[2]));
        Dot3D c = new Dot3D(Double.parseDouble(split3[0]),Double.parseDouble(split3[1]),Double.parseDouble(split3[2]));
        String dots = "";
        if (a.equal(b)) {
            dots = "A and B ";
        }else if (b.equal(c)){
            dots = "B and C ";
        }else if (c.equal(a)){
            dots = "C and A ";
        }
        if (dots != ""){
            System.out.print("Can't create triangle: ");
            System.out.print(dots);
            System.out.println("are equal to each other.");
        }else{
            System.out.print("Area of a triangle: ");
            System.out.println(round(computeArea(a, b, c), 5));
        }
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public static double computeArea (Dot3D a, Dot3D b, Dot3D c){
        double p = (a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a))/2;
        return Math.sqrt(p*(p-a.distanceTo(b))*(p-b.distanceTo(c))*(p-c.distanceTo(a)));
    }
}