package com.sparta.tests;


import com.sparta.MergeTwoSortedArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedArraysTests {
    @Test
    @DisplayName("Given input array1 with 9, 11, 15 and input array2 with 5, 10 Returns array 5, 9, 10, 11, 15")
    public void array1WithInput9_11_15AndArray2WithInput5_10_ReturnsArrayWith5_9_10_11_15() {
        int[] arr1 = {9,11,15};
        int[] arr2 = {5,10};
        int[] merged = {5,9,10,11,15};

        assertArrayEquals(merged, MergeTwoSortedArrays.mergeTwoSortedArrays(arr1, arr2));
    }

    @Test
    @DisplayName("Given input array1 with 10, 30, 50, 70 and input array2 with 20, 40, 60, 80 Returns array 10, 20, 30, 40, 50, 60, 70, 80")
    public void array1WithInput10_30_50_70AndArray2WithInput20_40_60_80_ReturnsArrayWith10_20_30_40_50_60_70_80(){
        int[] arr1 = {10,30,50,70};
        int[] arr2 = {20,40,60,80};
        int[] merged = {10,20,30,40,50,60,70,80};

        assertArrayEquals(merged, MergeTwoSortedArrays.mergeTwoSortedArrays(arr1, arr2));
    }
}


