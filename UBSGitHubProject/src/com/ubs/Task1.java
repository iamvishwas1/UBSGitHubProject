package com.ubs;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("src/input.txt"));
		FileWriter fw = new FileWriter("src/output.txt");
		while (scanner.hasNextLine()) {

			// System.out.println(scanner.nextLine());
			String str = scanner.nextLine();
			if (str.equals("="))
				break;
			if (Pattern.compile("[-+*/0-9]").matcher(str).find()) {
				//System.out.println("Valid : " + str);
				String[] strArr = str.split(" ");
				int firstNum = Integer.valueOf(strArr[0]);
				int secondNum = Integer.valueOf(strArr[2]);
				char operand = strArr[1].charAt(0);
				switch (operand) {
				case '+':fw.write(str+" = ");
					fw.write(firstNum + secondNum + "\n");
					break;
				case '-':fw.write(str+" = ");
					fw.write(firstNum - secondNum + "\n");
					break;
				case '*':fw.write(str+" = ");
					fw.write(firstNum * secondNum + "\n");
					break;
				case '/':fw.write(str+" = ");
					fw.write(firstNum / secondNum + "\n");
					break;
				// ...
				}

			} else {
				//System.out.println("Error : " + str);
				fw.write("Error \n");
			}

		}

		fw.close();
	}

}
