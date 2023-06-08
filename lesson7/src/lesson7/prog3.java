package lesson7;

public class prog3 {

	public static void main(String[] args) {
		myclass ob = new myclass();

	}

}
class myclass
{
	public myclass()
	{
		System.out.println("Это работает конструктор класса!");
	}
	public void show()
	{
		System.out.println("Это работает метод класса!");
	}
	ob.show();
}