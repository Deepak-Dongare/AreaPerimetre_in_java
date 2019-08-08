import java.util.Scanner;

public class AreaPerimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w;
		int h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Width");
		w=sc.nextInt();
		System.out.println("Enter the value  of height");
		h=sc.nextInt();
		int Area=w*h;
		System.out.println("Area of  Rectangle............"+Area);
		
		
		
		int Perimeter=2*(w+h);
		System.out.println("Perimeter of Rectangle"+Perimeter);
		

	}

}
