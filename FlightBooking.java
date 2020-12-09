package flightreservation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FlightBooking {
    public void addNew(String $flight,String $title,String $fName,String $lName,String $cc,String $catchClass,String $spReq)throws IOException{
      String $fileLocation = "D:/FlightBookingDetails/ReservedFlights.txt";
      
      String $buildSentence = $flight+"#"+$title+"#"+$fName+"#"+$lName+"#"+$cc+"#"+$catchClass+"#"+$spReq;
      FileWriter $fLogger = new FileWriter($fileLocation,true);
      PrintWriter $pwLogger = new PrintWriter($fLogger); 
      $pwLogger.printf( "%s" + "%n" , $buildSentence); 
      $pwLogger.close();
    }
}
