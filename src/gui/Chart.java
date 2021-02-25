/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.GUI1;
import cists.Event;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * GUI class to create and display charts.
 * 
 * @author mathew hayfield
 * @since 29-01-2021
 * @version 1.0
 * 
 */
public class Chart extends javax.swing.JFrame{
    
    
    String date = "Date";
    String timeOfDay = "Time of Day";
    String mood = "Mood";
    String hungover = "Hungover";
    String location = "Location";
    String overallIntensity = "Overall Intensity";
    String hoursSlept = "Hours Slept";
    String anxietyLvl = "Anxiety Lvl";
    String daysLasted = "Days Lasted";
    String timeLasted = "Time Lasted";
    /**
     * Constructor
     */
    public Chart(){
    
    }
    
    
    
    public CategoryDataset createCatDataset(List<Event> events, String xAxis, String yAxis){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        if (xAxis.equals(date) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), eachEvent.getDate());
            }
        }
        else if (xAxis.equals(timeOfDay) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), eachEvent.getEventBeginTime());
            }
        }
        else if (xAxis.equals(mood) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), eachEvent.getMood());
            }
        }
        else if (xAxis.equals(hungover) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), eachEvent.getHungoverString());
            }
        }
        else if (xAxis.equals(location) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), eachEvent.getLocation());
            }
        }
        else if (xAxis.equals(overallIntensity) && yAxis.equals(overallIntensity))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getOverallIntensity(), eachEvent.getDate(), String.valueOf(eachEvent.getOverallIntensity()));
            }
        }
        else if (xAxis.equals(date) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), eachEvent.getDate().toString());
            }
        }
        else if (xAxis.equals(timeOfDay) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), eachEvent.getEventBeginTime());
            }
        }
        else if (xAxis.equals(mood) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), eachEvent.getMood());
            }
        }
        else if (xAxis.equals(hungover) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), eachEvent.getHungoverString());
            }
        }
        else if (xAxis.equals(location) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), eachEvent.getLocation());
            }
        }
        else if (xAxis.equals(overallIntensity) && yAxis.equals(hoursSlept))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursSlept(), eachEvent.getDate(), String.valueOf(eachEvent.getOverallIntensity()));
            }
        }
        else if (xAxis.equals(date) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), eachEvent.getDate().toString());
            }
        }
        else if (xAxis.equals(timeOfDay) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), eachEvent.getEventBeginTime());
            }
        }
        else if (xAxis.equals(mood) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), eachEvent.getMood());
            }
        }
        else if (xAxis.equals(hungover) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), eachEvent.getHungoverString());
            }
        }
        else if (xAxis.equals(location) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), eachEvent.getLocation());
            }
        }
        else if (xAxis.equals(overallIntensity) && yAxis.equals(anxietyLvl))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), String.valueOf(eachEvent.getOverallIntensity()));
            }
        }
        else if (xAxis.equals(date) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), eachEvent.getDate().toString());
            }
        }
        else if (xAxis.equals(timeOfDay) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), eachEvent.getEventBeginTime());
            }
        }
        else if (xAxis.equals(mood) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), eachEvent.getMood());
            }
        }
        else if (xAxis.equals(hungover) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), eachEvent.getHungoverString());
            }
        }
        else if (xAxis.equals(location) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), eachEvent.getLocation());
            }
        }
        else if (xAxis.equals(overallIntensity) && yAxis.equals(daysLasted))
        {
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getDaysLasted(), eachEvent.getDate(), String.valueOf(eachEvent.getOverallIntensity()));
            }
        }
        else if(xAxis.equals(date) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), eachEvent.getDate().toString());
            }
        }
        else if(xAxis.equals(timeOfDay) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), eachEvent.getEventBeginTime());
            }
        }
        else if(xAxis.equals(mood) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), eachEvent.getMood());
            }
        }
        else if(xAxis.equals(hungover) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), eachEvent.getHungoverString());
            }
        }
        else if(xAxis.equals(location) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), eachEvent.getLocation());
            }
        }
        else if(xAxis.equals(overallIntensity) && yAxis.equals(timeLasted)){
            for (Event eachEvent : events){
            dataset.addValue(eachEvent.getHoursLasted(), eachEvent.getDate(), String.valueOf(eachEvent.getOverallIntensity()));
            }
        }
        return dataset;
    }
    
    public XYDataset createXYSeries(List<Event> events){
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Anxiety Lvl against Overall Intensity");
        for (Event eachEvent : events){
            series1.add(eachEvent.getOverallIntensity(), eachEvent.getAnxietyLevel());
        }
        dataset.addSeries(series1);
        return dataset;
    }
    
    public JFreeChart createBarChart(CategoryDataset dataset, String name, String 
            xLabel, String yLabel){
        
        JFreeChart barChart = ChartFactory.createBarChart(
                name, xLabel, yLabel, dataset, PlotOrientation.VERTICAL,
                true, true, false
        );
        
        return barChart;
    }
    
    public JFreeChart createLineChart(XYDataset dataset, String name, String 
            xLabel, String yLabel){
        
        JFreeChart lineChart = ChartFactory.createXYLineChart(name, xLabel, yLabel, dataset);
        
        return lineChart;
    }
  
    
}
