package Assignment;

public class Asg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1.1 */
		System.out.println("1.1\n");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		System.out.println("\n");
		
		/* 1.2 */
		System.out.println("1.2\n");
		for(int a = 0; a <= 5; a++) {
			System.out.println("Welcome to Java");
		}
		System.out.println("\n");
		
		/* 1.3 */
		System.out.println("1.3\n");
		System.out.println("   J     A   V     V   A");
		System.out.println("   J    A A   V   V   A A");
		System.out.println("J  J   AAAAA   V V   AAAAA");
		System.out.println(" JJ   A     A   V   A     A");
		System.out.println("\n");
		
		/* 1.4 */
		System.out.println("1.4\n");
		System.out.println("a    a^2    a^3");
		System.out.println("1    1      1");
		System.out.println("2    4      8");
		System.out.println("3    9      27");
		System.out.println("4    10     64");
		System.out.println("\n");
		
		/* 1.5 */
		System.out.println("1.5\n");
		System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
		System.out.println("\n");
		
		/* 1.6 */
		System.out.println("1.6\n");
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		System.out.println("\n");
		
		/* 1.7 */
		System.out.println("1.7\n");
		System.out.println(4.0 * (1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)));
		System.out.println(4.0 * (1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)));
		System.out.println("\n");
		
		/* 1.8 */
		System.out.println("1.8\n");
		double radius = 5.5;
		
		double perimeter = 2 * radius * 3.14159;
		
		double area = radius * radius * 3.14159;
				
		System.out.println("Perimeter is 2 * 5.5 * 3.14159");
		System.out.println("Hasil Akhir = " + perimeter);
		System.out.println("Area is 5.5 * 5.5 * 3.14159");
		System.out.println("Hasil Akhir = " + area);
		System.out.println("\n");
		
		/* 1.9 */
		System.out.println("1.9\n");
		double width = 4.5;
		double height = 7.9;
		
		double perimeters = 2 * (height + width);
		
		double areas = width * height;
		
		System.out.println("Perimeter is 2 * (7.9 + 4.5)");
		System.out.println("Hasil Akhir = " + perimeters);
		System.out.println("Area is 4.5 * 7.9");
		System.out.println("Hasil Akhir = " + areas);
		System.out.println("\n");
		
		/* 1.10 */
		System.out.println("1.10\n");
		double kilometers = 14.0;
		double miles = kilometers / 1.6;
		
		double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
		double averageSpeed = miles / rate;
		
		System.out.println("Average Speed (in miles per hour) = " + averageSpeed);
		System.out.println("\n");
		
		/* 1.11 */
		System.out.println("1.11\n");
		double birth = 7.0;
		double death = 13.0;
		double newImmigrant = 45.0;
		
		double currentPopulation = 312032486;
		double totalseconds = 60 * 60 * 24 * 365;
		
		double totalBirths = totalseconds / birth;
		double totalDeaths = totalseconds / death;
		double totalImmigrants = totalseconds / newImmigrant;
		
		for(int a = 1; a <= 5; a++) {
			currentPopulation += totalBirths + totalImmigrants - totalDeaths;
			System.out.println("Year " + a + " = " + (int)currentPopulation);
		}
	}
}