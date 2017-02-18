package edu.macalester.comp124.stopWatch;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by bjackson on 9/12/2016.
 */
public class StopWatchTest {

    StopWatch stopWatch = new StopWatch();

    @Test
    public void testTime() {
        stopWatch.setCountHour(23);
        stopWatch.setCountMin(59);
        stopWatch.setCountSec(59);

        try{
            Thread.sleep(1000);

        } catch(InterruptedException ex){
            assertEquals(24, stopWatch.getCountHour());
            assertEquals(00, stopWatch.getCountMin());
            assertEquals(00, stopWatch.getCountSec());

        }
    }
}