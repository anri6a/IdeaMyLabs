package myLabs.TimeInterval;

public class TimeInterval {
    int allSec;
     public void AllSec(int sec,int min,int hour){
        allSec=sec+min*60+hour*3600;
         System.out.println(allSec+" seconds");
    }
}
