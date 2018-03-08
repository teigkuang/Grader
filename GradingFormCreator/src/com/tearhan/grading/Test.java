package com.tearhan.grading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		Creator iCreator = new Creator(16, 1, 1, 2);
		String form = iCreator.getGradingForm();
		// System.out.println(form);

		File iFile = new File("./½ø½×±í.txt");
		if (iFile.exists()) {
			iFile.delete();

			System.out.println(iFile.getAbsolutePath().toString() + "ÒÑÉ¾³ý");
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
