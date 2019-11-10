package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> testCase = new ArrayList<>();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testCase);

        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> testCase = new ArrayList<>();
        testCase.add(1);
        testCase.add(2);
        testCase.add(3);
        testCase.add(4);

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testCase);

        //Then
        Assert.assertEquals(2, result.size());

    }
}
