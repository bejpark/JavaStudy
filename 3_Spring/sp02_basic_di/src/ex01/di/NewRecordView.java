package ex01.di;

public class NewRecordView {
	private NewRecord record;
//	public NewRecordView(int kor,int math,int eng, int com) {
//		record = new NewRecord(kor,eng,math,com);
//		
//	}
	
	//setter로 주입받기
	
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
		System.out.printf("kor : %d\n", record.getKor());
		System.out.printf("eng : %d\n", record.getEng());
		System.out.printf("math : %d\n", record.getMath());
		System.out.printf("com : %d\n", record.getCom());
		System.out.printf("total : %d\n", record.total());
		System.out.printf("avg : %f\n", record.avg());

	}

	public NewRecord getRecord() {
		return record;
	}

	public void setRecord(NewRecord record) {
		this.record = record;
	}

}
