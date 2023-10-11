/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mina;
import java.util.Scanner;
/**
 *
 * @author Alejo Galviz
 */
public class Licenses extends Workers {
            
    String type;
    private int days;

    public Licenses(String type, int days, String Name, int ID) {
        super(Name, ID);
        this.type = type;
        this.days = days;
    }
    
    public Licenses(String Name, int ID){
        super(Name, ID);
    }
    
    public String getType() {
        return type;
    }

    public int getDays() {
        return days;
    }
    
    public static void noveltyRegister(){
        Scanner sc = new Scanner(System.in);
         int option;

        do{
            System.out.println("\n Menú Novedades"
            + "\n 1.Licencias Temporales"
            + "\n 2.Licencia de Maternidad"       
            + "\n 3.Licencia de Paternidad" 
            + "\n 4.Incapacidades"
            + "\n 5.Vacaciones"
            + "\n 6.Permisos");
            System.out.print("Elija una opcion");
            option = sc.nextInt();
            sc.nextLine();

 

 

            switch(option){
                case 1:
                    RegisterTemporaryLicense();
                    break;

                case 2:
                    RegisterMaternalLeave();
                    
                case 3:
                    RegisterPaternalLeave();
                    
                case 4:
                    Incapacity();
                    
                case 5:
                    Vacations();
                    
                case 6:
                    Permissions();
                    
            


                default:
                    System.out.println("Opcion Incorrecta");
               }

        }
        while (option != 6);
        sc.close();
    }
    private static void RegisterTemporaryLicense() {
        int days = 1;
        if (days > 4){
            System.out.println("Debe tomar vacaciones");
        }
   }
    
     private static void RegisterMaternalLeave() {
         int days = 1;
         if (days <= 180){
             System.out.println("Le quedan: " + (180 - days) + "días de licencia de maternidad");
         }
    }
     
     private static void RegisterPaternalLeave() {
         int days = 1;
         if (days > 15){
            System.out.println("Debe tomar vacaciones");
    }
}   
     private static void Incapacity() {
         int days = 1;
         if (days <= 20){
             System.out.println("Le quedan: " + (20 - days) + "días de incapacidad");
    }
}
     
     private static void Vacations() {
         int days = 1;
         if (days < 15){
             System.out.println("Le quedan: " + (15 - days) + "días de vacaciones");
     }
         
    }

    private static void Permissions() {
        int days = 1;
        if (days <= 5){
            System.out.println("Permiso aceptado");
        }else {
            if (days > 5){
                System.out.println("Solicite un día de vacaciones o una licencia temporal");
            }
        }
          
    }

}