/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mina;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Alejo Galviz
 */
public class TimeRegister extends Workers {
        private LocalDateTime start_date;
        private LocalDateTime departure_date;

    public TimeRegister(LocalDateTime start_date, LocalDateTime departure_date, String Name, int ID) {
        super(Name, ID);
        this.start_date = start_date;
        this.departure_date = departure_date;
    }
        
       public LocalDateTime getStart_date() {
            return start_date;
        }

        public LocalDateTime getDeparture_date() {
            return departure_date;
        }
        
        public static void journeysRegister(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String Name = sc.nextLine();
        
        System.out.println("Ingrese cédula del empleado: ");
        int ID = sc.nextInt();
        Workers workers = new Workers(Name, ID);
        
        System.out.println("Ingrese la fecha de inicio (DD/MM/YY HH:MM): ");
        String startDateA = sc.nextLine();
        LocalDateTime startDate = LocalDateTime.parse(Name, DateTimeFormatter.ISO_DATE);
        
        System.out.println("Ingrese la fecha de finalización (DD/MM/YY HH:MM): ");
        String departureDateA = sc.nextLine();
        LocalDateTime departureDate = LocalDateTime.parse(Name, DateTimeFormatter.ISO_DATE);
        
        int hoursWorked = (int) startDate.until(departureDate, java.time.temporal.ChronoUnit.HOURS);
        
        if (hoursWorked < 8){
            System.out.println("Alerta, faltan " + (8 - hoursWorked) + "horas por completar");
            
        
    }
}
        
}
    
