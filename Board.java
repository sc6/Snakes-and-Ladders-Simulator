import java.awt.*;
import java.awt.Event;
import javax.swing.*;

public class Board extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		
		
		//Drawing decorations...
		
		g.setColor(Color.WHITE);
		g.drawRect(5, 5, 995, 745);
		
		g.drawString("Snakes and Ladders", 10, 20);
		g.drawString("Coded by Steve Chang", 10, 40);
		
		
		
		
		
		//Drawing the squares...

		g.setColor(Color.ORANGE);
		
		for(int y = 600; y > 100; y-=50) {
			for(int x = 250; x < 750; x+=50) {

				g.fillRect(x, y, 48, 48);
				
			}
		}
		
		
		//Writing the squares' numbers...
		
		int counter = 1;
		int x = 250;
		int y = 645;
		boolean writeDirectionRight = true;
		
		
		
		g.setColor(Color.WHITE);
		
		while(counter < 101) {
			
			g.drawString(String.valueOf(counter), x, y);

			if(counter%10 == 0) {
				y-=50;
				if(writeDirectionRight == true) writeDirectionRight = false;
				else writeDirectionRight = true;
				
				counter++;
				continue;
			}
			
			if(writeDirectionRight == false) {
				x-=50;
			}
			else x+=50;

			counter++;
		}
		
		
		
		
		//Drawing the snakes...
		
		g.setColor(Color.RED);
		
		//16 to 6
		g.drawLine(475, 575, 525, 625);
		
		//47 to 26
		g.drawLine(575, 425, 525, 525);
		
		//49 to 11
		g.drawLine(675, 425, 725, 575);
		
		//56 to 53
		g.drawLine(625, 375, 475, 375);
		
		//62 to 19
		g.drawLine(325, 325, 325, 575);
		
		//64 to 60
		g.drawLine(425, 325, 275, 375);
		
		//87 to 24
		g.drawLine(575, 225, 425, 525);
		
		//93 to 73
		g.drawLine(625, 175, 625, 275);
		
		//95 to 75
		g.drawLine(525, 175, 525, 275);
		
		//98 to 78
		g.drawLine(375, 175, 375, 275);
		
		
		
		//Drawing the ladders...
		
		g.setColor(Color.GREEN);
		
		//1 to 38
		g.drawLine(275, 625, 375, 475);
		
		//4 to 14
		g.drawLine(425, 625, 575, 575);
		
		//9 to 31
		g.drawLine(675, 625, 725, 475);
		
		//28 to 84
		g.drawLine(625, 525, 425, 225);
		
		//36 to 44
		g.drawLine(475, 475, 425, 425);
		
		//40 to 42
		g.drawLine(275, 475, 325, 425);
		
		//51 to 67
		g.drawLine(725, 375, 575, 325);
		
		//71 to 91
		g.drawLine(725, 275, 725, 175);
		
		//80 to 100
		g.drawLine(275, 275, 275, 175);
		
		


		
		
			
		}
	}
		
		
		
	
	



