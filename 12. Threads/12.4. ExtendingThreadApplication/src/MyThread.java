class MyThread extends Thread{
    // Overriding the run() method:
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread:\t"+i);
            try{
                Thread.sleep(4500);
            }
            catch(InterruptedException e){
                System.out.println("Interrupting a child thread");
            }
        }
    }
}