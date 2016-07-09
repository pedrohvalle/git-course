package com.qacg.utils;

public class MailUtils {
	
	public static boolean send (String email){
		
		if(email != null){
			
			System.out.println("Correo enviado a :" + email);
			return true;
		}
		else
		{
			return false;
		}
	}

}
