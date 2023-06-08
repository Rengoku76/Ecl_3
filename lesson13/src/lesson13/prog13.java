package lesson13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prog13 {

	public static void main(String[] args) {
		
		okno window = new okno();
	}
}
class okno extends JFrame
{
	public okno()
	{
	setBounds(0,0,900,600);
	setTitle("”правление приложением с помощью мыши");
	
	panel pan = new panel();
	Container con = getContentPane();
	con.add(pan);
	setBackground(new Color(238,238,238));
	setVisible(true);
	}
}
class panel extends JPanel
{
	Color[] masColor;
			int tCol = 0;
			int mX,mY;
			Boolean flag=false;
			public panel()
			{
				addMouseListener(new myMouse1());
				addMouseMotionListener(new myMouse2());
			}
			public void paintComponent(Graphics gr)
					{
				Color[] masColor;
					masColor = new Color[8];
					masColor[0] = Color.BLACK;
					masColor[1] = Color.GREEN;
					masColor[2] = Color.BLUE;
					masColor[3] = Color.RED;
					masColor[4] = Color.YELLOW;
					masColor[5] = Color.WHITE;
					masColor[6] = Color.ORANGE;
					masColor[7] = new Color(238,238,238);
					for (int i=0; i<8; i++)
					{
						gr.setColor(masColor[i]);
						gr.fillRect(i*100,0,100,50);
						if (flag==true)
						{
							gr.setColor(masColor[tCol]);
							gr.fillRect(mX,mY,7,7);
						}
					}
					}
						public class myMouse1 implements MouseListener
						{
							public void mouseClicked(MouseEvent e)
							{
							}
							public void mousePressed(MouseEvent e)
							{
								int tX = e.getX();
								int tY = e.getY();
								int col = e.getClickCount();
								int btn = e.getButton();
								if ((tX>0) && (tX<800) && (tY>0) && (tY<50))
								{
									if (col==1)
									{
										if (btn==1)
											{
											tCol = tX / 100;
								}
								}
							}
							}
							public void mouseReleased(MouseEvent e)
							{
							}
							public void mouseEntered(MouseEvent e)
							{
							}
							public void mouseExited(MouseEvent e)
							{		
							}
						}
						public class myMouse2 implements MouseMotionListener
						{
							public void mouseDragged(MouseEvent e)
							{
								int tX = e.getX();
								int tY = e.getY();
								if (tY>50)
								{
									mX = tX;
									mY = tY;
									flag=true;
									repaint();
								}
							}
							public void mouseMoved(MouseEvent e)
							{
							
							int tX = e.getX();
							int tY = e.getY();
							int col = e.getClickCount();
							int btn = e.getButton();
							if ((tX>0) && (tX<800) && (tY>0) && (tY<50))
							{
								setCursor(new Cursor(Cursor.HAND_CURSOR));
							}
							
							{
								setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
							}
							
							}
						}
}
