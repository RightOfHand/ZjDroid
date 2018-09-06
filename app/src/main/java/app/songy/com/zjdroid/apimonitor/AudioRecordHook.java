package app.songy.com.zjdroid.apimonitor;

import java.lang.reflect.Method;

import app.songy.com.zjdroid.hook.HookParam;
import app.songy.com.zjdroid.util.Logger;
import app.songy.com.zjdroid.util.RefInvoke;

public class AudioRecordHook extends ApiMonitorHook {

	@Override
	public void startHook() {
		// TODO Auto-generated method stub
		Method startRecordingMethod = RefInvoke.findMethodExact(
				"android.media.AudioRecord", ClassLoader.getSystemClassLoader(),
				"startRecording");
		hookhelper.hookMethod(startRecordingMethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				Logger.log_behavior("Audio Recording ->");
			}
		});
		
	}

}
