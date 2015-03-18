
public class TestString {
	public static void main(String args){
		TestString st = new TestString();
		System.out.println(st.getIdNo());
	}
	String idNo = "371523198902283752";
	public String getIdNo() {
		if(idNo != null && idNo.length() > 4){
			String StringPre = idNo.substring(0,idNo.length() - 4).replaceAll(".", "*");
			idNo = StringPre + idNo.substring(idNo.length() - 4,idNo.length());
		}
		return idNo;
	}
}
