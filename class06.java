class CCircle
{
    double pi = 3.14; 
    double radius;
    
    CCircle(double pi,double radius) {
        this.pi = pi;
        this.radius = 5.0;
    }

    void show_periphery () 
    {
        System.out.println("periphery="+2*pi*radius);
    }
}
public class class06 {
    public static void main(String[] args) {
        CCircle cir1 = new CCircle(3.14,3.0);

        cir1.show_periphery();
    }
}