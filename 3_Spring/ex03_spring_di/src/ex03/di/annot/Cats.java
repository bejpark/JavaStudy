package ex03.di.annot;

public class Cats {
	private MyCats myCats;
	
	public Cats(MyCats myCats) {
		this.myCats=myCats;
	}
	public void setMyCats(MyCats myCats) {
		this.myCats=myCats;
	}
	
	public void catsInfoPrint() {
		System.out.println("----------");
		System.out.println("cats Name : "+myCats.getName());
		System.out.println("cats age : "+myCats.getAge());
		System.out.println("cats hobby : "+myCats.getHobbys());
		System.out.println("cats weight : "+myCats.getWeight());
		System.out.println("cats color : "+myCats.getColor());
		System.out.println("----------");
		
	}
}
