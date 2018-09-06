package app.songy.com.zjdroid.apimonitor;

import java.lang.reflect.Method;

import app.songy.com.zjdroid.hook.HookParam;
import app.songy.com.zjdroid.util.Logger;
import app.songy.com.zjdroid.util.RefInvoke;


public class ActivityManagerHook extends ApiMonitorHook {

	@Override
	public void startHook() {

		Method killBackgroundProcessesmethod = RefInvoke.findMethodExact(
				"android.app.ActivityManager", ClassLoader.getSystemClassLoader(),
				"killBackgroundProcesses", String.class);
		hookhelper.hookMethod(killBackgroundProcessesmethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				String packageName = (String) param.args[0];
				Logger.log_behavior("kill packagename = "+packageName);
			}
		});
		
		Method forceStopPackagemethod = RefInvoke.findMethodExact(
				"android.app.ActivityManager", ClassLoader.getSystemClassLoader(),
				"forceStopPackage", String.class);
		hookhelper.hookMethod(forceStopPackagemethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				String packageName = (String) param.args[0];
				Logger.log_behavior("kill packagename = "+packageName);
			}
		});
	}

}
