public class Prime {
    
    
    public static void main(String args[]) {
        
        Check p = new Check();
        System.out.println(p.isPrime());
        
    }
}

class Check{
    public boolean isPrime(){
        boolean isPrime = true;
        int n=29;
        for(int i=2;i<=n-1;i++){
            if(n%2==0){
                isPrime =false;
                break; 
            }
        }
        return isPrime;
        
    }
}