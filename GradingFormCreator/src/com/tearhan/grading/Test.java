package com.tearhan.grading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		Creator iCreator = null;
		if (args.length == 0) {
			iCreator = new Creator();
		} else if (args.length == 1) {
			iCreator = new Creator(Integer.parseInt(args[0]));
		} else if (args.length == 2) {
			iCreator = new Creator(Integer.parseInt(args[0]),
					Integer.parseInt(args[1]));
		} else if (args.length == 3) {
			iCreator = new Creator(Integer.parseInt(args[0]),
					Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		} else if (args.length == 4) {
			iCreator = new Creator(Integer.parseInt(args[0]),
					Integer.parseInt(args[1]), Integer.parseInt(args[2]),
					Integer.parseInt(args[3]));
		}

		String form = iCreator.getGradingForm();

		File iFile = new File("./½ø½×±í.txt");
		if (iFile.exists()) {
			iFile.delete();

		} else {
			try {
				iFile.createNewFile();
				String path = iFile.getAbsolutePath().toString();
				System.out.println(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			FileWriter iFileWriter = new FileWriter(iFile);
			iFileWriter.write(form);
			iFileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
