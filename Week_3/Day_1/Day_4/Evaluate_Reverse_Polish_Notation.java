class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> x = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                int b = x.pop();
                int a = x.pop();
                x.push(a + b);
            } else if (s.equals("-")) {
                int b = x.pop();
                int a = x.pop();
                x.push(a - b);
            } else if (s.equals("*")) {
                int b = x.pop();
                int a = x.pop();
                x.push(a * b);
            } else if (s.equals("/")) {
                int b = x.pop();
                int a = x.pop();
                x.push(a / b);
            } else {
                x.push(Integer.parseInt(s));
            }
        }

        return x.pop();
    }
}
