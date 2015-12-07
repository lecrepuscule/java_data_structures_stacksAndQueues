class SetOfStacks{
  int length, capacity, sets;
  Node stackPointer, top;
  public SetOfStacks(int capacity){
    this.capacity = capacity;
    sets = 0;
  }
  public void push(Object data){
    if(length == capacity){
      Node newStackPointer = new Node(top);
      new StackPointer.next = stackPointer;
      stackPointer = newStackPointer;
      length = 0;
    } else {
      Node n = new Node(data);
      n.next = top;
      top = n;
    }
    length ++;
  }

  public Object pop(){
    Object data = top.data;
    length--;
    if(length == 0 || top.next == null){
      top = stackPointer.data; 
      stackPointer = stackPointer.next;
      sets--;
      length = capacity;
    } else {
      top = top.next;
    }
    return data;
  }

  public Object popAt(int index){
    if (index == 0) return pop();
    Node prevPointer, currPointer = stackPointer;
    for(int i=0; i<index; i++){
      prevPointer = currPointer;
      currPointer = currPointer.next;
    }
    Object data = currPointer.data.data;
    if(currPointer.data.next == null){
      prevPointer.next = currPointer.next;
    } else {
      currPointer.data = currPointer.data.next;
    }
    return data;
  }
}