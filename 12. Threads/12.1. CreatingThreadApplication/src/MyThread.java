/* This code describes a class that implements the Runnable interface, 
and the object created from it is passed as an argument to the Thread class 
constructor when an object of this class is created.
 */

class MyThread implements Runnable{
    
    // Description of the method run() (This is the thread code):
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread:\t"+i);
            try{
                Thread.sleep(1200);
            }
            catch(InterruptedException e){
                System.out.println("Interrupting a child thread!");
            }
        }
    }
}
