class NewThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Program execution starts");
        //An anonymous object of an anonymous class is passed as an argument 
        //to the constructor of the Thread class
        Thread t=new Thread(new Runnable(){
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
        });
        System.out.println("Child thread starts");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("Main Thread:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        // Checking a child thread:
        if(t.isAlive()){
            // Waiting for child thread to complete:
            t.join();
        }
        System.out.println("Program execution completed");
    }
}