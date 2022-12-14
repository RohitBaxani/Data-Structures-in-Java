class DeleteLinkedList
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
void deleteNode(int key)
{
Node temp=head,prev=null;
if(temp!=null && temp.data==key)
{
head=temp.next;
return;
}

while(temp!=null && temp.data!=key)
{
prev=temp;
temp=temp.next;
}

if(temp==null){
return;
}
prev.next=temp.next;
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

DeleteLinkedList llist= new DeleteLinkedList();

llist.push(41);
llist.push(45);
llist.push(47);
llist.push(55);



System.out.println("\nCreated Linked List");
llist.printList();

llist.deleteNode(45);

System.out.println("\n After Deletion");
llist.printList();
}
}
