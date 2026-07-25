public class WhileDemo {

    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){

            System.out.println(i);

            i++;

        }
        //even 
        i=2;
        while(i<=10){
            if(i%2==0){            
            System.out.println(i);
            
            }
            i++;

        }
        //print odd numbers
        i=1;
        while(i<10){
                     
            System.out.println(i);
            i=i+2;
        

        }
        i=10;
        while(i>0){
                     
            System.out.println(i);
            i--;
        

        }



    }

}