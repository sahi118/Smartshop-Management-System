//Importing Required Features
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class SalesRecord
{
    public static void fileGeneration(java.util.List<String> reportEntries)
    {     
        try {
            //Creates new file or replaces currently existing file
            File file = new File("Report.txt");
            if (!file.exists()) {
                file.createNewFile();
                //Displays pop-up telling user file has been created
                JOptionPane.showMessageDialog(null, file.getName() + " has been created");
            }
            //Writes the current content of the arraylist in Main to the txt file
            FileWriter writer = new FileWriter(file, false);
            writer.write("Sales Record\n");
            for (String entry : reportEntries) {
                writer.write(entry + "\n");
            }
            writer.write("-------------------\n");
            writer.close();

        //Displays pop-up telling user file has been added
            JOptionPane.showMessageDialog(null, file.getName() + " Report added successfully");

        }    catch(IOException e)
            {
                //Displays pop-up telling user an error has occured
                System.out.println("error occurred.");
                e.printStackTrace();
            }

    } 
}
