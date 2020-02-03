import java.util.Random;

public class ServerNameGenerator {




    public static void main(String[] args){

//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.

//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//                Create a method that will return a random element from an array of strings.
//                Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.



//      Example Output:

//            Here is your server name: dedicated-photon


        String[] adj = {"fast","slow","jumping","running","aggressive","faithful","silly","calm","furious","eager"};
        String[] noun = {"sam","steve","sarah","mountain","ball","cat","car","football","austin","chair"};


//        Random a = new Random();
//        Random n = new Random();
//
//        String randomAdjective = a.nextInt(adj.length);
//        String randomNoun = n.nextInt(noun.length);

        System.out.println("Here is your server name: " + getRandom(adj) + "-" + getRandom(noun));

    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }


}
