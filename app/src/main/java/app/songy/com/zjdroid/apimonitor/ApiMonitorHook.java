package app.songy.com.zjdroid.apimonitor;


import app.songy.com.zjdroid.hook.HookHelperFacktory;
import app.songy.com.zjdroid.hook.HookHelperInterface;

public abstract class ApiMonitorHook {
	
   protected HookHelperInterface hookhelper = HookHelperFacktory.getHookHelper();
   public static class InvokeInfo{
	   private long invokeAtTime;
	   private String className;
	   private String methodName;
	   private Object[] argv;
	   private Object result;
	   private Object invokeState;
   }
   public abstract void startHook();
    
}
