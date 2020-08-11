package cists;

import static cists.Condition.Mood.*;
import static cists.Event.EventBeginTime.*;
import static cists.Event.Location.*;
import gui.GUI;
import java.io.Serializable;
import java.util.*;

/**
 *
 * <h1>CVS Tracker</h1>
 * This program allows the user to record information about their CVS events
 * in order to compare and contrast in the hope to find triggers.
 * 
 * @author MJ Hayfield
 * @since 20-07-2019
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
        
        CISTSCoord cISTSCoord = new CISTSCoord();
        
        
        
        GUI gui = new GUI();
        gui.setVisible(true);
        
        gui.setBounds(250, 30, 700, 700);
        
        
    }
    
    
}
    
    
        
    
    
    
    

