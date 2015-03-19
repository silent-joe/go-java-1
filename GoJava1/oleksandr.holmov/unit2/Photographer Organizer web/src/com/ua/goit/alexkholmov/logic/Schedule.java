/**
 * 
 */
package com.ua.goit.alexkholmov.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author SASH
 *
 */
public class Schedule {
    static int TIME_WORKING_IN_WORK_DAY = 3; //hours
    static int TIME_WORKING_IN_DAY_OFF = 6; //hours
    static String PATTERN = "dd.MM.yyyy";
    private SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);

    private Calendar deadline;
    private Calendar startWork;
    private Calendar endWork;
    
    private int scheduleId;
    private int amountDays = 0;
    private WorkWithFotos workWithFotos;
    
    WorkWithFotos getWorkWithFotos() {
        return workWithFotos;
    }

    public void setWorkWithFotos(WorkWithFotos workWithFotos) {
        this.workWithFotos = workWithFotos;
    }

    public int getAmountDays() {
        return amountDays;
    }

    // set amount days manually
    void setAmountDays(int amountDays) {
        this.amountDays = amountDays;
    }
    
    /**
     * @return the tIME_WORKING_IN_WORK_DAY
     */
    public static int getTIME_WORKING_IN_WORK_DAY() {
        return TIME_WORKING_IN_WORK_DAY;
    }

    /**
     * @param tIME_WORKING_IN_WORK_DAY the tIME_WORKING_IN_WORK_DAY to set
     */
    public static void setTIME_WORKING_IN_WORK_DAY(int tIME_WORKING_IN_WORK_DAY) {
        TIME_WORKING_IN_WORK_DAY = tIME_WORKING_IN_WORK_DAY;
    }

    /**
     * @return the tIME_WORKING_IN_DAY_OFF
     */
    public static int getTIME_WORKING_IN_DAY_OFF() {
        return TIME_WORKING_IN_DAY_OFF;
    }

    /**
     * @param tIME_WORKING_IN_DAY_OFF the tIME_WORKING_IN_DAY_OFF to set
     */
    public static void setTIME_WORKING_IN_DAY_OFF(int tIME_WORKING_IN_DAY_OFF) {
        TIME_WORKING_IN_DAY_OFF = tIME_WORKING_IN_DAY_OFF;
    }

    /**
     * @return the deadline
     */
    public Calendar getDeadline() {
        return deadline;
    }

    /**
     * @return the startWork
     */
    public Calendar getStartWork() {
        return startWork;
    }

    /**
     * @return the endWork
     */
    public Calendar getEndWork() {
        return endWork;
    }

    public void setDeadline(String date) {
        try {
            Date dateParse = dateFormat.parse(date);
            deadline = Calendar.getInstance();
            deadline.setTime(dateParse);
        } catch (ParseException e) {
            // TODO: handle exception
            System.err.print(e.getMessage());
        }
    }
    
    public void setStartWork(String date) {
        try {
            Date dateParse = dateFormat.parse(date);
            startWork = Calendar.getInstance();
            startWork.setTime(dateParse);
        } catch (ParseException e) {
            // TODO: handle exception
            System.err.print(e.getMessage());
        }
    }
    
    public void calcEndWork() throws Exception {
        String startWorkDate = dateFormat.format(startWork.getTime());
        int workHours = workWithFotos.timeEditingFotosInPackage();
        boolean condition;
        try {
            Date dateParse = dateFormat.parse(startWorkDate);
            endWork = Calendar.getInstance(); 
            endWork.setTime(dateParse);
            int i = 1;
            while (workHours >= 0) {
                condition = endWork.get(Calendar.DAY_OF_WEEK) == 1 || endWork.get(Calendar.DAY_OF_WEEK) == 7;
                workHours = condition ? workHours - TIME_WORKING_IN_DAY_OFF : workHours - TIME_WORKING_IN_WORK_DAY;
                endWork.add(Calendar.DAY_OF_MONTH, i);
                amountDays++;
            }
        } catch (ParseException e) {
            System.err.print(e.getMessage());
        }
    }
    
    public boolean isOutOfDeadline() {  
        if (endWork.after(deadline)) {
            int i = 1;
            while (endWork.after(deadline)) {
                endWork.add(Calendar.DAY_OF_MONTH, -i);
                startWork.add(Calendar.DAY_OF_MONTH, -i);
                i++;
            }
            return true;
        } else {
            return false;
        }
    }

}