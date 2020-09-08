package cists;

import gui.GUI1;
import java.io.Serializable;

/**
 *
 * <h1>Chronic Illness Symptoms Tracking System</h1>
 * This program allows the user to record information about their chronic illness
 * symptomatic events in order to compare and contrast in the hope to find triggers.
 * @author MJ Hayfield
 * @since 10-05-2020
 * @version 1.0
 * 
 */
public class CISTS implements Serializable {
    
    

    /**
     * @param args the command line arguments
     * Creates and displays the GUI and creates a new Coordinating object.
     *
     */
    
    public static void main(String[] args) {
        
        
        openGUI();
        gui1.setSize(1100, 700);
    
        
    }
    
    static GUI1 gui1 = new GUI1();
    static void openGUI(){
        
        CISTS.gui1.setVisible(true);
        CISTS.gui1.setBounds(250, 30, 700, 700);
    }
    
   
    
   
    
}
    
    
        
    
    
    
    

