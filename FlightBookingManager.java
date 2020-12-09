package flightreservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlightBookingManager {
    String $fileLocation= "D:/FlightBookingDetails/ReservedFlights.txt";
    
    int countLines()throws IOException{
        int $lineCountStore=0;
        FileReader $readFile = new FileReader($fileLocation);
        BufferedReader $buffReadFile = new BufferedReader($readFile);
        String $singleLine;
        while (($singleLine=$buffReadFile.readLine())!=null){
            $lineCountStore++;
        }
        $buffReadFile.close();
        
        return $lineCountStore;
    }
    
    public ArrayList<String> loadDetails() throws IOException, FileNotFoundException{
        ArrayList<String> $loadedReservationDetails = new ArrayList<>();
        FileReader $readReservations = new FileReader($fileLocation);
        BufferedReader $buffReadReservations = new BufferedReader($readReservations);
        int $Lines = countLines(); 
      
        for(int $i=0; $i<$Lines;$i++){
          String $bindData =Integer.toString($i+1)+"#"+$buffReadReservations.readLine();
          String []$splitData = $bindData.split("#");
          String $finalReservationData = $splitData[0]+" "+$splitData[4]+$splitData[5]+" "+$splitData[6]+" "+$splitData[1]+" "+$splitData[3];
          $loadedReservationDetails.add($finalReservationData);
        }
        $buffReadReservations.close( ); 
        return $loadedReservationDetails;
}
    
    String $focusOnRow(int $getRow) throws IOException,FileNotFoundException{
        ArrayList<String> $focusOnDetails = new ArrayList<>();
        FileReader $readRow = new FileReader($fileLocation);
        BufferedReader $buffreadRow = new BufferedReader($readRow);
        int $Lines = countLines();
      
      //Following for loop is used to Organize the List of Requests from the user as in the Star-List Form and Split Details by "," char and Organize the Displaying Text in the List Box
      for(int $i=0; $i<$Lines;$i++){
          String $buildSentence =Integer.toString($i+1)+"#"+$buffreadRow.readLine();
          String []$splitInfo = $buildSentence.split("#");
          String $rebuildRequests = $splitInfo[9].replace(",", "\n * ");
          String $finalSentence = "Bookings: "+ $splitInfo[0]+"\nFlight :"+$splitInfo[1]+" | "+$splitInfo[2]+" | "+$splitInfo[3]+"\nPassenger :"+$splitInfo[4]+$splitInfo[5]+" "+$splitInfo[6]+"\nClass: "+$splitInfo[8]+"\nCC: "+$splitInfo[7]+"\nRequests: "+$rebuildRequests;
          $focusOnDetails.add($finalSentence);
      }
      $buffreadRow.close();
      String $finalSentenceToReturn = $focusOnDetails.get($getRow);
      return $finalSentenceToReturn;
    
    }
}
