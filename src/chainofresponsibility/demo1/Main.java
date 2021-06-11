package chainofresponsibility.demo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request request = new Request("port 123 CAT 666 request to connecting...");
		
		FilterChain fc = new FilterChain();
		fc.add(new ServerFilter1());
		fc.add(new ServerFilter2());
		fc.add(new ServerFilter3());
		
		Handler handler = new Handler(request, fc);
		handler.handleRequest();
	}

}
