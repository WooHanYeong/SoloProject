package com.itwill.expection;

public class PasswordMismatchException extends Exception {
	public PasswordMismatchException(String msg) {
		super(msg);
	}
}
