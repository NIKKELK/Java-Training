class UsingExceptionObjectDemo {
    public static void main(String[] args) {
        
        try{
            System.out.println("Negative size: ");
            int[] a=new int[-1];
        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        
        try{
            System.out.println("Invalid index: ");
            int[] b={1};
            b[-1]=0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        try{
            System.out.println("Division by 0: ");
            int c=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
