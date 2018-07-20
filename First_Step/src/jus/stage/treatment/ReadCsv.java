package jus.stage.treatment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCsv {

	public static ArrayList<String[]> parseCSV(String fileName) {

		String line = "";
		String cvsSplitBy = ",";

		ArrayList<String[]> parsedFile = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				for (int i = 0; i < country.length; i++) {
					country[i] = country[i].replaceAll("\"", "");
				}
				parsedFile.add(country);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return parsedFile;

	}

	public static void main(String[] args) {
		ArrayList<String[]> tmp = parseCSV("sample/201/list.csv");

		for (String[] tmp2 : tmp) {
			System.out.println(tmp2[0] + " ; " + tmp2[1]);
		}
	}

}
