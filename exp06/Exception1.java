/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception1;

import java.util.Scanner;

/**
 *
 * @author affrin
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        exception2 obj[]=new exception2[6];
        for(int i=0;i<obj.length;i++)
        {
            Scanner o=new Scanner(System.in);
            System.out.println("enter street address");
            String add;
            add = o.next();
            System.out.println("enter no.of digits of apartment number");
            int aptno=o.nextInt();
            System.out.println("enter no.of bedroom");
            int bedno=o.nextInt();
            System.out.println("enter apartment rent");
            int rent=o.nextInt();
            obj[i]=new exception2(add,aptno,bedno,rent);
        }
    }
   
}

    
