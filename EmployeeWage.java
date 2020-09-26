public class EmployeeWage{
	public static void main(String[] args) {
		int FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double check = Math.floor(Math.random() * 10) % 2;
		if (check == FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * WAGE_PER_HOUR;
			System.out.println("Employee Wage :"+empWage);
	}
}