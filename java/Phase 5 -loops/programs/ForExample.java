class ForExample{
    public static void main(String args[]){
        //checking ; The semicolon ends the loop immediately, 
        // and the block is no longer part of the loop.
        int n=5;
        //for(int i=1;i<=n;i++);
        for(int i=1;i<=n;i++)
        
        {
            System.out.println(i);
        }
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //odd numbers 1 3 5 7 9 11 13 15 17 19
        for(int i=1;i<20;i+=2){
            System.out.print(i+" ");


        }

        
    }
}
