package awtlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

public class AWTLayout {

    public static void main(String[] args) {
         Frame f = new Frame();
        
        LayoutManager layOut = new FlowLayout(FlowLayout.LEFT);
        
        f.setLayout(layOut);
        
        
        Button b = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        Button b5 = new Button("Button5");
        
        
        f.add(b);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        
        
        
        f.setSize(300, 100);
        f.setVisible(true);
        
        
        
    }

}
