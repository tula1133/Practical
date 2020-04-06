

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilesExperiment {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File file = new File("C:\\Users\\tula\\OneDrive\\List.txt"); 
  int i=3;
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  ArrayList<String> aList = new ArrayList<>();
  String st; 
  st = br.readLine();
  while (st!= null) 
  {
      if((i%2)==1) 
      {
         aList.add(st); 
      }
  st=br.readLine();
  i=i+1;
  }
  System.out.println(aList);
    } 
}
    
