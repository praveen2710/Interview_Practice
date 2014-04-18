/*In string reversal recursive we check base case and then we add that to reverse 
String and do recursion again.Note doing recursion and then trying to add the character to
reverse string fails and outputs same as input
declaring reverse inside or outside method does not affect it currently
*/

class StringReversal{
  //String reverse="";
  public String recursiveReversal(String input){
    String reverse="";
    if(input.length()==1)
      return input;
    else{
      reverse+=input.charAt(input.length()-1)+recursiveReversal(input.substring(0,input.length()-1));
      return reverse;  
    }    
  }  

  public static void main(String args[]){
    StringReversal sr = new StringReversal();
   System.out.println(sr.recursiveReversal("I love java"));
  }
}
