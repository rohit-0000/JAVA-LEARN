public class J15_Exception_Handling
{
    public static void main (String[] args)
    {
        int arr[] = { 23, 44, 78, 98};
        // Exception Handling
        try
        {
            System.out.println(arr[6]);
        }
        catch (Exception f)
        {
            // Do something after Cathing
            System.out.println("Trying to get unavailable number");
        }
        System.out.println(arr[2]);
    }
}
