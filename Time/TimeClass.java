/*Develop a Java program to create a class Time that has data members for hours and minutes.

Include a method addTime(Time t1, Time t2) that adds two Time objects and returns the resulting Time object.

In the main method, create two Time objects, add them using the addTime() method, and display the result.  */



class TimeClass{
    
    int hours;
    int minutes;

    static TimeClass addTime(TimeClass t1, TimeClass t2){
        
        TimeClass t3 = new TimeClass();
        if(t1.minutes+t2.minutes >= 60)
        {
            t3.hours = (t1.hours + t2.hours + 1)%24;
        }
        else
        {
            t3.hours = (t1.hours + t2.hours)%24;
        }
        t3.minutes = (t1.minutes+t2.minutes)%60;

      return t3;
    }

    @Override
    public String toString() {
        return String.format("%02d",hours) + ":" + String.format("%02d",minutes);
    }


    public static void main(String[] args)
    {
        TimeClass t1 = new TimeClass();
        TimeClass t2 = new TimeClass();

        t1.hours = 12;
        t1.minutes = 43;
        t2.hours = 11;
        t2.minutes = 17;


        System.out.println(addTime(t1,t2));
    }
}
