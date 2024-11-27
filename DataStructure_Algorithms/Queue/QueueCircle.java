package DataStructure_Algorithms.Queue;

public class QueueCircle {
  private static int MAX_SIZE = 20;
  private int front;
  private int rear;
  private int[] queue;

  public QueueCircle(){
    this.front= this.rear=-1;
    this.queue = new int[MAX_SIZE];
  }

  private boolean QueueFull(){
    if((this.rear+1)%MAX_SIZE == front) return true;
    return false;
  }

  private boolean QueueEmpty(){
    if(this.rear==-1 && this.front==-1) return true;
    return false;

  }

  public void Enqueue(int number){
    if(QueueFull()) System.out.println("Queue over flow");
    else if(this.rear==-1 && this.front==-1) {
      this.rear=this.front=0;
      this.queue[this.rear]=number;
    }
    else{
      this.rear=(this.rear+1)%MAX_SIZE;
      this.queue[this.rear]=number;
    }
  }

  public void Dequeue(){
    if(QueueEmpty()) System.out.println("Queue under flow");
    else if(this.front == this.rear) this.rear=this.front=-1;
    else this.front = (this.front+1)%MAX_SIZE;
  }
}
