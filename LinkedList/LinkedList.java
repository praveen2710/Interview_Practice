class LinkedList{

  Node start;
  int size;

  LinkedList(){
  start=null;
  size=0;
  }
  
  public void insertAtPos(int data,int pos){
   Node newPtr = new Node(data);
   Node headTemp =start;
   pos=pos-1;
   int i=1;
   if(pos>size){
    System.out.println("List is Not big Enough");
    return;
   }
   if(start==null){
    start=newPtr;
    headTemp=start;
    size++;
   } 
   while(i<pos){
    System.out.println(headTemp.getData());
    headTemp = headTemp.getLink();
    i++; 
   }
  if(i==pos){
   Node newTemp=headTemp.getLink();
   newPtr.setLink(headTemp);
   headTemp.setLink(newPtr); 
   size++; 
  }
 }    
 
//delete the node of data passed  
 public void deleteNode(int data){ 
  Node tempHead=start;
  Node preNode=start;
  while(tempHead.data!=data){
     preNode=tempHead;
     tempHead=tempHead.getLink();
     System.out.println("preNode"+preNode.getData());
     System.out.println("tempHead"+tempHead.getData());
  }
  if(start.getData()==data){
    start=start.getLink();
    size--;
    return;
  }
  if(tempHead.data==data){
  preNode.setLink(tempHead.getLink());
  size--;
  }
}

 public void printList(){
    System.out.println("Size is"+size);
    Node tempHead=start;
    for(int i=1;i<=size;i++){
      System.out.print(tempHead.data+"->");
      tempHead = tempHead.getLink();
    }
  }
  
  public static void main(String args[]){
   LinkedList ll = new LinkedList();
   ll.insertAtPos(6,1);
   ll.insertAtPos(7,2);
   ll.insertAtPos(3,3);
   ll.insertAtPos(8,4);
   ll.insertAtPos(5,5);
   ll.deleteNode(6);
   ll.deleteNode(5);
   ll.deleteNode(3);
   ll.printList();
  }
}
