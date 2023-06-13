package project_02;

import java.util.Scanner;

public class MusicBox {

    public static void main(String[] args) {

        /*
        create an app that will provide songs based on genres,
         genres are = Classical, Pop, Country
         Under each genre we have 3 songs for each genre
         Classical songs = 'Four Season', 'Fur Elise', 'Finlandia', 'Vocalize', 'The Planet '
         Pop songs = 'Bad Guy', 'Talk', 'Please me', '7 Rings', 'Without me'
         Country songs = 'Meant to be', 'Heaven', 'Simple', 'One Number Away', 'Get Along'

         Application should have exit option available in the beginning
         Application should not throw any exception, meaning no error message in the console.
         If user enters wrong song or wrong genre, app should give proper instruction to correct their way with proper message.
         If the payment is equal to price message should be given and application should ask to listen more songs?
         If payment is less, then user should be notified with proper message and should not play the music
         If the payment is more than the price, the app should give a message with change and music plays


         Prices:
         Pop = $4
         Classic = $2
         Country = $3



         */

        System.out.println("Hello, this is music box application");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the music type or Type exit to quit : ");
        System.out.println("Available music type are Classical , Pop , and Country.");

        do {
            String musicType = scanner.nextLine();

            if (musicType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Application. Bye Bye");
                break;
            }

            switch (musicType.toLowerCase()) {

                case "classical":
                    System.out.println("Available songs in classical music: ");
                    System.out.println("Four Season , Fur Elise , Finlandia , Vocolize , The Planets ");
                    break;

                case "pop":
                    System.out.println("Available songs in POP music:");
                    System.out.println("Bad Guy , Talk , Please Me, 7 Rings, Without Me");
                    break;
                case "country":
                    System.out.println("Available songs in Country music:");
                    System.out.println("Meant To Be, Heaven, Simple, One Number Away, Get Along");
                    break;
                default:
                    System.out.println(musicType + " music category is not available.");
                    continue; // break to switch - continue belongs to loop
            }

            System.out.println(" Which one do you want to listen? ");
            String chosenSong = scanner.nextLine();

            switch (musicType.toLowerCase()) {
                case "classical":
                    switch (chosenSong.toLowerCase()) {
                        case "four season":
                        case "fur elise":
                        case "finlandia":
                        case "vocolize":
                        case "the planets":
                            System.out.println("Please enter 2$ for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue; // break
                    }
                    break;

                case "pop":
                    switch (chosenSong.toLowerCase()) {
                        case "bad guy":
                        case "talk":
                        case "please me":
                        case "7 rings":
                        case "without me":
                            System.out.println("Please enter 4$ for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue;
                    }
                    break;


                case "country":
                    switch (chosenSong.toLowerCase()) {
                        case "meant to be":
                        case "heaven":
                        case "simple":
                        case "one number away":
                        case "get along":
                            System.out.println("Please enter 3$ for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue;
                    }
                    break;
            }

            int songPrice = scanner.nextInt();
            int expectedPrice;
            switch (musicType.toLowerCase()) {
                case "classical":
                    expectedPrice = 2;
                    break;
                case "pop":
                    expectedPrice = 4;
                    break;
                case "country":
                    expectedPrice = 3;
                    break;

                default:
                    continue;
            }



            if (songPrice < expectedPrice) {
                System.out.println("Enter price is not enough, please try it later");
            } else if (songPrice == expectedPrice) {
                System.out.println(chosenSong + " is playing. Enjoy the song!");
            } else {
                int change = songPrice - expectedPrice;
                System.out.println("You have entered $ " + change + " more. Please wait for change.");
                System.out.println(chosenSong + " is playing. Enjoy the song!");
            }

            scanner.nextLine();

        } while (true);
        scanner.close();
    }
}
