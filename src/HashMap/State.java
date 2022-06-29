package HashMap;

public class State {

	private String cMName;
	private String stateName;
	private String capitalName;
	private String lang;
	private int totalDistrict;

	public void setcMName(String cMName) {
		this.cMName=cMName;
	}

	public String getcMName() {
		return cMName;
	}

	public void setstateName(String stateName) {
		this.stateName=stateName;
	}

	public String getstateName() {
		return stateName;
	}

	public void setcapitalName(String capitalName) {
		this.capitalName=capitalName;
	}

	public String getcapitalName() {
		return capitalName;
	}

	public void setlang(String lang) {
		this.lang=lang;
	}

	public String getlang() {
		return lang;
	}

	public void settotalDistrict(int totalDistrict) {
		this.totalDistrict=totalDistrict;
	}

	public int gettotalDistrict() {
		return totalDistrict;
	}
	public State(String cMName,String stateName,String capitalName,String lang,int totalDistrict) {
		this.cMName=cMName;
		this.stateName=stateName;
		this.capitalName=capitalName;
		this.lang=lang;
		this.totalDistrict=totalDistrict;
	}
	public String toString() {
		return cMName+","+stateName+","+capitalName+","+lang+","+totalDistrict;
	}

	
}
