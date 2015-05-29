package smok.springmvc.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static final String Format_Date = "yyyy-MM-dd";
	public static final String Format_Time = "HH:mm:ss";
	public static final String Format_DateTime = "yyyy-MM-dd HH:mm:ss";

	public static String getCurrentDate() {
		return (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
	}

	public static String getCurrentDateTime() {
		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
	}

	public static String parseDateTime(long timestamp) {
		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(timestamp);
	}
	
	public static void main(String[] args) {
		System.out.println(parseDateTime(1432888479827l));
		
		String str = "1231251234";
		byte[] brr = str.getBytes();
		try {
			String at = new String(brr,"utf-8");
			System.out.println(at);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
