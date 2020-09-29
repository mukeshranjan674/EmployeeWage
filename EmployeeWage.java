public class EmployeeWage{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	private int noOfCompany = 0;
	private CompanyWage[]companyWageArray;
	
	public EmployeeWage() {
		companyWageArray = new CompanyWage[5];
	}
	
	private void addCompanyWage(String company, int empRate, int noOfDays, int maxHrs) {
		companyWageArray[noOfCompany] = new CompanyWage(company, empRate, noOfDays, maxHrs);
		noOfCompany++;
	}
	private void computeWage() {
		for(int i = 0; i < noOfCompany; i++) {
			companyWageArray[i].setTotalWage(this.computeWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}
	}
	
	private int computeWage(CompanyWage c) {
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		for (; totalHrs <= c.maxHrs && totalDays < c.numOfDays;) {
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
		int totalWage = totalHrs * c.empRate;
		
	return totalWage;
	}
	
	public static void main(String[] args) {
		EmployeeWage e = new EmployeeWage();
		e.addCompanyWage("Mukesh Group of Companies" , 20, 20, 90);
		e.addCompanyWage("Ranjan Industries" , 30, 25, 99);
		e.computeWage();
	}
}

class CompanyWage{
	
	public final String company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHrs;
	public int totalWage;
	
	public CompanyWage(String company, int empRate, int numOfDays, int maxHrs) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays =numOfDays;
		this.maxHrs = maxHrs;
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for Company: " +company+" is: " +totalWage;
	}
}
