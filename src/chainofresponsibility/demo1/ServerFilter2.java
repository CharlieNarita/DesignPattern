package chainofresponsibility.demo1;

public class ServerFilter2 implements Filter {

	@Override
	public void filtering(String data) {
		// TODO Auto-generated method stub
		if (data.contains("CAT")) {
			System.out.println("receive <CAT>...");
		}
	}

}
