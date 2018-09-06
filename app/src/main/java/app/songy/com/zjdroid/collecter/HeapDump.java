package app.songy.com.zjdroid.collecter;

import java.io.IOException;

import android.os.Debug;

public class HeapDump {

	public static void dumpHeap(String filename) {
		try {
			Debug.dumpHprofData(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
