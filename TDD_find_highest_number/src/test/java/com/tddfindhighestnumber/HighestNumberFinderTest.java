package com.tddfindhighestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberFinderTest {
    @Test
    public void find_highest_in_array_of_one_expect_single_item() {
        // arrange
        int array[] =
                {
                        10
                };
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 10;

        //act
        int actualResult = cut.findHighestNumber(array);

        //asset
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_Two_descending_numbers() {
        // arrange
        int array[] = {13, 4};
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();

        //act
        int actualResult = cut.findHighestNumber(array);

        //asset
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void find_highest_in_array_of_Two_ascending_numbers() {
        // arrange
        int array[] = {7, 13};
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();

        //act
        int actualResult = cut.findHighestNumber(array);

        //asset
        assertEquals(expectedResult, actualResult);
    }
}
