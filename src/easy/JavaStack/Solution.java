package easy.JavaStack;

import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(checkString(input));
        }
    }

    private static boolean checkString(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if ("({[".indexOf(ch) >= 0) {
                stack.push(ch);
            } else {
                if(stack.empty()){
                    return false;
                }
                Character openable = stack.pop();
                switch (ch){
                    case '}':
                        if(!openable.equals('{')){
                            return false;
                        }
                        break;
                    case ')':
                        if(!openable.equals('(')){
                            return false;
                        }
                        break;
                    case ']':
                        if(!openable.equals('[')){
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.empty();
    }
}