
package cists;

import static cists.CISTS.gui1;
import cists.Condition.Mood;
import cists.Event.EventBeginTime;
import cists.Event.Location;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import gui.GUI1;

/**
 * Coordinating object for the CVS Tracker system.
 *
 * @author MJ Hayfield
 * @since 20-07-2019
 * @version 1.0
 */
public class CISTSCoord {
    
    /**
     * List containing all CvsEvent objects.
     */
    public List<Event> events; 
    
    /**
     * Variable used for the CFB.
     * @see CustomFieldBoss
     */
    public CustomFieldBoss customFieldBoss;
    
//variables to create vomit
   
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public boolean aVomited;
   
    /**
    * Variable used to create the cf object.
    * @see Vomit
    */ 
    public int aNoOfVomit;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public boolean aViolent;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public boolean aEatenBefore;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public String aEatenWhat;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public boolean aDrunkAlcohol;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public String aDrunkWhat;
    
    /**
    * Variable used to create vomit object.
    * @see Vomit
    */ 
    public boolean aHungover;
   
//vomit obj variable
    
       /**
    * Vomit object used to create CvsEvent object.
    * @see Vomit
    */ 
    public EventDiet aCustomFields;
   
//vriables to create condition
   
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public boolean aAnxious;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public Mood aMood;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public boolean aAreYouIll;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public String aIllWithWhat;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public boolean aSlept;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public int aHrsSlept;
    
    /**
    * Variable used to create Condition object.
    * @see Condition
    */ 
    public String aMedicationTaken;
   
//condition obj variable
   
    /**
    * Condition object used to create CvsEvent object.
    * @see Condition
    */ 
    public Condition aCondition;
   
//variables to create cvsEvent
   
    /**
    * Variable used to create CvsEvent object.
    * @see CvsEvent
    */ 
    public EventBeginTime aEventBeginTime;
    
    /**
    * Variable used to create CvsEvent object.
    * @see CvsEvent
    */ 
    public Location aLocation;
    
    /**
    * Variable used to create CvsEvent object.
    * @see CvsEvent
    */ 
    public int aHoursLasted;
    
    /**
    * Variable used to create CvsEvent object.
    * @see CvsEvent
    */ 
    public int aDaysLasted;
    
    /**
    * Variable used to create CvsEvent object.
    * @see CvsEvent
    */ 
    public String aNotes;
   
//cvsEvent obj variable;
    
    /**
    * CvsEvent object.
    * @see CvsEvent
    */ 
    public Event aEvent;
    
    public Boolean conditionCreated = false;
    
    public Boolean vomitCreated = false;
    
    public int aIntensity;
    
    public int aAnxietyLVL;
   
   
    /**
     * Creates a new instance of the CvsTrackerCoord class.
     */
    public CISTSCoord(){
        
        events = new ArrayList<>();
        customFieldBoss = loadCustomFieldBoss();
        
    }
    
    /**
     * Returns a list populated with all the cvsEvent objects created by the user.
     * @return events
     */
    public ArrayList<Event> getEvents(){
        return (ArrayList<Event>) this.events;    
    }
    
    /**
     * Displays the all objects in the events list represented by their count number
     * and the date.
     */
    void displayEvents(){
        this.getEvents();
        for (Event eachEvent : events)
        {
            System.out.println(eachEvent.getCount() + " : " + eachEvent.getDate());
        }
    }
    
    /**
     * Saves the list containing all the events created by the user.
     */
    public void saveEventsList(){
        
        try
        {
            FileOutputStream fos = new FileOutputStream("EventsData"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos) ;
            
            oos.writeObject(events);
            
            System.out.println("Events saved successfully");
            
        }
        catch (IOException ioe)
        {
            System.out.println("IO error");
        }
        
        
    }
    
    /**
     * Loads and adds saved events to the events list, used on startup.
     */
    public void loadEventsList(){
        
        try
        {
            FileInputStream fis = new FileInputStream("EventsData"); 
            ObjectInputStream ois = new ObjectInputStream(fis);
                
            events = (ArrayList) ois.readObject();
            
            System.out.println("Events loaded successfully");
        }
        catch (IOException ioe)
        {
            System.out.println("IO error, file not found");
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
        }
        
    }
    
    /**
     * Saves the CustomFieldBoss. 
     */
    public void saveCustomFieldBoss(){
        
        try
        {
            FileOutputStream fos = new FileOutputStream("CFBossData"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos) ;
            
            oos.writeObject(customFieldBoss);
            
            System.out.println("CFBoss saved successfully");
            
        }
        catch (IOException ioe)
        {
            System.out.println("IO error");
        }
    }
    
    public CustomFieldBoss loadCustomFieldBoss(){
        
        try
        {
            FileInputStream fis = new FileInputStream("CFBossData"); 
            ObjectInputStream ois = new ObjectInputStream(fis);
                
            customFieldBoss = (CustomFieldBoss) ois.readObject();
           
            System.out.println("CFBoss loaded successfully");
        }
        catch (IOException ioe)
        {
            System.out.println("IO error, file not found");
            customFieldBoss = new CustomFieldBoss();
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
        }
        
        return customFieldBoss;
    }          

    public Boolean getConditionCreated(){
        return this.conditionCreated;
    }
    
    
    
    public Boolean getVomitCreated(){
        return this.vomitCreated;
    }
    
    public void setConditionCreated(Boolean a){
        this.conditionCreated = a;
    }
    
    
    
    public void setVomitCreated(Boolean a){
        this.vomitCreated = a;
    }
    
    public void resetCFBoss(){
        this.customFieldBoss = new CustomFieldBoss();
    }
    
    
    
    
}

