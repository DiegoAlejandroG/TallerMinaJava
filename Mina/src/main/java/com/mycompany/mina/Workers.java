
package com.mycompany.mina;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Alejo Galviz
 */
public class Workers {
    private String Name;
    private int ID;

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }
    
    public Workers(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;
    }
    }
