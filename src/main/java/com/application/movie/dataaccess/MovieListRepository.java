package com.application.movie.dataaccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.application.movie.model.Movie;

@Repository
public interface MovieListRepository extends JpaRepository<Movie, Long> {
    List<Movie> findMoviesByActor(String actor);
}
