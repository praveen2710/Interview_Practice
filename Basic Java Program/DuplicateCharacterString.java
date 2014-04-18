import java.util.*;
public class DuplicateCharacterString{

  public void checkString(String str){
    Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
    char[] chrs= str.toCharArray();
    for(Character ch:chrs){
      if(dupMap.containsKey(ch)){
        dupMap.put(ch,dupMap.get(ch)+1);
      }
      else{
        dupMap.put(ch,1);
      }
    }
    
    Set demo =dupMap.entrySet();
    Iterator i = demo.iterator();
    while(i.hasNext()){
     Map.Entry single =(Map.Entry) i.next();
     System.out.print(single.getKey()+":");
     System.out.println(single.getValue()); 
    }
  }
  
  public static void main(String args[]){
    DuplicateCharacterString dcs = new DuplicateCharacterString();
    dcs.checkString("I have no idea how any characters are duplicate in here"); 
  }
}
