import com.sun.source.tree.SynchronizedTree;

import java.util.*;
public class Main {
    public static void main(String[] arg){
       
        System.out.println("****HI & LO****");
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int guess=r.nextInt(100)+1;
        int userGuess,count=0;
        int opption=1;
        do {
            System.out.println("guess the number");
            userGuess=s.nextInt();
            count++;
            if(userGuess==guess){
                System.out.println("nicely done you have "+(100/count)+" % iq");
                guess=r.nextInt(100)+1;
                count=0;
            }
            else {
                if(userGuess>guess){
                    System.out.println("the number is found below your guess");
                }
                else {
                    System.out.println("the number is found above your guess");
                }
            }
            System.out.println("if you want to exit press'0' else press any button to continue");
            opption=s.nextInt();
        }while (opption!=0);
    }
}
