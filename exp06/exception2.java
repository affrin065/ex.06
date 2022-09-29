/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author affrin
 */
public class exception2 {
    

    public exception2(String address, int no, int bed, int rent) {
        try{
        if(no<3 && bed>1&&bed<4 && rent<2500&&rent>500)
        {
            System.out.println("successfull");
        }
        else
        {
            System.out.println("the error occured is");
            throw(new exception3());
        }
        }
        catch(exception3 e)
        {
            System.out.println(e.getMessage());
        }
    }    

   
}


    

