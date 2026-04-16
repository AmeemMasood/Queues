public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }
     
    public DynamicStack(int size){
        super(size);
    }

    public void push(int item){
        if(isfull()){
            int[] temp  = new int[data.length *2];
            System.arraycopy(data, 0, temp, 0 , data.length);
            data = temp;
        }
        super.push(item);

    }



    
}
