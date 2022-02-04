public class Queue {
  int capacity = 4;
  int queue[] = new int[capacity];
  int front = 0;
  int rear = 0;
  int size = 0;

  public void enqueue(int data) {
    if(size<capacity){
      queue[rear] = data;
      rear = (rear+1)%capacity;
      size++;
    }
  } 

  public int dequeue() {
    int data = queue[front];
    if(size!=0) {
      front = (front+1)%capacity;
      size--;
    } else {
      System.out.println("Queue is Empty");
    }
    return data;
  }

  public void show() {
    for(int i=0;i<size; i++){
      System.out.println(queue[(front+i)%capacity] + " ");
    }
  }
}