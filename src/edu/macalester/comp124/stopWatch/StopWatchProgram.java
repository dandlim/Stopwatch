package edu.macalester.comp124.stopWatch;

import comp124graphics.CanvasWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * This Program will display a stopwatch that can be started and stopped with a
 * button placed at the bottom of the window.
 *
 * Worked in partners with Chase Yoo.
 */
public class StopWatchProgram extends CanvasWindow implements ActionListener {

    // TODO: use a StopWatch instance instead of printing to the console
    private StopWatch stopWatch = new StopWatch(0, 0);;

    private int countHour = 0;
    private int countMin = 0;
    private int countSec = 0;

    private int timeSince = 0;


    Timer timer; // this is used in place of a while(true) loop with a pause
    public final static int ONE_SECOND = 1000;

    /**
     * Creates a constructor for the class with the window, the buttons and includes StopWatch
     */
    public StopWatchProgram() {

        super("Stop Watch", 700, 200);

        setBackground(Color.black);

        JButton button = new JButton("Start/Stop");
        button.setSize(200, 40);

        add(button);

        button.addActionListener(this);  // for the button

        setupJavaTimer();

        // TODO: setup the StopWatch object here.
        stopWatch = new StopWatch();
        add(stopWatch, 20, 60);
    }

    /**
     * A Timer is used in Java Graphics programs to trigger an
     * event to occur repeatedly after a certain amount of time.
     * In our case, we will trigger the event for every second,
     * and update the current time being displayed when the event
     * occurs.
     *
     * In this event-driven program that contains a JButton for the
     * user to start and stop the displayed timer, we must use this
     * code in place of using pause() inside a while(true) loop
     * as we have done previously.
     */
    public void setupJavaTimer() {
        timer = new Timer(ONE_SECOND, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                //TODO: replace this with an update to the LCD version of the stop watch
                // this version of the code will print out "unix time" which is the number
                // of seconds since midnight Thursday, 1 January 1970 UTC time zone. This is
                // how computers track time and will show you that this method is running.
                if (countSec < 59){

                    timeSince++;
                    countSec++;
                } else {

                    timeSince++;
                    countSec = 0;
                    if(countMin<59){

                        countMin++;
                    }else{

                        countMin = 0;
                        if(countHour<99){

                            countHour++;
                        } else{

                            countHour=0;
                        }

                    }
                }
                stopWatch.setCountHour(countHour);
                stopWatch.setCountMin(countMin);
                stopWatch.setCountSec(countSec);
                stopWatch.drawTime();

            }
        });
    }


    /**
     * Toggle the current state of the displayed StopWatch.
     * If the current state of the displayed StopWatch in
     * this program is "toggled" to 'off', then stop the timer object.
     * If the current state is 'on' then start the timer.
     */
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Start/Stop")) {

            // TODO: complete the logic here
            //       Right now this simply starts the timer when you click
            //       the button -
            //       you will need to kill the program to have it go away.
            //       The real version will start and stop your timer.
            //
            if (timer.isRunning()) {
                timer.stop();

            } else {
                timer.start();
                timeSince = 0;
            }
        }
    }

    public void setCountHour(int time) {
        countHour = time;
    }

    public void setCountMin(int time) {
        countMin = time;
    }

    public void setCountSec(int time) {
        countSec = time;
    }

    /**
     * Main method that runs the class
     */
    public static void main(String[] args){
        StopWatchProgram prog = new StopWatchProgram();
    }
}