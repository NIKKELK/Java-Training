public class CreatingThreadDemo {
    public static void main(String[] args) {
        System.out.println("Program execution starts");
        Thread t=new Thread(new MyThread());
        System.out.println("Child thread starts");
        t.start();
        for(int k=0;k<=5;k++){
            System.out.println("Main thread:\t"+(char)('A'+k));
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Interrupting the main thread");
            }
        }
        System.out.println("Program execution completed");
    }
    
}
