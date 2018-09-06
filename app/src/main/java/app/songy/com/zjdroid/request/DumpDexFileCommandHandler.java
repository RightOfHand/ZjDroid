package app.songy.com.zjdroid.request;


import app.songy.com.zjdroid.collecter.DexFileInfoCollecter;
import app.songy.com.zjdroid.collecter.ModuleContext;
import app.songy.com.zjdroid.util.Logger;

public class DumpDexFileCommandHandler implements CommandHandler {
	
	private String dexpath;

	public DumpDexFileCommandHandler(String dexpath) {
		this.dexpath = dexpath;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		String filename = ModuleContext.getInstance().getAppContext().getFilesDir()+"/dexdump.odex";
		DexFileInfoCollecter.getInstance().dumpDexFile(filename, dexpath);
		Logger.log("the dexfile data save to ="+filename);
	}

	
}
