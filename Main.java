import javax.swing.*;

public class Main{
	
	public static void main(String [] args) {
		JFrame j = new JFrame("Snakes and Ladders");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board b = new Board();
		
		j.add(b);
		j.setSize(1000,750);
		j.setVisible(true);
		
	}
	

}
