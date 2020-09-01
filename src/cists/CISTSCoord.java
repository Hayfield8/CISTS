
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
import gui.GUI;
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
    public CustomFields aCustomFields;
   
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

    /**
     * methods to add input fields to the gui
    */
     public void addTextField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JTextField customField;
        customLabel = new javax.swing.JLabel(aFieldName);
        customField = new javax.swing.JTextField();
        
       // gui1.customFieldPanel.invalidate();
       // gui1.customFieldPanel.add(customLabel, customField);
        gui1.customLabels.add(customLabel);
        gui1.customInputs.add(customField);
        
        
        //gui1.customFieldPanel.validate();
        //gui1.customFieldPanel.repaint();
        //gui1.customFieldPanel.updateUI();
        
        System.out.println("TextField Successfully Added");
    }
    
    public void addYesNoField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customCombo;
        customCombo = new javax.swing.JComboBox<>();
        customCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        customLabel = new javax.swing.JLabel(aFieldName);
        
        
       // gui1.customFieldPanel.add(customLabel, customCombo);
        gui1.customLabels.add(customLabel);
        gui1.customInputs.add(customCombo);
        
        //gui1.customFieldPanel.revalidate();
        //gui1.customFieldPanel.repaint();
        //gui1.customFieldPanel.updateUI();
        
        System.out.println("ComboBox Successfully Added");
    }
    
     public void addNumberField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JTextField customField;
        customLabel = new javax.swing.JLabel(aFieldName);
        customField = new javax.swing.JTextField();
        customField.setText("0");
        
        //gui1.customFieldPanel.add(customLabel, customField);
        //gui1.customLabels.add(customLabel);
       // gui1.customInputs.add(customField);
        
        
        //gui1.customFieldPanel.revalidate();
        //gui1.customFieldPanel.repaint();
        //gui1.customFieldPanel.updateUI();
        System.out.println("TextNumberField Successfully Added");
    }
    
     public void addSlider(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JSlider customSlider;
        customLabel = new javax.swing.JLabel(aFieldName);
        customSlider = new javax.swing.JSlider(1, 10);
        //gui1.customFieldPanel.add(customLabel, customSlider);
        gui1.customLabels.add(customLabel);
        gui1.customInputs.add(customSlider);
        
        //gui1.customFieldPanel.revalidate();
       // gui1.customFieldPanel.repaint();
        //gui1.customFieldPanel.updateUI();
        System.out.println("Slider Successfully Added");
    }
    
    public void addMultiCombo(String aFieldName, List<String> aMultiList){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customMulti;
        customMulti = new javax.swing.JComboBox<>();
        customMulti.setModel(new javax.swing.DefaultComboBoxModel<>
        (aMultiList.toArray(new String[0])));
        
        customLabel = new javax.swing.JLabel(aFieldName);
        
        
        //gui1.customFieldPanel.add(customLabel, customMulti);
        gui1.customLabels.add(customLabel);
        gui1.customInputs.add(customMulti);
        
        
        //gui1.customFieldPanel.revalidate();
       // gui1.customFieldPanel.repaint();
        //gui1.customFieldPanel.updateUI();
        System.out.println("MultiComboBox Successfully Added");
    } 
    
    public void GenerateCustomFields(List<CustomField> aCustomFieldList){
        
        aCustomFieldList.forEach((eachCF) -> {
            if ("textbox".equals(eachCF.getFieldType().toString())){
                addTextField(eachCF.getFieldName());
        }
            else if ("yesNo".equals(eachCF.getFieldType().toString())){
                addYesNoField(eachCF.getFieldName());
        }
            else if ("multiChoice".equals(eachCF.getFieldType().toString())){
                addMultiCombo(eachCF.getFieldName(), eachCF.getMultiList());
        }
            else if ("number".equals(eachCF.getFieldType().toString())){
                addNumberField(eachCF.getFieldName());  
        }
            else {
                addSlider(eachCF.getFieldName());
        }
        }
            );
    }
    
    public void GenerateCustomField(CustomField aCustomField){
        
            if ("textbox".equals(aCustomField.getFieldType().toString())){
                addTextField(aCustomField.getFieldName());
        }
            else if ("yesNo".equals(aCustomField.getFieldType().toString())){
                addYesNoField(aCustomField.getFieldName());
        }
            else if ("multiChoice".equals(aCustomField.getFieldType().toString())){
                addMultiCombo(aCustomField.getFieldName(), aCustomField.getMultiList());
        }
            else if ("number".equals(aCustomField.getFieldType().toString())){
                addNumberField(aCustomField.getFieldName());  
        }
            else {
                addSlider(aCustomField.getFieldName());
        }

    }
    
    
    
    
    
}

