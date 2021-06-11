package chainofresponsibility.demo1;

public class ServerFilter3 implements Filter {

	@Override
	public void filtering(String data) {
		// TODO Auto-generated method stub
		if (data.contains("666")) {
			System.out.println("checking <666>...please wait...");
		}
	}

}
