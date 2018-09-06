package app.songy.com.zjdroid.hook;

import java.lang.reflect.Member;


public interface HookHelperInterface {
	
	public abstract void hookMethod(Member method, MethodHookCallBack callback);

}
