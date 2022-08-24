public class UsingThrowDemo {
    public static void main(String[] args) {
        Exception me = new Exception("Artificial error");
        try{
            System.out.println("An error is generated");
            try{
                throw me;
            }
            catch(Exception one){
                System.out.println(one);
                System.out.println("Another error");
                // Rethrow an Exception:
                throw one;
            }
        }
        catch(Exception two){
            System.out.println(two);
        }
        System.out.println("Program execution completed");
    }
}