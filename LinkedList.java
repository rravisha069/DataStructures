public class LinkedList {
  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null) {
      head = node;
    }else {
      Node n = head;
      while(n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  public void insertAsStart(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null) {
      head = node;
    } else {
      Node n = head;
      node.next = n;
      head = node;
    }
  }

  public void insertAt(int index, int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    Node n = head;
    for(int i = 0; i < index-1; i++) {
      n = n.next;
    }
    node.next = n.next;
    n.next = node;
  }

  public void delete(int index) {
    if (index == 0) {
      head = head.next;
    } else {
      Node n = head;
      Node prevNode = null;
      for(int i=0; i<index; i++) {
        prevNode = n;
        n = n.next;
      }
      prevNode.next = n.next;
    }
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
