package chainofresponsibility.demo2;

public class Supervisor extends Leader {
	
	@Override
	public void handleRequest(int leaveDays) {
		// TODO Auto-generated method stub
		if(leaveDays <= 3) {
			System.out.println("the supervisor approve " + leaveDays + " leave days");
		} else {
			if(getNext() != null) {
				getNext().handleRequest(leaveDays);
			} else {
				System.out.println("the leave days too long, its can not be approved");
			}
		}
	}

}
