<<<<<<< HEAD
package gui;

import cists.*;
import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * GUI to display the custom fields.
 * 
 * @author m_hay
 * @since 20-06-2020
 * @version 1.0
 */
public class CustomFieldGUIView extends javax.swing.JFrame {
    /**
     * new JPanel.
     */
    JPanel cFPanel;
    
    /**
     * variable to reference the EventCustomField object.
     */
    EventCustomFields tempEventCF;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customTFLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customYNLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customMCLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customSLDLabels;
    
    /**
     * list of Swing components.
     */
    public List<Object> customInputs;
    
    /**
     * list of JTextFields.
     */
    public List<javax.swing.JTextField> customTextFields;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customYesNos;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customMultiCombo;
    
    /**
     * list of JSliders.
     */
    public List<javax.swing.JSlider> customSliders;
    
    /**
     * Creates a new CustomFieldGUIView using the customFieldBoss, and calls the
     * displayEventCF() method to generate the form.
     * @param aEventCF eventCustomFields object.
     */
    public CustomFieldGUIView(EventCustomFields aEventCF){
        super("Custom Fields Input Form");
        this.cFPanel = new JPanel();
        this.cFPanel.setLayout(new BoxLayout(this.cFPanel, BoxLayout.Y_AXIS));
        add(cFPanel);
        
        //JButton createCFButton = new JButton("Store Custom Info");
        //add(createCFButton, BorderLayout.SOUTH);
        //createCFButton.addActionListener(this);
        
        //customInputs = new ArrayList<>();
        //customTFLabels = new ArrayList<>();
       //customYNLabels = new ArrayList<>();
        //customMCLabels = new ArrayList<>();
        //customSLDLabels = new ArrayList<>();
        //customTextFields = new ArrayList<>();
        //customYesNos = new ArrayList<>();
        //customMultiCombo = new ArrayList<>();
        //customSliders = new ArrayList<>();
        
        displayEventCF(aEventCF);
        setSize(400, 800);
        setLocation(500, 200);
        setVisible(true);
        
    }
    
    /**
     * Method that iterates through the two eventCF lists, adding the names to 
     * a JLabel and a fills a JTextField with the details. 
     * @param aEventCF 
     */
    public void displayEventCF(EventCustomFields aEventCF){
        
        for (int i = 0 ; i != aEventCF.customFieldNames.size() ; i++){
            javax.swing.JLabel customLabel;
            javax.swing.JLabel customLabelSPACE;
            javax.swing.JLabel customLabelSPACE1;
            javax.swing.JLabel customLabelSPACE2;
            javax.swing.JTextField customField;
            customLabel = new javax.swing.JLabel(aEventCF.customFieldNames.get(i));
            customField = new javax.swing.JTextField(0);
            customLabelSPACE = new javax.swing.JLabel("   ");
            customLabelSPACE1 = new javax.swing.JLabel("****");
            customLabelSPACE2 = new javax.swing.JLabel("   ");
            customField.setBorder(new LineBorder(Color.BLACK, 1));
            customField.setText(aEventCF.customFieldInputs.get(i));
            customField.setEditable(false);
            
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customField);
        this.cFPanel.add(customLabelSPACE1);
        this.cFPanel.add(customLabelSPACE2);
        //this.customFieldsInputDialog.add(cFBox);
        this.cFPanel.setVisible(true);
        }
        
    } 
    
    
}
=======
package gui;

import cists.*;
import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * GUI to display the custom fields.
 * 
 * @author m_hay
 * @since 20-06-2020
 * @version 1.0
 */
public class CustomFieldGUIView extends javax.swing.JFrame {
    /**
     * new JPanel.
     */
    JPanel cFPanel;
    
    /**
     * variable to reference the EventCustomField object.
     */
    EventCustomFields tempEventCF;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customTFLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customYNLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customMCLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customSLDLabels;
    
    /**
     * list of Swing components.
     */
    public List<Object> customInputs;
    
    /**
     * list of JTextFields.
     */
    public List<javax.swing.JTextField> customTextFields;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customYesNos;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customMultiCombo;
    
    /**
     * list of JSliders.
     */
    public List<javax.swing.JSlider> customSliders;
    
    /**
     * Creates a new CustomFieldGUIView using the customFieldBoss, and calls the
     * displayEventCF() method to generate the form.
     * @param aEventCF eventCustomFields object.
     */
    public CustomFieldGUIView(EventCustomFields aEventCF){
        super("Custom Fields Input Form");
        this.cFPanel = new JPanel();
        this.cFPanel.setLayout(new BoxLayout(this.cFPanel, BoxLayout.Y_AXIS));
        add(cFPanel);
        
        //JButton createCFButton = new JButton("Store Custom Info");
        //add(createCFButton, BorderLayout.SOUTH);
        //createCFButton.addActionListener(this);
        
        //customInputs = new ArrayList<>();
        //customTFLabels = new ArrayList<>();
       //customYNLabels = new ArrayList<>();
        //customMCLabels = new ArrayList<>();
        //customSLDLabels = new ArrayList<>();
        //customTextFields = new ArrayList<>();
        //customYesNos = new ArrayList<>();
        //customMultiCombo = new ArrayList<>();
        //customSliders = new ArrayList<>();
        
        displayEventCF(aEventCF);
        setSize(400, 800);
        setLocation(500, 200);
        setVisible(true);
        
    }
    
    /**
     * Method that iterates through the two eventCF lists, adding the names to 
     * a JLabel and a fills a JTextField with the details. 
     * @param aEventCF 
     */
    public void displayEventCF(EventCustomFields aEventCF){
        
        for (int i = 0 ; i != aEventCF.customFieldNames.size() ; i++){
            javax.swing.JLabel customLabel;
            javax.swing.JLabel customLabelSPACE;
            javax.swing.JLabel customLabelSPACE1;
            javax.swing.JLabel customLabelSPACE2;
            javax.swing.JTextField customField;
            customLabel = new javax.swing.JLabel(aEventCF.customFieldNames.get(i));
            customField = new javax.swing.JTextField(0);
            customLabelSPACE = new javax.swing.JLabel("   ");
            customLabelSPACE1 = new javax.swing.JLabel("****");
            customLabelSPACE2 = new javax.swing.JLabel("   ");
            customField.setBorder(new LineBorder(Color.BLACK, 1));
            customField.setText(aEventCF.customFieldInputs.get(i));
            customField.setEditable(false);
            
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customField);
        this.cFPanel.add(customLabelSPACE1);
        this.cFPanel.add(customLabelSPACE2);
        //this.customFieldsInputDialog.add(cFBox);
        this.cFPanel.setVisible(true);
        }
        
    } 
    
    
}
>>>>>>> 1845e33bb69c178c291579b77d621224fd9171e9
