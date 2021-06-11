package chainofresponsibility.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterChain {
	List<Filter> filters;
	
	public FilterChain() {
		filters = new ArrayList<>();
	}
	
	public void add(Filter filter) {
		filters.add(filter);
	}
	
	public void remove(Filter filter) {
		filters.remove(filter);
	}
		
	public void processData(String data) {
		Iterator<Filter> it = filters.iterator();
		while(it.hasNext()) {
			Filter f = (Filter) it.next();
			f.filtering(data);
		}
	}
}
