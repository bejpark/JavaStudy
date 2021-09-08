package orderPackage;

import java.util.Date;

public class Orders {
	private int ordersCode;
	private String ordersDate;
	
	
	
	public Orders(int ordersCode, String ordersDate) {
		this.ordersCode = ordersCode;
		this.ordersDate = ordersDate;
	}


	private String Getdate() {
		return this.ordersDate;
	}

}
