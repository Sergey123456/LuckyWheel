package telran.luckywheel;

import java.util.ArrayList;
import java.util.List;

public class ProbabilityTable {
	private List<Interval> intervals = new ArrayList<>();
	
	public void addProbability(int multiplier, double probability) {
		Interval interval;
		if (intervals.isEmpty()) {
			interval = new Interval(multiplier, probability);
		} else {
			interval = new Interval(multiplier, intervals.get(intervals.size() - 1).getTopBorder() + probability);
		}
		intervals.add(interval);
	}
	
	public int find(double value) {
		return intervals.stream().filter(x -> x.getTopBorder() >= value).findFirst().orElse(new Interval(-1, -1)).getMultiplayer();
	}
}
