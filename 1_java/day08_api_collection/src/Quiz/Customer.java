package Quiz;

import java.util.Vector;

public class Customer {
	protected String name,address,tel;
	protected int idx;
	
	
	public Customer() {
		
	}
	public Customer(int idx, String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.idx = idx;
	}

	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "<< 고객 "+idx+"의 정보 >>\n 이름 : " + name + ", 주소 : " + address + ", 번호 : " + tel;
	}
	
	

}
