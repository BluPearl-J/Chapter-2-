import java.util.Scanner;
public class Switcher2 {  
public static void main (String [] args){
String menu =  """
		1. phoneBook
               2. messages
               3. chat
               4. callRegister
               5. tones
               6. settings
               7. callDivert
               8. games
               9. calculator
               10. reminders
               11. clock
               12. profiles
               13 simservices 
	""";

String phoneBookMenu =         """
                               1.search phonebook
                               2.Service NOS
                               3.Addname
                               4.Erase
                               5.Edit
                               6.Assigntone
                               7. Send birthdaycard
                               8. Options
                               9. Speeddials
                               10. Voicetags
                       """;

System.out.println ("PROMPTING YOU ENTER ANY NUMBER 1 TO 13");

System.out.println (menu);

Scanner scanning = new Scanner (System.in);
int nokiaNumbers = scanning.nextInt();

switch (nokiaNumbers) {

case 1: System.out.println ("PHONEBOOK");

System.out.println ("PROMPTING YOU ENTER ANY PHONE BOOK NUMBER 1 TO 10 TO CHOOSE SERVICE");


System.out.println (phoneBookMenu);

int phoneBookMenuNumbers = scanning.nextInt();

switch (phoneBookMenuNumbers) {
                    case 1:
                        System.out.println("SEARCHPHONEBOOK");
                        break;
                    case 2:
                        System.out.println("SERVICENUMBERS of phoneBook");
                        break;
                    case 3:
                        System.out.println("ADDNAME to phoneBook");
                        break;
                    case 4:
                        System.out.println("ERASE your phoneBook");
                        break;
                     case 5:
                        System.out.println("EDIT ");
                        break;
                     case 6:
                        System.out.println("ASSIGNTONES");
                        break;
                     case 7:
                        System.out.println("SENDBIRTHDAYCARDS");
                        break;
                     case 8:
                        System.out.println("OPTIONS");

System.out.println ("PROMPTING YOU ENTER ANY OPTIONS FROM 1 TO 2 TO CHOOSE SERVICE");

String optionsMenu =         """
                               1.Type of view
                               2.memoryStatus
                       """;

System.out.println (optionsMenu);

int options = scanning.nextInt();

switch (options) {
  
            case 1:
                System.out.println("speeddials");;
                break;
            case 2:
                System.out.println("hohoho");;
                break;
                default:
                        System.out.println("SPEEDDIALS");;
        }
            break;
                     case 9:
                        System.out.println("OPTIONS");
                        break;
                    default:
                        System.out.println("PHONEBOOKERROR");
                }

break;
case 2:System.out.println("MESSAGES") ;
break;
case 3: System.out.println("CHAT");
break;
case 4: System.out.println("CALLREGISTER");
break;
case 5: System.out.println("TONES");
break;
case 6: System.out.println("SETTINGS");
break;
case 7: System.out.println("CALLDIVERT");
break;
case 8: System.out.println("GAMES");
break;
case 9: System.out.println("CALCULATOR");
break;
case 10: System.out.println("REMINDERS");
break;
case 11: System.out.println("CLOCK");
break;
case 12: System.out.println("PROFILES");
break;
case 13: System.out.println("SIMSERVICES");
break;
default: System.out.println("Error: invalid status");
 System.exit(1);
}
} 
}


