package ex03.di;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRecordImpl record = new IRecordImpl();
		IRecordViewImpl view = new IRecordViewImpl();
		
		view.setRecord(record);
		view.input();
		view.print();

	}

}
