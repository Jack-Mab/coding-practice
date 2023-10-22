package easy.java.ArrayDuplicates;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test; // Import JUnit for Testing

public class ArrayDuplicatesTest {

    @Test
    public void hasDuplicates() {
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        ArrayList<Integer> result = arrayDuplicates.getDuplicates(new int[] {2,3,1,2,3}, 5);
        Assert.assertEquals((Integer) 2, result.get(0)); // The first duplicate is 2
        Assert.assertEquals((Integer) 3, result.get(1)); // The second duplicate is 3
        Assert.assertEquals(2, result.size()); // The are two duplicates
    }

    public void hasDuplicates2() {
        // To ensure that the previous test didn't pass by chance
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        ArrayList<Integer> result = arrayDuplicates.getDuplicates(new int[] {2,1,1,2,4,6,3,4,3}, 7);
        Assert.assertEquals((Integer) 1, result.get(0)); // The first duplicate is 1
        Assert.assertEquals((Integer) 2, result.get(1)); // The second duplicate is 2
        Assert.assertEquals((Integer) 3, result.get(2)); // The third duplicate is 3
        Assert.assertEquals((Integer) 4, result.get(3)); // The fourth duplicate is 4
        Assert.assertEquals(4, result.size()); // The are four duplicates
    }

    @Test
    public void hasNoDuplicates() {
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        // The returned arrayList must be empty since there no duplicates
        Assert.assertEquals(0, arrayDuplicates.getDuplicates(new int[] {0,3,1,2}, 4).size());
    }

    @Test
    public void hasNoDuplicatesOneElement() {
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        // The returned arrayList must be empty since there no duplicates
        Assert.assertEquals(0, arrayDuplicates.getDuplicates(new int[] {0}, 4).size());
    }
}