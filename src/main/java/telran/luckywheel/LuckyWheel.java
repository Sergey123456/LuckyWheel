package telran.luckywheel;

import java.util.Random;

public class LuckyWheel {
	private ProbabilityTable probabilityTable;
	private Random rand = new Random();

	public LuckyWheel(ProbabilityTable probabilityTable) {
		this.probabilityTable = probabilityTable;
	}
	
	public int spin() {
		double value = rand.doubles(0, 1 + Double.MIN_VALUE).findFirst().getAsDouble();
		return probabilityTable.find(value); 
	}
	
	
}
