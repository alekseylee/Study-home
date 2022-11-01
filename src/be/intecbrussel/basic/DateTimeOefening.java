package be.intecbrussel.basic;

import java.time.*;
import java.time.temporal.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

        public class DateTimeOefening {
            public static void main(String[] args) {

        //oefening 1
//                Instant dateAndTime = Instant.now();
//                System.out.println(dateAndTime);
        //oefening 2
//                Instant epochDate = Instant.EPOCH;
//                System.out.println(epochDate);

        //oefening 3
//                OffsetDateTime offsetDateTime = OffsetDateTime.now();
//                System.out.println(offsetDateTime);

        //oefening 4

                LocalDate justTheDate = LocalDate.now();
                LocalTime justTheTime = LocalTime.now();
                LocalDateTime dateAndTheTimeNow = LocalDateTime.now();
                System.out.println(justTheDate);
                System.out.println(justTheTime);
                System.out.println(dateAndTheTimeNow);


    }
}
