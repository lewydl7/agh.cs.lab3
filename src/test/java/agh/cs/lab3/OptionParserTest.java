package agh.cs.lab3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class OptionParserTest {
    @Test
    public void testParse(){
        OptionParser parser = new OptionParser();
        String[] testArgs = {"f","l","f","forward","r", "x"};
        MoveDirection[] moveArgs = {MoveDirection.FORWARD, MoveDirection.LEFT, MoveDirection.FORWARD, MoveDirection.FORWARD, MoveDirection.RIGHT};
        assertArrayEquals(parser.parse(testArgs), moveArgs);

    }
}
