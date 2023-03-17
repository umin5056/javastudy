import java.sql.Date;

public class test {

	private int test_no;
	private String id;
	private String name;
	private String address;
	
	public test() { }

	public test(int test_no, String id, String name, String address) {
		super();
		this.test_no = test_no;
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getTest_no() {
		return test_no;
	}

	public void setTest_no(int member_no) {
		this.test_no = member_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "test [member_no=" + test_no + ", id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	
	
	
}
