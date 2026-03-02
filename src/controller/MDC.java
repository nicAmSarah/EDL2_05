package controller;

public class MDC {

	public MDC() {
		super();
	}
	
	public int medir(int x, int y) {
		if(x == y) {
			return x;
		}
		if(x > y) {
			return medir(x - y, y);
		}
		else {
			return medir(y,x);	
		}
	}
	
}
