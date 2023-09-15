package com.itwill.expection;

import org.springframework.ui.Model;

public class ExistedUserException extends Exception{
	public ExistedUserException(String msg) {
        super(msg); 
		
	}
}
