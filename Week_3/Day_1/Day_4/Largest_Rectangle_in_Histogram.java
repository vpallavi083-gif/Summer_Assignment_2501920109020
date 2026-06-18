class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> a = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!a.isEmpty() && currHeight < heights[a.peek()]) {
                int height = heights[a.pop()];

                int width;
                if (a.isEmpty()) {
                    width = i;
                } else {
                    width = i - a.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            a.push(i);
        }

        return maxArea;
    }
}