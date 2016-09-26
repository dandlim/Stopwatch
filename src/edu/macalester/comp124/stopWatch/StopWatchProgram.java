package edu.macalester.comp124.stopWatch;

import comp124graphics.CanvasWindow;
import comp124graphics.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * This Program will display a stopwatch that can be started and stopped with a
 * button placed at the bottom of the window.
 */
public class StopWatchProgram extends CanvasWindow implements ActionListener {

    // TODO: use a StopWatch instance instead of printing to the console

    Timer timer; // this is used in place of a while(true) loop with a pause
    public final static int ONE_SECOND = 1000;


    private int hours; // the last displayed hours
    private int minutes; // the last displayed minutes
    private int seconds; // the last displayed seconds

    public StopWatchProgram() {
        super("Stop Watch", 700, 200);
        hours = 0;
        minutes = 0;
        seconds = 0;

        setBackground(Color.cyan);

        JButton button = new JButton("Start/Stop");
        button.setSize(200, 40);

        add(button);

        button.addActionListener(this);  // for the button

        setupJavaTimer();

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
                seconds++; //updating seconds is not enough for the real timer
                System.out.print("\r"+Integer.toString(seconds));
            }
        });
    }  // leave the structure of this method declaration intact




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
            timer.start();

        }
    }

    public static void main(String[] args){
        StopWatchProgram prog = new StopWatchProgram();
    }
}
