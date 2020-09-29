public class EmployeeWage{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	
	public static int calEmpWageForCompany( String cName, int empRate, int numOfDays, int maxHrs) {
		
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		for (; totalHrs <= maxHrs && totalDays < numOfDays;) {
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
		int totalWage = totalHrs * empRate;
			System.out.println("Total Employee Wage : "+ totalWage + " for " + cName);
	return totalWage;
	}
	public static void main(String[] args) {
		int n1 = calEmpWageForCompany("Mukesh Group of Companies" , 20, 20, 90);
		int n2 = calEmpWageForCompany("Ranjan Industries" , 30, 25, 99);

	}
}