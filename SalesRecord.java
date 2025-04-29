package smartshopManagement;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class SalesRecord
{
    public static void fileGeneration(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Report has been generated");
        
        try 
        {
            FileWriter myWriter = new FileWriter("New Report.txt");
            myWriter.write("New Report:");
            myWriter.write("");
            myWriter.write("");
            myWriter.close();
        } 
        catch (IOException e)
        {
            
        }
        
    } 
}
