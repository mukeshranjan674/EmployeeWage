public class EmployeeWage{
	public static void main(String[] args) {
		int FULL_TIME = 2;
		int PART_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double check = Math.floor(Math.random() * 10) % 3;
		if (check == FULL_TIME)
			empHrs = 8;
		else if(check == PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * WAGE_PER_HOUR;
			System.out.println("Employee Wage :"+empWage);
	}
}