
package hogwarts;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Firas & Joel
 */
public class Hogwarts {
    private static InfDB hogdb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try {
            
        hogdb = new InfDB("C:\\db\\HOGDB.FDB");        
        new StartSida(hogdb).setVisible(true);
        //setVisible visar den önskade j-Framen
            
        //InfExceptopn är en speciell undantagsklass som vi importerat till det här projektet
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick visst fel: " + e);
        } 

 
        }
    }
    

