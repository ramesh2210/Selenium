package week3.day2;

public class CalcIndividualTax implements IncomeCalculation,TaxCalculation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalcIndividualTax obj = new CalcIndividualTax();
		
		obj.calcGrossIncome();
		obj.incomeAdd(null, 0, 0);
		obj.incomeReduce(null, 0, 0);
		obj.publishValue();
		obj.removeDeductions();
		
		
	}
	public double incomeAdd(String name, double amount1, double amount2) {
		
		return 0;
	}
	public double incomeReduce(String name, double amount1, double amount2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void publishValue() {
		// TODO Auto-generated method stub
		
	}
	public void calcGrossIncome() {
		// TODO Auto-generated method stub
		
	}
	public void removeDeductions() {
		// TODO Auto-generated method stub
		
	}

}
