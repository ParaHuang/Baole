package day5;

public class AdvancedMathUtility {
	private int maxHistorySize = 100;
	private String[] calculationHistory;
	
	public AdvancedMathUtility() {
		calculationHistory = new String[maxHistorySize];
	}
	
	public AdvancedMathUtility(int maxHistorySize) {
		setMaxHistorySize(maxHistorySize);
		calculationHistory = new String[maxHistorySize];
	}
	
	public int getMaxHistorySize() {
		return maxHistorySize;
	}
	
	private void setMaxHistorySize(int maxHistorySize) {
		if(maxHistorySize<10 || maxHistorySize>100) {
			throw new RuntimeException("invalid maxHistorySize");
		}
		this.maxHistorySize = maxHistorySize;
	}
	public String[] getCalculationHistory() {
		return calculationHistory;
	}
	public void setCalculationHistory(String[] calculationHistory) {
		if(calculationHistory.length>maxHistorySize) {
			throw new RuntimeException("invalid calculationHistory");
		}
		this.calculationHistory = calculationHistory;
	}
	
	
}
