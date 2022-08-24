class MyMistake extends RuntimeException{
    
    private int code;
    
    MyMistake(int n){
        super();
        code=n;
    }
    
    public String toString(){
        String txt="MyMistake class exception\n";
        txt+="Error code: "+code+"\n";
        txt+="**************************";
        return txt;
    }
}