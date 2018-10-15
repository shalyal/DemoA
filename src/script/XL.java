package script;

import generic.Utility;

public class XL {
 public static void main(String[]args) {
	 
 int passcount=0,failcount=0;
	Utility.writeResultToXL("./result/Summary.xlsx", passcount, failcount);
 }
}
