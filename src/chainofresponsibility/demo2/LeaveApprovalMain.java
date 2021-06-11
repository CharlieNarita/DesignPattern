package chainofresponsibility.demo2;

public class LeaveApprovalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leaveDays = 5;
		
		Leader leader1 = new Supervisor();
		Leader leader2 = new Manager();
		Leader leader3 = new Minister();
		
		leader1.setNext(leader2);
		leader2.setNext(leader3);
		leader3.setNext(null);
		
		//start handle request;
		leader1.handleRequest(leaveDays);
	}

}
