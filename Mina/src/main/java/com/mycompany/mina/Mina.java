/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mina;
import static com.mycompany.mina.TimeRegister.journeysRegister;
import static com.mycompany.mina.Licenses.noveltyRegister;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner; 
/**
 *
 * @author Alejo Galviz
 */
public class Mina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int option;

        do{
            System.out.println("\n Menú"
            + "\n 1.Registar Jornada"
            + "\n 2.Registar Novedad"
            + "\n 3.Salir");
            System.out.print("Elija una opcion");
            option = sc.nextInt();

            sc.nextLine();

 
            switch(option){

                case 1:
                    journeysRegister();
                    break;

                case 2:
                    noveltyRegister();
                    break;

                case 3:

                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
               }
        }

        while (option != 3);

         sc.close();

    }
    
    
}
    



