import  javax.swing.*; // TODO: ABILITY TO TAKE IN NEGATIVE INTEGERS
public class Main {
    public static void main(String[] args) {
        int dividend = Integer.parseInt(JOptionPane.showInputDialog("What integer are you dividing?"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("What integer are you dividing it with?"));
        int quotient = 0;
        int rest = 0;
        if (divisor != 0) { 
            while (!(rest+(quotient*divisor)==dividend)){ // exits loop if the equation is solved
                if((quotient+1)*divisor>dividend){ // checking for overflow
                    rest = dividend-divisor*quotient;
                } else {
                    quotient++;
                }
            }
            JOptionPane.showMessageDialog(null,dividend + " = " + divisor + " * " + quotient+ " + " + rest+"\n" + dividend + "/" + divisor + " = " + quotient + " with " + rest +" as rest." );
        } else {
            // if trying to divide by zero
            ImageIcon icon = new ImageIcon(Main.class.getResource("/resources/really.jpg"));
            JOptionPane.showMessageDialog(null, "brah", "Image", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
}
