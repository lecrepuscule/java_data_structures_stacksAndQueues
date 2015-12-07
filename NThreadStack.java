class NThreadStack{
  ArrayList threads = new ArrayList();
  int[] tops;
  public NThreadStack(int numOfThreads){
    tops = new int[numOfThreads];
  }

  public void push (Object data, int thread){
    if (thread > tops.length -1) return;
    if(threads[thread] == null){
      threads[thread] = data;
      tops[thread] = thread;
    } else {
      tops[thread] += tops.length;
      threads[tops[thread]] = data;
    }
  }

  public Object pop (int thread){
    if (thread > tops.length -1) return;
    Object data = threads[tops[thread]];
    threads[tops[thread]] = null;
    if (tops[thread] != thread) tops[thread] -= tops.length;
    return data;
  }
}