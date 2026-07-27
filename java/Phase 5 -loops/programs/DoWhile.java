/*Write a Java program using a do-while loop to print:

1   5
2   4
3   3   
4   2   

5   1  */  

class DoWhile{
    public static void main(String args[]){
        int n=5;
        int i=1;
        do{
            System.out.println(i);
            i++;

        }while(i<=n);
        int temp=1;
        do{
            System.out.println(n);
            n--;
        }while(n>=temp);
        //evev numbers
        System.out.println("Even numbers : b/w 1 to 10");
        int j=2;
        do{
            System.out.println(j);
            j=j+2;
        }while(j<=10);
        //multiplication table
        System.out.println("Multiplication table of 7 : ");
        int k=7;
        int w=1;
        do{
            System.out.println(k+"x"+w+"="+(k*w));
            w++;
        }while(w<=10);



    }
}