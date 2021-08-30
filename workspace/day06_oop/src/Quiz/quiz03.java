package Quiz;


class TV{
	private int ch;
	private String color,sound;
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public TV(int ch, String color, String sound) {
		this.ch = ch;
		this.color = color;
		this.sound = sound;
	}
	public TV() {
		ch=0;
		color="color";
		sound="sound";
	}
	
	public void disp() {
		System.out.println("****** TV 정보 출력 ******");
		System.out.println("채널 : "+ch);
		System.out.println("색상 : "+color);
		System.out.println("소리 : "+sound);
	}
	
	
	
	
}
public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV(10,"white","good");
		tv.disp();
		

	}

}
