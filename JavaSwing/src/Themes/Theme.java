package Themes;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Theme {
    public Theme(String mode){
        try {
            if(mode.equalsIgnoreCase("light")){
                UIManager.setLookAndFeel(new FlatLightLaf());
            }else{
                UIManager.setLookAndFeel(new FlatDarkLaf());
            }
        } catch (Exception e) {
        }
    }
}
