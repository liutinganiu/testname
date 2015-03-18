
public class TT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getIdNo());
	}
	static String idNo = "371523198902283752";
	public static String getIdNo() {
		if(idNo != null && idNo.length() > 4){
			String StringPre = idNo.substring(0,idNo.length() - 4).replaceAll(".", "*");
			idNo = StringPre + idNo.substring(idNo.length() - 4,idNo.length());
		}
		return idNo;
	}

}
