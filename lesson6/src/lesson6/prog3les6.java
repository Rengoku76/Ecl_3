package lesson6;
import javax.imageio.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prog3les6 {

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
	private int x=0,y=0;
	private Image img;
	public myPanel()
{
		Timer nt = new Timer(50,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x++;
				repaint();
			}
		});
		nt.start();
		try
		{
			img = ImageIO.read(new File("Z:\\\\ÃĞÓÏÏÛ\\\\ÏĞÎÃĞÀÌÌÈÑÒÛ\\\\ÈÏ22\\\\Áåëîìåñòíîâ Ä\\\\Eclipse\\\\lesson6\\\\Image\\\\forest.jpg"));
		}
		catch(IOException exp) {}
}
	public void paintComponent(Graphics gr)
	{
		gr.clearRect(x-1, y-1, img.getWidth(null)+1, img.getHeight(null)+1);
		gr.drawImage(img, x, y, null);
	}
}
