
public class Election {
private String candidateName;
private int candidateAge;
private int noOfVotes;
private int candidateId;
private String candidateParty;
public void setcandidateName(String candidateName) {
	this.candidateName=candidateName;
}
public String getname() {
	return candidateName;
}
public void setcandidateAge(int candidateAge) {
	this.candidateAge=candidateAge;
}
public int getcandidateAge() {
	return candidateAge;
}
public void setnoOfVotes(int noOfVotes) {
	this.noOfVotes=noOfVotes;
}
public int getnoOfVotes() {
	return noOfVotes;
}
public void setcandidateId(int candidateId) {
	this.candidateId=candidateId;
}
public int getcandidateId() {
	return candidateId;
}
public void setcandidateParty(String candidateParty) {
	this.candidateParty=candidateParty;
}
public String getcandidateParty() {
	return candidateParty;
}
public Election(String candidateName, int candidateAge, int noOfVotes, int candidateId, String candidateParty) {
	this.candidateName=candidateName;
	this.candidateAge=candidateAge;
	this.noOfVotes=noOfVotes;
	this.candidateId=candidateId;
	this.candidateParty=candidateParty;

}
public String toString() {
	return candidateName+","+candidateAge+","+noOfVotes+","+candidateId+","+candidateParty;
}
}
