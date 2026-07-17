import java.io.*;

public class BufferReaderDemo {

    public static void main(String args[])
            throws Exception {

        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter Name: ");

        String name = br.readLine();

        System.out.println("Name : "+name);

    //read() :reads one character's numeric value:
    int ch = br.read();
    System.out.println((char) ch);
    //System.out.println(ch);
    /*  o/p:  a
              97
    //If the input is A, ch contains 65, so casting (char) ch displays A.
    
    BufferedReader
│
├── read()      → One character
├── readLine()  → One complete line
└── close()     → Close the reader */
    }
}