package Exception;

import java.io.FileInputStream;

public class runtime 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fis = new FileInputStream("d:/abc.txt");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
