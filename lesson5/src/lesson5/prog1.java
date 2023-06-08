package lesson5;
import javax.swing.*;
import java.awt.*;
public class prog1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		givotn slon = new givotn();
		slon.massa = 5000;
		slon.est();
		System.out.println(slon.massa);
	}
}
class givotn
{
	int massa;
	void est()
	{
		massa = massa+1;
	}
}
