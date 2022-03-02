import java.lang.Math;

class BinarySearch {
  // Time complexity: O(log(n))
  // Binary search provides logarithmic time complexity as each time the input array is cut down to half of its original size.
  // Space complexity: O(1)

  // Solution
  public static int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int mid = 0;
    int index = -1;

    // nums is empty
    if (end == -1) {
      return index;
    }

    while (start <= end) {
      mid = (int) Math.ceil(start + end) / 2;

      if (nums[mid] == target) {
        // Found index of target
        index = mid;
        break;
      }

      if (nums[mid] < target) {
        // Target is greater than number at mid
        // Hence move start pointer
        start = mid + 1;
      } else {
        // Target is smaller than number at mid
        // Hence move end pointer
        end = mid - 1;
      }
    }

    return index;
  }

  // Driver code
  public static void main(String[] args) {
    int[] nums = {-1,0,3,5,9,12};
    
    // Test case 1
    int target = 9;
    System.out.println("target = "+target+" Position: " + search(nums, target));
    
    // Test case 2
    target = 2;
    System.out.println("target = "+target+" Position: " + search(nums, target));
  }
}