package latihanjava;

/**
 *
 * @author Marcellino Immanuel Ndoki 25/03/2024
 */

import javax.swing.JOptionPane;

public class msgbox {
    public static void main(String[] arg){
    
        String nama = "";
        nama = JOptionPane.showInputDialog("Tuliskan Nama : ");
        
        System.out.println("Isi Variabel Nama : "+nama);
        
    
    }
}
