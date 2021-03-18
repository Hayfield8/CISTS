/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cists;

import cists.Condition.Mood;
import cists.Event.EventBeginTime;
import cists.Event.Location;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
public class CISTSCoordTest {
    
    public CISTSCoordTest() {
    }
    
    public static CISTSCoord coordInstance;
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    
    @BeforeClass
    public static void setUpClass() {
        coordInstance = new CISTSCoord();
        EventDiet aEventDiet = new EventDiet(true, "biscuits", true, "Natch", false);
        Condition aCondition = new Condition(true, Mood.sad, false, "n/a", true, 8, "none");
        
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
        
        Event aEvent = new Event(EventBeginTime.morning, Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(aEvent);
        
        Event bEvent = new Event(EventBeginTime.morning, Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(bEvent);
        
        Event cEvent = new Event(EventBeginTime.morning, Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(cEvent);
        
        Event dEvent = new Event(EventBeginTime.morning, Location.home, 10, 2, 
                "none", aEventDiet, aCondition, aEventCF, 8, 9);
        coordInstance.events.add(dEvent);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * Test of getEvents method, of class CISTSCoord.
     */
    @Test
    public void testGetEvents() {
        System.out.println("getEvents");
        //CISTSCoord instance = new CISTSCoord();
        ArrayList<Event> expResult = coordInstance.events;
        ArrayList<Event> result = coordInstance.getEvents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayEvents method, of class CISTSCoord.
     */
    @Test
    public void testDisplayEvents() {

        String expResult;
            
        expResult = coordInstance.events.get(0).getCount() + " : " + coordInstance.events.get(0).getDate();
       
        
        coordInstance.displayEvents();
        assertTrue(outContent.toString().contains(expResult));
    }

    /**
     * Test of saveEventsList method, of class CISTSCoord.
     */
    @Test
    public void testSaveEventsList() {
        System.out.println("saveEventsList");
        coordInstance.saveEventsList();
        assertTrue(outContent.toString().contains("Events saved successfully"));
    }
    

    /**
     * Test of loadEventsList method, of class CISTSCoord.
     */
    @Test
    public void testLoadEventsList() {
        System.out.println("loadEventsList");
        coordInstance.saveEventsList();
        coordInstance.loadEventsList();
        assertTrue(outContent.toString().contains("Events loaded successfully"));
    }
    
   
    /**
     * Test of saveCustomFieldBoss method, of class CISTSCoord.
     */
    @Test
    public void testSaveCustomFieldBoss() {
        System.out.println("saveCustomFieldBoss");
        coordInstance.saveCustomFieldBoss();
        assertTrue(outContent.toString().contains("CFBoss saved successfully"));
    }

    /**
     * Test of loadCustomFieldBoss method, of class CISTSCoord.
     */
    @Test
    public void testLoadCustomFieldBoss() {
        System.out.println("loadCustomFieldBoss");
        coordInstance.saveCustomFieldBoss();
        coordInstance.loadCustomFieldBoss();
        assertTrue(outContent.toString().contains("CFBoss loaded successfully"));
    }

    /**
     * Test of getConditionCreated method, of class CISTSCoord.
     */
    @Test
    public void testGetConditionCreated() {
        System.out.println("getConditionCreated");
        Boolean result = coordInstance.getConditionCreated();
        assertNotNull(result);
    }

    /**
     * Test of getEventDietCreated method, of class CISTSCoord.
     */
    @Test
    public void testGetEventDietCreated() {
        System.out.println("getEventDietCreated");
        Boolean result = coordInstance.getEventDietCreated();
        assertNotNull(result);
    }

    /**
     * Test of setConditionCreated method, of class CISTSCoord.
     */
    @Test
    public void testSetConditionCreated() {
        System.out.println("setConditionCreated");
        Boolean a = true;
        coordInstance.setConditionCreated(a);
        assertTrue(coordInstance.conditionCreated);
    }

    /**
     * Test of setEventDietCreated method, of class CISTSCoord.
     */
    @Test
    public void testSetEventDietCreated() {
        System.out.println("setEventDietCreated");
        Boolean a = true;
        coordInstance.setEventDietCreated(a);
        assertTrue(coordInstance.eventDietCreated);
    }

    /**
     * Test of resetCFBoss method, of class CISTSCoord.
     */
    @Test
    public void testResetCFBoss() {
        System.out.println("resetCFBoss");
        ArrayList<String> expList = new ArrayList<>();
        coordInstance.resetCFBoss();
        assertEquals(expList, coordInstance.customFieldBoss.multiList);
    }

    /**
     * Test of creatPDFSummary method, of class CISTSCoord.
     */
    @Test
    public void testCreatPDFSummary() {
        System.out.println("creatPDFSummary");
        coordInstance.creatPDFSummary(coordInstance.events);
        assertTrue(outContent.toString().contains("PDF created successfully"));
        
    }
    
}
