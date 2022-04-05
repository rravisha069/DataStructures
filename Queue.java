public class QueueUsingArray {
  int rear=0;
  int front=0;
  int capacity = 5;
  int queue[] = new int[capacity];
  int size=0;

  public void enqueue(int data) {
    if(isFull()) {
      System.out.println("queue overflow");
    } else {
      queue[rear] = data;
      rear = (rear + 1) % capacity;
      size = size + 1;
    }
  }

  public int dequeue() {
    int data = queue[front];
    if(!isEmpty()) {
      front = (front + 1) % capacity;
      size = size - 1;
    }
    return data;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }

  public boolean isFull() {
    return getSize() == capacity;
  }

  public void show() {
    for(int i=0; i<size; i++) {
      System.out.println(queue[(front + i)%capacity]);
    }
  }
}
