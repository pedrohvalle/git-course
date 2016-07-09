package com.qacg;

import com.qacg.utils.StringUtils;
import com.qacg.utils.MailUtils;

public class Main {
	
	public static void main (String[] args){
		String saludo ="Hello World !!!";
		MailUtils.send("pedro.hernandez@qacg.com");
		System.out.println(StringUtils.tolowerCase(saludo));
		
	}

}
