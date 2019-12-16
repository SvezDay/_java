public class Cell {
  private int elem;
  private Cell next;

  public Cell(){
    this.elem = -1;
    this.next = null;
  }
  public Cell(int elem, Cell next){
    this.elem = elem;
    this.next = next;
  }
  public int getElem(){
    return this.elem;
  }
  public void setElem(int elem){
    this.elem = elem;
  }
  public Cell getNext(){
    return this.next;
  }
  public void setNext(Cell next){
    this.next = next;
  }
}

public class Stack{
  private Cell head;
  // private Cell start;

  // default constructor
  public Stack(){
    this.head = null;
  }
  // custom constructor
  // if the given stack is copy if not empty
  public Stack(Stack s){
    if(s.empty() == true){
      // the given stack is empty nothing to copy and start init to null
      this.start = null;
    }else{
      // create new Cell
      Cell prov = s.start.getNext();
      this.start = new Cell(s.start.getElem(), null);
      Cell prov2 = this.start;
      while(prov != null) {
        prov2.setNext(new Cell(prov.getElem(), null));
        prov = prov.getNext();
        prov2 = prov2.getNext();
      }
    }
  }
  // test if head is empty
  public boolean empty(){
    boolean res = false;
    if(this.head == null){
      res = true;
    }
    return res;
  }
  // return head elem if not empty
  public int head(){
    int res = -1;
    if(!this.head.empty()){
      res = this.head.getElem();
    }
    return res;
  }
  // create cell with given elem and push it to the stack
  public void push(int val){
    Cell prov = this.head();
    head = new Cell(val, prov);
  }
  //pop the stack
  public void pop(){

  }
}
