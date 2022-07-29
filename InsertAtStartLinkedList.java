class InsertAtStartLinkedList{
Node head;
static class Node{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}

public void printList()
{
Node n=head;
while(n!=null){
System.out.println(n.data+"");
n=n.next;
}
}

public void push(int new_data)
{

Node new_node= new Node(new_data);
new_node.next=head;
head=new_node;

}
public static void main(String args[])
{
InsertAtStartLinkedList llist= new InsertAtStartLinkedList();

llist.head= new Node(1);
Node second= new Node(2);
Node third= new Node(3);

llist.head.next= second;

second.next= third;
System.out.println("BEFORE INSERT");
llist.printList();
llist.push(15);
System.out.println("AFTER INSERT");
llist.printList();
}
}