package jus.stage.treatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileTreatment {

	private static File path = new File("data");

	private static String[] samples = path.list(new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			return new File(dir, name).isDirectory();
		}
	});

	private static String[] listAllStudents(String dir) {
		String tmp = "data/" + dir;
		File currentPath = new File(tmp);
		String[] students = currentPath.list(new FilenameFilter() {
			@Override
			public boolean accept(File currentDir, String name) {
				return new File(currentDir, name).isDirectory();
			}
		});
		return students;
	}

	private static File[] getAllDirectoryFile(String dir) {
		return new File(dir).listFiles();
	}

	public static HashMap<String, File[]> getAllFileFromRoot() {
		HashMap<String, File[]> allFile = new HashMap<>();
		for (int i = 0; i < samples.length; i++) {
			String[] tmp = listAllStudents(samples[i]);
			for (int j = 0; j < tmp.length; j++) {
				String currentDirectory = "data/" + samples[i] + "/" + tmp[j];
				File[] currentDirectoryFile = getAllDirectoryFile(currentDirectory);
				allFile.put(currentDirectory, currentDirectoryFile);
			}
		}
		return allFile;
	}

	private static File getExecutionFile(File[] directoryFile, String currentDirectory) throws Exception {
		for (int i = 0; i < directoryFile.length; i++) {
			String tmp = (currentDirectory + "/execution.txt");
			if (directoryFile[i].toString().equals(tmp)) {
				return directoryFile[i];
			}
		}
		throw new Exception("Directory " + currentDirectory + " execution file not found");
	}

	private static boolean checkFile(File executionFile) {
		boolean working = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader(executionFile));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				if (line.equals("Grade :=>> 100")) {
					working = true;
				}
				line = br.readLine();
			}
			String everything = sb.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return working;
	}

	public static ArrayList<String> getOnlyWorkingDirectory(HashMap<String, File[]> allFile) {

		ArrayList<String> workingDirectory = new ArrayList<>();

		for (Map.Entry<String, File[]> entry : allFile.entrySet()) {

			try {
				if (checkFile(getExecutionFile(entry.getValue(), entry.getKey()))) {
					workingDirectory.add(entry.getKey());
				}
			} catch (Exception e) {
				// System.out.println(e.getMessage());
			}
		}
		return workingDirectory;
	}

	public static void extractWorkingDirectory(ArrayList<String> workingDirectory) {

		for (String tmp : workingDirectory) {
			Runtime rt = Runtime.getRuntime();
			try {
				char[] copy = Arrays.copyOfRange(tmp.toCharArray(), 5, tmp.length());
				System.out.println(copy);
				String temp = "cp -r " + tmp + " sample/" + new String(copy);
				Process pr = rt.exec(temp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		HashMap<String, File[]> test = getAllFileFromRoot();
		extractWorkingDirectory(getOnlyWorkingDirectory(test));

	}

}
