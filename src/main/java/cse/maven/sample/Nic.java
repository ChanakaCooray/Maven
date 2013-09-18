package cse.maven.sample;

import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class Nic{
    
    private int days;
    private int year;
    private int month;
    private boolean Vote;
    private boolean Male;
   
    public Nic(String nic){
        days = Integer.parseInt(nic.substring(2, 5));
        year = Integer.parseInt(nic.substring(0, 2));
        
        year+=1900;
        
        Male = true;
        
        Calendar cal = Calendar.getInstance();
        System.out.println((cal.getTime()));

        if(days>500){
            Male = false;
            days = days -500;
        }
        if(year%4==0){
            int datesOfMonths[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            for (int i = 0; i < 12; i++) {
                if (days < datesOfMonths[i]) {
                    break;
                }
                days = days - datesOfMonths[i];
                month = i;
            }
        }
        else{
            int datesOfMonths[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            for (int i = 0; i < 12; i++) {
                if (days < datesOfMonths[i]) {
                    break;
                }
                days = days - datesOfMonths[i];
                month = i;
            }
            
        }
        if(month>0){
            month+=2;
            days-=1;
        }
        else{
            month+=1;
        }
        
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getDay(){
        return days;
    }
    
    public boolean isMale(){
        return Male;
    }
    
    public boolean isVoter(){
        int age = 2013-year;
        if(age>18){
            Vote = true;
        }
        return Vote;
    }
}
