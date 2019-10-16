package hello;

public class Member1 {
	private String no; //회원번호
	private String name; //이름 
	private String course; // 등록과정
	public Member1(String no, String name, String course) {
		super();
		this.no = no;
		this.name = name;
		this.course = course;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
