package multithreading;

public class sleep {
    
    public static void main(String[] args) throws Exception {
        for(int i=0;i<=5;i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
