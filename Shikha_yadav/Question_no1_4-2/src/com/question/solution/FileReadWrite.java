package com.question.solution;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File infile=new File("input_numbers.txt");
		File outfile=new File("output_numbers.txt");
		FileReader fr=null;
		FileWriter fw=null;
		try{
			fr=new FileReader(infile);
			fw=new FileWriter(outfile);
			int a;
			while((a=fr.read())!=-1){
				fw.write(a);
			}
			
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			if(fr!=null){
				fr.close();
			}
			if(fw !=null){
				fw.close();
			}
		}

	}

}
