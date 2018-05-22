package TestPakage;

import javax.swing.*;

public class Enter {
    double j, k, l, x1, x2;
    String n1, n2, n3;
    EQSolver q = new EQSolver();
    public void Scan () {
        n1 = JOptionPane.showInputDialog("Enter your first number:");
        n2 = JOptionPane.showInputDialog("Enter your second number:");
        n3 = JOptionPane.showInputDialog("Enter your third number:");
        j = Double.parseDouble(n1);
        k = Double.parseDouble(n2);
        l = Double.parseDouble(n3);

    }
    public void Scan (double x1, double x2, double a, double b, double c) {
        if (b*b-4*a*c==0) {
            x2=-b/2*a;
            JOptionPane.showMessageDialog(null, "Your equation has only one root:"+x2);
        }
        else if (b*b-4*a*c >0 ) {
            x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
            x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
            JOptionPane.showMessageDialog(null, "Your equation has two roots. The first one is: " +x1);
            JOptionPane.showMessageDialog(null, "The second one is: " +x2);
        }
        else if (b*b-4*a*c <0) {
            JOptionPane.showMessageDialog(null, "Your equation has no roots.");
        }
    }
}
