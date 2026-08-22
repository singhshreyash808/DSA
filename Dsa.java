//perfect number 
/*import java.util.Scanner;

class Dsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        } 
        if(sum == n){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }   }
}*/

//print perfect number with in range
/*import java.util.Scanner;

class Dsa{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value :");
        // int n = sc.nextInt();
        int sum=0;
        
        int start = 500;
        int end = 5000;

        for(int n=start;n<end;n++){

            sum ==0;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        } 
        if(sum == n){
            System.out.println(n+"Perfect number");
        }
        else{
            System.out.println(n+"Not a perfect number");
        } }  }
}*/


import java.util.Scanner;

class Dsa{
    public static void main(String args[]){
        
        int sum=0;
        int count =0;
       
        for(int n=0;n>=0;n++){

            
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        } 
        if(sum == n){
            count++;
        }
        }
        if(count == 67){
            System.out.println(n+"is the 67 perfect number");
            break;
        } 
     }  
 }
