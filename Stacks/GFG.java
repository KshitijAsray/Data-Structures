package Stacks;
import java.io.*;
import java.util.Scanner;
public class GFG {

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating two stream
		// one input and other output
		FileInputStream fis = null;
		FileOutputStream fos = null;

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Input File name");
		String inputfile = ob.nextLine();
		System.out.println("Enter the Output File name");
		ob.close();
		String outputfile = ob.nextLine();
		try {

			// Initializing both the streams with
			// respective file directory on local machine

			// Custom directory path on local machine
			fis = new FileInputStream(inputfile);

			// Custom directory path on local machine
			fos = new FileOutputStream(outputfile);

			int c;

			// Condition check
			// Reading the input file till there is input
			// present
			while ((c = fis.read()) != -1) {

				// Writing to output file of the specified
				// directory
				fos.write(c);
			}

			// By now writing to the file has ended, so

			// Display message on the console
			System.out.println(
				"copied the file successfully");
		}

		// Optional finally keyword but is good practice to
		// empty the occupied space is recommended whenever
		// closing files,connections,streams
		finally {

			// Closing the streams

			if (fis != null) {

				// Closing the fileInputStream
				fis.close();
			}
			if (fos != null) {

				// Closing the fileOutputStream
				fos.close();
			}
		}
	}
}

