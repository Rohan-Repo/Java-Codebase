import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeEg {

    public static void main(String[] args) {
        ZonedDateTime currDateTime = ZonedDateTime.now();
        ZoneId zoneVanSF = ZoneId.of("Canada/Pacific");
        ZoneId zoneAtlantic = ZoneId.of("Canada/Atlantic");
        ZoneId zoneUAE = ZoneId.of( "Asia/Dubai" );
        ZoneId zoneIndia = ZoneId.of( "Asia/Kolkata" );
        ZoneId zoneNFLB = ZoneId.of( "Canada/Newfoundland" );

        ZonedDateTime timeVanSF = currDateTime.withZoneSameInstant( zoneVanSF );
        ZonedDateTime timeAtlantic = currDateTime.withZoneSameInstant( zoneAtlantic );
        ZonedDateTime timeUAE = currDateTime.withZoneSameInstant( zoneUAE );
        ZonedDateTime timeIndia = currDateTime.withZoneSameInstant( zoneIndia );
        ZonedDateTime timeNFLB = currDateTime.withZoneSameInstant( zoneNFLB );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MMM-dd HH:mm:ss z" );

        System.out.println( "\n -- Time Information -- " );
        System.out.println( "Time in Toronto/NewYork : " + currDateTime.format(formatter) );
        System.out.println( "Time in Vancouver/San-Francisco : " + timeVanSF.format(formatter) );
        System.out.println( "Time in Atlantic Canada : " + timeAtlantic.format(formatter) );
        System.out.println( "Time in Newfoundland and Labrador : " + timeNFLB.format(formatter) );
        System.out.println( "Time in Abu-Dhabi/Dubai : " + timeUAE.format(formatter) );
        System.out.println( "Time in India : " + timeIndia.format(formatter) );

        System.out.println( "\n -- Time Difference Information -- " );

        printZones(timeVanSF,currDateTime);
        printTimeDifference(LocalDateTime.from(timeVanSF),LocalDateTime.from(currDateTime));

        printZones(timeIndia,currDateTime);
        printTimeDifference(LocalDateTime.from(timeIndia),LocalDateTime.from(currDateTime));

        printZones(currDateTime,timeUAE);
        printTimeDifference(LocalDateTime.from(currDateTime),LocalDateTime.from(timeUAE));

        printZones(timeAtlantic,timeIndia);
        printTimeDifference(LocalDateTime.from(timeAtlantic),LocalDateTime.from(timeIndia));

        printZones(timeNFLB,timeAtlantic);
        printTimeDifference(LocalDateTime.from(timeNFLB),LocalDateTime.from(timeAtlantic));

        ZonedDateTime timeSeconds = currDateTime.minusSeconds( 30 );
        printZones(currDateTime,timeSeconds);
        printTimeDifference(LocalDateTime.from(currDateTime),LocalDateTime.from(timeSeconds));

        printZones(timeVanSF,timeIndia);
        printTimeDifference(LocalDateTime.from(timeVanSF),LocalDateTime.from(timeIndia));

    }
    private static void printZones(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {

        String zone1 = dateTime1.getZone().toString();
        String zone2 = dateTime2.getZone().toString();

        StringBuilder builder =  new StringBuilder();

        if( !zone1.equalsIgnoreCase(zone2) ) {
            builder.append( "Time Difference between : " );
            builder.append( zone1 );
            builder.append( " and " );
            builder.append( zone2 );
        } else {
            builder.append( "The Time Difference is : " );
        }

        System.out.println( builder );
    }

    private static void printTimeDifference(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        Period period = Period.between( LocalDate.from(dateTime1), LocalDate.from(dateTime2) );
        int cntDays = Math.abs( period.getDays() );
        if( cntDays >= 1 )
            System.out.print( "\t Days: " + cntDays );

        Duration duration = Duration.between( dateTime1, dateTime2 );

        int cntHours = Math.abs( duration.toHoursPart() );
        if( cntHours >= 1 )
            System.out.print( "\t Hours: " + cntHours );

        int cntMinutes = Math.abs( duration.toMinutesPart() );
        if( cntMinutes >= 1 )
            System.out.print( "\t Minutes: " + cntMinutes );

        long cntSeconds = Math.abs( duration.getSeconds() );
        if( cntSeconds >= 1 ) {
            if( cntSeconds > 60 )
                cntSeconds = (cntSeconds/1000) % 60;

            System.out.print( "\t Seconds: " + cntSeconds );
        }

        System.out.println( "\n" );
    }
}
