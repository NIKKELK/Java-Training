class MultiThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("The main thread starts running");
        // Creating Objects - Starting Threads:
        MyThread A=new MyThread("ALPHA",5);
        MyThread B=new MyThread("BRAVO",3);
        MyThread C=new MyThread("CHARLIE",7);
        for(int k=1;k<=4;k++){
            System.out.println("Message from the main thread:\t"+k);
            Thread.sleep(2000);
        }
        // Waiting for child threads to complete:
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        }
        System.out.println("Main thread completed");
    }
}