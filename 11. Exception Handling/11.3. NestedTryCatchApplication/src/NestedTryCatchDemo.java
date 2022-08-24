// Example Program Using Nested try-catch Blocks

import java.util.*;

class NestedTryCatchDemo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char[] symbs;
        int size,index;
        
        try{
            System.out.print("Specify the size of the array: ");
            size=input.nextInt();
            symbs=new char[size];
            System.out.print("| ");
            for(int k=0;k<size;k++){
                symbs[k]=(char)('A'+k);
                System.out.print(symbs[k]+" | ");
            }
            try{
                System.out.print("\nSpecify an index: ");
                index=input.nextInt();
                System.out.println("Character - "+symbs[index]);
            }
            // 1. If the user entered an invalid index:
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No such element");
            }
            finally{
                System.out.println("Array successfully created");
            }
            System.out.println("The index has a numeric value");
        }
        // 2. If not a number entered:
        catch(InputMismatchException e){
            System.out.println("Error: You did not enter a number");
        }
        // 3. If the array has a negative size:
        catch(NegativeArraySizeException e){
            System.out.println("Invalid array size");
        }
        System.out.println("Program execution completed");
    }
}