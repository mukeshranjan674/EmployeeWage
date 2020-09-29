public class EmployeeWage{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	String companyName;
	int empRate, numOfDays, maxHrs;
	
	public EmployeeWage(String companyName, int empRate, int numOfDays, int maxHrs) {
		this.companyName = companyName;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHrs = maxHrs;
	}
	public int calEmpWageForCompany() {
		
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
			System.out.println("Total Employee Wage : "+ totalWage + " for " + companyName);
	return totalWage;
	}
	
	public static void main(String[] args) {
		EmployeeWage e1 = new EmployeeWage("Mukesh Group of Companies" , 20, 20, 90);
		int n1 = e1.calEmpWageForCompany();
		EmployeeWage e2 = new EmployeeWage("Ranjan Industries" , 30, 25, 99);
		int n2 = e2.calEmpWageForCompany();
	}
}