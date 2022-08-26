
package  com.emp;
public class E1 {

	String name;
	int id;
	Address addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "E1 [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}
	
	
}
