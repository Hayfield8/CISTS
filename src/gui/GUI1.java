package gui;

import static cists.CustomField.FieldType;
import cists.Event;
import cists.Event.Location.*;
import cists.CISTSCoord;
import cists.Condition;
import java.util.*;
import javax.swing.DefaultListModel;
import cists.Condition.Mood;
import cists.CustomField;
import cists.EventDiet;
import cists.Event.EventBeginTime;
import cists.Event.Location;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;



/**
 * GUI for CISTS. 
 * 
 * @author MJ Hayfield
 * @since 20-06-2020
 * @version 1.0
 */
public class GUI1 extends javax.swing.JFrame {
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String vomitedString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String violentString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String eatenString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String drunkString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String hungoverString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String anxiousString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String moodString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String areYouIllString;
    
    /**
     * Used to store CvsEvent attributes converted to String in order to display
     * them.
     */
    String sleptString;
    
    /**
     * Creates a new CvsTrackerCoord coordinating object.
     * @see CvsTrackerCoord
     */
    CISTSCoord cISTSCoord = new CISTSCoord();
    
    /**
     * Mood enum for use in UI.
     * @see Condition
     */
    Mood comboMood;
    
    /**
     * The CvsEvent object selected on the list.
     */
    Event selectedEvent;
    Event selectedEvent1;
    
    /**
     * List to hold the events created by the user.
     */
    List<Event> events;
    
    /**
     * List to hold the customFields created by the user.
     */
    List<CustomField> customFields;
    
    /**
     * List to hold the custom labels generated form the customField objects.
     */
    public List<javax.swing.JLabel> customLabels; 
    
    /**
     * List to hold the custom input components generated from the customField
     * objects.
     */
    public List<Object> customInputs;
    
    /**
     * List to hold the multiple choice options added by the user.
     */
    public List<String> tempMultiOptions;
    
    /**
     * count of custom generated fields.
     */
    int customCount = 0;
    
    /**
     * box to hold the generated fields.
     */
    public Box cFBox = Box.createVerticalBox(); 
    
    /**
     * variable to reference the customFieldGUI window.
     */
    CustomFieldGUI customFieldGUI;
    
    /**
     * variable to reference the customFieldGUIView window.
     */
    CustomFieldGUIView customFieldGUIView;
    
    /**
     * List model used to populate the events jList.
     */
    DefaultListModel model;
    
    /**
     * List model used to populate the customFields JList.
     */
    DefaultListModel cFModel;
    
    /**
     * Object to display a JFreeChart.
     */
    ChartGUI chartGUI;
    
    /**
     * Strings for chart creation.
     */
    String chartTypeString;
    String xAxisString;
    String yAxisString;
    String chartTitleString;
    
    /**
     * Creates new form GUI loads and displays the events list, loads the new
     * event form and sets the list models to populate the jLists.
     */
    public GUI1() {
        
      initComponents();
      
      cISTSCoord.loadEventsList();  
      customFields = cISTSCoord.customFieldBoss.getCustomFieldList();
      events = cISTSCoord.getEvents();
      
      //customFields = cISTSCoord.customFieldBoss.getCustomFieldList();
      
      customInputs = new ArrayList<>();
      customLabels = new ArrayList<>();
      tempMultiOptions = new ArrayList<>();
      
      model = new DefaultListModel();
      for (Event eachEvent : events){
          model.addElement(eachEvent);
      }
      
      cFModel = new DefaultListModel();
      for (CustomField eachCF : customFields){
          cFModel.addElement(eachCF);
      }
      
      
      eventList1.setModel(model);
      eventList3.setModel(model);
      eventList4.setModel(model);
      customFieldList.setModel(cFModel);
    }
    
    

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventDetailsDialog = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        vomitDetailsTab = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        eatenDisplay = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        eatenWhatDisplay = new javax.swing.JTextArea();
        drunkDisplay = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        drunkWhatDisplay = new javax.swing.JTextArea();
        hungoverDisplay = new javax.swing.JTextField();
        ViewECFButton1 = new javax.swing.JToggleButton();
        conditionDetailsTab = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        anxiousDisplay = new javax.swing.JTextField();
        moodDisplay = new javax.swing.JTextField();
        illDisplay = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        illWithWhatDisplay = new javax.swing.JTextArea();
        sleptDisplay = new javax.swing.JTextField();
        hrsSleptDisplay = new javax.swing.JTextField();
        medicationDisplay = new javax.swing.JTextField();
        generalDetailsTab = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        beginTimeDisplay = new javax.swing.JTextField();
        locationDisplay = new javax.swing.JTextField();
        hrsLastedDisplay = new javax.swing.JTextField();
        daysLastedDisplay = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        notesDisplay = new javax.swing.JTextArea();
        dateDisplay = new javax.swing.JTextField();
        intensitySliderDisplay1 = new javax.swing.JSlider();
        anxietySliderDisplay1 = new javax.swing.JSlider();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        createEventError = new javax.swing.JDialog();
        jLabel45 = new javax.swing.JLabel();
        listSavedDialog = new javax.swing.JDialog();
        jLabel46 = new javax.swing.JLabel();
        infoStoredDialog = new javax.swing.JDialog();
        jLabel47 = new javax.swing.JLabel();
        eventCreatedDialog = new javax.swing.JDialog();
        jLabel48 = new javax.swing.JLabel();
        editEventDetailsDialog = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        generalDetailsTab1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        hrsLastedDisplay1 = new javax.swing.JTextField();
        daysLastedDisplay1 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        notesDisplay1 = new javax.swing.JTextArea();
        dateDisplay1 = new javax.swing.JTextField();
        beginTimeCombo1 = new javax.swing.JComboBox<>();
        locationCombo1 = new javax.swing.JComboBox<>();
        editBeginTimeButton = new javax.swing.JButton();
        editLocationButton = new javax.swing.JButton();
        editHrsLastedButton = new javax.swing.JButton();
        editDaysLastedButton = new javax.swing.JButton();
        editNotesButton = new javax.swing.JButton();
        intensitySliderDisplay4 = new javax.swing.JSlider();
        anxietySliderDisplay4 = new javax.swing.JSlider();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        editIntensityButton = new javax.swing.JButton();
        editAnxietyLVLButton = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        vomitDetailsTab1 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        eatenWhatDisplay1 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        drunkWhatDisplay1 = new javax.swing.JTextArea();
        eatenCombo1 = new javax.swing.JComboBox<>();
        drunkCombo1 = new javax.swing.JComboBox<>();
        hungoverCombo1 = new javax.swing.JComboBox<>();
        editDrunkButton = new javax.swing.JButton();
        editEatenButton = new javax.swing.JButton();
        editEatenWhatButton = new javax.swing.JButton();
        editDrunkWhatButton = new javax.swing.JButton();
        editHungoverButton = new javax.swing.JButton();
        conditionDetailsTab1 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        illWithWhatDisplay1 = new javax.swing.JTextArea();
        hrsSleptDisplay1 = new javax.swing.JTextField();
        medicationDisplay1 = new javax.swing.JTextField();
        anxiousCombo1 = new javax.swing.JComboBox<>();
        moodCombo1 = new javax.swing.JComboBox<>();
        areYouIllCombo1 = new javax.swing.JComboBox<>();
        sleptCombo1 = new javax.swing.JComboBox<>();
        editAnxiousButton = new javax.swing.JButton();
        editMoodButton = new javax.swing.JButton();
        editAreYouIllButton = new javax.swing.JButton();
        editSleptButton = new javax.swing.JButton();
        editIllWithWhatButton = new javax.swing.JButton();
        editHrsSleptButton = new javax.swing.JButton();
        editMedicationButton = new javax.swing.JButton();
        dualEventDetailsDialog = new javax.swing.JDialog();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        generalDetailsTab3 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        beginTimeDisplay2 = new javax.swing.JTextField();
        locationDisplay2 = new javax.swing.JTextField();
        hrsLastedDisplay3 = new javax.swing.JTextField();
        daysLastedDisplay3 = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        notesDisplay3 = new javax.swing.JTextArea();
        dateDisplay3 = new javax.swing.JTextField();
        anxietySliderDisplay2 = new javax.swing.JSlider();
        intensitySliderDisplay2 = new javax.swing.JSlider();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        vomitDetailsTab3 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        eatenDisplay2 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        eatenWhatDisplay3 = new javax.swing.JTextArea();
        drunkDisplay2 = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        drunkWhatDisplay3 = new javax.swing.JTextArea();
        hungoverDisplay2 = new javax.swing.JTextField();
        ViewECFButton2 = new javax.swing.JToggleButton();
        conditionDetailsTab3 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        anxiousDisplay2 = new javax.swing.JTextField();
        moodDisplay2 = new javax.swing.JTextField();
        illDisplay2 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        illWithWhatDisplay3 = new javax.swing.JTextArea();
        sleptDisplay2 = new javax.swing.JTextField();
        hrsSleptDisplay3 = new javax.swing.JTextField();
        medicationDisplay3 = new javax.swing.JTextField();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        generalDetailsTab4 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        beginTimeDisplay3 = new javax.swing.JTextField();
        locationDisplay3 = new javax.swing.JTextField();
        hrsLastedDisplay4 = new javax.swing.JTextField();
        daysLastedDisplay4 = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        notesDisplay4 = new javax.swing.JTextArea();
        dateDisplay4 = new javax.swing.JTextField();
        anxietySliderDisplay3 = new javax.swing.JSlider();
        intensitySliderDisplay3 = new javax.swing.JSlider();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        vomitDetailsTab4 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        eatenDisplay3 = new javax.swing.JTextField();
        jScrollPane25 = new javax.swing.JScrollPane();
        eatenWhatDisplay4 = new javax.swing.JTextArea();
        drunkDisplay3 = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        drunkWhatDisplay4 = new javax.swing.JTextArea();
        hungoverDisplay3 = new javax.swing.JTextField();
        ViewECFButton3 = new javax.swing.JToggleButton();
        conditionDetailsTab4 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        anxiousDisplay3 = new javax.swing.JTextField();
        moodDisplay3 = new javax.swing.JTextField();
        illDisplay3 = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        illWithWhatDisplay4 = new javax.swing.JTextArea();
        sleptDisplay3 = new javax.swing.JTextField();
        hrsSleptDisplay4 = new javax.swing.JTextField();
        medicationDisplay4 = new javax.swing.JTextField();
        createCFDialog = new javax.swing.JDialog();
        jLabel133 = new javax.swing.JLabel();
        fieldTypeCombo = new javax.swing.JComboBox<>();
        jLabel134 = new javax.swing.JLabel();
        newFieldNameField = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        multiChoiceField = new javax.swing.JTextField();
        addToMultiOptionsButton = new javax.swing.JButton();
        addNewCFButton = new javax.swing.JButton();
        cFListDialog = new javax.swing.JDialog();
        jScrollPane28 = new javax.swing.JScrollPane();
        customFieldList = new javax.swing.JList<>();
        select2EventErrorDialog = new javax.swing.JDialog();
        jLabel55 = new javax.swing.JLabel();
        cFBossSavedDialog = new javax.swing.JDialog();
        jLabel56 = new javax.swing.JLabel();
        resetCustomFieldsDialog = new javax.swing.JDialog();
        yesButton = new javax.swing.JToggleButton();
        noButton = new javax.swing.JToggleButton();
        jLabel57 = new javax.swing.JLabel();
        cFBossResetDialog = new javax.swing.JDialog();
        jLabel97 = new javax.swing.JLabel();
        deleteEventDialog = new javax.swing.JDialog();
        yesButton1 = new javax.swing.JToggleButton();
        noButton1 = new javax.swing.JToggleButton();
        jLabel98 = new javax.swing.JLabel();
        summarySelectionDialog = new javax.swing.JDialog();
        jScrollPane29 = new javax.swing.JScrollPane();
        eventList4 = new javax.swing.JList();
        createSummaryFinalButton = new javax.swing.JToggleButton();
        chartButton = new javax.swing.JButton();
        xAxisCombo = new javax.swing.JComboBox<>();
        jLabel118 = new javax.swing.JLabel();
        chartTypeCombo = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        yAxisCombo = new javax.swing.JComboBox<>();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        chartTitleField = new javax.swing.JTextField();
        eventDeletedDialog = new javax.swing.JDialog();
        jLabel99 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        addEventTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createEventDietButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        eatenCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        eatenWhatField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        drunkCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        drunkWhatField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        hungoverCombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        anxiousCombo = new javax.swing.JComboBox<>();
        createCondition = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        moodCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        areYouIllCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        illWithWhatField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sleptCombo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        hrsSleptField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicationTakenArea = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        beginTimeCombo = new javax.swing.JComboBox<>();
        createEvent = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        hoursLastedField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        daysLastedField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        goToCustomInputButton = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        intensitySlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        anxietySlider = new javax.swing.JSlider();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        eventListTab = new javax.swing.JPanel();
        listLabel = new javax.swing.JLabel();
        selectEventButton = new javax.swing.JButton();
        saveListButton = new javax.swing.JButton();
        editEventButton = new javax.swing.JButton();
        listScrollPane4 = new javax.swing.JScrollPane();
        eventList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        generalDetailsTab2 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        beginTimeDisplay1 = new javax.swing.JTextField();
        locationDisplay1 = new javax.swing.JTextField();
        hrsLastedDisplay2 = new javax.swing.JTextField();
        daysLastedDisplay2 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        notesDisplay2 = new javax.swing.JTextArea();
        dateDisplay2 = new javax.swing.JTextField();
        ViewECFButton = new javax.swing.JToggleButton();
        intensitySliderDisplay = new javax.swing.JSlider();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        anxietySliderDisplay = new javax.swing.JSlider();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        vomitDetailsTab2 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        eatenDisplay1 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        eatenWhatDisplay2 = new javax.swing.JTextArea();
        drunkDisplay1 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        drunkWhatDisplay2 = new javax.swing.JTextArea();
        hungoverDisplay1 = new javax.swing.JTextField();
        conditionDetailsTab2 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        anxiousDisplay1 = new javax.swing.JTextField();
        moodDisplay1 = new javax.swing.JTextField();
        illDisplay1 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        illWithWhatDisplay2 = new javax.swing.JTextArea();
        sleptDisplay1 = new javax.swing.JTextField();
        hrsSleptDisplay2 = new javax.swing.JTextField();
        medicationDisplay2 = new javax.swing.JTextField();
        listScrollPane6 = new javax.swing.JScrollPane();
        eventList3 = new javax.swing.JList();
        select2EventButton = new javax.swing.JButton();
        addCFButton = new javax.swing.JButton();
        saveCFButton = new javax.swing.JToggleButton();
        cFListButton = new javax.swing.JToggleButton();
        resetCFBossButton = new javax.swing.JToggleButton();
        eventSummaryButton = new javax.swing.JToggleButton();
        deleteEventButton = new javax.swing.JToggleButton();

        eventDetailsDialog.setTitle("Event Information");

        jLabel28.setText("Had you eaten beforehand?");

        jLabel29.setText("If so what?");

        jLabel30.setText("Had you drunk alcohol prior?");

        jLabel31.setText("What did you drink?");

        jLabel32.setText("Were you hungover?");

        eatenWhatDisplay.setColumns(20);
        eatenWhatDisplay.setRows(5);
        jScrollPane5.setViewportView(eatenWhatDisplay);

        drunkWhatDisplay.setColumns(20);
        drunkWhatDisplay.setRows(5);
        jScrollPane6.setViewportView(drunkWhatDisplay);

        ViewECFButton1.setText("View Events Custom Details");
        ViewECFButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewECFButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vomitDetailsTabLayout = new javax.swing.GroupLayout(vomitDetailsTab);
        vomitDetailsTab.setLayout(vomitDetailsTabLayout);
        vomitDetailsTabLayout.setHorizontalGroup(
            vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vomitDetailsTabLayout.createSequentialGroup()
                        .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(99, 99, 99)
                        .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(eatenDisplay)
                            .addComponent(drunkDisplay)
                            .addComponent(hungoverDisplay)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                    .addGroup(vomitDetailsTabLayout.createSequentialGroup()
                        .addComponent(ViewECFButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        vomitDetailsTabLayout.setVerticalGroup(
            vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(eatenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(drunkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(hungoverDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ViewECFButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Diet & Custom Details", vomitDetailsTab);

        jLabel33.setText("Were you anxious?");

        jLabel34.setText("What was your mood?");

        jLabel35.setText("Are you ill?");

        jLabel36.setText("Ill with what?");

        jLabel37.setText("Have you slept?");

        jLabel38.setText("How many hours did you sleep?");

        jLabel39.setText("What medication have you taken?");

        anxiousDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousDisplayActionPerformed(evt);
            }
        });

        moodDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodDisplayActionPerformed(evt);
            }
        });

        illDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illDisplayActionPerformed(evt);
            }
        });

        illWithWhatDisplay.setColumns(20);
        illWithWhatDisplay.setRows(5);
        jScrollPane7.setViewportView(illWithWhatDisplay);

        hrsSleptDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conditionDetailsTabLayout = new javax.swing.GroupLayout(conditionDetailsTab);
        conditionDetailsTab.setLayout(conditionDetailsTabLayout);
        conditionDetailsTabLayout.setHorizontalGroup(
            conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTabLayout.createSequentialGroup()
                        .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addGap(68, 68, 68)
                        .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(sleptDisplay)
                            .addComponent(hrsSleptDisplay)
                            .addComponent(medicationDisplay)))
                    .addGroup(conditionDetailsTabLayout.createSequentialGroup()
                        .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(124, 124, 124)
                        .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(illDisplay)
                            .addComponent(moodDisplay)
                            .addComponent(anxiousDisplay))))
                .addContainerGap())
        );
        conditionDetailsTabLayout.setVerticalGroup(
            conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(anxiousDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(moodDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(illDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(sleptDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(hrsSleptDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(medicationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Condition Details", conditionDetailsTab);

        jLabel40.setText("When did the event begin?");

        jLabel41.setText("Where were you when it began?");

        jLabel42.setText("How many hours did the event last?");

        jLabel43.setText("How many days did the event last?");

        jLabel44.setText("Notes");

        jLabel3.setText("Date recorded");

        beginTimeDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginTimeDisplayActionPerformed(evt);
            }
        });

        daysLastedDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedDisplayActionPerformed(evt);
            }
        });

        notesDisplay.setColumns(20);
        notesDisplay.setRows(5);
        jScrollPane8.setViewportView(notesDisplay);

        dateDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDisplayActionPerformed(evt);
            }
        });

        intensitySliderDisplay1.setMaximum(10);
        intensitySliderDisplay1.setMinimum(1);
        intensitySliderDisplay1.setMinorTickSpacing(1);
        intensitySliderDisplay1.setPaintLabels(true);
        intensitySliderDisplay1.setPaintTicks(true);
        intensitySliderDisplay1.setSnapToTicks(true);
        intensitySliderDisplay1.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySliderDisplay1.setValue(1);

        anxietySliderDisplay1.setMaximum(10);
        anxietySliderDisplay1.setMinimum(1);
        anxietySliderDisplay1.setMinorTickSpacing(1);
        anxietySliderDisplay1.setPaintLabels(true);
        anxietySliderDisplay1.setPaintTicks(true);
        anxietySliderDisplay1.setSnapToTicks(true);
        anxietySliderDisplay1.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySliderDisplay1.setValue(1);

        jLabel142.setText("1");

        jLabel143.setText("10");

        jLabel144.setText("1");

        jLabel145.setText("10");

        jLabel146.setText("Overall Intensity");

        jLabel147.setText("Anxiety Level");

        javax.swing.GroupLayout generalDetailsTabLayout = new javax.swing.GroupLayout(generalDetailsTab);
        generalDetailsTab.setLayout(generalDetailsTabLayout);
        generalDetailsTabLayout.setHorizontalGroup(
            generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel3)
                    .addComponent(jLabel146)
                    .addComponent(jLabel147))
                .addGap(64, 64, 64)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailsTabLayout.createSequentialGroup()
                        .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel142, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(generalDetailsTabLayout.createSequentialGroup()
                                .addComponent(anxietySliderDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel145))
                            .addGroup(generalDetailsTabLayout.createSequentialGroup()
                                .addComponent(intensitySliderDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel143)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(daysLastedDisplay)
                    .addComponent(hrsLastedDisplay)
                    .addComponent(locationDisplay)
                    .addComponent(beginTimeDisplay)
                    .addComponent(dateDisplay))
                .addContainerGap())
        );
        generalDetailsTabLayout.setVerticalGroup(
            generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(intensitySliderDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel142)
                        .addComponent(jLabel146))
                    .addComponent(jLabel143))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anxietySliderDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel144)
                        .addComponent(jLabel147))
                    .addComponent(jLabel145))
                .addGap(30, 30, 30)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(beginTimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(locationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(hrsLastedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(daysLastedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("General Details", generalDetailsTab);

        jScrollPane4.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout eventDetailsDialogLayout = new javax.swing.GroupLayout(eventDetailsDialog.getContentPane());
        eventDetailsDialog.getContentPane().setLayout(eventDetailsDialogLayout);
        eventDetailsDialogLayout.setHorizontalGroup(
            eventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        eventDetailsDialogLayout.setVerticalGroup(
            eventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jLabel45.setText("   Please ensure you have store the diet, custom and condition informtion.");

        javax.swing.GroupLayout createEventErrorLayout = new javax.swing.GroupLayout(createEventError.getContentPane());
        createEventError.getContentPane().setLayout(createEventErrorLayout);
        createEventErrorLayout.setHorizontalGroup(
            createEventErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createEventErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        createEventErrorLayout.setVerticalGroup(
            createEventErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("List saved");

        javax.swing.GroupLayout listSavedDialogLayout = new javax.swing.GroupLayout(listSavedDialog.getContentPane());
        listSavedDialog.getContentPane().setLayout(listSavedDialogLayout);
        listSavedDialogLayout.setHorizontalGroup(
            listSavedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSavedDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        listSavedDialogLayout.setVerticalGroup(
            listSavedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Info Stored");

        javax.swing.GroupLayout infoStoredDialogLayout = new javax.swing.GroupLayout(infoStoredDialog.getContentPane());
        infoStoredDialog.getContentPane().setLayout(infoStoredDialogLayout);
        infoStoredDialogLayout.setHorizontalGroup(
            infoStoredDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoStoredDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        infoStoredDialogLayout.setVerticalGroup(
            infoStoredDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Event Created");

        javax.swing.GroupLayout eventCreatedDialogLayout = new javax.swing.GroupLayout(eventCreatedDialog.getContentPane());
        eventCreatedDialog.getContentPane().setLayout(eventCreatedDialogLayout);
        eventCreatedDialogLayout.setHorizontalGroup(
            eventCreatedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventCreatedDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        eventCreatedDialogLayout.setVerticalGroup(
            eventCreatedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        editEventDetailsDialog.setTitle("Event Information");

        jLabel49.setText("When did the event begin?");

        jLabel50.setText("Where were you when it began?");

        jLabel51.setText("How many hours did the event last?");

        jLabel52.setText("How many days did the event last?");

        jLabel53.setText("Notes");

        jLabel54.setText("Date recorded");

        daysLastedDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedDisplay1ActionPerformed(evt);
            }
        });

        notesDisplay1.setColumns(20);
        notesDisplay1.setRows(5);
        jScrollPane10.setViewportView(notesDisplay1);

        dateDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDisplay1ActionPerformed(evt);
            }
        });

        beginTimeCombo1.setModel(new DefaultComboBoxModel(EventBeginTime.values()) );

        locationCombo1.setModel(new DefaultComboBoxModel(Location.values()));

        editBeginTimeButton.setText("Update");
        editBeginTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBeginTimeButtonActionPerformed(evt);
            }
        });

        editLocationButton.setText("Update");
        editLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLocationButtonActionPerformed(evt);
            }
        });

        editHrsLastedButton.setText("Update");
        editHrsLastedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHrsLastedButtonActionPerformed(evt);
            }
        });

        editDaysLastedButton.setText("Update");
        editDaysLastedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDaysLastedButtonActionPerformed(evt);
            }
        });

        editNotesButton.setText("Update");
        editNotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNotesButtonActionPerformed(evt);
            }
        });

        intensitySliderDisplay4.setMaximum(10);
        intensitySliderDisplay4.setMinimum(1);
        intensitySliderDisplay4.setMinorTickSpacing(1);
        intensitySliderDisplay4.setPaintLabels(true);
        intensitySliderDisplay4.setPaintTicks(true);
        intensitySliderDisplay4.setSnapToTicks(true);
        intensitySliderDisplay4.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySliderDisplay4.setValue(1);

        anxietySliderDisplay4.setMaximum(10);
        anxietySliderDisplay4.setMinimum(1);
        anxietySliderDisplay4.setMinorTickSpacing(1);
        anxietySliderDisplay4.setPaintLabels(true);
        anxietySliderDisplay4.setPaintTicks(true);
        anxietySliderDisplay4.setSnapToTicks(true);
        anxietySliderDisplay4.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySliderDisplay4.setValue(1);

        jLabel161.setText("10");

        jLabel162.setText("10");

        editIntensityButton.setText("Update");
        editIntensityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIntensityButtonActionPerformed(evt);
            }
        });

        editAnxietyLVLButton.setText("Update");
        editAnxietyLVLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnxietyLVLButtonActionPerformed(evt);
            }
        });

        jLabel163.setText("1");

        jLabel164.setText("1");

        jLabel165.setText("Overall Intensity");

        jLabel166.setText("Anxiety Level");

        javax.swing.GroupLayout generalDetailsTab1Layout = new javax.swing.GroupLayout(generalDetailsTab1);
        generalDetailsTab1.setLayout(generalDetailsTab1Layout);
        generalDetailsTab1Layout.setHorizontalGroup(
            generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel165)
                            .addComponent(jLabel166))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editAnxietyLVLButton))
                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addGap(55, 55, 55)
                        .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                        .addComponent(jLabel164)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(intensitySliderDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel162))
                                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                        .addComponent(jLabel163)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anxietySliderDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel161)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editIntensityButton))
                            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                .addComponent(locationCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editLocationButton))
                            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                .addComponent(beginTimeCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editBeginTimeButton))
                            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(daysLastedDisplay1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hrsLastedDisplay1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editDaysLastedButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editNotesButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editHrsLastedButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(dateDisplay1))))
                .addContainerGap())
        );
        generalDetailsTab1Layout.setVerticalGroup(
            generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                        .addComponent(editIntensityButton)
                        .addGap(18, 18, 18)
                        .addComponent(editAnxietyLVLButton)
                        .addGap(40, 40, 40))
                    .addGroup(generalDetailsTab1Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel162)
                            .addComponent(intensitySliderDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel164)
                                .addComponent(jLabel165)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anxietySliderDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel163)
                                .addComponent(jLabel166))
                            .addComponent(jLabel161, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43)))
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(beginTimeCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBeginTimeButton))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(locationCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editLocationButton))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(hrsLastedDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editHrsLastedButton))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(daysLastedDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDaysLastedButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNotesButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(dateDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("General Details", generalDetailsTab1);

        jLabel58.setText("Had you eaten beforehand?");

        jLabel59.setText("If so what?");

        jLabel60.setText("Had you drunk alcohol prior?");

        jLabel61.setText("What did you drink?");

        jLabel62.setText("Were you hungover?");

        eatenWhatDisplay1.setColumns(20);
        eatenWhatDisplay1.setRows(5);
        jScrollPane11.setViewportView(eatenWhatDisplay1);

        drunkWhatDisplay1.setColumns(20);
        drunkWhatDisplay1.setRows(5);
        jScrollPane12.setViewportView(drunkWhatDisplay1);

        eatenCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        drunkCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        drunkCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drunkCombo1ActionPerformed(evt);
            }
        });

        hungoverCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        hungoverCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hungoverCombo1ActionPerformed(evt);
            }
        });

        editDrunkButton.setText("Update");
        editDrunkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDrunkButtonActionPerformed(evt);
            }
        });

        editEatenButton.setText("Update");
        editEatenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEatenButtonActionPerformed(evt);
            }
        });

        editEatenWhatButton.setText("Update");
        editEatenWhatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEatenWhatButtonActionPerformed(evt);
            }
        });

        editDrunkWhatButton.setText("Update");
        editDrunkWhatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDrunkWhatButtonActionPerformed(evt);
            }
        });

        editHungoverButton.setText("Update");
        editHungoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHungoverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vomitDetailsTab1Layout = new javax.swing.GroupLayout(vomitDetailsTab1);
        vomitDetailsTab1.setLayout(vomitDetailsTab1Layout);
        vomitDetailsTab1Layout.setHorizontalGroup(
            vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel62))
                .addGap(85, 85, 85)
                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                        .addComponent(eatenCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editEatenButton))
                    .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                        .addComponent(drunkCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editDrunkButton))
                    .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                        .addComponent(hungoverCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editHungoverButton))
                    .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                        .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editEatenWhatButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editDrunkWhatButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        vomitDetailsTab1Layout.setVerticalGroup(
            vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vomitDetailsTab1Layout.createSequentialGroup()
                        .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel58)
                                    .addComponent(eatenCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editEatenButton))
                                .addGap(18, 18, 18)
                                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(vomitDetailsTab1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(editEatenWhatButton)))
                        .addGap(18, 18, 18)
                        .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(drunkCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editDrunkButton))
                        .addGap(18, 18, 18)
                        .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(editDrunkWhatButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(hungoverCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editHungoverButton))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Diet Details", vomitDetailsTab1);

        jLabel63.setText("Were you anxious?");

        jLabel64.setText("What was your mood?");

        jLabel65.setText("Are you ill?");

        jLabel66.setText("Ill with what?");

        jLabel67.setText("Have you slept?");

        jLabel68.setText("How many hours did you sleep?");

        jLabel69.setText("What medication have you taken?");

        illWithWhatDisplay1.setColumns(20);
        illWithWhatDisplay1.setRows(5);
        jScrollPane13.setViewportView(illWithWhatDisplay1);

        hrsSleptDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptDisplay1ActionPerformed(evt);
            }
        });

        anxiousCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        anxiousCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousCombo1ActionPerformed(evt);
            }
        });

        moodCombo1.setModel(new DefaultComboBoxModel(Mood.values()));

        areYouIllCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        sleptCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        editAnxiousButton.setText("Update");
        editAnxiousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnxiousButtonActionPerformed(evt);
            }
        });

        editMoodButton.setText("Update");
        editMoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMoodButtonActionPerformed(evt);
            }
        });

        editAreYouIllButton.setText("Update");
        editAreYouIllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAreYouIllButtonActionPerformed(evt);
            }
        });

        editSleptButton.setText("Update");
        editSleptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSleptButtonActionPerformed(evt);
            }
        });

        editIllWithWhatButton.setText("Update");
        editIllWithWhatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIllWithWhatButtonActionPerformed(evt);
            }
        });

        editHrsSleptButton.setText("Update");
        editHrsSleptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHrsSleptButtonActionPerformed(evt);
            }
        });

        editMedicationButton.setText("Update");
        editMedicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMedicationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conditionDetailsTab1Layout = new javax.swing.GroupLayout(conditionDetailsTab1);
        conditionDetailsTab1.setLayout(conditionDetailsTab1Layout);
        conditionDetailsTab1Layout.setHorizontalGroup(
            conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68)
                            .addComponent(jLabel67))
                        .addGap(68, 68, 68)
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                                .addComponent(sleptCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editSleptButton))
                            .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(medicationDisplay1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hrsSleptDisplay1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editIllWithWhatButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editHrsSleptButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editMedicationButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65))
                        .addGap(124, 124, 124)
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(areYouIllCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(anxiousCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moodCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editAnxiousButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editMoodButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editAreYouIllButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        conditionDetailsTab1Layout.setVerticalGroup(
            conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(anxiousCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAnxiousButton))
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(moodCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(conditionDetailsTab1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(editMoodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conditionDetailsTab1Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(areYouIllCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editAreYouIllButton))
                        .addGap(19, 19, 19)
                        .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(editIllWithWhatButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sleptCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editSleptButton)))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(hrsSleptDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editHrsSleptButton))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(medicationDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editMedicationButton))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Condition Details", conditionDetailsTab1);

        jScrollPane9.setViewportView(jTabbedPane3);

        javax.swing.GroupLayout editEventDetailsDialogLayout = new javax.swing.GroupLayout(editEventDetailsDialog.getContentPane());
        editEventDetailsDialog.getContentPane().setLayout(editEventDetailsDialogLayout);
        editEventDetailsDialogLayout.setHorizontalGroup(
            editEventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        editEventDetailsDialogLayout.setVerticalGroup(
            editEventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );

        jLabel91.setText("When did the event begin?");

        jLabel92.setText("Where were you when it began?");

        jLabel93.setText("How many hours did the event last?");

        jLabel94.setText("How many days did the event last?");

        jLabel95.setText("Notes");

        jLabel96.setText("Date recorded");

        beginTimeDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginTimeDisplay2ActionPerformed(evt);
            }
        });

        daysLastedDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedDisplay3ActionPerformed(evt);
            }
        });

        notesDisplay3.setColumns(20);
        notesDisplay3.setRows(5);
        jScrollPane19.setViewportView(notesDisplay3);

        dateDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDisplay3ActionPerformed(evt);
            }
        });

        anxietySliderDisplay2.setMaximum(10);
        anxietySliderDisplay2.setMinimum(1);
        anxietySliderDisplay2.setMinorTickSpacing(1);
        anxietySliderDisplay2.setPaintLabels(true);
        anxietySliderDisplay2.setPaintTicks(true);
        anxietySliderDisplay2.setSnapToTicks(true);
        anxietySliderDisplay2.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySliderDisplay2.setValue(1);

        intensitySliderDisplay2.setMaximum(10);
        intensitySliderDisplay2.setMinimum(1);
        intensitySliderDisplay2.setMinorTickSpacing(1);
        intensitySliderDisplay2.setPaintLabels(true);
        intensitySliderDisplay2.setPaintTicks(true);
        intensitySliderDisplay2.setSnapToTicks(true);
        intensitySliderDisplay2.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySliderDisplay2.setValue(1);

        jLabel25.setText("1");

        jLabel26.setText("1");

        jLabel27.setText("10");

        jLabel148.setText("10");

        jLabel149.setText("Overall Intensity");

        jLabel150.setText("Anxiety Level");

        javax.swing.GroupLayout generalDetailsTab3Layout = new javax.swing.GroupLayout(generalDetailsTab3);
        generalDetailsTab3.setLayout(generalDetailsTab3Layout);
        generalDetailsTab3Layout.setHorizontalGroup(
            generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailsTab3Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel149)
                            .addComponent(jLabel150))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96))
                        .addGap(64, 64, 64)))
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                        .addComponent(intensitySliderDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                        .addComponent(anxietySliderDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(locationDisplay2)
                    .addComponent(hrsLastedDisplay3)
                    .addComponent(daysLastedDisplay3)
                    .addComponent(dateDisplay3)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(beginTimeDisplay2))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        generalDetailsTab3Layout.setVerticalGroup(
            generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel150))
                    .addGroup(generalDetailsTab3Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel148)
                            .addComponent(intensitySliderDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel149)))
                        .addGap(16, 16, 16)
                        .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anxietySliderDisplay2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(beginTimeDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(locationDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(hrsLastedDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(daysLastedDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(dateDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane5.addTab("General Details", generalDetailsTab3);

        jLabel100.setText("Had you eaten beforehand?");

        jLabel101.setText("If so what?");

        jLabel102.setText("Had you drunk alcohol prior?");

        jLabel103.setText("What did you drink?");

        jLabel104.setText("Were you hungover?");

        eatenWhatDisplay3.setColumns(20);
        eatenWhatDisplay3.setRows(5);
        jScrollPane20.setViewportView(eatenWhatDisplay3);

        drunkWhatDisplay3.setColumns(20);
        drunkWhatDisplay3.setRows(5);
        jScrollPane21.setViewportView(drunkWhatDisplay3);

        ViewECFButton2.setText("View Events Custom Details");
        ViewECFButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewECFButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vomitDetailsTab3Layout = new javax.swing.GroupLayout(vomitDetailsTab3);
        vomitDetailsTab3.setLayout(vomitDetailsTab3Layout);
        vomitDetailsTab3Layout.setHorizontalGroup(
            vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vomitDetailsTab3Layout.createSequentialGroup()
                        .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jLabel100)
                            .addComponent(jLabel103)
                            .addComponent(jLabel102)
                            .addComponent(jLabel104))
                        .addGap(99, 99, 99)
                        .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(drunkDisplay2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eatenDisplay2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hungoverDisplay2)))
                    .addComponent(ViewECFButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        vomitDetailsTab3Layout.setVerticalGroup(
            vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(eatenDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(drunkDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(hungoverDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(ViewECFButton2)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Diet & Custom Details", vomitDetailsTab3);

        jLabel105.setText("Were you anxious?");

        jLabel106.setText("What was your mood?");

        jLabel107.setText("Are you ill?");

        jLabel108.setText("Ill with what?");

        jLabel109.setText("Have you slept?");

        jLabel110.setText("How many hours did you sleep?");

        jLabel111.setText("What medication have you taken?");

        anxiousDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousDisplay2ActionPerformed(evt);
            }
        });

        moodDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodDisplay2ActionPerformed(evt);
            }
        });

        illDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illDisplay2ActionPerformed(evt);
            }
        });

        illWithWhatDisplay3.setColumns(20);
        illWithWhatDisplay3.setRows(5);
        jScrollPane22.setViewportView(illWithWhatDisplay3);

        hrsSleptDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptDisplay3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conditionDetailsTab3Layout = new javax.swing.GroupLayout(conditionDetailsTab3);
        conditionDetailsTab3.setLayout(conditionDetailsTab3Layout);
        conditionDetailsTab3Layout.setHorizontalGroup(
            conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTab3Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108)
                            .addComponent(jLabel111)
                            .addComponent(jLabel110)
                            .addComponent(jLabel109))
                        .addGap(68, 68, 68)
                        .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(medicationDisplay3)
                            .addComponent(hrsSleptDisplay3)
                            .addComponent(sleptDisplay2)))
                    .addGroup(conditionDetailsTab3Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107))
                        .addGap(124, 124, 124)
                        .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(moodDisplay2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(anxiousDisplay2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(illDisplay2))))
                .addContainerGap())
        );
        conditionDetailsTab3Layout.setVerticalGroup(
            conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(anxiousDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106)
                    .addComponent(moodDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(illDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(sleptDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(hrsSleptDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(medicationDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Condition Details", conditionDetailsTab3);

        jScrollPane18.setViewportView(jTabbedPane5);

        jLabel112.setText("When did the event begin?");

        jLabel113.setText("Where were you when it began?");

        jLabel114.setText("How many hours did the event last?");

        jLabel115.setText("How many days did the event last?");

        jLabel116.setText("Notes");

        jLabel117.setText("Date recorded");

        beginTimeDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginTimeDisplay3ActionPerformed(evt);
            }
        });

        daysLastedDisplay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedDisplay4ActionPerformed(evt);
            }
        });

        notesDisplay4.setColumns(20);
        notesDisplay4.setRows(5);
        jScrollPane24.setViewportView(notesDisplay4);

        dateDisplay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDisplay4ActionPerformed(evt);
            }
        });

        anxietySliderDisplay3.setMaximum(10);
        anxietySliderDisplay3.setMinimum(1);
        anxietySliderDisplay3.setMinorTickSpacing(1);
        anxietySliderDisplay3.setPaintLabels(true);
        anxietySliderDisplay3.setPaintTicks(true);
        anxietySliderDisplay3.setSnapToTicks(true);
        anxietySliderDisplay3.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySliderDisplay3.setValue(1);

        intensitySliderDisplay3.setMaximum(10);
        intensitySliderDisplay3.setMinimum(1);
        intensitySliderDisplay3.setMinorTickSpacing(1);
        intensitySliderDisplay3.setPaintLabels(true);
        intensitySliderDisplay3.setPaintTicks(true);
        intensitySliderDisplay3.setSnapToTicks(true);
        intensitySliderDisplay3.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySliderDisplay3.setValue(1);

        jLabel151.setText("Overall Intensity");

        jLabel152.setText("Anxiety Level");

        jLabel153.setText("10");

        jLabel154.setText("10");

        jLabel155.setText("1");

        jLabel156.setText("1");

        javax.swing.GroupLayout generalDetailsTab4Layout = new javax.swing.GroupLayout(generalDetailsTab4);
        generalDetailsTab4.setLayout(generalDetailsTab4Layout);
        generalDetailsTab4Layout.setHorizontalGroup(
            generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addComponent(jLabel113)
                            .addComponent(jLabel114)
                            .addComponent(jLabel115)
                            .addComponent(jLabel116)
                            .addComponent(jLabel117))
                        .addGap(64, 64, 64))
                    .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel151)
                            .addComponent(jLabel152))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel156))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(locationDisplay3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hrsLastedDisplay4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(daysLastedDisplay4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateDisplay4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(beginTimeDisplay3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intensitySliderDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anxietySliderDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel154))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        generalDetailsTab4Layout.setVerticalGroup(
            generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailsTab4Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel153)
                            .addComponent(intensitySliderDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anxietySliderDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel154)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel156)
                        .addComponent(jLabel152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailsTab4Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel155)
                            .addComponent(jLabel151))
                        .addGap(47, 47, 47)))
                .addGap(22, 22, 22)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112)
                    .addComponent(beginTimeDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(locationDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(hrsLastedDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(daysLastedDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(dateDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane6.addTab("General Details", generalDetailsTab4);

        jLabel121.setText("Had you eaten beforehand?");

        jLabel122.setText("If so what?");

        jLabel123.setText("Had you drunk alcohol prior?");

        jLabel124.setText("What did you drink?");

        jLabel125.setText("Were you hungover?");

        eatenWhatDisplay4.setColumns(20);
        eatenWhatDisplay4.setRows(5);
        jScrollPane25.setViewportView(eatenWhatDisplay4);

        drunkWhatDisplay4.setColumns(20);
        drunkWhatDisplay4.setRows(5);
        jScrollPane26.setViewportView(drunkWhatDisplay4);

        ViewECFButton3.setText("View Events Custom Details");
        ViewECFButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewECFButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vomitDetailsTab4Layout = new javax.swing.GroupLayout(vomitDetailsTab4);
        vomitDetailsTab4.setLayout(vomitDetailsTab4Layout);
        vomitDetailsTab4Layout.setHorizontalGroup(
            vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vomitDetailsTab4Layout.createSequentialGroup()
                        .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122)
                            .addComponent(jLabel121)
                            .addComponent(jLabel124)
                            .addComponent(jLabel123)
                            .addComponent(jLabel125))
                        .addGap(99, 99, 99)
                        .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(drunkDisplay3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eatenDisplay3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hungoverDisplay3)))
                    .addComponent(ViewECFButton3))
                .addContainerGap())
        );
        vomitDetailsTab4Layout.setVerticalGroup(
            vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(eatenDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(drunkDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(hungoverDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(ViewECFButton3)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Diet & Custom Details", vomitDetailsTab4);

        jLabel126.setText("Were you anxious?");

        jLabel127.setText("What was your mood?");

        jLabel128.setText("Are you ill?");

        jLabel129.setText("Ill with what?");

        jLabel130.setText("Have you slept?");

        jLabel131.setText("How many hours did you sleep?");

        jLabel132.setText("What medication have you taken?");

        anxiousDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousDisplay3ActionPerformed(evt);
            }
        });

        moodDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodDisplay3ActionPerformed(evt);
            }
        });

        illDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illDisplay3ActionPerformed(evt);
            }
        });

        illWithWhatDisplay4.setColumns(20);
        illWithWhatDisplay4.setRows(5);
        jScrollPane27.setViewportView(illWithWhatDisplay4);

        hrsSleptDisplay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptDisplay4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conditionDetailsTab4Layout = new javax.swing.GroupLayout(conditionDetailsTab4);
        conditionDetailsTab4.setLayout(conditionDetailsTab4Layout);
        conditionDetailsTab4Layout.setHorizontalGroup(
            conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTab4Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel132)
                            .addComponent(jLabel131)
                            .addComponent(jLabel130))
                        .addGap(68, 68, 68)
                        .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(medicationDisplay4)
                            .addComponent(hrsSleptDisplay4)
                            .addComponent(sleptDisplay3)))
                    .addGroup(conditionDetailsTab4Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126)
                            .addComponent(jLabel127)
                            .addComponent(jLabel128))
                        .addGap(124, 124, 124)
                        .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(moodDisplay3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(anxiousDisplay3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(illDisplay3))))
                .addContainerGap())
        );
        conditionDetailsTab4Layout.setVerticalGroup(
            conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(anxiousDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127)
                    .addComponent(moodDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(illDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(sleptDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(hrsSleptDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(medicationDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane6.addTab("Condition Details", conditionDetailsTab4);

        jScrollPane23.setViewportView(jTabbedPane6);

        javax.swing.GroupLayout dualEventDetailsDialogLayout = new javax.swing.GroupLayout(dualEventDetailsDialog.getContentPane());
        dualEventDetailsDialog.getContentPane().setLayout(dualEventDetailsDialogLayout);
        dualEventDetailsDialogLayout.setHorizontalGroup(
            dualEventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dualEventDetailsDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23))
        );
        dualEventDetailsDialogLayout.setVerticalGroup(
            dualEventDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel133.setText("New Field Type     :");

        fieldTypeCombo.setModel(new DefaultComboBoxModel(FieldType.values()));
        fieldTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTypeComboActionPerformed(evt);
            }
        });

        jLabel134.setText("New Field Name    :");

        newFieldNameField.setText("jTextField1");
        newFieldNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFieldNameFieldActionPerformed(evt);
            }
        });

        jLabel135.setText("If you have selected multiChoice enter the options you would like one by one :");

        addToMultiOptionsButton.setText("Add to List");
        addToMultiOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToMultiOptionsButtonActionPerformed(evt);
            }
        });

        addNewCFButton.setText("Save New Field");
        addNewCFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCFButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createCFDialogLayout = new javax.swing.GroupLayout(createCFDialog.getContentPane());
        createCFDialog.getContentPane().setLayout(createCFDialogLayout);
        createCFDialogLayout.setHorizontalGroup(
            createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCFDialogLayout.createSequentialGroup()
                .addGroup(createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCFDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createCFDialogLayout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addGap(18, 18, 18)
                                .addComponent(fieldTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createCFDialogLayout.createSequentialGroup()
                                .addComponent(jLabel134)
                                .addGap(18, 18, 18)
                                .addComponent(newFieldNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel135)
                            .addGroup(createCFDialogLayout.createSequentialGroup()
                                .addComponent(multiChoiceField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addToMultiOptionsButton))))
                    .addGroup(createCFDialogLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(addNewCFButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createCFDialogLayout.setVerticalGroup(
            createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCFDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(fieldTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(newFieldNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel135)
                .addGap(18, 18, 18)
                .addGroup(createCFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiChoiceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToMultiOptionsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addNewCFButton)
                .addGap(19, 19, 19))
        );

        customFieldList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane28.setViewportView(customFieldList);

        javax.swing.GroupLayout cFListDialogLayout = new javax.swing.GroupLayout(cFListDialog.getContentPane());
        cFListDialog.getContentPane().setLayout(cFListDialogLayout);
        cFListDialogLayout.setHorizontalGroup(
            cFListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cFListDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
        cFListDialogLayout.setVerticalGroup(
            cFListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cFListDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel55.setText("Error:                 Please select an item from both lists.");

        javax.swing.GroupLayout select2EventErrorDialogLayout = new javax.swing.GroupLayout(select2EventErrorDialog.getContentPane());
        select2EventErrorDialog.getContentPane().setLayout(select2EventErrorDialogLayout);
        select2EventErrorDialogLayout.setHorizontalGroup(
            select2EventErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, select2EventErrorDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        select2EventErrorDialogLayout.setVerticalGroup(
            select2EventErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select2EventErrorDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel55)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Custom Fields saved");

        javax.swing.GroupLayout cFBossSavedDialogLayout = new javax.swing.GroupLayout(cFBossSavedDialog.getContentPane());
        cFBossSavedDialog.getContentPane().setLayout(cFBossSavedDialogLayout);
        cFBossSavedDialogLayout.setHorizontalGroup(
            cFBossSavedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cFBossSavedDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cFBossSavedDialogLayout.setVerticalGroup(
            cFBossSavedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        jLabel57.setText("Are you sure you want to permenently delete the selected event?");

        javax.swing.GroupLayout resetCustomFieldsDialogLayout = new javax.swing.GroupLayout(resetCustomFieldsDialog.getContentPane());
        resetCustomFieldsDialog.getContentPane().setLayout(resetCustomFieldsDialogLayout);
        resetCustomFieldsDialogLayout.setHorizontalGroup(
            resetCustomFieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetCustomFieldsDialogLayout.createSequentialGroup()
                .addGroup(resetCustomFieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resetCustomFieldsDialogLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(yesButton)
                        .addGap(38, 38, 38)
                        .addComponent(noButton))
                    .addGroup(resetCustomFieldsDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel57)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resetCustomFieldsDialogLayout.setVerticalGroup(
            resetCustomFieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetCustomFieldsDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(24, 24, 24)
                .addGroup(resetCustomFieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noButton)
                    .addComponent(yesButton))
                .addGap(16, 16, 16))
        );

        jLabel97.setText("Custom Fields Deleted");

        javax.swing.GroupLayout cFBossResetDialogLayout = new javax.swing.GroupLayout(cFBossResetDialog.getContentPane());
        cFBossResetDialog.getContentPane().setLayout(cFBossResetDialogLayout);
        cFBossResetDialogLayout.setHorizontalGroup(
            cFBossResetDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cFBossResetDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel97)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        cFBossResetDialogLayout.setVerticalGroup(
            cFBossResetDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cFBossResetDialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel97)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        yesButton1.setText("Yes");
        yesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButton1ActionPerformed(evt);
            }
        });

        noButton1.setText("No");
        noButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButton1ActionPerformed(evt);
            }
        });

        jLabel98.setText("Are you sure you want to permenently delete the selected event?");

        javax.swing.GroupLayout deleteEventDialogLayout = new javax.swing.GroupLayout(deleteEventDialog.getContentPane());
        deleteEventDialog.getContentPane().setLayout(deleteEventDialogLayout);
        deleteEventDialogLayout.setHorizontalGroup(
            deleteEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteEventDialogLayout.createSequentialGroup()
                .addGroup(deleteEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteEventDialogLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(yesButton1)
                        .addGap(38, 38, 38)
                        .addComponent(noButton1))
                    .addGroup(deleteEventDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel98)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteEventDialogLayout.setVerticalGroup(
            deleteEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteEventDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel98)
                .addGap(24, 24, 24)
                .addGroup(deleteEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noButton1)
                    .addComponent(yesButton1))
                .addGap(16, 16, 16))
        );

        eventList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        eventList4.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventList4ValueChanged(evt);
            }
        });
        jScrollPane29.setViewportView(eventList4);

        createSummaryFinalButton.setText("Create Summary PDF");
        createSummaryFinalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSummaryFinalButtonActionPerformed(evt);
            }
        });

        chartButton.setText("Create Chart");
        chartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartButtonActionPerformed(evt);
            }
        });

        xAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        xAxisCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xAxisComboActionPerformed(evt);
            }
        });
        xAxisCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                xAxisComboPropertyChange(evt);
            }
        });

        jLabel118.setText("X Axis");

        chartTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bar Chart", "XY Line Chart" }));
        chartTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartTypeComboActionPerformed(evt);
            }
        });
        chartTypeCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chartTypeComboPropertyChange(evt);
            }
        });

        jLabel119.setText("Chart Type");

        yAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        yAxisCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yAxisComboActionPerformed(evt);
            }
        });
        yAxisCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yAxisComboPropertyChange(evt);
            }
        });

        jLabel157.setText("Y Axis");

        jLabel158.setText("Chart Title");

        chartTitleField.setText("Chart");

        javax.swing.GroupLayout summarySelectionDialogLayout = new javax.swing.GroupLayout(summarySelectionDialog.getContentPane());
        summarySelectionDialog.getContentPane().setLayout(summarySelectionDialogLayout);
        summarySelectionDialogLayout.setHorizontalGroup(
            summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                        .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(chartButton))
                            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(createSummaryFinalButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chartTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(xAxisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summarySelectionDialogLayout.createSequentialGroup()
                                .addComponent(jLabel157)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yAxisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summarySelectionDialogLayout.createSequentialGroup()
                                .addComponent(jLabel158)
                                .addGap(18, 18, 18)
                                .addComponent(chartTitleField)))))
                .addContainerGap())
        );
        summarySelectionDialogLayout.setVerticalGroup(
            summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summarySelectionDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(chartTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(xAxisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(yAxisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summarySelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel158)
                    .addComponent(chartTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(createSummaryFinalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartButton))
        );

        jLabel99.setText("Event Deleted");

        javax.swing.GroupLayout eventDeletedDialogLayout = new javax.swing.GroupLayout(eventDeletedDialog.getContentPane());
        eventDeletedDialog.getContentPane().setLayout(eventDeletedDialogLayout);
        eventDeletedDialogLayout.setHorizontalGroup(
            eventDeletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventDeletedDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel99)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        eventDeletedDialogLayout.setVerticalGroup(
            eventDeletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventDeletedDialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel99)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel120.setText("Chart Type");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CISTS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Diet Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Details On Your Condition");

        createEventDietButton.setText("Store Diet Info");
        createEventDietButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createEventDietButtonMouseClicked(evt);
            }
        });
        createEventDietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventDietButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Had you eaten beforehand?");

        eatenCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel8.setText("If so what?");

        eatenWhatField.setText("nothing");
        eatenWhatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eatenWhatFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Have you drunk alcohol today?");

        drunkCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        drunkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drunkComboActionPerformed(evt);
            }
        });

        jLabel10.setText("What did you drink?");

        drunkWhatField.setText("nothing");
        drunkWhatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drunkWhatFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("Are you hungover?");

        hungoverCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        hungoverCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hungoverComboActionPerformed(evt);
            }
        });

        jLabel12.setText("Were you anxious?");

        anxiousCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        anxiousCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousComboActionPerformed(evt);
            }
        });

        createCondition.setText("Store Condition Info");
        createCondition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createConditionMouseClicked(evt);
            }
        });
        createCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createConditionActionPerformed(evt);
            }
        });

        jLabel13.setText("What was your mood?");

        moodCombo.setModel(new DefaultComboBoxModel(Mood.values()));
        moodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodComboActionPerformed(evt);
            }
        });

        jLabel14.setText("Are you ill?");

        areYouIllCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel15.setText("Ill with what?");

        illWithWhatField.setText("nothing");
        illWithWhatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illWithWhatFieldActionPerformed(evt);
            }
        });

        jLabel16.setText("Have you slept?");

        sleptCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel17.setText("How many hours did you sleep?");

        hrsSleptField.setText("0");
        hrsSleptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("What medication have you taken?");

        medicationTakenArea.setColumns(20);
        medicationTakenArea.setRows(5);
        medicationTakenArea.setText("nothing");
        jScrollPane2.setViewportView(medicationTakenArea);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("General Information");

        jLabel20.setText("When did the event begin?");

        beginTimeCombo.setModel(new DefaultComboBoxModel(EventBeginTime.values()) );

        createEvent.setText("Create and Store Event");
        createEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createEventMouseClicked(evt);
            }
        });
        createEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventActionPerformed(evt);
            }
        });

        jLabel21.setText("Where were you when it began?");

        locationCombo.setModel(new DefaultComboBoxModel(Location.values()));

        jLabel22.setText("How many hours did the event last?");

        hoursLastedField.setText("0");
        hoursLastedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursLastedFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("How many days did the event last?");

        daysLastedField.setText("0");
        daysLastedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedFieldActionPerformed(evt);
            }
        });

        jLabel24.setText("Any more comments?");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesArea.setText("nothing");
        jScrollPane3.setViewportView(notesArea);

        goToCustomInputButton.setText("View Custom Inputs");
        goToCustomInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToCustomInputButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Overall Intensity");

        intensitySlider.setMaximum(10);
        intensitySlider.setMinimum(1);
        intensitySlider.setMinorTickSpacing(1);
        intensitySlider.setPaintLabels(true);
        intensitySlider.setPaintTicks(true);
        intensitySlider.setSnapToTicks(true);
        intensitySlider.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySlider.setValue(1);

        jLabel5.setText("1");

        jLabel6.setText("10");

        anxietySlider.setMaximum(10);
        anxietySlider.setMinimum(1);
        anxietySlider.setMinorTickSpacing(1);
        anxietySlider.setPaintLabels(true);
        anxietySlider.setPaintTicks(true);
        anxietySlider.setSnapToTicks(true);
        anxietySlider.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySlider.setValue(1);

        jLabel76.setText("10");

        jLabel77.setText("1");

        jLabel78.setText("Anxiety Level");

        javax.swing.GroupLayout addEventTabLayout = new javax.swing.GroupLayout(addEventTab);
        addEventTab.setLayout(addEventTabLayout);
        addEventTabLayout.setHorizontalGroup(
            addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEventTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(drunkWhatField))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(eatenWhatField))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(hungoverCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(eatenCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(drunkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(addEventTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createEvent)
                            .addComponent(goToCustomInputButton)
                            .addComponent(createCondition))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(illWithWhatField))
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(hrsSleptField))
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3))
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createEventDietButton)
                                    .addGroup(addEventTabLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(sleptCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addEventTabLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(areYouIllCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(addEventTabLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(anxiousCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addEventTabLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(moodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEventTabLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(intensitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEventTabLayout.createSequentialGroup()
                                            .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel78)
                                                .addComponent(jLabel19))
                                            .addGap(23, 23, 23)
                                            .addComponent(jLabel77)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(anxietySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel76))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEventTabLayout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(61, 61, 61)
                                            .addComponent(beginTimeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(addEventTabLayout.createSequentialGroup()
                                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23))
                                        .addGap(18, 18, 18)
                                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(daysLastedField)
                                            .addComponent(locationCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hoursLastedField, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(400, 400, 400)))
                        .addContainerGap())))
        );
        addEventTabLayout.setVerticalGroup(
            addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eatenCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(eatenWhatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(drunkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(drunkWhatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(hungoverCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(createEventDietButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(anxiousCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(moodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(areYouIllCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(illWithWhatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(sleptCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(hrsSleptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(createCondition)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(intensitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addEventTabLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel77)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEventTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anxietySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(beginTimeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(hoursLastedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(daysLastedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addEventTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(goToCustomInputButton)
                        .addGap(18, 18, 18)
                        .addComponent(createEvent)
                        .addGap(16, 16, 16))
                    .addGroup(addEventTabLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel76)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Add A New Event", addEventTab);

        listLabel.setText("CVS Events List");

        selectEventButton.setText("View Event Info");
        selectEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEventButtonActionPerformed(evt);
            }
        });

        saveListButton.setText("Save List");
        saveListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListButtonActionPerformed(evt);
            }
        });

        editEventButton.setText("Edit Event Info");
        editEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEventButtonActionPerformed(evt);
            }
        });

        eventList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        eventList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventList1ValueChanged(evt);
            }
        });
        listScrollPane4.setViewportView(eventList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel70.setText("When did the event begin?");

        jLabel71.setText("Where were you when it began?");

        jLabel72.setText("How many hours did the event last?");

        jLabel73.setText("How many days did the event last?");

        jLabel74.setText("Notes");

        jLabel75.setText("Date recorded");

        beginTimeDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginTimeDisplay1ActionPerformed(evt);
            }
        });

        daysLastedDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLastedDisplay2ActionPerformed(evt);
            }
        });

        notesDisplay2.setColumns(20);
        notesDisplay2.setRows(5);
        jScrollPane14.setViewportView(notesDisplay2);

        dateDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDisplay2ActionPerformed(evt);
            }
        });

        ViewECFButton.setText("View Events Custom Details");
        ViewECFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewECFButtonActionPerformed(evt);
            }
        });

        intensitySliderDisplay.setMaximum(10);
        intensitySliderDisplay.setMinimum(1);
        intensitySliderDisplay.setMinorTickSpacing(1);
        intensitySliderDisplay.setPaintLabels(true);
        intensitySliderDisplay.setPaintTicks(true);
        intensitySliderDisplay.setSnapToTicks(true);
        intensitySliderDisplay.setToolTipText("1 is not very - 10 is extremely intense");
        intensitySliderDisplay.setValue(1);

        jLabel136.setText("10");

        jLabel137.setText("1");

        jLabel138.setText("Overall Intensity");

        anxietySliderDisplay.setMaximum(10);
        anxietySliderDisplay.setMinimum(1);
        anxietySliderDisplay.setMinorTickSpacing(1);
        anxietySliderDisplay.setPaintLabels(true);
        anxietySliderDisplay.setPaintTicks(true);
        anxietySliderDisplay.setSnapToTicks(true);
        anxietySliderDisplay.setToolTipText("1 is not very - 10 is extremely intense");
        anxietySliderDisplay.setValue(1);

        jLabel139.setText("10");

        jLabel140.setText("1");

        jLabel141.setText("Anxiety Intensity");

        javax.swing.GroupLayout generalDetailsTab2Layout = new javax.swing.GroupLayout(generalDetailsTab2);
        generalDetailsTab2.setLayout(generalDetailsTab2Layout);
        generalDetailsTab2Layout.setHorizontalGroup(
            generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel138)
                            .addComponent(jLabel141))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel140)
                            .addComponent(jLabel137))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                                .addComponent(intensitySliderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel139))
                            .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                                .addComponent(anxietySliderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel136)))
                        .addContainerGap())
                    .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                        .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(ViewECFButton))
                        .addGap(64, 64, 64)
                        .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                                .addComponent(dateDisplay2)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailsTab2Layout.createSequentialGroup()
                                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(beginTimeDisplay1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locationDisplay1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hrsLastedDisplay2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(daysLastedDisplay2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane14))
                                .addContainerGap())))))
        );
        generalDetailsTab2Layout.setVerticalGroup(
            generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                        .addComponent(jLabel138)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel137))
                    .addComponent(intensitySliderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139))
                .addGap(12, 12, 12)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel140)
                    .addComponent(anxietySliderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(generalDetailsTab2Layout.createSequentialGroup()
                        .addComponent(jLabel141)
                        .addGap(9, 9, 9))
                    .addComponent(jLabel136))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(beginTimeDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(locationDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(hrsLastedDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(daysLastedDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(generalDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(dateDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(ViewECFButton)
                .addContainerGap())
        );

        jTabbedPane4.addTab("General Details", generalDetailsTab2);

        jLabel79.setText("Had you eaten beforehand?");

        jLabel80.setText("If so what?");

        jLabel81.setText("Had you drunk alcohol prior?");

        jLabel82.setText("What did you drink?");

        jLabel83.setText("Were you hungover?");

        eatenWhatDisplay2.setColumns(20);
        eatenWhatDisplay2.setRows(5);
        jScrollPane15.setViewportView(eatenWhatDisplay2);

        drunkWhatDisplay2.setColumns(20);
        drunkWhatDisplay2.setRows(5);
        jScrollPane16.setViewportView(drunkWhatDisplay2);

        javax.swing.GroupLayout vomitDetailsTab2Layout = new javax.swing.GroupLayout(vomitDetailsTab2);
        vomitDetailsTab2.setLayout(vomitDetailsTab2Layout);
        vomitDetailsTab2Layout.setHorizontalGroup(
            vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addComponent(jLabel79)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addComponent(jLabel83))
                .addGap(99, 99, 99)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(eatenDisplay1)
                    .addComponent(drunkDisplay1)
                    .addComponent(hungoverDisplay1)
                    .addComponent(jScrollPane15))
                .addContainerGap())
        );
        vomitDetailsTab2Layout.setVerticalGroup(
            vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vomitDetailsTab2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(eatenDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(drunkDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vomitDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(hungoverDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Diet Details", vomitDetailsTab2);

        jLabel84.setText("Were you anxious?");

        jLabel85.setText("What was your mood?");

        jLabel86.setText("Are you ill?");

        jLabel87.setText("Ill with what?");

        jLabel88.setText("Have you slept?");

        jLabel89.setText("How many hours did you sleep?");

        jLabel90.setText("What medication have you taken?");

        anxiousDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anxiousDisplay1ActionPerformed(evt);
            }
        });

        moodDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodDisplay1ActionPerformed(evt);
            }
        });

        illDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illDisplay1ActionPerformed(evt);
            }
        });

        illWithWhatDisplay2.setColumns(20);
        illWithWhatDisplay2.setRows(5);
        jScrollPane17.setViewportView(illWithWhatDisplay2);

        hrsSleptDisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsSleptDisplay2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conditionDetailsTab2Layout = new javax.swing.GroupLayout(conditionDetailsTab2);
        conditionDetailsTab2.setLayout(conditionDetailsTab2Layout);
        conditionDetailsTab2Layout.setHorizontalGroup(
            conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conditionDetailsTab2Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addComponent(jLabel90)
                            .addComponent(jLabel89)
                            .addComponent(jLabel88))
                        .addGap(68, 68, 68)
                        .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17)
                            .addComponent(sleptDisplay1)
                            .addComponent(hrsSleptDisplay2)
                            .addComponent(medicationDisplay2)))
                    .addGroup(conditionDetailsTab2Layout.createSequentialGroup()
                        .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86))
                        .addGap(124, 124, 124)
                        .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(illDisplay1)
                            .addComponent(moodDisplay1)
                            .addComponent(anxiousDisplay1))))
                .addContainerGap())
        );
        conditionDetailsTab2Layout.setVerticalGroup(
            conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionDetailsTab2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(anxiousDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(moodDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(illDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(sleptDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(hrsSleptDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conditionDetailsTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(medicationDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Condition Details", conditionDetailsTab2);

        eventList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        eventList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventList3ValueChanged(evt);
            }
        });
        listScrollPane6.setViewportView(eventList3);

        select2EventButton.setText("View 2 Events Info");
        select2EventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2EventButtonActionPerformed(evt);
            }
        });

        addCFButton.setText("Add Custom Field");
        addCFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCFButtonActionPerformed(evt);
            }
        });

        saveCFButton.setText("Save Custom Fields");
        saveCFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCFButtonActionPerformed(evt);
            }
        });

        cFListButton.setText("View Custom Field List");
        cFListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFListButtonActionPerformed(evt);
            }
        });

        resetCFBossButton.setText("Reset Custom Fields");
        resetCFBossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCFBossButtonActionPerformed(evt);
            }
        });

        eventSummaryButton.setText("Create Summary/Charts");
        eventSummaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventSummaryButtonActionPerformed(evt);
            }
        });

        deleteEventButton.setText("Delete Event");
        deleteEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eventListTabLayout = new javax.swing.GroupLayout(eventListTab);
        eventListTab.setLayout(eventListTabLayout);
        eventListTabLayout.setHorizontalGroup(
            eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventListTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectEventButton)
                            .addComponent(editEventButton)
                            .addComponent(eventSummaryButton))
                        .addGap(18, 18, 18)
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveListButton)
                            .addComponent(select2EventButton)
                            .addComponent(deleteEventButton))
                        .addGap(24, 24, 24)
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveCFButton)
                            .addComponent(cFListButton)
                            .addComponent(addCFButton)))
                    .addComponent(listLabel)
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addComponent(listScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resetCFBossButton)))
                .addGap(19, 19, 19))
        );
        eventListTabLayout.setVerticalGroup(
            eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventListTabLayout.createSequentialGroup()
                .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eventListTabLayout.createSequentialGroup()
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(eventListTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(listLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(eventListTabLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(listScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectEventButton)
                            .addComponent(saveListButton)
                            .addComponent(addCFButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editEventButton)
                            .addComponent(saveCFButton)
                            .addComponent(select2EventButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cFListButton)
                        .addComponent(resetCFBossButton))
                    .addGroup(eventListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eventSummaryButton)
                        .addComponent(deleteEventButton)))
                .addContainerGap(720, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CISTS HomePage", eventListTab);

        jScrollPane1.setViewportView(jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1009, 690);
    }// </editor-fold>//GEN-END:initComponents
 
    private void anxiousDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousDisplayActionPerformed

    private void hrsSleptDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptDisplayActionPerformed

    private void illDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illDisplayActionPerformed

    private void moodDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodDisplayActionPerformed

    private void beginTimeDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginTimeDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginTimeDisplayActionPerformed

    private void daysLastedDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedDisplayActionPerformed

    private void dateDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDisplayActionPerformed

   
    private void hrsSleptDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptDisplay2ActionPerformed

    private void illDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illDisplay1ActionPerformed

    private void moodDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodDisplay1ActionPerformed

    private void anxiousDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousDisplay1ActionPerformed

    private void dateDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDisplay2ActionPerformed

    private void daysLastedDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedDisplay2ActionPerformed

    private void beginTimeDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginTimeDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginTimeDisplay1ActionPerformed
/**
 * Populates event display on the right of container with the selected event's 
 * details.
 * @param evt 
 */
    private void eventList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventList1ValueChanged
        this.selectedEvent = (Event) eventList1.getSelectedValue();
    }//GEN-LAST:event_eventList1ValueChanged

    /**
     * Displays the edit event details window and populates it with the detail of the 
     * selected event. 
     * @param evt 
     */
    private void editEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEventButtonActionPerformed

        //populate general details

        this.beginTimeCombo1.setSelectedItem(selectedEvent.getEventBeginTime());

        this.locationCombo1.setSelectedItem(selectedEvent.getLocation());

        this.hrsLastedDisplay1.setText(Integer.toString(selectedEvent.getHoursLasted()));

        this.daysLastedDisplay1.setText(Integer.toString(selectedEvent.getDaysLasted()));

        this.notesDisplay1.setText(selectedEvent.getNotes());

        this.dateDisplay1.setText(selectedEvent.toString());
        this.dateDisplay1.setEditable(false);

        // populate vomit details

        EventDiet tempCF = this.selectedEvent.getCustomFields();


        if (tempCF.getEatenBefore() == true){
            this.eatenCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.eatenCombo1.setSelectedItem("No");
        }

        this.eatenWhatDisplay1.setText(tempCF.getEatenWhat());

        if (tempCF.getDrunkAlcohol() == true){
            this.drunkCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.drunkCombo1.setSelectedItem("No");
        }

        this.drunkWhatDisplay1.setText(tempCF.getDrunkWhat());

        this.hungoverCombo1.setSelectedItem(tempCF.getHungover());
        if (tempCF.getHungover() == true){
            this.hungoverCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.hungoverCombo1.setSelectedItem("No");
        }

        //populate condition details

        Condition tempCon = this.selectedEvent.getCondition();

        if (tempCon.getAnxious() == true){
            this.anxiousCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.anxiousCombo1.setSelectedItem("No");
        }

        this.moodCombo1.setSelectedItem(tempCon.getMood());

        this.areYouIllCombo1.setSelectedItem(tempCon.getAreYouIll());
        if (tempCon.getAreYouIll() == true){
            this.areYouIllCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.areYouIllCombo1.setSelectedItem("No");
        }

        this.illWithWhatDisplay1.setText(tempCon.getIllWithWhat());

        if (tempCon.getSlept() == true){
            this.sleptCombo1.setSelectedItem("Yes");
        }
        
        else {
            this.sleptCombo1.setSelectedItem("No");
        }

        this.hrsSleptDisplay1.setText(Integer.toString(tempCon.getHrsSlept()));

        this.medicationDisplay1.setText(tempCon.getMedicationTaken());

        //display dialog box

        editEventDetailsDialog.pack();
        editEventDetailsDialog.setVisible(true);
    }//GEN-LAST:event_editEventButtonActionPerformed

    /**
     * Saves the list in its current state when the user clicks the button.
     * @param evt 
     */
    private void saveListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListButtonActionPerformed
        cISTSCoord.saveEventsList();

        listSavedDialog.pack();
        listSavedDialog.setVisible(true);
        listSavedDialog.setLocation(500, 500);
    }//GEN-LAST:event_saveListButtonActionPerformed

    /**
     * Displays the event details window and populates it with the detail of the 
     * selected event.
     * @param evt 
     */
    private void selectEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEventButtonActionPerformed
        //populate general details
        
        this.displayEvent();
        
        this.intensitySliderDisplay1.setValue(selectedEvent.getOverallIntensity());
        this.intensitySliderDisplay1.setEnabled(false);
        
        this.anxietySliderDisplay1.setValue(selectedEvent.getAnxietyLevel());
        this.anxietySliderDisplay1.setEnabled(false);
        
        this.beginTimeDisplay.setText(selectedEvent.getEventBeginTime().toString());
        this.beginTimeDisplay.setEditable(false);

        this.locationDisplay.setText(selectedEvent.getLocation().toString());
        this.locationDisplay.setEditable(false);

        this.hrsLastedDisplay.setText(Integer.toString(selectedEvent.getHoursLasted()));
        this.hrsLastedDisplay.setEditable(false);

        this.daysLastedDisplay.setText(Integer.toString(selectedEvent.getDaysLasted()));
        this.daysLastedDisplay.setEditable(false);

        this.notesDisplay.setText(selectedEvent.getNotes());
        this.notesDisplay.setEditable(false);

        this.dateDisplay.setText(selectedEvent.toString());
        this.dateDisplay.setEditable(false);

        // populate vomit details

        EventDiet tempCF = this.selectedEvent.getCustomFields();

        this.eatenDisplay.setText(Boolean.toString(tempCF.getEatenBefore()));
        this.eatenDisplay.setEditable(false);

        this.eatenWhatDisplay.setText(tempCF.getEatenWhat());
        this.eatenWhatDisplay.setEditable(false);

        this.drunkDisplay.setText(Boolean.toString(tempCF.getDrunkAlcohol()));
        this.drunkDisplay.setEditable(false);

        this.drunkWhatDisplay.setText(tempCF.getDrunkWhat());
        this.drunkWhatDisplay.setEditable(false);

        this.hungoverDisplay.setText(Boolean.toString(tempCF.getHungover()));
        this.hungoverDisplay.setEditable(false);

        //populate condition details

        Condition tempCon = this.selectedEvent.getCondition();

        this.anxiousDisplay.setText(Boolean.toString(tempCon.getAnxious()));
        this.anxiousDisplay.setEditable(false);

        this.moodDisplay.setText(tempCon.getMood().toString());
        this.moodDisplay.setEditable(false);

        this.illDisplay.setText(Boolean.toString(tempCon.getAreYouIll()));
        this.illDisplay.setEditable(false);

        this.illWithWhatDisplay.setText(tempCon.getIllWithWhat());
        this.illWithWhatDisplay.setEditable(false);

        this.sleptDisplay.setText(Boolean.toString(tempCon.getSlept()));
        this.sleptDisplay.setEditable(false);

        this.hrsSleptDisplay.setText(Integer.toString(tempCon.getHrsSlept()));
        this.hrsSleptDisplay.setEditable(false);

        this.medicationDisplay.setText(tempCon.getMedicationTaken());
        this.medicationDisplay.setEditable(false);

        //display dialog box

        //eventDetailsDialog.pack();
        //eventDetailsDialog.setVisible(true);
    }//GEN-LAST:event_selectEventButtonActionPerformed

    /**
     * Set the selectedEvent to the currently selected item on the list whenever
     * a change of selection is made.
     * @param evt 
     */
    private void eventList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventList3ValueChanged
         this.selectedEvent1 = (Event) eventList3.getSelectedValue();
    }//GEN-LAST:event_eventList3ValueChanged

    private void beginTimeDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginTimeDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginTimeDisplay2ActionPerformed

    private void daysLastedDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedDisplay3ActionPerformed

    private void dateDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDisplay3ActionPerformed

    private void anxiousDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousDisplay2ActionPerformed

    private void moodDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodDisplay2ActionPerformed

    private void illDisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illDisplay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illDisplay2ActionPerformed

    private void hrsSleptDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptDisplay3ActionPerformed
    /**
     * Displays the dual event details window and populates it with the details of the 
     * selected events. 
     * @param evt 
     */
    private void select2EventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2EventButtonActionPerformed
      
      //Populate left display.
      
        if (eventList1.isSelectionEmpty() == false && eventList3.isSelectionEmpty()
                == false) {
            this.intensitySliderDisplay2.setValue(selectedEvent.getOverallIntensity());
            this.intensitySliderDisplay2.setEnabled(false);
            
            this.anxietySliderDisplay2.setValue(selectedEvent.getAnxietyLevel());
            this.anxietySliderDisplay2.setEnabled(false);
            
            this.beginTimeDisplay2.setText(selectedEvent.getEventBeginTime().toString());
            this.beginTimeDisplay2.setEditable(false);
            
            this.locationDisplay2.setText(selectedEvent.getLocation().toString());
            this.locationDisplay2.setEditable(false);
            
            this.hrsLastedDisplay3.setText(Integer.toString(selectedEvent.getHoursLasted()));
            this.hrsLastedDisplay3.setEditable(false);
            
            this.daysLastedDisplay3.setText(Integer.toString(selectedEvent.getDaysLasted()));
            this.daysLastedDisplay3.setEditable(false);
            
            this.notesDisplay3.setText(selectedEvent.getNotes());
            this.notesDisplay3.setEditable(false);
            
            this.dateDisplay3.setText(selectedEvent.toString());
            this.dateDisplay3.setEditable(false);

            // populate vomit details
            EventDiet tempCF = this.selectedEvent.getCustomFields();
            
            this.eatenDisplay2.setText(Boolean.toString(tempCF.getEatenBefore()));
            this.eatenDisplay2.setEditable(false);
            
            this.eatenWhatDisplay3.setText(tempCF.getEatenWhat());
            this.eatenWhatDisplay3.setEditable(false);
            
            this.drunkDisplay2.setText(Boolean.toString(tempCF.getDrunkAlcohol()));
            this.drunkDisplay2.setEditable(false);
            
            this.drunkWhatDisplay3.setText(tempCF.getDrunkWhat());
            this.drunkWhatDisplay3.setEditable(false);
            
            this.hungoverDisplay2.setText(Boolean.toString(tempCF.getHungover()));
            this.hungoverDisplay2.setEditable(false);

            //populate condition details
            Condition tempCon = this.selectedEvent.getCondition();
            
            this.anxiousDisplay2.setText(Boolean.toString(tempCon.getAnxious()));
            this.anxiousDisplay2.setEditable(false);
            
            this.moodDisplay2.setText(tempCon.getMood().toString());
            this.moodDisplay2.setEditable(false);
            
            this.illDisplay2.setText(Boolean.toString(tempCon.getAreYouIll()));
            this.illDisplay2.setEditable(false);
            
            this.illWithWhatDisplay3.setText(tempCon.getIllWithWhat());
            this.illWithWhatDisplay3.setEditable(false);
            
            this.sleptDisplay2.setText(Boolean.toString(tempCon.getSlept()));
            this.sleptDisplay2.setEditable(false);
            
            this.hrsSleptDisplay3.setText(Integer.toString(tempCon.getHrsSlept()));
            this.hrsSleptDisplay3.setEditable(false);
            
            this.medicationDisplay3.setText(tempCon.getMedicationTaken());
            this.medicationDisplay3.setEditable(false);

            //populates right display.
            this.intensitySliderDisplay3.setValue(selectedEvent1.getOverallIntensity());
            this.intensitySliderDisplay3.setEnabled(false);
            
            this.anxietySliderDisplay3.setValue(selectedEvent1.getAnxietyLevel());
            this.anxietySliderDisplay3.setEnabled(false);
            
            this.beginTimeDisplay3.setText(selectedEvent1.getEventBeginTime().toString());
            this.beginTimeDisplay3.setEditable(false);
            
            this.locationDisplay3.setText(selectedEvent1.getLocation().toString());
            this.locationDisplay3.setEditable(false);
            
            this.hrsLastedDisplay4.setText(Integer.toString(selectedEvent1.getHoursLasted()));
            this.hrsLastedDisplay4.setEditable(false);
            
            this.daysLastedDisplay4.setText(Integer.toString(selectedEvent1.getDaysLasted()));
            this.daysLastedDisplay4.setEditable(false);
            
            this.notesDisplay4.setText(selectedEvent1.getNotes());
            this.notesDisplay4.setEditable(false);
            
            this.dateDisplay4.setText(selectedEvent1.toString());
            this.dateDisplay4.setEditable(false);

            // populate vomit details
            EventDiet tempCF1 = this.selectedEvent1.getCustomFields();
            
            this.eatenDisplay3.setText(Boolean.toString(tempCF1.getEatenBefore()));
            this.eatenDisplay3.setEditable(false);
            
            this.eatenWhatDisplay4.setText(tempCF1.getEatenWhat());
            this.eatenWhatDisplay4.setEditable(false);
            
            this.drunkDisplay3.setText(Boolean.toString(tempCF1.getDrunkAlcohol()));
            this.drunkDisplay3.setEditable(false);
            
            this.drunkWhatDisplay4.setText(tempCF1.getDrunkWhat());
            this.drunkWhatDisplay4.setEditable(false);
            
            this.hungoverDisplay3.setText(Boolean.toString(tempCF1.getHungover()));
            this.hungoverDisplay3.setEditable(false);

            //populate condition details
            Condition tempCon1 = this.selectedEvent1.getCondition();
            
            this.anxiousDisplay3.setText(Boolean.toString(tempCon1.getAnxious()));
            this.anxiousDisplay3.setEditable(false);
            
            this.moodDisplay3.setText(tempCon1.getMood().toString());
            this.moodDisplay3.setEditable(false);
            
            this.illDisplay3.setText(Boolean.toString(tempCon1.getAreYouIll()));
            this.illDisplay3.setEditable(false);
            
            this.illWithWhatDisplay4.setText(tempCon1.getIllWithWhat());
            this.illWithWhatDisplay4.setEditable(false);
            
            this.sleptDisplay3.setText(Boolean.toString(tempCon1.getSlept()));
            this.sleptDisplay3.setEditable(false);
            
            this.hrsSleptDisplay4.setText(Integer.toString(tempCon1.getHrsSlept()));
            this.hrsSleptDisplay4.setEditable(false);
            
            this.medicationDisplay4.setText(tempCon1.getMedicationTaken());
            this.medicationDisplay4.setEditable(false);

            //display dialog box
            dualEventDetailsDialog.pack();
            dualEventDetailsDialog.setVisible(true);
        }
        else {
            select2EventErrorDialog.pack();
            select2EventErrorDialog.setVisible(true);
        }
    }//GEN-LAST:event_select2EventButtonActionPerformed
/**
 * opens the create a custom field dialog.
 * @param evt 
 */
    private void addCFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCFButtonActionPerformed
        createCFDialog.pack();
        createCFDialog.setVisible(true);
        tempMultiOptions.clear();
        createCFDialog.setLocation(500, 500);
        //tempMultiOptions.clear();
    }//GEN-LAST:event_addCFButtonActionPerformed

    private void fieldTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTypeComboActionPerformed

    private void newFieldNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFieldNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFieldNameFieldActionPerformed
/**
 * Creates a new custom field object from the user entered form data.
 * @param evt 
 */
    private void addNewCFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCFButtonActionPerformed
        
        CustomField tempCustomField;
        FieldType tempFieldType;
        String tempFieldName;
        this.invalidate();
        if ("multiChoice".equals(fieldTypeCombo.getSelectedItem().toString())){
        
        
            tempFieldType = FieldType.valueOf(fieldTypeCombo.getSelectedItem().
            toString());
        
            tempFieldName = newFieldNameField.getText();
        
            tempCustomField = cISTSCoord.customFieldBoss.createCustomFieldMulti(
                    tempMultiOptions, tempFieldType, tempFieldName);
            
            cFModel.addElement(tempCustomField);
            
        }
        
        else {
            tempFieldType = FieldType.valueOf(fieldTypeCombo.getSelectedItem().
            toString());
        
            tempFieldName = newFieldNameField.getText();
            
            tempCustomField = cISTSCoord.customFieldBoss.createCustomField(tempFieldType,
                    tempFieldName);
            
            cFModel.addElement(tempCustomField);
        }
        
        //this.GenerateCustomField(tempCustomField);
        this.validate();
        
        
        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
        createCFDialog.dispose();
    }//GEN-LAST:event_addNewCFButtonActionPerformed
/**
 * adds a string onto the end of the multiple choice list.
 * @param evt 
 */
    private void addToMultiOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToMultiOptionsButtonActionPerformed
        tempMultiOptions.add(multiChoiceField.getText());
        
        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
        multiChoiceField.setText("");
    }//GEN-LAST:event_addToMultiOptionsButtonActionPerformed

    private void daysLastedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedFieldActionPerformed

    private void hoursLastedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursLastedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursLastedFieldActionPerformed

    private void createEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createEventActionPerformed

    /**
     * Creates a new instance of the Event class and adds it to the event list
     * if the user has created a EventDiet, EventCustomFields and Condition object otherwise it prompts
     * the user to create them when they have clicked the button.
     * @see Event
     * @param evt 
     */
    private void createEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEventMouseClicked
        // TODO add your handling code here:

        cISTSCoord.aEventBeginTime = EventBeginTime.valueOf(
            beginTimeCombo.getSelectedItem().toString());

        cISTSCoord.aLocation = Location.valueOf(
            locationCombo.getSelectedItem().toString());

        cISTSCoord.aHoursLasted = Integer.parseInt(hoursLastedField.getText
            ());

        cISTSCoord.aDaysLasted = Integer.parseInt(daysLastedField.getText
            ());

        cISTSCoord.aNotes = notesArea.getText();
        
        cISTSCoord.aIntensity = intensitySlider.getValue();
        
        cISTSCoord.aAnxietyLVL = anxietySlider.getValue();

        
        if (customFieldGUI != null && cISTSCoord.eventDietCreated == true && 
                cISTSCoord.conditionCreated == true 
                && customFieldGUI.customFieldsCreated == true)
        {
            cISTSCoord.aEvent = new Event (cISTSCoord.aEventBeginTime,
                cISTSCoord.aLocation, cISTSCoord.aHoursLasted,
                cISTSCoord.aDaysLasted, cISTSCoord.aNotes,
                cISTSCoord.aCustomFields, cISTSCoord.aCondition ,customFieldGUI.
                tempEventCF, cISTSCoord.aIntensity, cISTSCoord.aAnxietyLVL);

            cISTSCoord.events.add(cISTSCoord.aEvent);

            model.addElement(cISTSCoord.aEvent);
            
            cISTSCoord.setConditionCreated(false);
            cISTSCoord.setEventDietCreated(false);
            customFieldGUI.setCustomFieldsCreated(false);

            eventCreatedDialog.pack();
            eventCreatedDialog.setVisible(true);
            eventCreatedDialog.setLocation(500, 500);
        }
        else
        {
            createEventError.pack();
            createEventError.setVisible(true);
            createEventError.setLocation(500, 500);
        }

        this.revalidate();

    }//GEN-LAST:event_createEventMouseClicked

    private void hrsSleptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptFieldActionPerformed

    private void illWithWhatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illWithWhatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illWithWhatFieldActionPerformed

    private void moodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodComboActionPerformed

    private void createConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createConditionActionPerformed

    /**
     * Create a new instance of the Condition class when the user has clicked the 
     * button.
     * @see Condition
     * @param evt 
     */
    private void createConditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createConditionMouseClicked
        //

        anxiousString = anxiousCombo.getSelectedItem().toString();
        if ("Yes".equals(anxiousString)){
            cISTSCoord.aAnxious = true;
        }
        else {
            cISTSCoord.aAnxious = false;
        }

        cISTSCoord.aMood = Mood.valueOf(moodCombo.getSelectedItem().
            toString());

        areYouIllString = areYouIllCombo.getSelectedItem().toString();
        if ("Yes".equals(areYouIllString)){
            cISTSCoord.aAreYouIll = true;
        }
        else {
            cISTSCoord.aAreYouIll = false;
        }

        cISTSCoord.aIllWithWhat = illWithWhatField.getText();

        sleptString = sleptCombo.getSelectedItem().toString();
        if ("Yes".equals(sleptString)){
            cISTSCoord.aSlept = true;
        }
        else {
            cISTSCoord.aSlept = false;
        }

        cISTSCoord.aHrsSlept = Integer.parseInt(hrsSleptField.getText());

        cISTSCoord.aMedicationTaken = medicationTakenArea.getText();

        cISTSCoord.aCondition = new Condition(cISTSCoord.aAnxious,
            cISTSCoord.aMood, cISTSCoord.aAreYouIll,
            cISTSCoord.aIllWithWhat, cISTSCoord.aSlept,
            cISTSCoord.aHrsSlept, cISTSCoord.aMedicationTaken);
        
        cISTSCoord.setConditionCreated(true);

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_createConditionMouseClicked

    private void anxiousComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousComboActionPerformed

    private void hungoverComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hungoverComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hungoverComboActionPerformed

    private void drunkWhatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drunkWhatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drunkWhatFieldActionPerformed

    private void drunkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drunkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drunkComboActionPerformed

    private void eatenWhatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eatenWhatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eatenWhatFieldActionPerformed

    /**
     * Creates a new instance of the EventDiet class when the user has clicked the 
     * button.
     * @see EventDiet
     * @param evt
     */
    private void createEventDietButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEventDietButtonMouseClicked
        // TODO add your handling code here:

        eatenString = eatenCombo.getSelectedItem().toString();
        if ("Yes".equals(eatenString)){
            cISTSCoord.aEatenBefore = true;
        }
        else {
            cISTSCoord.aEatenBefore = false;
        }

        cISTSCoord.aEatenWhat = eatenWhatField.getText();

        drunkString = drunkCombo.getSelectedItem().toString();
        if ("Yes".equals(drunkString)){
            cISTSCoord.aDrunkAlcohol = true;
        }
        else {
            cISTSCoord.aDrunkAlcohol = false;
        }

        cISTSCoord.aDrunkWhat = drunkWhatField.getText();

        hungoverString = hungoverCombo.getSelectedItem().toString();
        if ("Yes".equals(hungoverString)){
            cISTSCoord.aHungover = true;
        }
        else {
            cISTSCoord.aHungover = false;
        }

        cISTSCoord.aCustomFields = new EventDiet(cISTSCoord.aEatenBefore, 
            cISTSCoord.aEatenWhat,cISTSCoord.aDrunkAlcohol, cISTSCoord.aDrunkWhat,
            cISTSCoord.aHungover);
        
        cISTSCoord.setEventDietCreated(true);

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_createEventDietButtonMouseClicked
/**
 * opens the custom field input window.
 * @param evt 
 */
    private void goToCustomInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToCustomInputButtonActionPerformed

        customFieldGUI = new CustomFieldGUI(cISTSCoord.customFieldBoss);
    }//GEN-LAST:event_goToCustomInputButtonActionPerformed

    private void createEventDietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventDietButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createEventDietButtonActionPerformed
/**
 * opens the custom field view window.
 * @param evt 
 */
    private void ViewECFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewECFButtonActionPerformed
        customFieldGUIView = new CustomFieldGUIView(selectedEvent.getECF());
    }//GEN-LAST:event_ViewECFButtonActionPerformed
/**
 * saves the customFieldBoss.
 * @param evt 
 */
    private void saveCFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCFButtonActionPerformed
        cISTSCoord.saveCustomFieldBoss();
        
        cFBossSavedDialog.pack();
        cFBossSavedDialog.setVisible(true);
        cFBossSavedDialog.setLocation(500, 300);
    }//GEN-LAST:event_saveCFButtonActionPerformed

    private void hrsSleptDisplay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptDisplay4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptDisplay4ActionPerformed

    private void illDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illDisplay3ActionPerformed

    private void moodDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodDisplay3ActionPerformed

    private void anxiousDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousDisplay3ActionPerformed

    private void dateDisplay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDisplay4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDisplay4ActionPerformed

    private void daysLastedDisplay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedDisplay4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedDisplay4ActionPerformed

    private void beginTimeDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginTimeDisplay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginTimeDisplay3ActionPerformed
/**
 * opens the custom field view window.
 * @param evt 
 */   
    private void ViewECFButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewECFButton1ActionPerformed
        customFieldGUIView = new CustomFieldGUIView(selectedEvent.getECF());
    }//GEN-LAST:event_ViewECFButton1ActionPerformed
/**
 * opens the custom field view window.
 * @param evt 
 */
    private void ViewECFButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewECFButton2ActionPerformed
         customFieldGUIView = new CustomFieldGUIView(selectedEvent.getECF());
    }//GEN-LAST:event_ViewECFButton2ActionPerformed
/**
 * opens the custom field view window.
 * @param evt 
 */
    private void ViewECFButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewECFButton3ActionPerformed
         customFieldGUIView = new CustomFieldGUIView(selectedEvent1.getECF());
    }//GEN-LAST:event_ViewECFButton3ActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editMedicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMedicationButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setConditionMedicationTaken(medicationDisplay1.getText());

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editMedicationButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editHrsSleptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHrsSleptButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setConditionHrsSlept(Integer.parseInt(hrsSleptDisplay1.getText()));

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editHrsSleptButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editIllWithWhatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIllWithWhatButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setConditionIllWithWhat(illWithWhatDisplay1.getText());

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editIllWithWhatButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editAreYouIllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAreYouIllButtonActionPerformed
        // TODO add your handling code here:

        areYouIllString = areYouIllCombo1.getSelectedItem().toString();
        if ("Yes".equals(areYouIllString)){
            selectedEvent.setConditionAreYouIll(true);
        }
        else {
            selectedEvent.setConditionAreYouIll(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editAreYouIllButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editMoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMoodButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setConditionMood(Mood.valueOf(
            moodCombo1.getSelectedItem().toString()));

    infoStoredDialog.pack();
    infoStoredDialog.setVisible(true);
    infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editMoodButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editAnxiousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAnxiousButtonActionPerformed

        anxiousString = anxiousCombo1.getSelectedItem().toString();
        if ("Yes".equals(anxiousString)){
            selectedEvent.setConditionAnxious(true);
        }
        else {
            selectedEvent.setConditionAnxious(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editAnxiousButtonActionPerformed

    private void anxiousCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anxiousCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anxiousCombo1ActionPerformed

    private void hrsSleptDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsSleptDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrsSleptDisplay1ActionPerformed
/**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editAnxietyLVLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAnxietyLVLButtonActionPerformed
        this.selectedEvent.setAnxietyLevel(anxietySliderDisplay4.getValue());
        
        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editAnxietyLVLButtonActionPerformed
/**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editIntensityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIntensityButtonActionPerformed
        this.selectedEvent.setOverallIntensity(intensitySliderDisplay4.getValue());
        
        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editIntensityButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNotesButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setNotes(notesDisplay1.getText());

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editNotesButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editDaysLastedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDaysLastedButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setDaysLasted(Integer.parseInt(daysLastedDisplay1.getText()));

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editDaysLastedButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editHrsLastedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHrsLastedButtonActionPerformed
        // TODO add your handling code here:
        this.selectedEvent.setHoursLasted(Integer.parseInt(hrsLastedDisplay1.getText()));

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editHrsLastedButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLocationButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setLocation(Location.valueOf(
            locationCombo1.getSelectedItem().toString()));

    infoStoredDialog.pack();
    infoStoredDialog.setVisible(true);
    infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editLocationButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editBeginTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBeginTimeButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setEventBeginTime(EventBeginTime.valueOf(
            beginTimeCombo1.getSelectedItem().toString()));

    infoStoredDialog.pack();
    infoStoredDialog.setVisible(true);
    infoStoredDialog.setLocation(500, 500);

    }//GEN-LAST:event_editBeginTimeButtonActionPerformed

    private void dateDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDisplay1ActionPerformed

    private void daysLastedDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLastedDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLastedDisplay1ActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editHungoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHungoverButtonActionPerformed
        // TODO add your handling code here:

        hungoverString = hungoverCombo1.getSelectedItem().toString();
        if ("Yes".equals(hungoverString)){
            selectedEvent.setEDHungover(true);
        }
        else {
            selectedEvent.setEDHungover(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editHungoverButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editDrunkWhatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDrunkWhatButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setEDDrunkWhat(drunkWhatDisplay1.getText());

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editDrunkWhatButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editEatenWhatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEatenWhatButtonActionPerformed
        // TODO add your handling code here:

        this.selectedEvent.setEDEatenWhat(eatenWhatDisplay1.getText());

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editEatenWhatButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editEatenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEatenButtonActionPerformed
        // TODO add your handling code here:

        eatenString = eatenCombo1.getSelectedItem().toString();
        if ("Yes".equals(eatenString)){
            selectedEvent.setEDEatenBefore(true);
        }
        else {
            selectedEvent.setEDEatenBefore(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editEatenButtonActionPerformed

    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editDrunkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDrunkButtonActionPerformed
        // TODO add your handling code here:

        drunkString = drunkCombo1.getSelectedItem().toString();
        if ("Yes".equals(drunkString)){
            selectedEvent.setEDDrunkAlcohol(true);
        }
        else {
            selectedEvent.setEDDrunkAlcohol(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editDrunkButtonActionPerformed

    private void hungoverCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hungoverCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hungoverCombo1ActionPerformed

    private void drunkCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drunkCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drunkCombo1ActionPerformed
    /**
     * Edits Event attribute. 
     * @param evt 
     */
    private void editSleptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSleptButtonActionPerformed
        sleptString = sleptCombo1.getSelectedItem().toString();
        if ("Yes".equals(sleptString)){
            selectedEvent.setConditionSlept(true);
        }
        else {
            selectedEvent.setConditionSlept(false);
        }

        infoStoredDialog.pack();
        infoStoredDialog.setVisible(true);
        infoStoredDialog.setLocation(500, 500);
    }//GEN-LAST:event_editSleptButtonActionPerformed
/**
 * opens the custom field list window.
 * @param evt 
 */
    private void cFListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFListButtonActionPerformed
        cFListDialog.pack();
        cFListDialog.setVisible(true);
        cFListDialog.setLocation(500, 500);
    }//GEN-LAST:event_cFListButtonActionPerformed

    /**
     * resets the custom field boss.
     * @param evt 
     */
    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        cISTSCoord.resetCFBoss();
        customFields = cISTSCoord.customFieldBoss.getCustomFieldList();
        cFModel.clear();
        cFBossResetDialog.pack();
        cFBossResetDialog.setVisible(true);
        cFBossResetDialog.setLocation(500, 500);
        resetCustomFieldsDialog.dispose();
    }//GEN-LAST:event_yesButtonActionPerformed
/**
 * opens a yes no dialog.
 * @param evt 
 */
    private void resetCFBossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCFBossButtonActionPerformed
        resetCustomFieldsDialog.pack();
        resetCustomFieldsDialog.setVisible(true);
        resetCustomFieldsDialog.setLocation(500, 500);
    }//GEN-LAST:event_resetCFBossButtonActionPerformed
/**
 * closes the window.
 * @param evt 
 */
    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        resetCustomFieldsDialog.dispose();
    }//GEN-LAST:event_noButtonActionPerformed

    private void eventList4ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventList4ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_eventList4ValueChanged
/**
 * creates a PDF summary of the selected events.
 * @param evt 
 */
    private void createSummaryFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSummaryFinalButtonActionPerformed
     List<Event> selectedEvents;
     selectedEvents = new ArrayList<>();
     for (Object eachEvent : eventList4.getSelectedValuesList()){
         Event tempEvent = (Event) eachEvent;
         selectedEvents.add(tempEvent);
     }
     
     cISTSCoord.creatPDFSummary(selectedEvents);
     System.out.println("Summary Created");
     summarySelectionDialog.dispose();
    }//GEN-LAST:event_createSummaryFinalButtonActionPerformed
/**
 * Opens the summary selection window.
 * @param evt 
 */
    private void eventSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventSummaryButtonActionPerformed
            summarySelectionDialog.pack();
            summarySelectionDialog.setVisible(true);
            summarySelectionDialog.setLocation(500, 500);
    }//GEN-LAST:event_eventSummaryButtonActionPerformed

    private void deleteEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEventButtonActionPerformed
       this.deleteEventDialog.pack();
       this.deleteEventDialog.setVisible(true);
       this.deleteEventDialog.setLocation(500, 500); 
    }//GEN-LAST:event_deleteEventButtonActionPerformed

    private void yesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButton1ActionPerformed
       this.deleteEvent();
       this.eventDeletedDialog.pack();
       this.eventDeletedDialog.setVisible(true);
       this.eventDeletedDialog.setLocation(500, 500);
       this.deleteEventDialog.dispose();
    }//GEN-LAST:event_yesButton1ActionPerformed

    private void noButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButton1ActionPerformed
        this.deleteEventDialog.dispose();
    }//GEN-LAST:event_noButton1ActionPerformed

    private void chartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartButtonActionPerformed
        List<Event> selectedEvents;
        selectedEvents = new ArrayList<>();
        for (Object eachEvent : eventList4.getSelectedValuesList()){
            Event tempEvent = (Event) eachEvent;
            selectedEvents.add(tempEvent);
        }
        
        chartTitleString = this.chartTitleField.getText();
        
        chartGUI = new ChartGUI(selectedEvents, cISTSCoord, chartTypeString, xAxisString, yAxisString, chartTitleString);
     
    }//GEN-LAST:event_chartButtonActionPerformed

    private void chartTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartTypeComboActionPerformed
              chartTypeString = chartTypeCombo.getSelectedItem().toString();
        System.out.println(chartTypeString);
        
        if ("Bar Chart".equals(chartTypeString)){
            this.xAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Date", "Time of Day", "Mood", "Hungover", "Location", "Overall Intensity"}));
            this.yAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Overall Intensity", "Hours Slept", "Anxiety Lvl", "Days Lasted", "Time Lasted" }));
        }
        else if ("XY Line Chart".equals(chartTypeString)){
            this.xAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Overall Intensity", "Hours Slept", "Anxiety Lvl", "Days Lasted", "Time Lasted" }));
            this.yAxisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Overall Intensity", "Hours Slept", "Anxiety Lvl", "Days Lasted", "Time Lasted" }));
        } 
    }//GEN-LAST:event_chartTypeComboActionPerformed

    private void chartTypeComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chartTypeComboPropertyChange
   
    }//GEN-LAST:event_chartTypeComboPropertyChange

    private void xAxisComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xAxisComboActionPerformed
       xAxisString = this.xAxisCombo.getSelectedItem().toString();
       System.out.println(xAxisString);
    }//GEN-LAST:event_xAxisComboActionPerformed

    private void xAxisComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_xAxisComboPropertyChange
        
    }//GEN-LAST:event_xAxisComboPropertyChange

    private void yAxisComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yAxisComboPropertyChange

    }//GEN-LAST:event_yAxisComboPropertyChange

    private void yAxisComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yAxisComboActionPerformed
        yAxisString = this.yAxisCombo.getSelectedItem().toString();
       System.out.println(yAxisString);
    }//GEN-LAST:event_yAxisComboActionPerformed

    private void deleteEvent(){
        
        cISTSCoord.events.remove(this.selectedEvent);
        System.out.println("event removed from list.");
            
        this.events = cISTSCoord.getEvents();
        System.out.println("GUI events list refreshed");
        
        model.removeElement(this.selectedEvent);
        System.out.println("event removed from model.");    
        
    }
    
    private void displayEvent(){
        this.intensitySliderDisplay.setValue(selectedEvent.getOverallIntensity());
        this.intensitySliderDisplay.setEnabled(false);
        
        this.anxietySliderDisplay.setValue(selectedEvent.getAnxietyLevel());
        this.anxietySliderDisplay.setEnabled(false);
        
        this.beginTimeDisplay1.setText(selectedEvent.getEventBeginTime().toString());
        this.beginTimeDisplay1.setEditable(false);

        this.locationDisplay1.setText(selectedEvent.getLocation().toString());
        this.locationDisplay1.setEditable(false);

        this.hrsLastedDisplay2.setText(Integer.toString(selectedEvent.getHoursLasted()));
        this.hrsLastedDisplay2.setEditable(false);

        this.daysLastedDisplay2.setText(Integer.toString(selectedEvent.getDaysLasted()));
        this.daysLastedDisplay2.setEditable(false);

        this.notesDisplay2.setText(selectedEvent.getNotes());
        this.notesDisplay2.setEditable(false);

        this.dateDisplay2.setText(selectedEvent.toString());
        this.dateDisplay2.setEditable(false);

        // populate vomit details

        EventDiet tempCF = this.selectedEvent.getCustomFields();

        this.eatenDisplay1.setText(Boolean.toString(tempCF.getEatenBefore()));
        this.eatenDisplay1.setEditable(false);

        this.eatenWhatDisplay2.setText(tempCF.getEatenWhat());
        this.eatenWhatDisplay2.setEditable(false);

        this.drunkDisplay1.setText(Boolean.toString(tempCF.getDrunkAlcohol()));
        this.drunkDisplay1.setEditable(false);

        this.drunkWhatDisplay2.setText(tempCF.getDrunkWhat());
        this.drunkWhatDisplay2.setEditable(false);

        this.hungoverDisplay1.setText(Boolean.toString(tempCF.getHungover()));
        this.hungoverDisplay1.setEditable(false);

        //populate condition details

        Condition tempCon = this.selectedEvent.getCondition();

        this.anxiousDisplay1.setText(Boolean.toString(tempCon.getAnxious()));
        this.anxiousDisplay1.setEditable(false);

        this.moodDisplay1.setText(tempCon.getMood().toString());
        this.moodDisplay1.setEditable(false);

        this.illDisplay1.setText(Boolean.toString(tempCon.getAreYouIll()));
        this.illDisplay1.setEditable(false);

        this.illWithWhatDisplay2.setText(tempCon.getIllWithWhat());
        this.illWithWhatDisplay2.setEditable(false);

        this.sleptDisplay1.setText(Boolean.toString(tempCon.getSlept()));
        this.sleptDisplay1.setEditable(false);

        this.hrsSleptDisplay2.setText(Integer.toString(tempCon.getHrsSlept()));
        this.hrsSleptDisplay2.setEditable(false);

        this.medicationDisplay2.setText(tempCon.getMedicationTaken());
        this.medicationDisplay2.setEditable(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI1().setVisible(true);
            }
        });
        
        /*  */        
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ViewECFButton;
    private javax.swing.JToggleButton ViewECFButton1;
    private javax.swing.JToggleButton ViewECFButton2;
    private javax.swing.JToggleButton ViewECFButton3;
    private javax.swing.JButton addCFButton;
    public javax.swing.JPanel addEventTab;
    private javax.swing.JButton addNewCFButton;
    private javax.swing.JButton addToMultiOptionsButton;
    private javax.swing.JSlider anxietySlider;
    private javax.swing.JSlider anxietySliderDisplay;
    private javax.swing.JSlider anxietySliderDisplay1;
    private javax.swing.JSlider anxietySliderDisplay2;
    private javax.swing.JSlider anxietySliderDisplay3;
    private javax.swing.JSlider anxietySliderDisplay4;
    private javax.swing.JComboBox<String> anxiousCombo;
    private javax.swing.JComboBox<String> anxiousCombo1;
    private javax.swing.JTextField anxiousDisplay;
    private javax.swing.JTextField anxiousDisplay1;
    private javax.swing.JTextField anxiousDisplay2;
    private javax.swing.JTextField anxiousDisplay3;
    private javax.swing.JComboBox<String> areYouIllCombo;
    private javax.swing.JComboBox<String> areYouIllCombo1;
    private javax.swing.JComboBox<String> beginTimeCombo;
    private javax.swing.JComboBox<String> beginTimeCombo1;
    private javax.swing.JTextField beginTimeDisplay;
    private javax.swing.JTextField beginTimeDisplay1;
    private javax.swing.JTextField beginTimeDisplay2;
    private javax.swing.JTextField beginTimeDisplay3;
    private javax.swing.JDialog cFBossResetDialog;
    private javax.swing.JDialog cFBossSavedDialog;
    private javax.swing.JToggleButton cFListButton;
    private javax.swing.JDialog cFListDialog;
    private javax.swing.JButton chartButton;
    private javax.swing.JTextField chartTitleField;
    private javax.swing.JComboBox<String> chartTypeCombo;
    private javax.swing.JPanel conditionDetailsTab;
    private javax.swing.JPanel conditionDetailsTab1;
    private javax.swing.JPanel conditionDetailsTab2;
    private javax.swing.JPanel conditionDetailsTab3;
    private javax.swing.JPanel conditionDetailsTab4;
    private javax.swing.JDialog createCFDialog;
    private javax.swing.JButton createCondition;
    private javax.swing.JButton createEvent;
    private javax.swing.JButton createEventDietButton;
    private javax.swing.JDialog createEventError;
    private javax.swing.JToggleButton createSummaryFinalButton;
    private javax.swing.JList<String> customFieldList;
    private javax.swing.JTextField dateDisplay;
    private javax.swing.JTextField dateDisplay1;
    private javax.swing.JTextField dateDisplay2;
    private javax.swing.JTextField dateDisplay3;
    private javax.swing.JTextField dateDisplay4;
    private javax.swing.JTextField daysLastedDisplay;
    private javax.swing.JTextField daysLastedDisplay1;
    private javax.swing.JTextField daysLastedDisplay2;
    private javax.swing.JTextField daysLastedDisplay3;
    private javax.swing.JTextField daysLastedDisplay4;
    private javax.swing.JTextField daysLastedField;
    private javax.swing.JToggleButton deleteEventButton;
    private javax.swing.JDialog deleteEventDialog;
    private javax.swing.JComboBox<String> drunkCombo;
    private javax.swing.JComboBox<String> drunkCombo1;
    private javax.swing.JTextField drunkDisplay;
    private javax.swing.JTextField drunkDisplay1;
    private javax.swing.JTextField drunkDisplay2;
    private javax.swing.JTextField drunkDisplay3;
    private javax.swing.JTextArea drunkWhatDisplay;
    private javax.swing.JTextArea drunkWhatDisplay1;
    private javax.swing.JTextArea drunkWhatDisplay2;
    private javax.swing.JTextArea drunkWhatDisplay3;
    private javax.swing.JTextArea drunkWhatDisplay4;
    private javax.swing.JTextField drunkWhatField;
    private javax.swing.JDialog dualEventDetailsDialog;
    private javax.swing.JComboBox<String> eatenCombo;
    private javax.swing.JComboBox<String> eatenCombo1;
    private javax.swing.JTextField eatenDisplay;
    private javax.swing.JTextField eatenDisplay1;
    private javax.swing.JTextField eatenDisplay2;
    private javax.swing.JTextField eatenDisplay3;
    private javax.swing.JTextArea eatenWhatDisplay;
    private javax.swing.JTextArea eatenWhatDisplay1;
    private javax.swing.JTextArea eatenWhatDisplay2;
    private javax.swing.JTextArea eatenWhatDisplay3;
    private javax.swing.JTextArea eatenWhatDisplay4;
    private javax.swing.JTextField eatenWhatField;
    private javax.swing.JButton editAnxietyLVLButton;
    private javax.swing.JButton editAnxiousButton;
    private javax.swing.JButton editAreYouIllButton;
    private javax.swing.JButton editBeginTimeButton;
    private javax.swing.JButton editDaysLastedButton;
    private javax.swing.JButton editDrunkButton;
    private javax.swing.JButton editDrunkWhatButton;
    private javax.swing.JButton editEatenButton;
    private javax.swing.JButton editEatenWhatButton;
    private javax.swing.JButton editEventButton;
    private javax.swing.JDialog editEventDetailsDialog;
    private javax.swing.JButton editHrsLastedButton;
    private javax.swing.JButton editHrsSleptButton;
    private javax.swing.JButton editHungoverButton;
    private javax.swing.JButton editIllWithWhatButton;
    private javax.swing.JButton editIntensityButton;
    private javax.swing.JButton editLocationButton;
    private javax.swing.JButton editMedicationButton;
    private javax.swing.JButton editMoodButton;
    private javax.swing.JButton editNotesButton;
    private javax.swing.JButton editSleptButton;
    private javax.swing.JDialog eventCreatedDialog;
    private javax.swing.JDialog eventDeletedDialog;
    private javax.swing.JDialog eventDetailsDialog;
    private javax.swing.JList eventList1;
    private javax.swing.JList eventList3;
    private javax.swing.JList eventList4;
    private javax.swing.JPanel eventListTab;
    private javax.swing.JToggleButton eventSummaryButton;
    private javax.swing.JComboBox<String> fieldTypeCombo;
    private javax.swing.JPanel generalDetailsTab;
    private javax.swing.JPanel generalDetailsTab1;
    private javax.swing.JPanel generalDetailsTab2;
    private javax.swing.JPanel generalDetailsTab3;
    private javax.swing.JPanel generalDetailsTab4;
    private javax.swing.JToggleButton goToCustomInputButton;
    private javax.swing.JTextField hoursLastedField;
    private javax.swing.JTextField hrsLastedDisplay;
    private javax.swing.JTextField hrsLastedDisplay1;
    private javax.swing.JTextField hrsLastedDisplay2;
    private javax.swing.JTextField hrsLastedDisplay3;
    private javax.swing.JTextField hrsLastedDisplay4;
    private javax.swing.JTextField hrsSleptDisplay;
    private javax.swing.JTextField hrsSleptDisplay1;
    private javax.swing.JTextField hrsSleptDisplay2;
    private javax.swing.JTextField hrsSleptDisplay3;
    private javax.swing.JTextField hrsSleptDisplay4;
    private javax.swing.JTextField hrsSleptField;
    private javax.swing.JComboBox<String> hungoverCombo;
    private javax.swing.JComboBox<String> hungoverCombo1;
    private javax.swing.JTextField hungoverDisplay;
    private javax.swing.JTextField hungoverDisplay1;
    private javax.swing.JTextField hungoverDisplay2;
    private javax.swing.JTextField hungoverDisplay3;
    private javax.swing.JTextField illDisplay;
    private javax.swing.JTextField illDisplay1;
    private javax.swing.JTextField illDisplay2;
    private javax.swing.JTextField illDisplay3;
    private javax.swing.JTextArea illWithWhatDisplay;
    private javax.swing.JTextArea illWithWhatDisplay1;
    private javax.swing.JTextArea illWithWhatDisplay2;
    private javax.swing.JTextArea illWithWhatDisplay3;
    private javax.swing.JTextArea illWithWhatDisplay4;
    private javax.swing.JTextField illWithWhatField;
    private javax.swing.JDialog infoStoredDialog;
    private javax.swing.JSlider intensitySlider;
    private javax.swing.JSlider intensitySliderDisplay;
    private javax.swing.JSlider intensitySliderDisplay1;
    private javax.swing.JSlider intensitySliderDisplay2;
    private javax.swing.JSlider intensitySliderDisplay3;
    private javax.swing.JSlider intensitySliderDisplay4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JLabel listLabel;
    private javax.swing.JDialog listSavedDialog;
    private javax.swing.JScrollPane listScrollPane4;
    private javax.swing.JScrollPane listScrollPane6;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> locationCombo1;
    private javax.swing.JTextField locationDisplay;
    private javax.swing.JTextField locationDisplay1;
    private javax.swing.JTextField locationDisplay2;
    private javax.swing.JTextField locationDisplay3;
    private javax.swing.JTextField medicationDisplay;
    private javax.swing.JTextField medicationDisplay1;
    private javax.swing.JTextField medicationDisplay2;
    private javax.swing.JTextField medicationDisplay3;
    private javax.swing.JTextField medicationDisplay4;
    private javax.swing.JTextArea medicationTakenArea;
    private javax.swing.JComboBox<String> moodCombo;
    private javax.swing.JComboBox<String> moodCombo1;
    private javax.swing.JTextField moodDisplay;
    private javax.swing.JTextField moodDisplay1;
    private javax.swing.JTextField moodDisplay2;
    private javax.swing.JTextField moodDisplay3;
    private javax.swing.JTextField multiChoiceField;
    private javax.swing.JTextField newFieldNameField;
    private javax.swing.JToggleButton noButton;
    private javax.swing.JToggleButton noButton1;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JTextArea notesDisplay;
    private javax.swing.JTextArea notesDisplay1;
    private javax.swing.JTextArea notesDisplay2;
    private javax.swing.JTextArea notesDisplay3;
    private javax.swing.JTextArea notesDisplay4;
    private javax.swing.JToggleButton resetCFBossButton;
    private javax.swing.JDialog resetCustomFieldsDialog;
    private javax.swing.JToggleButton saveCFButton;
    private javax.swing.JButton saveListButton;
    private javax.swing.JButton select2EventButton;
    private javax.swing.JDialog select2EventErrorDialog;
    private javax.swing.JButton selectEventButton;
    private javax.swing.JComboBox<String> sleptCombo;
    private javax.swing.JComboBox<String> sleptCombo1;
    private javax.swing.JTextField sleptDisplay;
    private javax.swing.JTextField sleptDisplay1;
    private javax.swing.JTextField sleptDisplay2;
    private javax.swing.JTextField sleptDisplay3;
    private javax.swing.JDialog summarySelectionDialog;
    private javax.swing.JPanel vomitDetailsTab;
    private javax.swing.JPanel vomitDetailsTab1;
    private javax.swing.JPanel vomitDetailsTab2;
    private javax.swing.JPanel vomitDetailsTab3;
    private javax.swing.JPanel vomitDetailsTab4;
    private javax.swing.JComboBox<String> xAxisCombo;
    private javax.swing.JComboBox<String> yAxisCombo;
    private javax.swing.JToggleButton yesButton;
    private javax.swing.JToggleButton yesButton1;
    // End of variables declaration//GEN-END:variables
}
