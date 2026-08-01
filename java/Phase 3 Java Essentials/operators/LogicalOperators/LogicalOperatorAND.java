/*Write a program for:
ATM withdrawal
Driving license eligibility
College exam eligibility
Use only the && operator.*/
class LogicalOperatorAND{
    public static void main(String args[]){
        //ATM Withdrwal
        int bal=55000;
        int withDraw=60000;
        boolean pinCorrect=true;
        if(bal>=withDraw&&pinCorrect){
            System.out.println("Successfull.");
        }
    else{
        System.out.println("Failed.");
    }
    //Driving License Eligibility
    int age=16;
    boolean citizen=true;
    if(age>=18&&citizen){
        System.out.println("Eligible");
    }
    else{
        System.out.println("Not eligible.");
    }
    //College Exam ELigibility
    float attendance=70.5f;
    boolean feePaid=true;
    if(attendance>=75&&feePaid){
        System.out.println("Eligible");
    }
    else{
        System.out.println("Not eligible.");
    }
    }
    //
    
}