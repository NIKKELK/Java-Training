class MyThread extends Thread{
    
    // Reference to an object with an integer field:
    private MyNumber obj;
    // Thread pause interval:
    private int time;
    // The number of cycles:
    private int count;
    private boolean state;
    
    MyThread(String name, MyNumber obj, int time, int count, boolean state){
        super(name);
        this.obj=obj;
        this.time=time;
        this.count=count;
        this.state=state;
        start();
    }
    
    // Method for displaying "lines" of characters:
    private void line(){
        char s;
        if(state) s='-';
        else s='*';
        for(int k=1;k<=35;k++){
            System.out.print(s);
        }
        System.out.println("");
    }
    
    // run() method override:
    public void run(){
        for(int k=1;k<=count;k++){
            synchronized(obj){
                line();
                System.out.println("Thread "+getName()+": initial value "+obj.number);
                try{
                    Thread.sleep(time);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
                if(state) obj.number++;
                else obj.number--;
                System.out.println("Thread "+getName()+": new value "+obj.number);
                line();
            }
        }
    }
}