package com.liu.exception.exception;


public class MyException extends Exception
{
	private static final long serialVersionUID = 1L;
	public MyException()
	{
	}
	public MyException(String msg)
	{
		super(msg);
	}
}