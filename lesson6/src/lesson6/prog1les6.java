package lesson6;
import javax.swing.*;
import java.awt.*;
public class prog1les6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame okno = new myFrame();
	}
	
}
class myFrame extends JFrame
{
	public myFrame()
	{
		myPanel np = new myPanel();
		Container cont = getContentPane();
		cont.add(np);
		setBounds(10,10,800,600);
		setVisible(true);
	}
}
class myPanel extends JPanel
{
	public void paintComponent(Graphics gr)
	{
		gr.setColor(Color.BLUE);
		for(int i = 0; i < 10; i++)
		{
			gr.fillRect(10 * i, 10 * i, 50 * i, 50 * i);
		}
	}
}