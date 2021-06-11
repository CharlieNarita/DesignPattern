package chainofresponsibility.demo1;

public class ServerFilter1 implements Filter {

	@Override
	public void filtering(String data) {
		// TODO Auto-generated method stub
		if (data.contains("123")) {
			System.out.println("receive <123>...");
		}
	}

}
