package CollectionArrayList;

public class Programmer {
	private String name;
	private int id;
	private String gender;
	private String designation;
	private String codingLang;

	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	public String getdesignation() {
		return designation;
	}
	public void setcodingLang(String codingLang) {
		this.codingLang=codingLang;
	}
	public String getcodingLang() {
		return codingLang;
	}
	public Programmer(String name, int id, String gender, String designation, String codingLang) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.designation=designation;
		this.codingLang=codingLang;
		
	}
	public String toString() {
		return name+","+id+""+gender+","+designation+","+codingLang;
	}
}
