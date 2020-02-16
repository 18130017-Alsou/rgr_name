package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test2 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(2000, 30, 90);
		assertEquals(a.getCost(),"54000.0");
	}

}
