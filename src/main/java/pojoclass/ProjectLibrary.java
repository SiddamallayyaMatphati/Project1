package pojoclass;


public class ProjectLibrary {
	
	String duration;
	String id;
	String name;
	String packageStatus;
	int price;
	
	public ProjectLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectLibrary(String duration, String id, String name, String packagestatus, int price) {
		super();
		this.duration = duration;
		this.id = id;
		this.name = name;
		this.packageStatus = packagestatus;
		this.price = price;
	} 

	public String getduration() {
		return duration;
	}

	public void setduration(String duration) {
		this.duration = duration;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getpackagestatus() {
		return  packageStatus;
	}

	public void setpackagestatus(String packagestatus) {
		this. packageStatus =  packageStatus;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}
	
	

}