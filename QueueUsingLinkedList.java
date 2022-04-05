public class QueueUsingLinkedList {
  Node head = null;
  int count = 0;

  public void enqueue(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null) {
      head = node;
    } else {
      Node n = head;
      while(n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
    count++;
  }

  public void dequeue() {
    Node n = head;
    head = n.next;
    count--;
  }

  public void show() {
    Node n = head;
        
    while(n.next != null) {
        System.out.println(n.data);
        n = n.next;
    }
    System.out.println(n.data);
  }
}
