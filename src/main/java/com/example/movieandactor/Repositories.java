package com.example.movieandactor;

import org.springframework.data.repository.CrudRepository;

public class Repositories {
    public static class ActorRepository {
    }

    public static interface MovieRepository extends CrudRepository<Movie, Long> {
        Iterable<Movie> findAllByCastIsIn(Iterable<Actor> actors);
    }
}
