package sinyalprojesi;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.geom.Dimension2D;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.plaf.SliderUI;

public class Slider extends JPanel {

    protected JSlider fazSlider = new JSlider(JSlider.HORIZONTAL, -600, 600, 0);
    protected JSlider acıSlider = new JSlider(JSlider.HORIZONTAL, 0, 2000, 0);
    protected JSlider genlikSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 0);
    protected JSlider genislikSlider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 0);
    protected JSlider yükseklikSlider = new JSlider(JSlider.HORIZONTAL, -200, 200, 0);
    protected JSlider fazAcısıSlider = new JSlider(JSlider.HORIZONTAL, 0, 360, 0);
    protected JLabel yükseklikLabel = new JLabel("                  YÜKSEKLİK KONUMU");
    protected JLabel genislikLabel = new JLabel("                 GENISLIK");
    protected JLabel genlikLabel = new JLabel("                 GENLIK");
    protected JLabel acıLabel = new JLabel("                  PERIYOT DEGERI");
    protected JLabel fazLabel = new JLabel("                       FAZ");
    protected JLabel fazAcısıLabel = new JLabel("             FAZACISI");
    protected JPanel panelSlider = new JPanel();
    protected Dimension dim1=new Dimension(1200,200);

    public Slider() {
        fazSlider.setPaintTicks(true);
        fazSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        fazSlider.setForeground(Color.BLACK);
        fazSlider.setMajorTickSpacing(300);
        fazSlider.setMinorTickSpacing(100);
        fazSlider.setPaintTicks(true);
        fazSlider.setPaintLabels(true);
        fazSlider.setCursor(Cursor.getPredefinedCursor(10));
        acıSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        acıSlider.setForeground(Color.BLACK);
        acıSlider.setMajorTickSpacing(500);
        acıSlider.setMinorTickSpacing(100);
        acıSlider.setPaintTicks(true);
        acıSlider.setPaintLabels(true);
        acıSlider.setCursor(Cursor.getPredefinedCursor(10));
        genlikSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        genlikSlider.setForeground(Color.BLACK);
        genlikSlider.setMajorTickSpacing(50);
        genlikSlider.setMinorTickSpacing(20);
        genlikSlider.setPaintTicks(true);
        genlikSlider.setPaintLabels(true);
        genlikSlider.setCursor(Cursor.getPredefinedCursor(10));
        genislikSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        genislikSlider.setForeground(Color.BLACK);
        genislikSlider.setMajorTickSpacing(250);
        genislikSlider.setMinorTickSpacing(100);
        genislikSlider.setPaintTicks(true);
        genislikSlider.setPaintLabels(true);
        genislikSlider.setCursor(Cursor.getPredefinedCursor(10));
        yükseklikSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        yükseklikSlider.setForeground(Color.BLACK);
        yükseklikSlider.setMajorTickSpacing(100);
        yükseklikSlider.setMinorTickSpacing(50);
        yükseklikSlider.setPaintTicks(true);
        yükseklikSlider.setPaintLabels(true);
        yükseklikSlider.setCursor(Cursor.getPredefinedCursor(10));
        fazAcısıSlider.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        fazAcısıSlider.setForeground(Color.BLACK);
        fazAcısıSlider.setMajorTickSpacing(60);
        fazAcısıSlider.setMinorTickSpacing(30);
        fazAcısıSlider.setPaintTicks(true);
        fazAcısıSlider.setPaintLabels(true);
        fazAcısıSlider.setCursor(Cursor.getPredefinedCursor(10));


        panelSlider.setPreferredSize(dim1);
        panelSlider.setLayout(new GridLayout(2, 6));
        setLayout(new FlowLayout());
        add(panelSlider);
        panelSlider.add(fazSlider);
        panelSlider.add(acıSlider);
        panelSlider.add(genlikSlider);
        panelSlider.add(genislikSlider);
        panelSlider.add(yükseklikSlider);
        panelSlider.add(fazAcısıSlider);
        panelSlider.add(fazLabel);
        panelSlider.add(acıLabel);
        panelSlider.add(genlikLabel);
        panelSlider.add(genislikLabel);
        panelSlider.add(yükseklikLabel);
        panelSlider.add(fazAcısıLabel);
    }
}
