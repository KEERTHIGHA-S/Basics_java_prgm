class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

class Linkedlist
{
    Node head,tail;
    public void insert(int data)
    {
        Node n=new Node(data);
        n.next=null;
        
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    
    }
    public void insertbeg(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertat(int pos,int data)
    {
        Node n=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }
}
public class SingleLinkedlist
{
    public static void main(String[] args)
    {
        Linkedlist ll=new Linkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        
        ll.insertbeg(5);
        
        ll.insertat(2,11);
        
        ll.display();
    }
}