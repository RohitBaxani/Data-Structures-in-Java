class DeleteAtPosLinkedList
{
Node head;

class Node{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
void deleteNode(int position)
{

if(head==null)
{
return;
}
Node temp=head;

if(position==0)
{
head=temp.next;
return;
}

for(int i=0;temp!=null && i<position-1;i++)
{
temp=temp.next;
}

if(temp==null || temp.next==null){
return;
}

Node next=temp.next.next;
temp.next=next;
}

public void push(int new_data)
{
Node new_node=new Node(new_data);
new_node.next=head;
head=new_node;
}

public void printList()
{
Node tnode=head;
while(tnode!=null){
System.out.println(tnode.data+"");
tnode=tnode.next;
}
}


public static void main(String args[])
{

DeleteAtPosLinkedList llist= new DeleteAtPosLinkedList();

llist.push(41);
llist.push(45);
llist.push(47);
llist.push(55);
llist.push(65);
llist.push(68);


System.out.println("\nCreated Linked List");
llist.printList();

llist.deleteNode(3);

System.out.println("\n After Deletion");
llist.printList();
}
}
