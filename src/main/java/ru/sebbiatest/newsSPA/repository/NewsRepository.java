package ru.sebbiatest.newsSPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sebbiatest.newsSPA.model.News;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public interface NewsRepository  extends JpaRepository<News, Long> {

/*
    List<String> findCategories();*/

    @Query("select a.category from News a")
    Set<String> findCategories();


    @Query("select a.ID, a.shortDescription from News a where a.category = :category")
    Map<Long, String> findShortDescriptionsByCategory(@Param("category")String category);
}
