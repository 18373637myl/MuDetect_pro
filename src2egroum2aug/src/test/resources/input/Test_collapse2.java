package input;

import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

class Test_collapse2 {
	
	String s;
	
	public void before() {
		StringBuffer sb = new StringBuffer();
		sb.append("");
		sb.append(m());
		for (;;) {
			sb.append(n());
			sb.append("");
		}
		sb.append("");
		sb.toString();
	}

	public void after() {
		StringBuffer sb = new StringBuffer();
		sb.append("");
		for (;;) {
			sb.append("");
		}
		sb.append("");
		sb.toString();
	}
}