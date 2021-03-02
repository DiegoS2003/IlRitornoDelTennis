import java.io.File;

import javax.swing.filechooser.FileFilter;

public class TxtFileFilter  extends FileFilter{

	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		if(f.isDirectory()) {
			return true;
		}
		String fileName = f.getName().toLowerCase();
		return fileName.endsWith("txt");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "File di testo";
	}
}
