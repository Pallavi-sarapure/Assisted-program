package append;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws IOException {
     System.out.println("write the data to be append");
     Scanner sc=new Scanner(System.in);
   	 String input= sc.next();
   	 FileWriter fw=new FileWriter("a.txt",true);
   	 fw.write(input);
   	 System.out.println("Data Written");   	 
   	 fw.close();
   	 
    }

}