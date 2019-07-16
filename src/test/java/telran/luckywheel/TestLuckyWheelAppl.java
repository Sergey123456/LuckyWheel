package telran.luckywheel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLuckyWheelAppl {
	
	LuckyWheelAppl luckyWheelAppl;
	public static final int MIN_BET = 10_000;
	public static final int MAX_BET = 100_000_000;
	public static final int MIN_MULTIPLIER = 3;
	public static final int MAX_MULTIPLIER = 80;
	
	@BeforeEach
	public void setUp() {
		luckyWheelAppl = new LuckyWheelAppl();
	}
	
    @Test
    public void bet() {
    	long win = luckyWheelAppl.bet(Integer.toString(MIN_BET));
    	assertTrue((win >= MIN_BET * MIN_MULTIPLIER) && (win <= (long)MAX_BET * MAX_MULTIPLIER));
    }
}