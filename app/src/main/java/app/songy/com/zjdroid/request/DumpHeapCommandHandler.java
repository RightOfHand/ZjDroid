package app.songy.com.zjdroid.request;


import app.songy.com.zjdroid.collecter.HeapDump;
import app.songy.com.zjdroid.collecter.ModuleContext;
import app.songy.com.zjdroid.util.Logger;

public class DumpHeapCommandHandler implements CommandHandler {
	
	private static String dumpFileName;

	public DumpHeapCommandHandler() {
		dumpFileName = android.os.Process.myPid()+".hprof";
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		String heapfilePath = ModuleContext.getInstance().getAppContext().getFilesDir()+"/"+dumpFileName;
        HeapDump.dumpHeap(heapfilePath);
        Logger.log("the heap data save to ="+ heapfilePath);
	}
	
	

}
