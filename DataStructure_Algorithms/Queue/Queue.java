package DataStructure_Algorithms.Queue;

public class Queue {
  private static int MAX_SIZE = 20;
  private int front;
  private int rear;
  private int[] queue;

  public Queue(){
    this.front= this.rear=-1;
    queue = new int[MAX_SIZE];
  }
  public boolean queueFull(){
    if(this.rear==MAX_SIZE-1) return true;
    return false;
  }

  public boolean queueEmpty(){
    if(this.rear==-1 && this.front==-1) return true;
    return false;
  }

  public void Enqueue(int number){
    if(queueFull()) System.out.println("Queue over flow");
    else if(this.rear==-1 && this.front==-1){
      this.rear=this.front=0;
      queue[this.rear]=number;
    } 
    else{
      this.rear=this.rear+1;
      queue[this.rear]=number;
    }
  }

  public void Dequeue(){
    if(queueEmpty()) System.out.println("Queue under flow");
    else if(this.rear==this.front) this.rear=this.front=-1;
    else{
       this.rear=this.rear+1;
    }
  }
}
