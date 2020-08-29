package com.example.messagingstompwebsocket;

public class Greeting {



	private String content;
	private byte[] array;

	public Greeting() {
	}

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
	public byte[] getArray() {
		return array;
	}

	public void setArray(byte[] array) {
		this.array = array;
	}

}
