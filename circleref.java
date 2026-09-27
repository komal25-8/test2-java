import java.util.*;

public class circleref {
    public static double circumference(double r){
    return (2*3.14*r);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        System.out.println("circumference of circle :"+circumference(r));



    }

    
}
