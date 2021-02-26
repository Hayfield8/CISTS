package cists;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Event objects represent a single CISTS episode, each identifiable by date.
 *
 * @author MJ Hayfield
 * @since 10-05-2020
 * @version 1.0
 */
public class Event implements Serializable {
    
    // attributes
    
    /**
     * Enumeration of the period of day in which the event started.
     */
    public enum EventBeginTime {
        morning,
        afternoon,
        evening,
        lateNight,
        earlyMorning
    }
    EventBeginTime eventBeginTime;
    
    /**
     * Enumeration of the location in which the event started.
     */
    public enum Location {
        home,
        travelling,
        socialising,
        shopping,
        work,
        other
    }
    Location location;
    
    /**
     * The number of hours the event lasted.
     */
    int hoursLasted = 0;
    
    /**
     * The number of days the event lasted.
     */
    int daysLasted = 0;
    
    /**
     * The overall intensity of the event, 1-10.
    */
    int overallIntensity = 0;
    
    /**
     * The anxiety level during the event, 1-10.
     */
    int anxietyLevel = 0;
           
    
    /**
     * The date when the event started.
     */
    Date date;
    
    /**
     * Any notes about the event. 
     */
    String notes = "";
    
    /**
     * Link to eventDiet object.
     * @see EventDiet
     */
    EventDiet eventDiet;
    
    /**
     * Link to eventCustomFields object.
     * @see EventCustomFields
     */
    EventCustomFields eventCF;
   
    
    /**
     * Link to condition object.
     * @see Condition
     */
    Condition condition;
    
    /**
     * The number of Event objects created.
     */
    static int count = 0;
    
    /**
     * 
     * Initialises a new instance of a Event class with the given details and
     * the given EventDiet, EventCustomFields and Condition objects.
     * 
     * @param aEventBeginTime the event begin time
     * @param aLocation the location the event began
     * @param aHoursLasted hours the event lasted
     * @param aCondition condition object
     * @param aNotes notes regarding the event
     * @param aCustomFields vomit object
     * @param aDaysLasted days the event lasted
     * @param aEventCF custom information created by user
     * @param aIntensity intensity of event 1-10
     * @param aAnxietyLevel anxiety level during event 1-10
     */
    
    public Event (EventBeginTime aEventBeginTime, Location aLocation, int 
    aHoursLasted, int aDaysLasted, String aNotes, EventDiet aCustomFields,
    Condition aCondition, EventCustomFields aEventCF, int aIntensity, int aAnxietyLevel){
        
        eventBeginTime = aEventBeginTime;
        location = aLocation;
        hoursLasted = aHoursLasted;
        daysLasted = aDaysLasted;
        date = new Date();
        notes = aNotes;
        eventDiet = aCustomFields;
        condition = aCondition;
        count = count++;
        overallIntensity = aIntensity;
        anxietyLevel = aAnxietyLevel;
        eventCF = aEventCF;
        
        System.out.println("CvsEvent created successfully");
    }
    
//getters
    
    /**
     * Returns the time this event began.
     * @return eventBeginTime
     */
    public EventBeginTime getEventBeginTime(){
        return this.eventBeginTime;
    }
    
    /**
     * Returns the location this event began.
     * @return location
     */
    public Location getLocation(){
        return this.location;
    }
    
    /**
     * Returns the hours this event lasted.
     * @return hoursLasted
     */
    public int getHoursLasted(){
        return this.hoursLasted;
    }
    
    /**
     * Returns the number of days this event lasted.
     * @return daysLasted
     */
    public int getDaysLasted(){
        return this.daysLasted;
    }
    
    /**
     * Returns the notes regarding this event.
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }
    
    /**
     * Returns the overallIntensity associated with this event.
     * @return overallIntensity the overall intensity of this event 1-10.
     */
    public int getOverallIntensity(){
        return this.overallIntensity;
    }
    
    /**
     * Returns the anxietyLevel associated with this event.
     * @return anxietyLevel the level of anxiety during this event 1-10.
     */
    public int getAnxietyLevel(){
        return this.anxietyLevel;
    }
    
    /**
     * Returns the eventDiet object linked to this event.
     * @return eventDiet the diet information for this event.
     */
    public EventDiet getCustomFields(){
        return this.eventDiet;
    }
    
    /**
     * Returns the eventCustomField object linked to this event.
     * @return eventCF the custom information for this event.
     */
    public EventCustomFields getECF(){
        return this.eventCF;
    }
    
    /**
     * Returns the condition object linked to this event.
     * @return condition
     */
    public Condition getCondition(){
        return this.condition;
    }
    
    /**
     * Returns the count of CvsEvents created at the time of this events creation.
     * @return count
     */
    public int getCount(){
        return Event.count;
    }
    
    /**
     * Returns the date when the event was created.
     * @return date
     */
    public Date getDate(){
        return this.date;
    }
    
    /**
     * returns the mood of the user when the event was created.
     * @return String mood
     */
    public String getMood(){
        String mood = this.condition.getMood().toString();
        return mood;
    }
    
    /**
     * returns whether the user was hungover or not.
     */
    public boolean getHungover(){
        boolean hungover = this.eventDiet.getHungover();
        return hungover;
    }
    
    public int getHoursSlept(){
        int hrsSlept = this.condition.getHrsSlept();
        return hrsSlept;
    }
    
    
    public String getHungoverString(){
        String hungoverString;
        boolean hungover = this.eventDiet.getHungover();
        if (hungover == true){
            hungoverString = "Was Hungover";
        }
        else if (hungover == false){
            hungoverString = "Was Not Hungover";
        }
        else{
            hungoverString = "No Data";
        }
        return hungoverString;
    }
    
    
//setters
    
    /**
     * Sets the events begin time to the one provided.
     * @param aEventBeginTime the event begin time
     */
    public void setEventBeginTime(EventBeginTime aEventBeginTime){
        this.eventBeginTime = aEventBeginTime;
    }
    
    /**
     * Sets the location where the event began with the one provided. 
     * @param aLocation the location the event began
     */
    public void setLocation(Location aLocation){
        this.location = aLocation;
    }
    
    /**
     * Sets the number of hours the event lasted with the one provided.
     * @param aHoursLasted hours the event lasted
     */
    public void setHoursLasted(int aHoursLasted){
        this.hoursLasted = aHoursLasted;
    }
    
    /**
     * Sets the number of days the event lasted with the one provided.
     * @param aDaysLasted number of days the event lasted 
     */
    public void setDaysLasted(int aDaysLasted){
        this.daysLasted = aDaysLasted;
    }
    
    /**
     * Sets the notes regarding the event with those provided.
     * @param aNotes notes regarding the event
     */
    public void setNotes(String aNotes){
        this.notes = aNotes;
    }
    
    /**
     * Sets the overallIntensity of the event with the number provided.
     * @param aIntensity the overall intensity of the event 1-10.
     */
    public void setOverallIntensity(int aIntensity){
        this.overallIntensity = aIntensity;
    }
    
    /**
     * Sets the anxietyLevel of the event with the number provided.
     * @param aAnxietyLevel the anxiety level at the time of event 1-10.
     */
    public void setAnxietyLevel(int aAnxietyLevel){
        this.anxietyLevel = aAnxietyLevel;
    }
    
    
    
    
//EventDiet setters
    
    
    /**
     * Sets whether the user has eaten before the event began in the linked EventDiet object
     * with the answer provided.
     * @param aEatenBefore whether they had eaten before the event
     */
    public void setEDEatenBefore(boolean aEatenBefore){
        this.eventDiet.setEatenBefore(aEatenBefore);
    }
    
    /**
     * Sets what the user had eaten before the event in the linked EventDiet object with
     * the string provided.
     * @param aEatenWhat what was eaten before the event began
     */
    public void setEDEatenWhat(String aEatenWhat){
        this.eventDiet.setEatenWhat(aEatenWhat);
    }
    
    /**
     * Sets whether the user had drunk alcohol before the event in the linked EventDiet object
     * with the answer provided.
     * @param aDrunkAlcohol whether alcohol was drunk before the event or not
     */
    public void setEDDrunkAlcohol(boolean aDrunkAlcohol){
        this.eventDiet.setDrunkAlcohol(aDrunkAlcohol);
    }
    
    /**
     * Sets what alcohol the user had drunk before the event in the linked EventDiet object with
     * with the string provided.
     * @param aDrunkWhat what the user drunk before the event 
     */
    public void setEDDrunkWhat(String aDrunkWhat){
        this.eventDiet.setDrunkWhat(aDrunkWhat);
    }
    
    /**
     * Sets whether the user was hung-over or not when the event began in the linked
     * EventDiet object with the answer provided.
     * @param aHungover whether the user was hung-over during the event
     */
    public void setEDHungover(boolean aHungover){
        this.eventDiet.setHungover(aHungover);
    }
    
// condition setters
    
    /**
     * Sets whether the user was anxious when the event began in the linked Condition
     * object with the answer provided.
     * @param aAnxious whether the user was anxious at the event's beginning
     */
     public void setConditionAnxious(boolean aAnxious){
        this.condition.setAnxious(aAnxious);
    }
    
    /**
     * Sets what mood the user was when the event began in the linked Condition object
     * with the answer provided.
     * @param aMood the user's mood at the start of the event
     */
    public void setConditionMood(Condition.Mood aMood){
        this.condition.setMood(aMood);
    }
    
    /**
     * Sets whether the user was ill at all when the event began in the linked Condition 
     * object with the answer provided.
     * @param aAreYouIll whether they were ill at the start of the event
     */
    public void setConditionAreYouIll(boolean aAreYouIll){
        this.condition.setAreYouIll(aAreYouIll);
    }
    
    /**
     * Sets what the user was ill with in the linked Condition object with the string
     * provided.
     * @param aIllWithWhat what the user was ill with
     */
    public void setConditionIllWithWhat(String aIllWithWhat){
        this.condition.setIllWithWhat(aIllWithWhat);
    }
    
    /**
     * Sets whether the user had slept before the event in the linked Condition
     * object with the answer provided.
     * @param aSlept whether the user slept before the event
     */
    public void setConditionSlept(boolean aSlept){
        this.condition.setSlept(aSlept);
    }
    
    /**
     * Sets the number of hours slept before the event in the linked Condition object 
     * with the one provided.
     * @param aHrsSlept number of hours slept before event 
     */
    public void setConditionHrsSlept(int aHrsSlept){
        this.condition.setHrsSlept(aHrsSlept);
    }
    
    /**
     * Set what medication the user had taken before the event in the linked Condition 
     * object with the string provided.
     * @param aMedicationTaken the medication taken before the event
     */
    public void setConditionMedicationTaken(String aMedicationTaken){
        this.condition.setMedicationTaken(aMedicationTaken);
    }
    
//toString
    
    /**
     * Converts this Event's date into a string and returns it. For use in this events 
     * overridden toString method.
     * @return strDate  
     */
    String dateToString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("converted Date to String: " + strDate);
        return strDate;
    }
    
    /**
     * Returns a string of the date and time this object was created and the intensity
     * as a representation of this object. Utilises the dateToString method.
     * @return strDate
     */
    @Override
    public String toString(){
        
        String string = this.dateToString()+ " : " + 
                Integer.toString(this.getOverallIntensity());
        return string;
        
    }
    
    /**
     * creates a string summary of the event object.
     * @return String
     */
    public String stringSummary(){
        
        String eatenString;
        if(this.eventDiet.getEatenBefore() == true){
            eatenString = "The user had eaten " + this.eventDiet.getEatenWhat()
                    + ". ";
        }
        else {
            eatenString = "The user had not eaten.";
        }
        
        String drunkString;
        if(this.eventDiet.getDrunkAlcohol()== true){
            drunkString = "The user had drunk this alcohol before, " + 
                    this.eventDiet.getDrunkWhat() + ". ";
        }
        else {
            drunkString = "The user had not drunk alcohol.";
        }
        
        String hungoverString;
        if(this.eventDiet.getHungover() == true){
            hungoverString = "The user was hungover. ";
        }
        else {
            hungoverString = "The user was not hungover. ";
        }
        
        String illString;
        if(this.condition.areYouIll == true){
            illString = "The user was ill with " + this.condition.getIllWithWhat()
                    + ". ";
        }
        else {
            illString = "The user was not ill. ";
        }
        
        String sleptString;
        if(this.condition.getSlept() == true){
            sleptString = "The user had slept for " + 
                    Integer.toString(this.condition.getHrsSlept())
                    + " hours. ";
        }
        else {
            sleptString = "The user had not slept prior. ";
        }
        
        String customFieldString;
        customFieldString = null;
        for (int i = 0 ; i != this.eventCF.customFieldNames.size() ; i++) {
            customFieldString = customFieldString + this.eventCF.customFieldNames.get(i) + 
                    "   :   " + this.eventCF.customFieldInputs.get(i) + "   ...   ";
            
        }
        
        
        String stringSummary = "";
        stringSummary = "This event began on " + this.dateToString() + ", in the "
                + this.getEventBeginTime().toString() + 
                " and lasted for " + Integer.toString(this.getDaysLasted()) + 
                " days and " + Integer.toString(this.getHoursLasted()) + 
                " hours, while the user was at " + this.getLocation().toString() 
                + ". The intensity of the event (out of 10) was "  + 
                Integer.toString(this.getOverallIntensity()) + " with "
                + "an anxiety level of " + Integer.toString(this.getAnxietyLevel())
                + ". The user was in a " + this.condition.getMood().toString() +
                " mood. " + eatenString + drunkString + hungoverString + illString
                + sleptString + " The user left the following comments : " + 
                this.getNotes() + ".    The user added the following custom information:"
                + "   " + customFieldString + " Summary end." ;
        
        System.out.println("summary created");
        return stringSummary;
        
    }
}
