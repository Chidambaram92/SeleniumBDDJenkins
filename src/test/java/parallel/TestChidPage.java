package parallel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TestChidPage {
	//static variable declaration
	static int You;
	public static void main(String[] args) {
	AccountsPageSteps step = new AccountsPageSteps();
	int iVal=step.getStateVar();
	TestChidPage  objOne= new TestChidPage();
	objOne.tableMapMethod();
	
	}
	public static void statMethod () {
		/* non  static members cannot be called 
		 * TestChidPage chid= new TestChidPage(); chid.ival
		 */
		//call static members inside static methods
		int vis=You;
		int i;
	}
	private  List<Map<String, Integer>> tableMapMethod (){
		//able to call static method inside non static method
		statMethod();
		List<String>nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Chidambaram");
		nameList.add("Test");
		nameList.add("Value");
		 return null;
		
	}
}
