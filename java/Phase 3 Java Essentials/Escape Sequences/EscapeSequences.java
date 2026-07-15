//Escape Sequences
public class EscapeSequences{
    public static void main(String args[]){
        System.out.println("*****************");
        System.out.println(" Student Report ");
        System.out.println("*****************");
        String name="Vasavi";
        int age=21;
        double cgpa=8.91;
        // (\t usage)
        System.out.println("Name\t:"+name);
        System.out.println("Age\t:"+age);
        System.out.println("CGPA\t:"+cgpa);
        //(\n usage)
        System.out.println("Student record saved successfully");
        System.out.println("Hello Vasavi ......\nYeah here you gooooo...");
        //  (\" -Double quote)
        System.out.println("Name\t: "+"\""+name+"\"");
        System.out.println("CGPA\t: "+"\'"+cgpa+"\'");
        // (  \\ backslash )
        System.out.println("Student record saved in "+"c:\\users\\vasavi\\student");
   }
}

//output
/******************
 Student Report 
*****************
Name    :Vasavi
Age     :21
CGPA    :8.91
Student record saved successfully
Hello Vasavi ......
Yeah here you gooooo...
Name    : "Vasavi"
CGPA    : '8.91'
Student record saved in c:\users\vasavi\student*/


 