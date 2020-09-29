public class EmployeeWage{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_HOURS = 100;
	
	public static int computeWage() {
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		
		for (; totalHrs <= MAX_HOURS && totalDays < WORKING_DAYS;) {
			totalDays++;
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
			totalHrs = totalHrs + empHrs;
			System.out.println("Day: " + totalDays + " Employee Hours: " + empHrs);
			
		}
		int totalWage = totalHrs * WAGE_PER_HOUR;
			System.out.println("Total Employee Wage :"+totalWage);
			return totalWage;
	}
	public static void main(String[] args) {
		computeWage();
	}
}
	
