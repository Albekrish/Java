package com.mailapplication.sendreceive;

public interface SendReceiveViewCallBack {

	String getContent();

	void invalidMail(String string);

	void message(String string);

}
