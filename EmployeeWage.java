public class EmployeeWage{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS = 20;
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage = 0;
		int totalWage = 0;
		
		for (int day = 0; day < WORKING_DAYS; day++) {
			double check = Math.floor(Math.random() * 10) % 3;
			switch ((int)check) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			
		}
			empWage = empHrs * WAGE_PER_HOUR;
			totalWage = totalWage + empWage;
			System.out.println("Employee Wage : "+empWage);
		}
		
			System.out.println("Total Employee Wage :"+totalWage);
	}
}