package edu.macalester.comp124.stopWatch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bjackson on 9/12/2016.
 */
public class StopWatchTest {

    StopWatch stopWatch = new StopWatch();
     /**
      * Sets the time to 23:59:57 and checks if the clock function properly after 24:00:00
      */
    public static void main(String[] args){
        StopWatchProgram stopWatch = new StopWatchProgram();
        stopWatch.setCountHour(23);
        stopWatch.setCountMin(59);
        stopWatch.setCountSec(57);
    }
}