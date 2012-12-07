package sinyalprojesi;
//Swing componentleri skendi yazıo grasdsphicsi awt den alıo
//applet componenti ve graphicsi awtden kullssdsdsdanıorzsa
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;


public class CanvasPanel extends JPanel {

    protected int yükseklik;
    protected int genlik;
    protected int genislik;
    protected int acısalFrakans;
    protected int fazAcısı;
    protected int faz;//başlangıç noktasını değiştiriyor
    int points;
    double[] sines;
    int[] pts;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        points = acısalFrakans * 2;
        sines = new double[points];

        for (int i = 0; i < points; i++) {
            double radians = (Math.PI / 180) * i;
            sines[i] = Math.sin(radians+fazAcısı*Math.PI/180);
        }

        int maxWidth = genislik;
        double hstep = (double) maxWidth / (double) points;
        pts = new int[points];
        for (int i = 0; i < points; i++) {
            pts[i] = (int) (sines[i] * genlik);
        }
        g.setColor(Color.BLUE);
        g.drawLine(0, 157, 1500, 157);//yatay
        g.drawLine(600,0, 600, 800);//dikey
        g.drawLine(190,320,990, 0);//Z ekseni
        for(int i=0;i<400;i++){
            g.drawLine((i)*20,155,(i)*20, 160);
        }
          for(int i=0;i<100;i++){
            g.drawLine(597,(i*20)-2,603,(i*20)-2);
        }
           for(int i=0;i<80;i++){
            g.drawLine(188+(15*i),318-(6*i), 190+(15*i),323-(6*i));
        }
        
      
      
        g.setColor(Color.red);
        
        for (int i = 1; i < points; i++) {

            int x1 = (int) ((i - 1) * hstep);
            int x2 = (int) (i * hstep);
            int y1 = pts[i - 1] - yükseklik+158;
            int y2 = pts[i] - yükseklik+158;
            g.drawLine(x1 + faz+600, y1, x2 +600+ faz, y2);
        }
    }
}
