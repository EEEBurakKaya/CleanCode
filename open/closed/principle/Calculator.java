package open.closed.principle;

public class Calculator {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }

    public int add(int... params){
        int result = 0;
        for(int param:params){
            result += param;
        }
        return result;
    }
}
