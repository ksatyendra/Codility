package Lesson8;

/**
 * Created by yaodh on 2014/12/7.
 * 1. MinPerimeterRectangle
 * Find the minimal perimeter of any rectangle whose area equals N.
 * Task description
 * An integer N is given, representing the area of some rectangle.
 * The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
 * The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.
 * For example, given integer N = 30, rectangles of area 30 are:
 * (1, 30), with a perimeter of 62,
 * (2, 15), with a perimeter of 34,
 * (3, 10), with a perimeter of 26,
 * (5, 6), with a perimeter of 22.
 * Write a function:
 * class Solution { public int solution(int N); }
 * that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.
 * For example, given an integer N = 30, the function should return 22, as explained above.
 * Assume that:
 * N is an integer within the range [1..1,000,000,000].
 * Complexity:
 * expected worst-case time complexity is O(sqrt(N));
 * expected worst-case space complexity is O(1).
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        for (int i = (int) Math.sqrt(N); i > 0; i--) {
            int t = N / i;
            if (t * i == N) return 2 * (t + i);
        }
        return 0;
    }

    public static void main(String[] args) {
        int ans = new MinPerimeterRectangle().solution(11);
        System.out.println(ans);
    }
}