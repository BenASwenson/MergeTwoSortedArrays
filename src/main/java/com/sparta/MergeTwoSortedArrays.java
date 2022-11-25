package com.sparta;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int[] merged = new int[arr1Length + arr2Length];

        int arr1Index = 0;
        int arr2Index = 0;
        int mergedIndex = 0;

        while(arr1Index < arr1Length && arr2Index < arr2Length) {
            if(arr1[arr1Index] < arr2[arr2Index]) {
                merged[mergedIndex++] = arr1[arr1Index++];
            } else {
                merged[mergedIndex++] = arr2[arr2Index++];
            }
        }

        while(arr1Index < arr1Length) {
            merged[mergedIndex++] = arr1[arr1Index++];
        }

        while(arr2Index < arr2Length) {
            merged[mergedIndex++] = arr2[arr2Index++];
        }
        System.out.print("Merged array is: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        return merged;
    }
}
