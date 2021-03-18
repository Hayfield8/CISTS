/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cists;

import static cists.CISTSCoordTest.coordInstance;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author m_hay
 */
public class EventTest {
    
    public EventTest() {
    }
    
    public static CISTSCoord coordInstance;
    public static Event aEvent;
    public static Event bEvent;
    public static Event cEvent;
    public static Event dEvent;
    public static Date createDate;
    
    @BeforeClass
    public static void setUpClass() {
        coordInstance = new CISTSCoord();
        EventDiet aEventDiet = new EventDiet(true, "biscuits", true, "Natch", false);
        Condition aCondition = new Condition(true, Condition.Mood.sad, false, "n/a", true, 8, "none");
        
        List<String> names = new ArrayList<>();
        List<String> content = new ArrayList<>();
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        content.add("a");
        content.add("b");
        content.add("c");
        content.add("d");
        EventCustomFields aEventCF = new EventCustomFields(names, content);
        
        aEvent = new Event(Event.EventBeginTime.morning, Event.Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(aEvent);
        
        bEvent = new Event(Event.EventBeginTime.morning, Event.Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(bEvent);
        
        cEvent = new Event(Event.EventBeginTime.morning, Event.Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(cEvent);
        
        dEvent = new Event(Event.EventBeginTime.morning, Event.Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(dEvent);
        
        createDate = new Date();
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of dateToString method, of class Event.
     */
    @Test
    public void testDateToString() throws ParseException {
        System.out.println("dateToString");
        String result = aEvent.dateToString();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String expResult = dateFormat.format(createDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Event.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String result = aEvent.toString();
        assertTrue(result.contains(
                Integer.toString (aEvent.getOverallIntensity()) ) && 
                result.contains(aEvent.dateToString()));
    }

    /**
     * Test of stringSummary method, of class Event.
     */
    @Test
    public void testStringSummary() {
        System.out.println("stringSummary");
        String result = aEvent.stringSummary();
        assertTrue(result.contains("Natch") && 
                result.contains("biscuits") 
                && result.contains("The user was not hungover") && 
                result.contains(Integer.toString(aEvent.getAnxietyLevel())));
    }
    
}
