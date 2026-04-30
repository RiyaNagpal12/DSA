public class q26 {
    public static class deque{
        
        int arr[];
        int front , size;
        int rear;

        public deque(int n) {
            size=n;
            front =rear=-1;
        }

        public boolean isfull(){
            if((rear+1)%size==front){
                return true;
            }
            return false;
        }

        public void addfront(int data){
            if (isfull()){
                System.out.println("full");
                return;
            }

            if(front ==-1){
                front=rear=0;
            }

            else{

            front+= (front+1)%size;}
            arr[front]=data;
        }

        public void addlast(int data){
            if(isfull()){
                System.out.println("full");
                return;
            

            }
            if(front ==-1){
                front=rear=0;
            }
            else{
            rear+=(rear+1)%size;}
            arr[rear]=data;

        }

        public int removefront(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int val = arr[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                front+=(front+1)%size;
            }
            return val;
        }

        public int removeend(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int val = arr[rear];
            if(front==rear){
                front=rear=-1;
            }
            else{
            rear+=(rear+1)%size;}
            return val;
        }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[front];
    }

    // Peek rear
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[rear];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("empty");
        }
        int i =front;
        while(true){
            System.out.print(arr[i]+ "");
            if(i==rear){
                break;
            }
            i=(i+1)%size;
        }
        
    }


        

        public boolean  isEmpty(){
            if(front ==-1){
                return true;

            }
            return false;
        }
    }
    public static void main(String[] args) {
         deque dq = new deque(5);

    }
}
