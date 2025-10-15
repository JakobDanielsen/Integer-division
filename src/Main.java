import  javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int dividend = Integer.parseInt(JOptionPane.showInputDialog("What integer are you dividing?"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("What integer are you dividing it with?"));
        int quotient = 0;
        int remainder = dividend < 0 ? -dividend : dividend; // Setting remainder as absolute value of dividend, this compacts the code if dividend < 0
        
        if (divisor != 0) { // cheks if the user is a troll
            while (remainder >= divisor){ // using 0 <= remainder < divisor, to find out if the equation is done
                   remainder -= divisor;
                   quotient++;
            }
            if (dividend < 0) { // correcting values if the dividend is negative
                if (remainder == 0) {
                    quotient = -quotient;
                } else {
                    quotient = -(quotient + 1);
                    remainder = divisor - remainder;
                }
            }
            JOptionPane.showMessageDialog(null,dividend + " = " + divisor + " * " + quotient+ " + " + remainder +"\n" + dividend + "/" + divisor + " = " + quotient + " with " + remainder +" as remainder." );
        } else {
            // if trying to divide by zero
            ImageIcon icon = new ImageIcon(Main.class.getResource("/resources/really.jpg"));
            JOptionPane.showMessageDialog(null, "brah", "Image", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
}
