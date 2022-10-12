package classwerk6;


import java.time.LocalTime;
import java.util.Scanner;

public class TijdsmetingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();
        System.out.println("Enter start-uur (in uren)");
        int startUur = scanner.nextInt();
        System.out.println("Enter start-uur (in minuten)");
        int startMinute = scanner.nextInt();

        System.out.println("Enter stop-uur (in uren)");
        int stoptUur = scanner.nextInt();
        System.out.println("Enter stop-uur (in minuten)");
        int stopMinute = scanner.nextInt();

        LocalTime time1 = LocalTime.of(startUur, startMinute);
        LocalTime time2 = LocalTime.of(23, 59);
        LocalTime time3 = LocalTime.of(0, 0);
        LocalTime time4 = LocalTime.of(stoptUur, stopMinute);

        long diff1 = time2.getHour() - time1.getHour();
        long diff2 = time2.getMinute() - time1.getMinute() + 1;
        long diff3 = time4.getHour() - time3.getHour();
        long diff4 = time4.getMinute() - time3.getMinute();
        System.out.println((diff1 + diff3) + " hours, " + (diff2 + diff4) + " minutes");

        diff1 *= 60;
        diff3 *= 60;
        int hours = (int) ((diff1 + diff2 + diff3 + diff4) / 60);
        int minutes = (int) ((diff1 + diff2 + diff3 + diff4) % 60);
        System.out.println(hours + " uren, " + minutes + " minuten");

        double salaryTotal = 0;
        double salaryMon = 0;
        double salaryTue = 0;
        double salaryWed = 0;
        double salaryThu = 0;
        double salaryFri = 0;
        double salarySat = 0;
        double salarySun = 0;

        for (int counter = 0; counter < counter + 1; counter++) {
            if (day != "stop") {
                switch (day) {
                        case "Monday":
                            System.out.println("You worked: " + hours);
                            salaryMon += hours * 11.5;
                            salaryTotal += salaryMon;
                            System.out.println("Your salary for Monday is: " + salaryMon);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Tuesday":
                            System.out.println("You worked: " + hours);
                            salaryTue += hours * 11.5;
                            System.out.println("Your salary for Tuesday is: " + salaryTue);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Wednesday":
                            System.out.println("You worked: " + hours);
                            salaryWed += hours * 11.5;
                            System.out.println("Your salary for Wednesday is: " + salaryWed);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Thursday":
                            System.out.println("You worked: " + hours);
                            salaryThu += hours * 11.5;
                            System.out.println("Your salary for Thursday is: " + salaryThu);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Friday":
                            System.out.println("You worked: " + hours);
                            salaryFri += hours * 11.5;
                            System.out.println("Your salary for Friday is: " + salaryFri);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Saturday":
                            System.out.println("You worked: " + hours);
                            salarySat += hours * 11.5;
                            System.out.println("Your salary for Saturday is: " + salarySat);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        case "Sunday":
                            System.out.println("You worked: " + hours);
                            salarySun += hours * 11.5;
                            System.out.println("Your salary for Sunday is: " + salarySun);
                            System.out.println("Enter day: ");
                            day = scanner.nextLine();
                            continue;
                        default:

                            System.out.println("Your total price is: " + salaryTotal);
                            System.out.println("You werked " + counter + " days");
                            System.exit(-1);
                            break;
                    }


                }
            }
        }
    }
