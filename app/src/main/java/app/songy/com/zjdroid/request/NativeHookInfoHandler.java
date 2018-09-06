package app.songy.com.zjdroid.request;


import app.songy.com.zjdroid.collecter.NativeHookCollecter;

public class NativeHookInfoHandler implements CommandHandler {

	@Override
	public void doAction() {
        NativeHookCollecter.getInstance().parserNativeHookInfo();
	}

}
