class ExtendingThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program execution starts");
        MyThread t=new MyThread();
        System.out.println("Child thread starts");
        t.start();
        for(int k=0;k<=5;k++){
            System.out.println("Main thread:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Program execution completed");
    }
}