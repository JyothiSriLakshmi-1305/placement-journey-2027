/* Write a program that accepts any number of integers as command-line arguments and prints:

Total Sum
Average
Largest Number
Smallest Number
*/
class ProgramDemo{
    public static void main(String args[]){
        //Accessing the elements from comand line arguments
        if(args.length==0){
            System.out.println("Please provide atleast one..");
            return;
        }
        
        System.out.println("The elements are : ");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("Total Arguments : "+args.length);
        int sum=0;
        int largest=Integer.parseInt(args[0]);
        int smallest=Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++){
            //total sum
            sum+=Integer.parseInt(args[i]);
            
            //max
            int num = Integer.parseInt(args[i]);
            if(num > largest){
                largest = num;
            }
            //min
            if(num<smallest){
                smallest=num;
            }

            
        }
        System.out.println("The elements are : "+sum);
        System.out.println("Average : "+((double)sum/args.length));
        System.out.println("Largest Number : "+largest);
        System.out.println("The elements are : "+smallest);


    }
}