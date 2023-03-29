package com.javaprogram.example;

import java.io.File;
import java.io.IOException;

public class TestDogsArrayProgram {
	public static void main(String[] args) throws IOException {
		File out = null;
		try {
			//out = new File("D:\\Application Setup\\TempFilePrograms\\text.txt");
			out.createNewFile();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (out != null) {
				
			}

		}
	}
}
