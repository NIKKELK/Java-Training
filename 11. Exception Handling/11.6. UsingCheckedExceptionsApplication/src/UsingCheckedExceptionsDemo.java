public class UsingCheckedExceptionsDemo{
    
    // This method throws a controlled exception:
    static void alpha(int n) throws Exception{
        // The text to pass as an argument to the 
        // constructor when creating the exception object
        String txt ="Method alpha() with argument "+n;
        throw new Exception(txt);
    }
    
    static void bravo(int n){
        // The text to pass as an argument to the 
        // constructor when creating the exception object
        String txt ="Method bravo() with argument "+n;
        try{
            if(n>0){
                throw new Exception(txt);
            }
            else{
                //Throwing an unchecked exception:
                throw new RuntimeException(txt);
            }
        }
        catch(RuntimeException e){
            // Rethrowing an unchecked exception:
            throw e;
        }
        catch(Exception e){
            System.out.println("Error Handling in bravo():");
            System.out.println(e.getMessage());
            System.out.println("**************************");
        }
    }
    
    // Method to call when handling exceptions
    static void catchMe(Exception e){
        System.out.println("Error Handling in main():");
        System.out.println(e.getMessage());
        System.out.println("--------------------------");
    }
    
    
    public static void main(String[] args){
        try{
            //When a method is called, an exception of class Exception is thrown.
            alpha(123);
        }
        catch (Exception e){
            catchMe(e);
        }
        
        try{
            bravo(123);
        }
        catch(Exception e){
            catchMe(e);
        }
        
        try{
            // When a method is called, an exception is thrown (class RuntimeException):
            bravo(-1);
        }
        catch(Exception e){
            catchMe(e);
        }
    }
}