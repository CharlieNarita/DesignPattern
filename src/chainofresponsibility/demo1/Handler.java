package chainofresponsibility.demo1;

public class Handler {
	
	Request request;
	FilterChain fc;
	
	public Handler(Request request, FilterChain fc) {
		this.request = request;
		this.fc = fc;
	}
	
	public void handleRequest() {
		fc.processData(request.getData());
	}
}
