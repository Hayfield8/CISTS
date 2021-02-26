package cists;

import cists.Condition.Mood;
import cists.Event.EventBeginTime;
import cists.Event.Location;
import com.itextpdf.text.Chunk;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import gui.Chart;
import java.io.FileNotFoundException;

/**
 * Coordinating object for CISTS.
 *
 * @author MJ Hayfield
 * @since 10-05-2020
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
    
//variables to create EventDiet
       
    /**
    * Variable used to create EventDiet object.
    * @see EventDiet
    */ 
    public boolean aEatenBefore;
    
   /**
    * Variable used to create EventDiet object.
    * @see EventDiet
    */ 
    public String aEatenWhat;
    
    /**
    * Variable used to create EventDiet object.
    * @see EventDiet
    */ 
    public boolean aDrunkAlcohol;
    
    /**
    * Variable used to create EventDiet object.
    * @see EventDiet
    */ 
    public String aDrunkWhat;
    
    /**
    * Variable used to create EventDiet object.
    * @see EventDiet
    */ 
    public boolean aHungover;
   
//EventDiet obj variable
    
       /**
    * EventObject object used to create CvsEvent object.
    * @see EventDiet
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
   
//variables to create Event
   
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public EventBeginTime aEventBeginTime;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public Location aLocation;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public int aHoursLasted;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public int aDaysLasted;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public String aNotes;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public int aIntensity;
    
    /**
    * Variable used to create Event object.
    * @see Event
    */ 
    public int aAnxietyLVL;
    
//Event obj variable;
    
    /**
    * Event object.
    * @see Event
    */ 
    public Event aEvent;
    
    /**
    * Variable used to track if a Condition object has been created.
    */ 
    public Boolean conditionCreated = false;
    
    /**
    * Variable used to track if a EventDiet object has been created.
    */ 
    public Boolean eventDietCreated = false;
    
    /**
     * Document for the summary
     */
    public Document eventSummaryDoc;
    
    public Chart chartManager;
    
    /**
     * Constructor. Creates a new instance of the CISTSCoord class. Initialises
     * events array and loads the saved CustomFieldBoss object.
     */
    public CISTSCoord(){
        
        events = new ArrayList<>();
        customFieldBoss = loadCustomFieldBoss();
        chartManager = new Chart();
        
    }
    
    /**
     * Returns a list populated with all the Event objects created by the user.
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
     * Saves the list containing all the events created by the user to a file
     * named EventsData in the program folder.
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
     * Loads EventData file and adds saved events to the events list, used on startup.
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
     * Saves the CustomFieldBoss to a file named CFBossData in the program folder. 
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
    
    /**
     * Loads CFBossData file if it exists if not it creates a new customFieldboss
     * , used on startup.
     */
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

    
    /**
     * getter for the conditionCreated variable.
     * @return Boolean
     */
    public Boolean getConditionCreated(){
        return this.conditionCreated;
    }
    
    
    /**
     * getter for the eventDietCreated variable.
     * @return Boolean
     */
    public Boolean getEventDietCreated(){
        return this.eventDietCreated;
    }
    
    /**
     * setter for the conditionCreated variable.
     * @param a Boolean
     */
    public void setConditionCreated(Boolean a){
        this.conditionCreated = a;
    }
    
    
    /**
     * setter for the eventDietCreated variable.
     * @param a Boolean
     */
    public void setEventDietCreated(Boolean a){
        this.eventDietCreated = a;
    }
    
    /**
     * method that replaces the current CFBoss with a new one.
     */
    public void resetCFBoss(){
        this.customFieldBoss = new CustomFieldBoss();
    }
    
    /**
     * creates a PDF document with a summary of each selected Event.
     * @param aEvents list of selected events
     */
    public void creatPDFSummary(List<Event> aEvents){
        eventSummaryDoc = new Document();
        
        try {
            
            PdfWriter writer = PdfWriter.getInstance(eventSummaryDoc, new 
            FileOutputStream("EventSummary.pdf"));
            eventSummaryDoc.open();
            eventSummaryDoc.addTitle("Events Summary");
            eventSummaryDoc.addHeader("Events Summary", "Events Summary");
            Font font = new Font(FontFamily.HELVETICA, 13, Font.BOLD);
            Font font2 = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
            Paragraph title = new Paragraph("Events Summary", font);
            title.setAlignment(Element.ALIGN_CENTER);
            Paragraph newEvent = new Paragraph("Next Event Summary", font2);
            newEvent.setAlignment(Element.ALIGN_CENTER);
            eventSummaryDoc.add(title);
            eventSummaryDoc.add(Chunk.NEWLINE);
            for (Event eachEvent : aEvents){
                eventSummaryDoc.add(newEvent);
                eventSummaryDoc.add(Chunk.NEWLINE);
                eventSummaryDoc.add(new Paragraph(eachEvent.stringSummary()));
                eventSummaryDoc.add(Chunk.NEWLINE);
                eventSummaryDoc.add(Chunk.NEWLINE);
            }
            eventSummaryDoc.close();
            writer.close();
        }
        catch (DocumentException | FileNotFoundException e)
        {
         e.printStackTrace();
        }
    }
    
}

