package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {

    public static void movies(){
        Scanner scanner = new Scanner(System.in);
        boolean decision = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input input = new Input();

        while (decision) {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - view movies in the musical category");
            System.out.println("7 - Add a movie");


            int choice = input.getInt(0,7);

            switch (choice) {
                case (0):
                    boolean confirm = input.yesNo("Do you really want to quit? Yes or No");
                    if (confirm) {
                        System.out.println("Have a nice day....");
                        decision = false;
                    }else{
                        System.out.println("Restarting....");
                    }
                    break;
                case(1):
                    for (Movie movie : movieArray){
                        System.out.println(movie.getName() + " --- " + movie.getCategory());
                    }
                    break;
                case(2):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("animated")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(3):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("drama")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(4):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("horror")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(5):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("scifi")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(6):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("musical")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(7):
//                    String title = input.getString("Input movie title: ");
//                    String genre = input.getString("Input movie genre: ").toLowerCase();
//
//                    Movie add = new Movie(title, genre);
//                    movieArray = addMovie(movieArray, add);
//
//
//
//                    for(Movie movie : movieArray){
//                        System.out.println(movie.getName() + " --- " + movie.getCategory());
//                    }
//                    break;
                    movieArray = addMovie(movieArray, scanner);
                default:
                    System.out.println("Please Wait..");
                    break;
            }
        }
    }

    private static Movie[] addMovie(Movie[] movieArray, Scanner scanner){
//        movies = Arrays.copyOf(movies, movies.length + 1);
//        movies[movies.length - 1] = movie;
//        return movies;
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.println("Enter movie category: ");
        String category = scanner.nextLine();

        Movie newMovie = new Movie(title, category);
        Movie[] newList = null;
        int length = 0;
        if(movieArray != null){
            length = movieArray.length;
            newList = Arrays.copyOf(movieArray, length +1);
        }else{
            newList = new Movie[1];
        }
        newList[length] = newMovie;


        return newList;
    }

    public static void main(String[] args){
        movies();
    }

}
