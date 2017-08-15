package org.lc.corejava.annotation;

@Permission("/log/service")
public class LogService {
	
	@Permission("add")
	public void add() {
		
	}
	@Permission("update")
	public void update(){
		
	}

}
