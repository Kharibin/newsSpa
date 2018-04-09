package ru.sebbiatest.newsSPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sebbiatest.newsSPA.model.News;
import ru.sebbiatest.newsSPA.repository.NewsRepository;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NewsService {

    private NewsRepository newsRepository;

    public Set<String> getCategories() {
        return newsRepository.findCategories();
    }

    public Map<Long, String> getShortDescriptionsByCategory(String category) {
        return newsRepository.findByCategory(category).stream()
                .collect(Collectors.toMap(News::getID, News::getShortDescription));
    }

    public News getNewsById(Long id) {
        Optional<News> newsOpt = newsRepository.findById(id);
        //Think what to do if cant get current news obj
        return newsOpt.orElse(new News(0l, "ERROR", "Cant get currents news", ""));
    }

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Autowired
    public NewsRepository getNewsRepository() {
        return newsRepository;
    }

    @Autowired
    public void setNewsRepository(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
}
