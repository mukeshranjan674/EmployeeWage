import java.util.*;
public class EmployeeWage implements EmployeeWageInterface{
	
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	private int noOfCompany = 0;
	private LinkedList<CompanyWage> companyList;
	private Map<String,CompanyWage> companyMap;
	
	public EmployeeWage() {
		companyList = new LinkedList<>();
		companyMap = new HashMap<>();
	}
	
	public void addCompanyWage(String company, int empRate, int noOfDays, int maxHrs) {
		CompanyWage c = new CompanyWage(company, empRate, noOfDays, maxHrs);
		companyList.add(c);
		companyMap.put(company, c);
		noOfCompany++;
	}
	public void computeWage() {
		for(int i = 0; i < companyList.size() ; i++) {
			CompanyWage c = companyList.get(i);
			c.setTotalWage(this.computeWage(c));
			System.out.println(c);
		}
	}
	
	public int computeWage(CompanyWage c) {
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		for (int i =0 ; totalHrs <= c.maxHrs && totalDays < c.numOfDays; i++) {
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
			c.dailyWage.add(empHrs * c.empRate);
			totalHrs = totalHrs + empHrs;
			System.out.println("Day: " + totalDays + " Employee Hours: " + empHrs + "  Wage : " + c.dailyWage.get(i));
			
		}
		int totalWage = totalHrs * c.empRate;
		
	return totalWage;
	}
	
	public int getTotalWage(String company) {
		return companyMap.get(company).totalWage;
	}
	
	public static void main(String[] args) {
		EmployeeWageInterface e = new EmployeeWage();
		e.addCompanyWage("Mukesh Group of Companies" , 20, 20, 90);
		e.addCompanyWage("Ranjan Industries" , 30, 25, 99);
		e.computeWage();
		System.out.println("Total Wage for Ranjan Industries: " + e.getTotalWage("Ranjan Industries"));
	}
}

class CompanyWage{
	
	public final String company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHrs;
	public int totalWage;
	public List dailyWage;  // Daily Wage is stored in this list
	
	public CompanyWage(String company, int empRate, int numOfDays, int maxHrs) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays =numOfDays;
		this.maxHrs = maxHrs;
		dailyWage = new ArrayList<Integer>();
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for Company: " +company+" is: " +totalWage;
	}
}

public interface EmployeeWageInterface{
	
	public void addCompanyWage(String company, int empRate, int noOfDays, int maxHrs);
	public void computeWage();
	public int getTotalWage(String company);
}


