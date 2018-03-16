import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayUtilitiesTest {

    @Test
    public void testMoveLastToFirst(){
        int[] values = {4, 6, 2, 9};
        int[] expected = {9, 4, 6, 2};
//        ArrayUtilities.moveLastToFirst(values);
//        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void testRemoveDuplicate(){
        int[] values = {4, 4, 6, 2, 9, 9, 9, 9};
        int[] expected = {4, 6, 2, 9};
//        int[] actual = ArrayUtilities.removeDuplicate(values);
//        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMean(){
        int[] values = {3, 5, 8, 1};
        double expected = 8.5;
//        double actual = ArrayUtilities.mean(values);
//        Assert.assertEquals(expected, actual, 0.10);
    }
}
