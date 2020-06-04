import java.util.*; 

class RetainAll{ 

 public static void main(String args[]){ 

  ArrayList<String> al=new ArrayList<String>(); 

  al.add("Anurag"); 

  al.add("Praksah"); 

  al.add("Ajay"); 

 ArrayList<String> al2=new ArrayList<String>(); 

  al2.add("Saurabh"); 

  al2.add("Rohit");

  al2.add("Ajay");

  al.retainAll(al2);

  Iterator itr=al.iterator(); 

  while(itr.hasNext()){ 

  System.out.println(itr.next()); 

  } 

  } 

}