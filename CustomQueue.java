//time complexity
//insertion O(1)
// deletion O(N)

public class CustomQueue {
    int[] data;
    int end=0;
    static final int default_size=10;

    public CustomQueue(){
        this(default_size);
    }
    public CustomQueue(int size){
        this.data= new int[size];
    }

    public void insert(int item){
        if(isfull()){
            System.out.println("Queue is full");
            return;
        }
        data[end++]= item;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is emoty");
        }
        int removed = data[0];
        for(int i =1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i] + "-> ");

        }
    }

    public boolean isfull(){
        return end == data.length;
    }

    public boolean isempty(){
        return end==0;
    }


  

    
}
