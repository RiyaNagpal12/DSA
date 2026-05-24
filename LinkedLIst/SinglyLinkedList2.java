// Deletion in Singly Linked list 
public class Node { 
int data ;
Node next ; 
Node (int data){
  this.data = data ;
  this.next = null; 
}
} 
public class LinkedList{ 

Node head ; 
  // delete from begining
void deleteatbegining(){
  if (head == null){
    System.out.println(" Null");
  return; 
  } 
  head = head.next ; 
} 
  // delete given key value 
void delete(int key) {

    // If list empty
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // If first node is key
    if (head.data == key) {
        head = head.next;
        return;
    }

    Node temp = head;

    while (temp.next != null && temp.next.data != key) {
        temp = temp.next;
    }

    // Element not found
    if (temp.next == null) {
        System.out.println("Element not found");
        return;
    }

    temp.next = temp.next.next;
}
