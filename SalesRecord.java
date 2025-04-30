import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class SalesRecord
{
    public static void fileGeneration(java.util.List<String> reportEntries)
    {     
        try {
            File file = new File("Report.txt");
            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, file.getName() + " has been created");
            }
            FileWriter writer = new FileWriter(file, false);
            writer.write("Sales Record\n");
            for (String entry : reportEntries) {
                writer.write(entry + "\n");
            }
            writer.write("-------------------\n");
            writer.close();


            JOptionPane.showMessageDialog(null, file.getName() + " Report added successfully");

        }    catch(IOException e)
            {
                System.out.println("error occurred.");
                e.printStackTrace();
            }

    } 
}
