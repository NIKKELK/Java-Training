class LambdaInThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Program execution starts");
        // Interface variable value - lambda expression:
        Runnable r=()->{
            for(int i=1;i<=5;i++){
                System.out.println("Child thread:\t"+i);
                try{
                    Thread.sleep(4500);
                }
                catch(InterruptedException e){
                    System.out.println("Interrupting a child thread!");
                }
            }
        };
        //The interface variable is passed to the constructor of the Thread class:
        Thread t=new Thread(r);
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