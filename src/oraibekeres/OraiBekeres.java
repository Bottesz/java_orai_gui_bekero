/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oraibekeres;

import java.util.Scanner;

public class OraiBekeres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem az életkorodat: ");
        int eletkor = scanner.nextInt();
        
        
        System.out.print("Kérem a nevedet: ");
        String nev = scanner.nextLine();

        System.out.print("Neved:" + nev );
        System.out.println(", korod " + eletkor);
        
        //  írj egy olyan programot 6 nál nagyobb életkort fogad el
        
        System.out.print("Kérem az életkorodat (csak 6-nál nagyobbat fogad el): ");
        if (eletkor < 6 ) {
        
        } else {
                System.out.println("Az életkor nem lehet 6 vagy annál kisebb. Próbáld újra!");
        }
    
        
        
   
        
        
        
           
        };
        
        
    }
    
