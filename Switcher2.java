
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
                System.out.println("typeOfView");
                break;
            case 2:
                System.out.println("memoryStatus");
                break;
                default:
                        System.out.println(" LISTOFMENUFUNCTIONS");
        }
            break;
                     case 9:
                        System.out.println("SPEEDDIALS");
                        break;
                    case 10:
                        System.out.println("VOICETAGS");
                        break;
                    default:
                        System.out.println("PHONEBOOKERROR");
                }

break;
case 2:System.out.println("MESSAGES") ;

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 10 TO CHOOSE MESSAGE SERVICES");

String messageMenu =         """
                               1.write messages
                               2.inbox
                               3. outbox
                               4. pictureMessages
                               5.templates
                               6.smileys
                               7. messageSettings
                               8.Info service
                               9.voiceMailboxNumber
                               10.serviceCommandEditor
                       """;

System.out.println (messageMenu);

int messages = scanning.nextInt();


switch (messages) {
  
            case 1:
                System.out.println("writeMessages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("outbox");
                break;
            case 4:
                System.out.println("pictureMessages");
                break;
            case 5:
                System.out.println("Templates");
                break;
             case 6:
                System.out.println("smileys");
                break;
             case 7:
                System.out.println("messageSettings");
                break;
             case 8:
                System.out.println("InfoService");
                break;
             case 9:
                System.out.println("voiceMailboxNumber");
                break;
            case 10:
                System.out.println("serviceCommandEditor");
                break;
                default:
                        System.out.println(" LISTOFMessageFUNCTIONS");
        }
break;
case 3: System.out.println("CHAT");
break;
case 4: System.out.println("CALLREGISTER");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 8 TO SELECT CALL REGISTER SERVICES");

String callRegisterMenu =         """
                               1.missedCalls
                               2.receivedCalls
                               3.dialledNumbers
                               4.eraseRecentCallLists
                               5.showCallDuration
                               6.showCallCosts
                               7.callCostSettings
                               8.prepaidCredit
                              
                       """;

System.out.println (callRegisterMenu);

int callRegister = scanning.nextInt();


switch (callRegister) {
  
            case 1:
                System.out.println("missedCalls");
                break;
            case 2:
                System.out.println("receivedCalls");
                break;
            case 3:
                System.out.println("dialledNumbers");
                break;
            case 4:
                System.out.println("eraseRecentCallLists");
                break;
            case 5:
                System.out.println("showCallDuration");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 5 TO CHOOSE CALL DURATION OPTIONS");

String callDurationMenu =         """
                               1.lastCallDuration
                               2.allCallsDuration
                               3.receivedCallsDuration
                               4.dialledCallsDuration
                               5.clearTimers
                       """;

System.out.println (callDurationMenu);

int callDuration = scanning.nextInt();


switch (callDuration) {
  
            case 1:
                System.out.println("lastCallDuration");
                break;
            case 2:
                System.out.println("allCallsDuration");
                break;
            case 3:
                System.out.println("receivedCallsDuration");
                break;
            case 4:
                System.out.println("dialledCallsDuration");
                break;
            case 5:
                System.out.println("clearTimes");
                break;
                default:
                        System.out.println(" callDurationError");
        }

                break;
             case 6:
                System.out.println("showCallCosts");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 3 TO CHOOSE CALL COSTS OPTIONS");

String callCostsMenu =         """
                               1.lastCallCost
                               2.allCallsCost
                               3.clearCounters
                       """;

System.out.println (callCostsMenu);

int callCost = scanning.nextInt();


switch (callCost) {
  
            case 1:
                System.out.println("lastCallCost");
                break;
            case 2:
                System.out.println("allCallsCost");
                break;
            case 3:
                System.out.println("clearCounters");
                break;
            
                default:
                        System.out.println(" callcostsError");
        }

break;
             case 7:
                System.out.println("callCostSettings");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 2 TO CHOOSE CALL COST SETTINGS");

String callCostSettingsMenu =         """
                               1.callCostLimit
                               2.showCostsin
                               """;

System.out.println (callCostSettingsMenu);

int callCostSettings = scanning.nextInt();


switch (callCostSettings) {
  
            case 1:
                System.out.println("callCostLimit");
                break;
            case 2:
                System.out.println("showCostsin");
                break;
                default:
                        System.out.println(" callCostSettingsError");
        }

                break;
             case 8:
                System.out.println("prepaidCredit");

                break;

                default:
                        System.out.println("callRegisterError");
        }
break;
case 5: System.out.println("TONES");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 9 TO SELECT TONE SETTINGS");

String tonesMenu =         """
                               1.ringingTone
                               2.ringingVolume
                               3.incomingCallAlert
                               4. composer
                               5. messageAlertTone
                               6. keypadTones
                               7. warningAndGameTones
                               8. vibratingAlert
                               9. screenSaver

                               """;

System.out.println (tonesMenu);

int tones = scanning.nextInt();


switch (tones) {
  
            case 1:
                System.out.println("ringingTone");
                break;
            case 2:
                System.out.println("ringingVolume");
                break;
            case 3:
                System.out.println("incomingCallAlert");
                break;
            case 4:
                System.out.println("composer");
                break;
            case 5:
                System.out.println("messageAlertTone");
                break;
           case 6:
                System.out.println("keypadTones");
                break;
           case 7:
                System.out.println("warningAndGameTones");
                break;
           case 8:
                System.out.println("vibratingAlert");
                break;
           case 9:
                System.out.println("screenSaver");
                break;
      default:
                        System.out.println(" tonesSettingsError");
        }
break;
case 6: System.out.println("SETTINGS");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 4 TO CHOOSE PREFERRABLE SETTINGS");

String settingsMenu =         """
                               1.callSettings
                               2.phoneSettings
                               3.securitySettings
                               4.restoreFactorySettings
                       """;

System.out.println (settingsMenu);

int settings = scanning.nextInt();


switch (settings) {
  
            case 1:
                System.out.println("callSettings");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 4 TO CHOOSE PREFERRABLE CALLSETTINGS");

String callSettingsMenu =         """
                               1.choseCallSettings
                               2.automaticRedial
                               3.speedDialing
                               4.callWaitingOptions
                               5.ownNumberSending
                               6.phoneLineinUse
                               7.automaticAnswer
                       """;

System.out.println (callSettingsMenu);

int callSettings = scanning.nextInt();


switch (callSettings) {
  
            case 1:
                System.out.println("callSettings");
                break;
            case 2:
                System.out.println("automaticRedial");
                break;
            case 3:
                System.out.println("speedDialing");
                break;
            case 4:
                System.out.println("callWaitingOptions");
                break;
            case 5:
                System.out.println("ownNumberSending");
                break;
            case 6:
                System.out.println("phoneLineInUse");
                break;
             case 7:
                System.out.println("automaticAnswer");
                break;
            
                default:
                        System.out.println(" LISTOFsettingsFUNCTIONS");
        }
                break;
            case 2:
                System.out.println("phoneSettings");

System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 6 TO SELECT PREFERRABLE PHONE SETTINGS");

String phoneSettingsMenu =         """
                               1.language
                               2.cellInfoDisplay
                               3.welcomeNote
                               4.networkSelection
                               5.lights
                               6.confirmSimServiceSelection
                       """;

System.out.println (phoneSettingsMenu);

int phoneSettings = scanning.nextInt();


switch (phoneSettings) {
  
            case 1:
                System.out.println("language");
                break;
            case 2:
                System.out.println("cellInfoDisplay");
                break;
            case 3:
                System.out.println("welcomeNote");
                break;
            case 4:
                System.out.println("networkSelection");
                break;
            case 5:
                System.out.println("lights2");
                break;
            case 6:
                System.out.println("confirmSimServiceSelection");
                break;
                default:
                        System.out.println(" phoneSettingsMenuError");
        }
  break;
            case 3:
                System.out.println("securitySettings");
               
System.out.println ("PROMPTING YOU TYPE ANY NUMBER FROM 1 TO 6 TO SELECT PREFERRABLE SECURITY SETTINGS");

String securitySettingsMenu =    """
                               1.pinCodeRequest
                               2.callBarringService
                               3.fixedDialing
                               4.closedUserGroup
                               5.phoneSecurity
                               6.changeAccessCodes

                                  """;

System.out.println (securitySettingsMenu);

int securitySettings = scanning.nextInt();

switch (securitySettings) {
  
            case 1:
                System.out.println("PINcodeRequest");
                break;
            case 2:
                System.out.println("callBarringService");
                break;
            case 3:
                System.out.println("fixedDialling");
                break;
            case 4:
                System.out.println("closedUserGroup");
                break;
            case 5:
                System.out.println("phoneSecurity");
                break;
            case 6:
                System.out.println("changeAccessCodes");
                break;

            default:
                        System.out.println(" securitySettingsMenuError");
        }

        break;

  case 4:
                System.out.println("restoreFactorySettings");
                break;
            
                default:
                        System.out.println(" LISTOFMessageFUNCTIONS");
        }
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
System.out.println ("PROMPTING YOU ENTER ANY NUMBER FROM 1 TO 6 TO SET CLOCK");

String clockMenu =         """
                               1.alarmClock
                               2.clockSettings
                               3.dateSettings
                               4.stopWatch
                               5.countdownTimers
                               6.autoUpdateofDateandTime
                       """;

System.out.println (clockMenu);

int clock = scanning.nextInt();


switch (clock) {
  
            case 1:
                System.out.println("alarmClock");
                break;
            case 2:
                System.out.println("clockSettings");
                break;
            case 3:
                System.out.println("dateSettings");
                break;
            case 4:
                System.out.println("stopWatch");
                break;
            case 5:
                System.out.println("countdownTimer");
             case 6:
                System.out.println("autoUpdateOfDateAndTime");
                break;
                default:
                        System.out.println(" clockError");
        }
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



