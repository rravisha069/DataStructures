public class StackUsingLinkedList {
  Node head = null;
  int stackCount = 0;

  public void push(int data) {
    Node node = new Node();
    node.data = data;
    node.next = head;

    head = node;
    stackCount += 1;
  }

  public void pop() {
    if(stackCount != 0) {
      stackCount -= 1;
      head = head.next;
    }
  }

  public int peek() {
    if(stackCount != 0) {
      return head.data;
    }
    return 0;
  }

  public void show() {
    Node n = head;

    if(stackCount != 0) {
      while(n.next != null) {
        System.out.println(n.data);
        n = n.next;
      }
      System.out.println(n.data);
    }
  }
}
