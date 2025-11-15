package JavaCheck;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileandBufferWritter {
    public static void main(String[] args) {
        FileWriter fw = null;   // declare outside try

        try {
            fw = new FileWriter("output.txt",true); 
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Welcome and ");
            bw.newLine();
            bw.write("Hi Soldiers");
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        finally {
            try {
                if(fw != null) {
                    fw.close();       // safe close
                }
            } catch (Exception e) {
                System.out.println("Error closing file");
            }
        }
        try {
        	FileReader fr = new FileReader("output.txt");
        	BufferedReader br = new BufferedReader(fr);
        	String line = br.readLine();
        	while(line != null) {
        		System.out.println(line);
        		line = br.readLine();
        	}
        	
        }
        catch (Exception e) {
        	
        }
        
    }
}
