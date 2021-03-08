package empmgtusinglayeredarchitecture.com.cg.enitities;

public class Department {
	private int dept_id;
	private String dept_name;
	public Department() {}
	public Department(int dept_id, String dept_name) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public int hashCode() {
		return dept_id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (dept_id != other.dept_id)
			return false;
		return true;
	}
	
	
}
