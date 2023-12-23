import linkedlist.Node;

public class Driver {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;
  //      recursiveTraversalLinkedList(head);
        Node node = Node.insertAtTheGivenPositionOfLinkedList(head,25,2);
        System.out.println(node);
        // print a linked list
//        while(head !=null){
//            System.out.println(head.data);
//            head = head.next;
//        }


    }

    public static void recursiveTraversalLinkedList(Node head){


        if(head ==null) return ;

        System.out.print(head.data + " ");
        recursiveTraversalLinkedList(head.next);


    }
}
