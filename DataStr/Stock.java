package DataStr;

import java.util.Stack;

public class Stock {

    public static void stockSpan(int stocks[],int spans[]){
        Stack<Integer> s = new Stack<>();
        spans[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                spans[i]=i+1;
            } else{
                int prevHigh = s.peek();
                spans[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[] = {100,80,60,70,60,85,100};
        int spans[] = new int[stocks.length];
        stockSpan(stocks,spans);
        
        for(int i=0;i<stocks.length;i++){
            System.out.print(spans[i]+" ");
        }
    }
}
