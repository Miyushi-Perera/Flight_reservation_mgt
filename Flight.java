package flightreservation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Flight {
    private String fileLocation="";
    
    public ArrayList<String> searchAndLoad(String $Dep,String $Des,String $Dat) throws IOException {
      fileLocation= "D:/FlightBookingDetails/ListofFlights.txt";
      
      String searchFor = $Dep+">>"+$Des+"#"+$Dat;
      
      FileReader $fReader = new FileReader(fileLocation);
      BufferedReader $bReader = new BufferedReader($fReader);
      int $Lines = countLines();
      ArrayList<String> $found = new ArrayList<>();
      
      for(int i=0; i<$Lines;i++){
          String line = $bReader.readLine();
          int $isPresent = line.indexOf(searchFor);
          if ($isPresent>-1){
              $found.add(line);
          }
      }
      $bReader.close( ); 
      return $found;
}

int countLines()throws IOException{
    int $lines=0;
    FileReader $fLines = new FileReader(fileLocation);
    BufferedReader $bLines = new BufferedReader($fLines);
    String $thisLine;
    
    while (($thisLine=$bLines.readLine())!=null){
        $lines++;
    }
    $bLines.close();
    return $lines;
}
    
    
}
