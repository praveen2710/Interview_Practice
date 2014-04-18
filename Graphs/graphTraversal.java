
import java.util.*;

class graphTraversal{
  graphNode root;
  ArrayList<graphNode> al = new ArrayList<graphNode>();
  int[][] adjMatrix;
  int size;
 
  public void setRoot(graphNode n){
    this.root=n;
  }

  public graphNode getRoot(){
    return root;
  }
 
  public void addNode(graphNode n){
   al.add(n); 
  } 

  public void connectEdges(graphNode n1,graphNode n2){
    int node1 = al.indexOf(n1);
    int node2 = al.indexOf(n2);
    if(adjMatrix==null){
      size = al.size();
      adjMatrix = new int[size][size];
    }
    adjMatrix[node1][node2]=1;
    adjMatrix[node2][node1]=1;
  }

  public graphNode unVisitedChild(graphNode n){
   int node1 = al.indexOf(n);
   for(int i=0;i<size;i++){
    if(adjMatrix[node1][i]==1&&al.get(i).visited==false){
      return al.get(i);
    }
   }
   return null;
  }

  public void clearNodes(){
    int i=0;
    while(i<size){
      al.get(i).visited=false;
      i++;
    }
  }
  public static void main(String args[]){
    graphTraversal gt = new graphTraversal();
    graphNode n1 = new graphNode(13);
    graphNode n2 = new graphNode(16);
    graphNode n3 = new graphNode(1);
    graphNode n4 = new graphNode(15);
    graphNode n5 = new graphNode(31);
    graphNode n6 = new graphNode(3);
    graphNode n7 = new graphNode(4);

    gt.addNode(n1);
    gt.addNode(n2);
    gt.addNode(n3);
    gt.addNode(n4);
    gt.addNode(n5);
    gt.addNode(n6);
    gt.addNode(n7);

    gt.setRoot(n2);

    gt.connectEdges(n1,n3);
    gt.connectEdges(n2,n3);
    gt.connectEdges(n3,n4);
    gt.connectEdges(n4,n1);
    gt.connectEdges(n2,n5);
    gt.connectEdges(n1,n6);
    gt.connectEdges(n6,n4);
    gt.connectEdges(n4,n7);
    gt.connectEdges(n7,n5);

    gt.unVisitedChild(n3);
    System.out.println("The DFS iS");
    gt.dfs();
    System.out.println("The BFS is");
    gt.bfs();
  }
 /*
* dfs uses stack and an if contion to push if child node is present and print node else pop 
*/ 
  public void dfs(){
    Stack<graphNode> s = new Stack<graphNode>();
    s.push(this.root);
    root.visited=true;
    System.out.println(root.data);    
    while(!s.isEmpty()){
      graphNode n=s.peek();
      graphNode unVisitedChild = unVisitedChild(n);
      if(unVisitedChild!=null){
        System.out.println(unVisitedChild.data);
        unVisitedChild.visited=true;
        s.push(unVisitedChild);
      }
      else
        s.pop();
    }
    clearNodes();
  }
/*
*push in queue root and then remove each element do a while to check all child
nodes if present print them else go for next element in queue
*/
  public void bfs(){
    Queue<graphNode> q = new LinkedList<graphNode>();
    q.add(this.root);
    System.out.println(root.data);
    root.visited=true;
    while(!q.isEmpty()){
     graphNode queLast = q.remove();
     graphNode child=null;
     while((child=unVisitedChild(queLast))!=null){
       child.visited=true;
       q.add(child);
       System.out.println(child.data); 
     } 
    }
    clearNodes();
  }
}
