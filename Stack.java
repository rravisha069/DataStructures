public class StackUsingArray {
  int stack[] = new int[5];
  int top = 0;

  public void push(int data) {
    stack[top] = data;
    top++;
  }

  public void pop() {
    stack[top-1] = 0;
  }

  public int peek() {
    int data = 0;
    data = stack[top-1];
    return data;
  }
}
