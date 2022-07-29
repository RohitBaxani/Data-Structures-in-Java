//Length of the LinkedList Using Iterative Method

class Node
{
int data;
Node next;
Node(int d){
data=d;
next=null;
}
}
class LengthLinkedList
{
Node head;

public void push(int new_data)
{
Node new_node= new Node(new_data);

new_node.next=head;
head=new_node;
}

public int getCount()
{
Node temp=head;
int count=0;
while(temp!=null){
count++;
temp=temp.next;
}
return count;
}

public static void main(String args[])
{
LengthLinkedList llist= new LengthLinkedList();
llist.push(1);
llist.push(2);
llist.push(3);
llist.push(4);
llist.push(5);

System.out.println("Count of the nodes is " + llist.getCount());
}
}











