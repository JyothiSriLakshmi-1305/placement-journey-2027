public class PrecisionLoss{
    public static void main(String args[]){
        double d = 0.1;
        //output :0.1 But internally it is not exactly 0.1.
        System.out.println(d);
        float f = 123456789f;

        System.out.println(f);
        //output : 1.23456792E8

        //Some digits change because a float has limited precision.

    }
}

