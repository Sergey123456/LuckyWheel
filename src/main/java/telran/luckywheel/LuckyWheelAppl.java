package telran.luckywheel;

public class LuckyWheelAppl {
    public static void main(String[] args) {
    	try {
    		System.out.println("Your win: " + new LuckyWheelAppl().bet(args[0]));
    	} catch (Exception e) {
    		System.err.println("Wrong bet!");
    	}
    }
    
    public long bet(String arg) {
    	long res = 0;
    	try {
    		int bet = Integer.parseInt(arg);
    		
    		ProbabilityTable probabilityTable = new ProbabilityTable();
        	probabilityTable.addProbability(3, 0.4);
        	probabilityTable.addProbability(7, 0.3);
        	probabilityTable.addProbability(15, 0.2);
        	probabilityTable.addProbability(20, 0.05);
        	probabilityTable.addProbability(50, 0.03);
        	probabilityTable.addProbability(80, 0.02);
            
        	LuckyWheel lw = new LuckyWheel(probabilityTable);
            
        	res = (long)lw.spin() * bet;
    	} catch (NumberFormatException e) {
			throw new NumberFormatException("Wrong bet!");
		}
    	return res;
    }
}
