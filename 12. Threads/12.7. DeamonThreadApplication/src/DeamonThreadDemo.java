import static javax.swing.JOptionPane.*;

class DeamonThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        //Creating an object for a child thread.
        // The first argument of the constructor is a lambda expression 
        // The second argument is the name of the thread
        Thread t=new Thread(()->{
            int k=1,s=0;
            // Infinite loop for sum calculation:
            while(true){
                System.out.println(Thread.currentThread().getName()+": "+s);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){}
                s+=k;
                k++;
            }
        },"Sum calculation");
        t.setDaemon(true);
        int res;
        t.start();
        do{
            Thread.sleep(3000);
            res=showConfirmDialog(null,"Finish calculating the sum?","Sum of numbers",YES_NO_OPTION);
        }while(res!=YES_OPTION);
    }
}