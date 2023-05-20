package algorithmprobles.anagramdetection.costomizemessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CostomizeMessageMain {
    public static void main(String[] args) {
        // Given message
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. " +
                "Your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification. " +
                "Thank you BridgeLabz 01/01/2016.";

        // User's information
        String firstName = "Neetesh";
        String fullName = "Neetesh Golhani";
        String contactNumber = "91-944463636";

        // Replace <<name>> with first name
        message = message.replaceAll("<<name>>", firstName);

        // Replace <<full name>> with full name
        message = message.replaceAll("<<full name>>", fullName);

        // Replace contact number pattern (91-xxxxxxxxxx) with actual contact number
        Pattern contactPattern = Pattern.compile("91-xxxxxxxxxx");

        // Create a matcher object to find the contact number pattern in the message
        Matcher contactMatcher = contactPattern.matcher(message);

        // Check if the contact number pattern is found in the message
        if (contactMatcher.find()) {
            // Replace the found contact number pattern with the actual contact number
            message = message.replace(contactMatcher.group(), contactNumber);
        }

        // Define the date format to be used
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Format the current date using the defined format
        String currentDate = dateFormat.format(new Date());

        // Define the pattern for the date in the format XX/XX/XXXX
        Pattern datePattern = Pattern.compile("(0[1-9]|1[0-2])/([0-2][0-9]|3[0-1])/\\d{4}");

        // Create a matcher object to find the date pattern in the message
        Matcher dateMatcher = datePattern.matcher(message);

        // Check if the date pattern is found in the message
        if (dateMatcher.find()) {
            // Replace the found date pattern with the current date
        }
        message = message.replace(dateMatcher.group(), currentDate);

        // Print the customized message with the replaced values
        System.out.println(message);
    }
}

