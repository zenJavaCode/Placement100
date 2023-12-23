public class Queue {

     int front,rear,size;
     int capacity;
     int array[];

     public Queue(int capacity){
         this.capacity = capacity;
         front = this.size = 0;
         rear = capacity - 1;
         array = new int[this.capacity];
     }
     boolean isFull(Queue queue){
         return  (queue.size == queue.capacity);
     }

     boolean isEmpty(Queue queue){
         return  (queue.size==0);
     }

     void enqueue(int item){
         if(isFull(this)) return;
         this.rear = (this.rear+1)%this.capacity;


     }
}
