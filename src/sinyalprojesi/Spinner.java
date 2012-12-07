package sinyalprojesi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.ItemListener;
import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Spinner extends JPanel {

    protected JSpinner fazSpinner = new JSpinner();
    protected JSpinner genlikSpinner = new JSpinner();
    protected JSpinner acıSpinner = new JSpinner();
    protected JSpinner yükseklikSpinner = new JSpinner();
    protected JSpinner genislikSpinner = new JSpinner();
    protected JSpinner fazAcısıSpinner = new JSpinner();
    protected JPanel panelSpinner = new JPanel();
    protected JCheckBox secim = new JCheckBox(" Devre Durumu", true);
    protected Dimension dim = new Dimension(50, 20);

    public Spinner() {
        fazSpinner.setPreferredSize(dim);
        acıSpinner.setPreferredSize(dim);
        genlikSpinner.setPreferredSize(dim);
        genislikSpinner.setPreferredSize(dim);
        yükseklikSpinner.setPreferredSize(dim);
        fazAcısıSpinner.setPreferredSize(dim);

        panelSpinner.setLayout(new GridLayout(1, 7));
        add(panelSpinner);
        fazSpinner.setMaximumSize(new Dimension(190, 19));
        panelSpinner.add(fazSpinner);
        panelSpinner.add(acıSpinner);
        panelSpinner.add(genlikSpinner);
        panelSpinner.add(genislikSpinner);
        panelSpinner.add(yükseklikSpinner);
        panelSpinner.add(fazAcısıSpinner);
        panelSpinner.add(secim);
    }
}