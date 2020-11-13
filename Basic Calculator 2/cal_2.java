class Solution {
    public int calculate(String s) {
        int len = s.length();
        if (s == null || len == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = (num * 10) + Character.getNumericValue(c);
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == len -1)        
            {
                
                if(sign == '-') {
                    stack.push(-num);
                }
                else if (sign == '+') {
                    stack.push(num);
                }
                else if(sign == '*') {
                    stack.push(stack.pop() * num);
                }
                else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args)
    {
      String s="3+4+6*7";
      System.out.print(calculate(s));
    }
    
}
