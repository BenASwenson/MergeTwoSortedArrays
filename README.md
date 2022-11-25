# MergeTwoSortedArrays

## Take two sorted arrays as input and combine them into one sorted array.

### MergeTwoSortedArrays class contains mergeTwoSortedArrays() method which implements the merging

- created a third array which is the same size as the two passed arrays combined
- used variables to keep track of the current index value for each of the arrays when we traverse both the passed arrays
- in each iteration we take the array with the smaller element at their index and advance that index.  This element is added to the next index of the merged array
- once one array is transferred, we continue copying the remaining elements from the other array into the merged array.
- finally, we return the merged array

### MergeTwoSortedArraysTests class contains methods utilising jUnit Jupiter tests to decipher if variations of input are producing results as expected.