package smartshopManagement;
import java.io.FileWriter;

public class SalesRecord
{
    public static void fileGeneration(String[] args)
    {
        try 
        {
            FileWriter myWriter = new FileWriter("New Report.txt");
            myWriter.write("New Report:");
            myWriter.write("");
            myWriter.write("");
            myWriter.close();
        } 
        catch (Exception e)
        {
        }
        
    } 
}
