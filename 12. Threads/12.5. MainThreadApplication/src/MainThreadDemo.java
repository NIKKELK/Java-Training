class MainThreadDemo{
    public static void main(String[] args){
        // Object variable to record a reference to the stream:
        Thread t;
        // Getting a reference to the main thread object:
        t=Thread.currentThread();
        // Stream information display:
        System.out.println(t);
        // Changing the name of the main thread:
        t.setName("MAIN THREAD");
        // The thread priority is set:
        t.setPriority(7);
        System.out.println(t);
    }
}