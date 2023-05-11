import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class MapsAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(new File("covid317.csv"));
			int count = 0;
			s.nextLine(); //skips the column headers!
			
			HashMap<String, Integer> states = new HashMap<String, Integer>();
			
			while(s.hasNextLine()) {
				System.out.println(s);
			}
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Animate {
    public static void main(String[] args) throws InterruptedException {
        String[] frames = {
                "   _____            _       _        ",
                "  / ____|          (_)     | |       ",
                " | |     ___  _ __  _ _ __ | |_ ___  ",
                " | |    / _ \\| '_ \\| | '_ \\| __/ _ \\ ",
                " | |___| (_) | | | | | |_) | || (_) |",
                "  \\_____\\___/|_| |_|_| .__/ \\__\\___/ ",
                "                     | |             ",
                "                     |_|             ",
                "",
                "",
                "We're no strangers to love",
                "You know the rules and so do I",
                "A full commitment's what I'm thinking of",
                "You wouldn't get this from any other guy",
                "",
                "I just wanna tell you how I'm feeling",
                "Gotta make you understand",
                "",
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "",
                "We've known each other for so long",
                "Your heart's been aching but",
                "You're too shy to say it",
                "Inside we both know what's been going on",
                "We know the game and we're gonna play it",
                "",
                "And if you ask me how I'm feeling",
                "Don't tell me you're too blind to see",
                "",
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "",
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "",
                "Give you up, give you up",
                "Never gonna give you up",
                "Give you up, give you up",
                "Never gonna give you up",
                "",
                "We've known each other for so long",
                "Your heart's been aching but",
                "You're too shy to say it",
                "Inside we both know what's been going on",
                "We know the game and we're gonna play it",
                "",
                "I just wanna tell you how I'm feeling",
                "Gotta make you understand",
                "",
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "",
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "",
                "Give you up, give you up",
                "Never gonna give you up",
                "Give you up, give you up",
                "Never gonna give you up",
        };
        
        int frameDelay = 200; // milliseconds between frames
    }
    
    static String[] frames = {
            "   _____            _       _        ",
            "  / ____|          (_)     | |       ",
            " | |     ___  _ __  _ _ __ | |_ ___  ",
            " | |    / _ \\| '_ \\| | '_ \\| __/ _ \\ ",
            " | |___| (_) | | | | | |_) | || (_) |",
            "  \\_____\\___/|_| |_|_| .__/ \\__\\___/ ",
            "                     | |             ",
            "                     |_|             ",
            "",
            "",
            "We're no strangers to love",
            "You know the rules and so do I",
            "A full commitment's what I'm thinking of",
            "You wouldn't get this from any other guy",
            "",
            "I just wanna tell you how I'm feeling",
            "Gotta make you understand",
            "",
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "",
            "We've known each other for so long",
            "Your heart's been aching but",
            "You're too shy to say it",
            "Inside we both know what's been going on",
            "We know the game and we're gonna play it",
            "",
            "And if you ask me how I'm feeling",
            "Don't tell me you're too blind to see",
            "",
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "",
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "",
            "Give you up, give you up",
            "Never gonna give you up",
            "Give you up, give you up",
            "Never gonna give you up",
            "",
            "We've known each other for so long",
            "Your heart's been aching but",
            "You're too shy to say it",
            "Inside we both know what's been going on",
            "We know the game and we're gonna play it",
            "",
            "I just wanna tell you how I'm feeling",
            "Gotta make you understand",
            "",
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "",
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "",
            "Give you up, give you up",
            "Never gonna give you up",
            "Give you up, give you up",
            "Never gonna give you up",
    };
    
}
