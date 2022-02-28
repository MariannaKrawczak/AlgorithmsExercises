import java.util.ArrayDeque;
import java.util.Deque;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

public class Stack {
  public boolean isValid(String s) {
    Deque<Character> brackets = new ArrayDeque<>();

    for (int i = 0; i<s.length(); i++) {
      char currentChar = s.charAt(i);
      if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
        brackets.push(currentChar);
      } else {
        if (brackets.isEmpty()) {
          return false;
        }
        if (currentChar == ')' && brackets.peek() == '(') {
          brackets.pop();
        } else if (currentChar == '}' && brackets.peek() == '{') {
          brackets.pop();
      } else if (currentChar == ']' && brackets.peek() == '[') {
          brackets.pop();
        } else {
          return false;
        }
      }
  }
    return brackets.isEmpty();
  }
}