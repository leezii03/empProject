package Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlertMessager {
    static public void success(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("D:\\Java Etec\\JavaSwing\\src\\Image\\SuccessIcon.png"));
    }
    
    static public void warning(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.WARNING_MESSAGE);
    }
    
    static public void error(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.ERROR_MESSAGE);
    }
}
