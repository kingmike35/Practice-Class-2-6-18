import java.util.Scanner;
public class County2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter the County name, population, year established, and county land volume.");

County county2= new County(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());

System.out.println(county2.CountyName);
System.out.println(county2.CountyPopulation);
System.out.println(county2.CountyYearEstablished);
System.out.println(county2.CountyLandVolume);

	}

}
