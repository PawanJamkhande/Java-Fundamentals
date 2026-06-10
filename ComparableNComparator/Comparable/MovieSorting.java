package ComparableNComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
    int id;
    String name;
    double rating;
    public Movie(int id, String name, double rating){
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
    public void disp(){
        System.out.println("Movie id: "+this.id+"/n Movie name: "+this.name+"/n Movie rating: "+this.rating);

    }
    public int compareTo(Movie o1,Movie o2) {

        return Double.compare(o1.rating, o2.rating);
    }   
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
    }
    @Override
    public int compareTo(Movie o) {

        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }   
}

public class MovieSorting{
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie(101,"The Shawshank Redemption",9.3));
        movies.add(new Movie(103,"The Dark Knight",9.0));
        movies.add(new Movie(104,"Pulp Fiction",8.9));
        movies.add(new Movie(102,"The Godfather",9.2));
        


        System.out.println("Before Sorting:");

        for(Movie m:movies) {
            System.out.println(m);
        }
        Collections.sort(movies, (Movie m1, Movie m2) -> Double.compare(m1.rating, m2.rating));
        System.out.println("After Sorting:");

        for(Movie m:movies) {
            System.out.println(m);
        }
    }
}