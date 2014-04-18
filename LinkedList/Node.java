/*
checking if packages apply and also will try different access sepcifiers
constructors can be overloaded
*/
class Node{
  Node link;
  int data;
  
  Node(){
    link=null;
    data=0;
  }

  Node(int d){
    this.data=d;
    this.link=null;
  }
  
  public void setLink(Node l){
    this.link=l;
  }

  public Node getLink(){
    return link;
  }

  public void setData(int d){
    this.data=d;
  }

  public int getData(){
    return data;
  }
}
