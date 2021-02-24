/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import cists.CISTSCoord;
import cists.Event;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author m_hay
 */
public class ChartGUI extends javax.swing.JFrame implements ActionListener{
    /**
     * new JPanel.
     */
    JPanel chartJPanel;
    List<Event> chartEvents;
    CategoryDataset dataset;
    CISTSCoord cISTSCoord;
    
    public ChartGUI(List<Event> selectedEvents, CISTSCoord coord){
        cISTSCoord = coord;
        chartEvents = selectedEvents;
        dataset = cISTSCoord.chartManager.createAnxLVLCatDataset(selectedEvents);
        
        JFreeChart chart = cISTSCoord.chartManager.createChart(dataset, "Chart", 
        "X", "Y");
        
         System.out.println("Chart Created");
        
        this.chartJPanel = new JPanel();
         
        
        this.chartJPanel.setLayout(new BoxLayout(chartJPanel, BoxLayout.Y_AXIS));
        this.add(chartJPanel, BorderLayout.CENTER);
        
        ChartPanel cPanel = new ChartPanel(chart);
      
        this.chartJPanel.add(cPanel);
     
        setSize(400, 800);
        setLocation(500, 200);
        setVisible(true);
    }
    
     
     

      
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
