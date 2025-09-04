package assigm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter your first name: ");
	            String firstName = sc.nextLine();
	            System.out.print("Enter your last name: ");
	            String lastName = sc.nextLine();
	            System.out.print("Enter file name: ");
	            String fileName = sc.nextLine();

	            String fullName = firstName + " " + lastName;

	            FileWriter fw = new FileWriter(fileName, true);
	            fw.write(fullName + "\n");
	            fw.close();

	            System.out.println("File content:");
	            BufferedReader br = new BufferedReader(new FileReader(fileName));
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}



