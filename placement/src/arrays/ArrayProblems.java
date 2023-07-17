package arrays;

public class ArrayProblems {

        public static void main(String[] args) {
                int[] numbers= new int[10];
                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                numbers[3] = 4;
                numbers[4] = 5;


        }

        public int insertElement(int[] array,int position,int value){

                if(array.length ==position ) return array.length;
                int index = position-1;
                for(int i= array.length-1;i>=index;i--){

                }
                array[index]=value;
                return array.length+1;

        }
        public int removeElement(int[] array,int element){
                int i;
                for(i=0;i<array.length;i++){
                        if(array[i]==element){
                                break;
                        }
                }
                if(i==array.length){
                        return -1;
                }
                for(int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                }
                return array.length-1;
        }

        





}
