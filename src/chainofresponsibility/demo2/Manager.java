package chainofresponsibility.demo2;

public class Manager extends Leader {

	@Override
	public void handleRequest(int leaveDays) {
		// TODO Auto-generated method stub
		if(leaveDays <= 7) {
			System.out.println("the Manager approve " + leaveDays + " leave days");
		} else {
			if(getNext() != null) {
				getNext().handleRequest(leaveDays);
			} else {
				System.out.println("the leave days too long, its can not be approved");
			}
		}
	}

}
