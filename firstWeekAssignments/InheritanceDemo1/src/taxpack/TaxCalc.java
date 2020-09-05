package taxpack;

import com.telstra.emp.Employee;
import com.telstra.emp.Manager;

public class TaxCalc {

	public static double calcTax(Employee e) {
		if(e instanceof Manager) {
			return 100.10;
		}
		else {
			return 90.10;
		}
	}
	
}
