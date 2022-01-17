package read; 
import java.io.FileInputStream;  
public class main1 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("a.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
}