package DataStructure_Algorithms.LinkList;

public class SingleLikedList {
  private Node head;
  private Node temp;
  
  SingleLikedList(){
    this.head = null;
  }

  public void createNode(Node newNode){
    if(this.head==null){
       this.head = this.temp = newNode;
    }
    else{
       this.temp.next = newNode;
       this.temp = newNode;
    }
  }

  public void deleteBegin(){
    this.temp = this.head;
    this.head = this.temp.next;
    this.temp.next = null;
    
  }
  public void deleteEnd(){
    Node previous=new Node();
    this.temp = this.head;
    while(this.temp.next !=null){
      previous = this.temp;
      this.temp = this.temp.next;
    }
    if(this.temp==this.head) this.head=null;
    previous.next=null;
  }

  public void deleteLocation(int position){
    int i=1;
    Node nextNode  = new Node();
    this.temp = this.head;
    while(i<position-1){
      temp = temp.next;
      i++;
    }
    nextNode= this.temp.next;
    this.temp.next = nextNode.next;

  }

  public void insertBegin(Node newNode){
     newNode.next = head;
     this.head = newNode;
  }

  public void insertEnd(Node newNode){
    newNode.next = null;
    this.temp = this.head;
    while(this.temp.next!=null){
      this.temp = this.temp.next;
    }

    this.temp.next = newNode;
  }

  public void insertLocation(int position,Node newNode){
    this.temp = this.head;
    int count = 0;
    while(temp!=null){
      count+=1;
      this.temp = this.temp.next;
    }

    if(position>count) System.out.println("Invalid position");
    else{
      this.temp = this.head;
      int i =1;
      while(i<position){
        this.temp = this.temp.next;
        i++;
      }
      newNode.next = this.temp.next;
      this.temp.next = newNode;
    }
  }

  public void display(){
    this.temp = this.head;
    while(this.temp!=null){
      System.out.println(this.temp.data);
      this.temp = this.temp.next;
    }
  }
}
