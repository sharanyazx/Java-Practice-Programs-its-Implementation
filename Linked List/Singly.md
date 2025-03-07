# Remove Duplicates in SLL 
### Brute force (O n^2)
``` java []
class LLNode{
    LLNode next;
    int data;
    LLNode (int data){
        this.next=null;
        this.data=data;
    }
}
class SLL{
    LLNode head;
    public  void insert(int data){
        LLNode newNode=new LLNode(data);
        if(head==null){
         head=newNode;
         return;
        }
        LLNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void print(){
        LLNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void removeDuplicatesBruteForce() {
        LLNode temp = head;
        while (temp != null && temp.next != null) {
            LLNode curr = temp;
            while (curr.next != null) {
                if (temp.data == curr.next.data) {
                    // update to next node 
                    curr.next = curr.next.next; // Remove duplicate node
                } else {
                    // skip to next node 
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
    }

}
public class RemoveDuplicatesLL {
    public static void main(String args[]) {
        SLL list = new SLL();
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.insert(70);
        list.insert(50);
        list.insert(60);

        System.out.println("Original List");
        list.print();
        System.out.println();
        list.removeDuplicatesBruteForce();
        System.out.println("After Removing Duplicates (Brute Force):");
        list.print();

    }

}

```
### Efficient Approach (O(n))
``` java []
import java.util.*;
class LLNode{
    LLNode next;
    int data;
    LLNode (int data){
        this.next=null;
        this.data=data;
    }
}
class SLL{
    LLNode head;
    public  void insert(int data){
        LLNode newNode=new LLNode(data);
        if(head==null){
         head=newNode;
         return;
        }
        LLNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void print(){
        LLNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    void removeDuplicatesEfficient() {
        if (head == null) return;

        HashSet<Integer> seen = new HashSet<>();
        LLNode current = head;
        LLNode prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next; // Remove duplicate
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

}
public class RemoveDuplicatesLL {
    public static void main(String args[]) {
        SLL list = new SLL();
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.insert(70);
        list.insert(50);
        list.insert(60);

        System.out.println("Original List");
        list.print();

        System.out.println();

        list.removeDuplicatesEfficient();
        System.out.println("After Removing Duplicates (Brute Force):");
        list.print();

    }

}

```

## Output
```

Original List
50->60->70->80->90->70->50->60->null
After Removing Duplicates (Brute Force):
50->60->70->80->90->null
Process finished with exit code 0
```
