class StackWithMin extends Stack<Integer>{
  Stack<Integer> minStack;
  
  public StackWithMin(){
    minStack = new Stack<Integer>();
  }

  public void push(Integer value){
    if (minStack.peek() >= value){
      minStack.push(value);
    }
    super.push(value);
  }

  public Integer pop(){
    Integer value = super.pop();
    if (value == minStack.peek()){
      minStack.pop();
    }
    return value;
  }

  public Integer min(){
    if (minStack.peek() == null) return Integer.MAX_VALUE;
    return minStack.peek();
  }



}