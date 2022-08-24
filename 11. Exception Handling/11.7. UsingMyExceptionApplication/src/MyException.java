class MyException extends Exception{
    
    private int code;
    
    MyException(int n){
        super();
        code=n;
    }
    
    public String toString(){
        String txt="MyException class exception\n";
        txt+="Error code: "+code+"\n";
        txt+="--------------------------";
        return txt;
    }
}