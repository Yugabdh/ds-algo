import java.lang.Math;

public class Main {
  // Time complexity: O(log(n)) where n is number of versions
  // Solved with binary search algorithm
  // Binary search provides logarithmic time complexity as each time the input array is cut down to half of its original size.
  // Space complexity: O(1)

  // given block starts-----------------------------------------------
  public static int minBad;
  
  public static boolean isBadVersion (int n) {
    if (n < minBad) {
      return false;
    } else {
      return true;
    }
  }
  // given block ends-------------------------------------------------
  
  // Solution starts--------------------------------------------------
  public static int firstBadVersion (int n) {
    int mid = 0;
    int min = 1;
    int max = n;
    int last = 0;
    while (min <= max) {
	    mid = (int) (min+(max-min)/2);
	    if (isBadVersion (mid)) {
        last = mid;
	      max = mid-1;
	    } else {
	      min = mid+1;
	    }
    }
    return last;
  }
  // solution ends----------------------------------------------------

  // driver code------------------------------------------------------
  public static void main (String[]args) {
    //test case 1
    minBad = 1;
    int totalVersion = 5;
    System.out.println (firstBadVersion(totalVersion));

    //test case 2
    minBad = 5;
    totalVersion = 5;
    System.out.println (firstBadVersion(totalVersion));

    //test case 3
    minBad = 1702766719;
    totalVersion = 2126753390;
    System.out.println (firstBadVersion(totalVersion));
  }
}
