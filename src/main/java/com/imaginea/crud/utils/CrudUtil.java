package com.imaginea.crud.utils;

import java.util.Calendar;
import java.util.Date;

public class CrudUtil {
	
	public static Date getCurrentTime(){
		Calendar today = Calendar.getInstance();
		return today.getTime();
	}

}
