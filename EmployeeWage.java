public class EmployeeWage{
	public static void main(String[] args) {
		int FULL_TIME = 1;
		double check = Math.floor(Math.random() * 10) % 2;
		if (check == FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}