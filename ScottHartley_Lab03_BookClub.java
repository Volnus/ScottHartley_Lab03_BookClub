import javax.swing.JOptionPane;
/**
 * Scott Hartley
 * 
 * This program awards points to the user.  
 *
 */
public class ScottHartley_Lab03_BookClub {
	public static void main (String [] args){
		double books; // Holds First Score
		String input;  // Holds String input
		
		// Get The Number Of Books
				input = JOptionPane.showInputDialog ("Enter How Many Books You Purchased");
				books = Double.parseDouble(input);

				// Award Points
				if (books == 0) {
				JOptionPane.showMessageDialog(null,  "Sorry, you did not earn any points.");			
				}
				
				if (books == 1) {
					JOptionPane.showMessageDialog(null,  "You have been awarded 5 points.");			
					}
				
				if (books == 2) {
					JOptionPane.showMessageDialog(null,  "You have been awarded 15 points.");			
					}
				
				if (books == 3) {
					JOptionPane.showMessageDialog(null,  "You have been awarded 30 points.");			
					}
				
				if (books == 4) {
					JOptionPane.showMessageDialog(null,  "You have been awarded 60 points.");			
					}
	}
}
