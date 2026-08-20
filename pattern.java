//Solid Square Pattern 
/*class Pattern{
    public static void main(String args[]){
        int n =4;
        for( int row=1;row<=4;row++){
            for(int col=1;col<=4;col++){
                System.out.print("* ");
            }
       
        System.out.println();
         }
    }
}*/


//Solid Rectangle pattern
/*import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n= sc.nextInt();

        System.out.println("enter the value of coloumn:");
        int  m= sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int c =1;c<=m;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}*/

//Solid Right Angle Triangle Pattern
/*import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n= sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}*/


//Solid ROmbus Pattern
/*import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n= sc.nextInt();

        for(int r=1;r<=n;r++)
        {
            for(int s=1;s<=n-r;s++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=n;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//Inverted right angle triangle
/*import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n= sc.nextInt();

        for (int r=1;r<=n;r++)
        {
            for(int c=1;c<=n-r+1;c++){
        System.out.print("* ");
            }
        
        System.out.println();
        }
        }
    }*/


   //solid pyramid pattern
   /*import java.util.Scanner;

   class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n = sc.nextInt();

        for (int r=1;r<=n;r++){
            for(int s =1;s<=n-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   }*/

  //Inverted solid pyramid pattern
  /*import java.util.Scanner;

  class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int s=1;s<=r-1;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*n-2*r-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  }*/

 //Hollow rectangle pattern
            
    
/*import java.util.Scanner;

class Pattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row:");
        int n = sc.nextInt();

        System.out.println("Enter the value of column:");
        int m = sc.nextInt();

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= m; c++) {

                if (r == 1 || r == n || c == 1 || c == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}*/

// Hollow triangle pattern

import java.util.Scanner;

class Pattern{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row:");
        int n = sc.nextInt();

        for(int r =1 ;r<=n;r++){
            if(r==1|| r==2|| r==n){
                for(int c=1;c<=r;c++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int c=1;c<=(r-2);c++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}
            
        
       


      


