package DataStructure_Algorithms.Stack;

public class Stack {
  private static int MAX_SIZE = 20;
  private int top;
  private int[] stack;

  public Stack(){
    top=-1;
    stack = new int[MAX_SIZE];
  }

  public void push(int number){
    if(stackFull()) System.out.println("stack over flow");
    else{
      top=top+1;
      stack[top]=number;
    }
  }
  public int peek(){
    if(stackEmpty()) System.out.println("stack is empty");
    return stack[top];
  }
  public int pop(){
    if(stackEmpty()) System.out.println("stack is empty");
    else{
      top=top-1;
    }
    return stack[top+1];
  }
  public boolean stackEmpty(){
    if(top==-1) return true;
    return false;
  }
  public boolean stackFull(){
    if(top==MAX_SIZE-1) return true;
    return false;
  }
}
