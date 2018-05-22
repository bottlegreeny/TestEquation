package TestPakage;

import javax.swing.JOptionPane;

public class EQSolver {
    public static void main(String[] args) {

        Enter e = new Enter();
        e. Scan();
        double b = e.k;
        double a = e.j;
        double c = e.l;
        double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        e.Scan(x1, x2, a, b, c);


    }


}
