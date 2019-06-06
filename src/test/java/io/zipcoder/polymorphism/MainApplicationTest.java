package io.zipcoder.polymorphism;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.Test;
import org.junit.Assert;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.io.*;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    @Test
    public void askPetInfoTest() {
        //ask how many pets they have
        //what kind of pet each is alone with each pet's name
        //hole onto user input and print out the list at the end

        /*
        program prints prompt for input
        user responds with number
        kind of pet along with each pet's name save info
         */
        //Given
        InputStream input = System.in;
        PrintStream output = System.out;

        final PipedOutputStream testInput = new PipedOutputStream();
        PipedOutputStream out = new PipedOutputStream();
        final PipedInputStream testOutput = new PipedInputStream();
        System.setIn(new PipedInputStream(testInput));
        System.setOut(new PrintStream(out));

        new Thread(new Runnable() {
            public void run() {
                try {
                    PrintStream testPrint = new PrintStream(testInput);
                    BufferedReader testReader = new BufferedReader(new InputStreamReader(testOutput));
                    String expectedPrompt = "How many pets do you have?"
                    Assert.assertEquals(expectedPrompt, testReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        }


    }

}
