import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

class MoreTryCatchDemo{
    public static void main(String[] args){
        
        String input;
        char[] symbs;
        // Variables to record array size and element index:
        int size, index;
        
        input=showInputDialog(null,"Specify the size of the array","Character array",QUESTION_MESSAGE);
        try{
            size=parseInt(input);
            symbs=new char[size];
            // Text variable for forming the text of the message:
            String txt="| ";
            for(int k=0;k<size;k++){
                symbs[k]=(char)('A'+k);
                txt+=symbs[k]+" | ";
            }
            showMessageDialog(null,txt,"Characters from an array",INFORMATION_MESSAGE);
            input=showInputDialog(null,"Specify element index","Array element index",QUESTION_MESSAGE);
            index=parseInt(input);
            txt="Index - "+index+"\nCharacter - "+symbs[index];
            showMessageDialog(null,txt,"Character",INFORMATION_MESSAGE);
        }
        
        // 1. The user canceled the input or entered a non-numeric value:
        catch(NumberFormatException e){
            showMessageDialog(null,"Sorry, an error occurred","ERROR",WARNING_MESSAGE);
        }
        
        // 2.The user specified the wrong array size:
        catch(NegativeArraySizeException e){
            showMessageDialog(null,"Incorrect array size","ERROR",WARNING_MESSAGE);
        }
        
        // 3. The user specified an invalid value for the array element index:
        catch(ArrayIndexOutOfBoundsException e){
            showMessageDialog(null,"Are you sure? There is no such index in the array!","ERROR",QUESTION_MESSAGE);
        }
    }
}