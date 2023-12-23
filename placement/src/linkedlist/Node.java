package linkedlist;

public class Node {
  public   int data;
   public  Node next;

    public Node(int x){
        this.data=x;
        this.next =null;
    }



    public Node insertionAtBeginningOfLinkedList(int  x,Node head){

        Node temp = new Node(x);
        if(head ==null) return temp;
        else {
             temp.next =head;
             return temp;
        }
    }

    public static Node insertAtTheEndOfLinkedList(Node head,int x){
        Node node = new Node(x);
        if (head == null) return node;
        Node curr = head;
        //TODO: i need to reach to the last of the linked list.
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        return head;
    }

    public static Node insertAtTheGivenPositionOfLinkedList(Node head,int x,int position){

        Node temp = new Node(x);
        if (head == null) return temp;
        Node curr = head;
        int positionCounter = 1;
        //TODO: i need to reach to the last of the linked list.
        while ( curr.next !=null) {
            curr = curr.next;
            positionCounter++;

            if(position == positionCounter){
                temp.next = curr.next;
                curr.next = temp;
                break;
            }
        }
        return head;

    }

    public static Node insertAtGivenPos(Node head,int x,int pos){
        Node temp = new Node(x);
        if(pos==1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        // TODO: I choose to do pos -2  because let say position is 4 and linkedlist look like 1,4,6,8,10 so if i reach till 6 num node then i can insert a node between
        //TODO: 6 and 8 and to read till 6 i just need to 2 traversal in first i reach to 4 and in second i reach to 6.
        for(int i =0;i<pos-2 && curr !=null;i++) curr = curr.next;

        if(curr==null) return head;
        temp.next = curr.next;
        curr.next=temp;
        return head;

    }

    public static Node deleteFirstNodeOfLinkedList(Node head){
        if(head==null ) return null;
        return head.next;


    }

    public static Node deleteLastNodeFromLinkedList(Node head){
        if(head == null || head.next ==null) return null;
        Node curr = head;
        while(curr.next.next !=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;

    }


    public static int searchInLinkedListIterative(Node head,int element){
        int position = 1;
        Node curr = head;
        while(curr!=null){
            if(curr.data == element){
                return position;
            }
            curr = curr.next;
            position++;
        }
    return -1;
    }

    public static int searchInLinkedListRecursion(Node head,int x){
        if(head ==null) return -1;
        if(head.data ==x) return 1;else{
            int res = searchInLinkedListRecursion(head.next,x);
            if(res ==-1)return -1;else return (res+1);
        }

    }
}


