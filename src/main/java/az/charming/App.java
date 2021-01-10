package az.charming;

import az.charming.connect.MySqlConnect;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Connect");
        MySqlConnect.connect();
    }
}
