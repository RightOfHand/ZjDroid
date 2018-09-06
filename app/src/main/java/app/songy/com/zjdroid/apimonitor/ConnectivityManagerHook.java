package app.songy.com.zjdroid.apimonitor;

import java.lang.reflect.Method;

import app.songy.com.zjdroid.hook.HookParam;
import app.songy.com.zjdroid.util.Logger;
import app.songy.com.zjdroid.util.RefInvoke;


public class ConnectivityManagerHook extends ApiMonitorHook {

	@Override
	public void startHook() {
		
		Method setMobileDataEnabledmethod = RefInvoke.findMethodExact(
				"android.net.ConnectivityManager", ClassLoader.getSystemClassLoader(),
				"setMobileDataEnabled",boolean.class);
		hookhelper.hookMethod(setMobileDataEnabledmethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				boolean status = (Boolean) param.args[0];
				Logger.log("Set MobileDataEnabled = "+status);
			}
		});
		
	}

}
