class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            boolean even = num%2==0;

            if (even) {
                num = num/2;
                steps++;
            } else {
                num -= 1;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // 14 -> 6
        System.out.println(sol.numberOfSteps(14));
        // 8 -> 4
        System.out.println(sol.numberOfSteps(8));
        // 123 -> 12
        System.out.println(sol.numberOfSteps(123));
    }
}
