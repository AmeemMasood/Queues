class CircularQueue {

    int size=0;
    int[] data;
    static final int default_size=10;
    int end=0;
    int front=0;

    public CircularQueue(){
        this(default_size);
    }

    public CircularQueue(int value){
        this.data= new int[value];
    }

    public void insert(int item){
        if(isfull()){
             int[] temp= new int[data.length * 2];
             for(int i=0; i<data.length;i++){
                temp[i]= data[(front+i)%data.length];
             }
             front=0;
             end = temp.length;
             data = temp;
        }
    
        data[end]=item;
        end++;
        end = end % data.length;
        size++;

    }
    public boolean isfull(){
        return size == data.length;
    }

    public boolean isempty(){
        return size == 0;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Qeueu is empty");
        }

        int removed= data[front];
        front++;
        size--;
        front= front % data.length;
        return removed;
    }

    public void display(){
       if(isempty()){
          System.out.println("Empty");
          return;
       }

       int i=front;
       do{
          System.out.println(data[i] + " ->");
          i++;
          i= i % data.length;
       }while(i != end);
       System.out.println("End");
    }
}
