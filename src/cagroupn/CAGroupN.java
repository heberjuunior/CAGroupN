
package cagroupn;

/**
 *
 * @author heber
 */
public class CAGroupN {
    static void carlosMethod(){
            /**
             * 
             * author: Carlos Salinas
             */
            System.out.println("Hello World");
    }
    
           
    static int heberMethod(int x, int y) {
        /**
         * author: Heber Junior
         */
        
        System.out.println("the sum of " + x +" and " + y + " is "+ (x+y));
        return 0;
    }
   
    
    
    
    static int yuboMethod(){
         /**
         * author: Yubo Wang
         */  
        
        Scanner myKB =new Scanner(System.in);
        
        try{
        
            System.out.println("Please enter your first number");
            
            int Num1 =myKB.nextInt();
            
            System.out.println("Please enter your second number");
            
            int Num2 =myKB.nextInt();
            
            System.out.println("The sum of " + Num1 + "minus " + Num2 + "is " + (Num1-Num2));
        
}catch(Exception e){
            System.out.println("Error");
    }
    
    return 0;
    }
    
    public static void main(String[] args) {
       heberMethod(5,2);
       carlosMethod();
       yuboMethod();
    }
        
}
