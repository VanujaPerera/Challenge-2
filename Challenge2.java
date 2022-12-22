import java.util.*;


public class Challenge2 {

    public static boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String[] args) {
        String userInp;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string to evaulate: ");
        userInp= sc.nextLine();

        boolean result = isValid(userInp);

        System.out.printf("The result is: %b", result);
    }
}