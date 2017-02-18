package edu.macalester.comp124.stopWatch;

import comp124graphics.GraphicsGroup;

/**
 * This program creates a stopwatch
 *
 * Created by danielimmy on 2017. 2. 16..
 * Worked in partners with Chase Yoo.
 */
public class StopWatch extends GraphicsGroup {

    private Number hour2; // second digit of the hour
    private Number hour1; // first digit of the hour
    private Number min2; // second digit of the minute
    private Number min1; // second digit of the minute
    private Number sec2; // second digit of the second
    private Number sec1; // second digit of the second
    private Number colon1; // first colon
    private Number colon2; // second colon

    private int countSec = 0; // seconds displayed
    private int countMin = 0; // minutes displayed
    private int countHour = 0; // hours displayed

    /**
     * Constructor that places StopWatch at 0.0, 0.0
     */
    public StopWatch() {

        this(0.0,0.0);
    }

    /**
     * Creates a constructor for StopWatch
     *
     * @param x coordinate of where to start putting the clock
     * @param y coordinate of where to start putting the clock
     */
    public StopWatch(double x, double y) {

        double xPos = x;
        hour2 = new Number(0);
        add(hour2, xPos, y);

        xPos = xPos + hour2.getWidth();
        hour1 = new Number(0);
        add(hour1, xPos, y);

        xPos = xPos + hour1.getWidth();
        colon2 = new Number(10);
        add(colon2, xPos, y);

        xPos = xPos + colon2.getWidth();
        min2 = new Number(0);
        add(min2, xPos, y);

        xPos = xPos + min2.getWidth();
        min1 = new Number(0);
        add(min1, xPos, y);

        xPos = xPos + min1.getWidth();
        colon1 = new Number(10);
        add(colon1, xPos, y);

        xPos = xPos + colon1.getWidth();
        sec2 = new Number(0);
        add(sec2, xPos, y);

        xPos = xPos + sec2.getWidth();
        sec1 = new Number(0);
        add(sec1, xPos, y);
    }

    /**
     * Draws the current time
     */
    public void drawTime() {

        int h2 = countHour / 10;
        int h1 = countHour % 10;
        int m2 = countMin / 10;
        int m1 = countMin % 10;
        int s2 = countSec / 10;
        int s1 = countSec % 10;

        colon2.drawNumber(10);
        colon1.drawNumber(10);
        hour2.drawNumber(h2);
        hour1.drawNumber(h1);
        min2.drawNumber(m2);
        min1.drawNumber(m1);
        sec2.drawNumber(s2);
        sec1.drawNumber(s1);
    }

    /**
     * Setter for hours in Stopwatch
     * @param countHour number of hours
     */
    public void setCountHour(int countHour) {

        this.countHour = countHour;
    }

    /**
     * Setter for minutes in Stopwatch
     * @param countMin number of minutes
     */
    public void setCountMin(int countMin) {

        this.countMin = countMin;
    }

    /**
     * Setter for seconds in Stopwatch
     * @param countSec number of seconds
     */
    public void setCountSec(int countSec) {

        this.countSec = countSec;
    }

    /**
     * Gets the variable CountSec
     * @return
     */
    public int getCountSec() {
        return countSec;
    }

    /**
     * Gets the variable CountMin
     * @return
     */
    public int getCountMin() {
        return countMin;
    }

    /**
     * Gets the variable CountMin

     * @return
     */
    public int getCountHour() {
        return countHour;
    }

    /**
     * String object representation of the Graphics object's value
     *
     * @return Returns what the last displayed time was
     */
    @Override
    public String toString() {

        return "Display time: " + countHour + ":" + countMin + ":" + countSec;
    }
}