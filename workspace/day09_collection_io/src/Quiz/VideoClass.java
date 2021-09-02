package Quiz;

public class VideoClass {
	private int id;
	private boolean lend;
	private String title,category,lendName,lendDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getLend() {
		return lend;
	}

	public void setLend(Boolean lend) {
		this.lend = lend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public VideoClass(int id, String title, String category, Boolean lend, String lendName, String lendDate) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		return "id : "+id+", title : " + title + ", category : " + category + "\nlend : " + lend + ", lendName : " + lendName
				+ ", lendDate : " + lendDate;
	}
	
	
}
