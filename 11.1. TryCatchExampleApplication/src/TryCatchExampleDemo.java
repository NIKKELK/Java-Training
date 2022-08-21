/* A window with an input field is displayed, an integer is entered, in a new
dialog box three numbers are displayed: entered and two neighboring */

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

class TryCatchExampleDemo{
    public static void main (String[] args){
        
        String input; // variable to store read value
        int num;
        
        input=showInputDialog(null,"Enter your number","Number",QUESTION_MESSAGE);
        
        try{
            num=parseInt(input);
            showMessageDialog(null,(num-1)+", "+(num)+", "+(num+1),"Numbers", INFORMATION_MESSAGE);
        }catch(Exception e){
            showMessageDialog(null,"Something went wrong","ERROR!",ERROR_MESSAGE);
        }
    }
}

