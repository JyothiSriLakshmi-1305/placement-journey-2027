/*Write programs for:

Holiday Checker
Amazon Order Availability
Netflix Subscription
College Holiday System

Use only the || operator.*/
class LogicalOperatorOR{
    public static void main(String args[]){
        //Holiday Checker
        boolean sunday=false;
        boolean publicHoliday=false;
        if(sunday||publicHoliday){
            System.out.println("Holiday");
        }
        else{
            System.out.println("Working Day.");
        }
        //Amazon Order Availability
        boolean inStock=false;
        boolean avialableForPreOrder=true;
        if(inStock||avialableForPreOrder){
            System.out.println("Order placed.");
            
        }
        else{
            System.out.println("Order not placed.");
        }

    }
    
}