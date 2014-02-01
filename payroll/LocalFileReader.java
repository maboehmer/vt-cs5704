package payroll;

/*****************************************************************************
 * A class to read the Employee data file and the Deduction data file.
 *****************************************************************************/
import java.io.*;

public class LocalFileReader
{
    // The file input stream.
    private FileInputStream fis = null;
    
    // The buffered reader
    private BufferedReader  in  = null;

    /*************************************************************************
     * Constructs a LocalFileReader
     *************************************************************************/
    LocalFileReader ( String filename )
        throws IOException
    {
        fis = new FileInputStream( filename );
        in  = new BufferedReader( new InputStreamReader( fis ) );
    }

    /*************************************************************************
     * Reads one line from the file.
     * 
     * @return The line read.
     * 
     * @throws IOException if there is a problem reading the file.
     *************************************************************************/
    public String readLine()
        throws IOException
    {
        return in.readLine();
    }

    /*************************************************************************
     * Closes the file input stream and buffered reader.
     *************************************************************************/
    public void close()
    {
        if ( fis != null )
        {
            try
            {
                fis.close();
            } 
            catch ( IOException e )
            {
                // Do nothing...
            }
        }
        
        if ( in != null )
        {
            try
            {
                in.close();
            }
            catch ( IOException e )
            {
                // Do nothing...
            }
        }
    }
}
