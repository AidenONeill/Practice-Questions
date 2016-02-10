package HackerRank;
import java.util.*;

public class Solution2 {
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        Link[] array = new Link[num];
        for(int i=0;i<num;i++){
            array[i]=new Link(myscanner.nextLine());    
        }
        while(myscanner.hasNext()){
            int select=myscanner.nextInt();
            int previous=myscanner.nextInt();
            int next=myscanner.nextInt();
            if(previous!=-1){
                array[select].previous=array[previous];
            }
            if(next!=-1){
                array[select].next=array[next];
            }
        }
        LinkedList mylist = new LinkedList();
        if(num>0){
            mylist.first=array[0];
            mylist.last=array[num-1];
        }
        System.out.println(check(mylist));
    }  


public static String check(LinkedList mylist){
        if(mylist.isEmpty())
            {
            return "empty";
        }
        Stack<String> s1 = new Stack<String>(); //creates a stack of type string
        int count = 0;
		Link current = mylist.last;//sets the last link to current
        
        while(current != null)//while the link isn't null
        {
            s1.push(current.data);//pushes the data onto the stack
            current = current.previous;//sets the item before current to be current
            count++; //increments count
            
            if(count > 100)//makes sure that there is no more than 100 links in the list
                break;
        } 
        
        Link latest = mylist.first;//sets latest to the first link
        boolean equal = true;
        
        while(!s1.empty())
        {
             if(s1.pop() != latest.data)//pops the data off the stack and checks that it is not equal to the expected 
                equal = false;
            
            if(latest.next != null)
                latest = latest.next;
        } 
        
        if(equal)
            return "TRUE";
        else 
            return "FALSE";
    }

}

class Link{
	public String data;
	public Link next;
	public Link previous;
    
    public Link(String input){
        data=input;
        next=null;
        previous=null;
    }
}

class LinkedList {
	public Link first;
    public Link last;

	public LinkedList( ){
		first=null;
        last=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}
    
    public void insertHead(Link insert){
        if(isEmpty()){
            first=insert;
            last=insert;
        }else{
            first.previous=insert;
            insert.next=first;
            first=insert;
        }
    }
}
        
            
          