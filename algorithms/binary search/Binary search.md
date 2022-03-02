# Binary search Algorithm
In Binary search algorithm we basically ignore half of the elements just after one comparison.

**Note: This algorithm workes only with sorted array.**

## Steps
1. Check if array contains elements. 
   If not then return -1.
2. SET
   START = 0
   END = *length_of_array* - 1
   INDEX = -1
3. Repeat step 4 to 5 **while START <= end**
4. Calculate mid= start+end/2
5. Compare target with the middle element.
4. If x matches with the middle element, 
   SET INDEX = MID 
   go to step 8.
5. Else If x is greater than the MID element, then x
   can only lie in the right half subarray after the MID element.
   So SET START = MID+1.
   Else (x is smaller) SET END = MID -1.
6. return INDEX