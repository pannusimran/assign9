
package assignment12;
import java.util.Scanner;

public class Assignment12 {
    
    

  
    public static void main(String[] args) {
      
    
          Scanner console= new Scanner(System.in);
             int i,j,k;
        System.out.print("How many number of lines: ");
   
        int n = console.nextInt();
       
       
        for(i=n;i>0;i--){
        for(j=0;j<n-i;j++){
            System.out.print(" ");
    }
        for(k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
       console.close();
    }
    
}}
