class TypeConversions{
    public static void main(String args[]){
        //int x=5.99; error:Incompatible types
        //System.out.println(x);
        int x=5;
        double y=x;
        System.out.println(y);

        //Implicit type conversions
        //always we will convert from short to large data types
        int a=10;
        double b=a;
        System.out.println(b);
        float c=10.56f;
        double d=c;
        System.out.println(d);
        //Error checking
        //int g=d;
        //System.out.println(g);
        char e='A';
        int f=e;//we will study Unicode in the Strings module.) o/p is :65
        System.out.println(f);
        //Explicit type conversion
        double d1=10.46;
        int d2=(int)d1;
        System.out.println(d2);
        float f1=3.455f;
        long f2=(long)f1;
        System.out.println(f2);

        //OverFlow 
        int d3=130;
        byte d4=(byte)d3;
        System.out.println(d4);




    }
}