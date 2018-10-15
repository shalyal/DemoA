package script;

import generic.Utility;

public class XL {
 public static void main(String[]args) {
	 
 int passcount=10,failcount=20;
	Utility.writeResultToXL("./result/Summary.xlsx", passcount, failcount);
 }
}

