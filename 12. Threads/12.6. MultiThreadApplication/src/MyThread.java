import java.util.Random;

class MyThread extends Thread{
    
    // Number of messages:
    private int count;
    
    MyThread(String name,int count){
        super(name);
        this.count=count;
        start();
    }
    
    public void run(){
        System.out.println("Thread in progress: "+getName());
        Random rnd=new Random();
        for(int k=1;k<=count;k++){
            System.out.println("Message from the thread "+getName()+":\t"+getName().charAt(0)+k);
            try{
                Thread.sleep(1000+rnd.nextInt(2001));
            }
            catch(InterruptedException e){
                System.out.println("Thread interruption "+getName());
            }
        }
        // Thread completion message:
        System.out.println("Thread "+getName()+" completed");
    }
}