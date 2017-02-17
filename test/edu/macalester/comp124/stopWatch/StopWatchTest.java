package edu.macalester.comp124.stopWatch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by bjackson on 9/12/2016.
 */
public class StopWatchTest {
    
    public static void main(String[] args){
        StopWatchProgram stopWatch = new StopWatchProgram();
        stopWatch.setCountHour(23);
        stopWatch.setCountMin(59);
        stopWatch.setCountSec(57);
    }
}