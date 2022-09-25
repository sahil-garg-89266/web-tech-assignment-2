1.

package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
         double score=sc.nextDouble();
         if(score>=80.0 && score<=90.0){
             score+=5;
         }
        System.out.println(score);

    }

}

2.

package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
         MinOfThree(34,21,85);
         
    }
    public static void MinOfThree(int a, int b, int c){
        if(a<=b && b<=c) System.out.println(a);
        if(b<=a && b<=c) System.out.println(b);
        if(c<=a && c<=b) System.out.println(c);
    }

}


3.


package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here
       Scanner sc= new Scanner(System.in);
       int c= sc.nextInt();
       switch (c){
           case 1: {
               System.out.println("january  31");

           }
           case 2: {
               System.out.println("february  28");

           } case 3: {
               System.out.println("march 31");

           } case 4: {
               System.out.println("april  30");

           } case 5: {
               System.out.println("may  31");

           } case 6: {
               System.out.println("june  30");

           } case 7: {
               System.out.println("july  31");

           } case 8: {
               System.out.println("august  31");

           } case 9: {
               System.out.println("september  30");

           } case 10: {
               System.out.println("october  31");

           } case 11: {
               System.out.println("november  30");

           } case 12: {
               System.out.println("december  31");

           }
               
       }

    }
   

}


4.

package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here

      int population=80000;
      int year=0;
      while(population<150000){
          population+=(population/20);
          year++;
      }
        System.out.println(year);

    }


}


5.

package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here

        for(int j=0;j<=5;j++){

            for(int i=1;i<=4;i++) {
                if(j==0){
                    if(i==1) System.out.print("n"+" ");
                    else System.out.print("n^"+i+" ");
                }else{
                    if(i==1|| i==2)
                    System.out.print((int)Math.pow(j,i)+" ");
                    else{
                        System.out.print((int)Math.pow(j,i)+" ");
                    }
                }
            }
            System.out.println();

        }


    }


}

//6.

package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here


        int c=3;
        do{
            System.out.print(c+" ");
            c+=3;
        }while(c<=36);


    }


}



