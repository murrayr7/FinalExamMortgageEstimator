

public class Estimator {
	
	private Estimator(){
	}

	public static double HousingPayment(double grossIncome, double down,
			double interest, double monthlyDebt, double term) {
		return (grossIncome/12)*.18;
	}

	public static double TotalObligations(double grossIncome, double down,
			double interest, double monthlyDebt, double term) {
		return (grossIncome/12)*.36;
	}

	public static double MaxMortgage(double grossIncome, double down,
			double interest, double monthlyDebt, double term) {
		//double futureVal = amount*Math.pow(1+(inter/1200), year*12);
		
		double maxPay = MaxPayment(grossIncome, down, interest, monthlyDebt, term);
		double rate=interest/1200;
		double periods=term*12;
		double a = maxPay*( Math.pow(1+rate, periods)-1)/rate;
		return a*Math.pow(1+rate, -periods) + down;
	}

	public static double MaxPayment(double grossIncome, double down,
			double interest, double monthlyDebt, double term) {
		double totOb=TotalObligations(grossIncome, down, interest, monthlyDebt, term);
		double housePay=HousingPayment(grossIncome, down, interest, monthlyDebt, term);
		double housePayOb=totOb-monthlyDebt;
		if(housePayOb>housePay){
			return housePay;
		} else{
			return housePayOb;
		}			
	}

	

}