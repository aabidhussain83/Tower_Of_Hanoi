
package towerOfHanoi;
import java.util.Scanner;

public class Tower {
    
    static int stepCount=0;
    
    public void towerOfHanoi(int n,String Source,String Destination,String Auxilary)
    {  
        
        
        if(n==1)
        { 
            System.out.println(Source+" -> "+Destination);
            stepCount++;
            
            return;
        }
        
        towerOfHanoi(n-1,Source,Auxilary,Destination);
            
      //  towerOfHanoi(1,Source, Destination, Auxilary);
         System.out.println(Source+" -> "+Destination);  
         stepCount++;
        towerOfHanoi(n-1,Auxilary,Destination,Source);
        
        
    }
    
    public static void main(String[] args)
    {
        String Source="Source",Destination="Destination",Auxilary="Auxilary";
        
       Scanner scan=new Scanner(System.in);
        
        Tower obj=new Tower();
        
        System.out.println("Enter Number of Discs ");
        int n=scan.nextInt();
        
        obj.towerOfHanoi(n, Source, Destination, Auxilary);
        
        System.out.println("Total steps = "+stepCount);
        
    }
}
