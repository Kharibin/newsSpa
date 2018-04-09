package ru.sebbiatest.newsSPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sebbiatest.newsSPA.model.News;
import ru.sebbiatest.newsSPA.service.NewsService;

import java.util.Map;
import java.util.Set;

@RestController
public class NewsController {

    private NewsService newsService;


    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public Set<String> getCategories() {
        return newsService.getCategories();
    }

    @RequestMapping(value = "/getNewsByCategory", method = RequestMethod.GET)
    public Map<Long, String> getShortDescriptionsByCategory(@RequestParam("category") String category) {
        return newsService.getShortDescriptionsByCategory(category);
    }

    @RequestMapping(value = "/getArticle", method = RequestMethod.GET)
    public News showNews(@RequestParam("id") Long id) {
        return newsService.getNewsById(id);
    }


    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    public NewsService getNewsService() {
        return newsService;
    }

    @Autowired
    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }
}
