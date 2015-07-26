package selenium_training.applogic;

import java.util.List;

import selenium_training.model.Film;

public interface FilmHelper {

	void create(Film film);
	void delete(Film film);
	List<Film> search(String Title);

}
