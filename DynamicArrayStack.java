public class StackUsingArray {
  int capacity = 5;
  int stack[] = new int[capacity];
  int top = 0;

  public void push(int data) {
    if(top == capacity) {
      expand();  
    }
    
    stack[top] = data;
    top++;
  }

  public void expand() {
    int newStack[] = new int[capacity*2];
    System.arraycopy(stack, 0, newStack, 0, 5);
    stack = newStack;
    capacity *= 2;
  }

  public void pop() {
    if(top == capacity/2) {
      shrink();
    }
    
    stack[top-1] = 0;
    top--;
  }

  public void shrink() {
    int newStack[] = new int[capacity/2];
    System.arraycopy(stack, 0, newStack, 0, 5);
    stack = newStack;
    capacity /= 2;
  }

  public int peek() {
    int data = 0;
    data = stack[top-1];
    return data;
  }
}
