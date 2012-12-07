package sinyalprojesi;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.DimensionUIResource;
import sinyalprojesi.CanvasPanel;
import sinyalprojesi.Slider;
import sinyalprojesi.Spinner;

public class Main1 extends Applet implements ChangeListener, ItemListener {

    Spinner spinner = new Spinner();
    Slider slider = new Slider();
    CanvasPanel canvasPanel = new CanvasPanel();
    JPanel panelUst = new JPanel();
    JPanel panelAlt = new JPanel();
    Dimension dimMain = new Dimension(100, 200);
    public Main1() {
        spinner.acıSpinner.addChangeListener(this);
        spinner.fazSpinner.addChangeListener(this);
        spinner.genlikSpinner.addChangeListener(this);
        spinner.yükseklikSpinner.addChangeListener(this);
        spinner.genislikSpinner.addChangeListener(this);
        spinner.fazAcısıSpinner.addChangeListener(this);
        spinner.secim.addItemListener(this);

        ChangeListener listenerSlider = new ChangeListener() {
           @Override
            public void stateChanged(ChangeEvent e) {
                spinner.acıSpinner.setValue(slider.acıSlider.getValue());
                spinner.fazSpinner.setValue(slider.fazSlider.getValue());
                spinner.genlikSpinner.setValue(slider.genlikSlider.getValue());
                spinner.yükseklikSpinner.setValue(slider.yükseklikSlider.getValue());
                spinner.genislikSpinner.setValue(slider.genislikSlider.getValue());
                spinner.fazAcısıSpinner.setValue(slider.fazAcısıSlider.getValue());
                spinner.fazSpinner.setComponentOrientation(ComponentOrientation.getOrientation(Locale.FRENCH));
                //--------
                canvasPanel.genislik = (int) slider.genislikSlider.getValue();
                canvasPanel.faz = (int) slider.fazSlider.getValue();
                canvasPanel.acısalFrakans = (int) slider.acıSlider.getValue();
                canvasPanel.genlik = (int) slider.genlikSlider.getValue();
                canvasPanel.yükseklik = (int) slider.yükseklikSlider.getValue();
                canvasPanel.fazAcısı = (int) slider.fazAcısıSlider.getValue();
                canvasPanel.repaint();
            }
        };
        slider.fazAcısıSlider.addChangeListener(listenerSlider);
        slider.acıSlider.addChangeListener(listenerSlider);
        slider.fazSlider.addChangeListener(listenerSlider);
        slider.genlikSlider.addChangeListener(listenerSlider);
        slider.genislikSlider.addChangeListener(listenerSlider);
        slider.yükseklikSlider.addChangeListener(listenerSlider);
    }

    public void init() {
        setLayout(new GridLayout(2, 1));
       //panelUst.setLayout(new GridLayout(1, 7));
       // panelUst.setLayout(new FlowLayout(21, 42, 12));
       panelAlt.setLayout (new GridLayout(1, 1));
        panelUst.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panelAlt.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 10));
        
        add(panelUst);
        add(panelAlt);
        panelUst.add(slider.panelSlider);
        panelUst.add(spinner.panelSpinner);
        panelAlt.add(canvasPanel);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        slider.acıSlider.setValue((int) spinner.acıSpinner.getValue());
        slider.fazSlider.setValue((int) spinner.fazSpinner.getValue());
        slider.genlikSlider.setValue((int) spinner.genlikSpinner.getValue());
        slider.genislikSlider.setValue((int) spinner.genislikSpinner.getValue());
        slider.yükseklikSlider.setValue((int) spinner.yükseklikSpinner.getValue());
        slider.fazAcısıSlider.setValue((int) spinner.fazAcısıSpinner.getValue());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (spinner.secim.isSelected()) {
            slider.acıSlider.setEnabled(true);
            slider.fazSlider.setEnabled(true);
            slider.genlikSlider.setEnabled(true);
            slider.genislikSlider.setEnabled(true);
            slider.fazAcısıSlider.setEnabled(true);
            slider.yükseklikSlider.setEnabled(true);
            spinner.acıSpinner.setEnabled(true);
            spinner.fazSpinner.setEnabled(true);
            spinner.genlikSpinner.setEnabled(true);
            spinner.genislikSpinner.setEnabled(true);
            spinner.yükseklikSpinner.setEnabled(true);
            spinner.fazAcısıSpinner.setEnabled(true);
        } else {
            slider.acıSlider.setEnabled(false);
            slider.fazSlider.setEnabled(false);
            slider.genlikSlider.setEnabled(false);
            slider.genislikSlider.setEnabled(false);
            slider.yükseklikSlider.setEnabled(false);
            slider.fazAcısıSlider.setEnabled(false);
            spinner.acıSpinner.setEnabled(false);
            spinner.genlikSpinner.setEnabled(false);
            spinner.fazSpinner.setEnabled(false);
            spinner.genislikSpinner.setEnabled(false);
            spinner.yükseklikSpinner.setEnabled(false);
            spinner.fazAcısıSpinner.setEnabled(false);

            spinner.acıSpinner.setValue(0);
            spinner.fazSpinner.setValue(0);
            spinner.genlikSpinner.setValue(0);
            spinner.yükseklikSpinner.setValue(0);
            spinner.genislikSpinner.setValue(0);
            spinner.fazAcısıSpinner.setValue(0);
        }
    }
}
