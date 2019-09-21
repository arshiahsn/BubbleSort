package test.java.com.bubble;


import main.java.com.bubble.BubbleSort;
import org.junit.*;

import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;



public class TestSort {

    private BubbleSort bs;

    @Before
    public void init(){
        bs = new BubbleSort();
    }


    @Test
    public void testPermutations() throws RuntimeException {

        int[] sortedArray = {10, 20, 30};
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{10, 20, 30}));
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{10, 30, 20}));
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{20, 10, 30}));
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{20, 30, 10}));
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{30, 10, 20}));
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{30, 20, 10}));
    }

    @Test
    public void testNegative() throws RuntimeException {
        int[] sortedArray = new int[] {-30, -20, -10};
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{-30, -10, -20}));
    }

    @Test
    public void testMixed() throws RuntimeException {
        int[] sortedArray = new int[] {-10, 0, 10};
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{10, -10, 0}));
    }

    @Test
    public void testDuplicates() throws RuntimeException {
        int[] sortedArray = new int[] {5, 10, 10, 20, 30};
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{10, 5, 20, 30, 10}));
    }

    @Test
    public void testOne() throws RuntimeException {
        int[] sortedArray = new int[] {1};
        assertArrayEquals(sortedArray, bs.bubbleSort(new int[]{1}));
    }

    @Test(expected = RuntimeException.class)
    public void testEmpty() throws RuntimeException {
        bs.bubbleSort(new int[]{});

    }

    @Test(expected = RuntimeException.class)
    public void testNull() throws RuntimeException {
        bs.bubbleSort(null);

    }

}
