class Solution {
    public String decodeString(String s) {
        Stack<Integer> a = new Stack<>();
        Stack<String> b = new Stack<>();

        String r = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                a.push(num);
                b.push(r);

                num = 0;
                r = "";
            }

            else if (ch == ']') {
                int times = a.pop();
                String prev = b.pop();

                String temp = "";
                for (int i = 0; i < times; i++) {
                    temp += r;
                }

                r = prev + temp;
            }

            else {
               r += ch;
            }
        }

        return r;
    }
}