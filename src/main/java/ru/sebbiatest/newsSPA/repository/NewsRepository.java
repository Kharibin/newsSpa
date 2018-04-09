package ru.sebbiatest.newsSPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sebbiatest.newsSPA.model.News;

import java.util.List;
import java.util.Set;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("select a.category from News a")
    Set<String> findCategories();

    List<News> findByCategory(String category);
}
