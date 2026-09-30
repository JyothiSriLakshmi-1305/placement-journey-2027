import java.util.*;
class Rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l and w for rectangle: ");
        
        for(int i=0;i<3;i++){
            int l = sc.nextInt();
        int w = sc.nextInt();
        int a = area(l, w);
        System.out.println("Area of Rectangle : " + a);
    }
}

    static int area(int l, int w) {
        return l * w;
    }
}