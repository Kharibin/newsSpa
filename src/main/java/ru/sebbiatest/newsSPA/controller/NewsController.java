package ru.sebbiatest.newsSPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sebbiatest.newsSPA.service.NewsService;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/news")
public class NewsController {

    NewsService newsService;


    @RequestMapping(method = RequestMethod.GET)
    public Set<String> getCategories(){
        return newsService.getCategories();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Map<Long, String> getShortDescriptionsByCategory(@RequestParam String category){
        return newsService.getShortDescriptionsByCategory(category);
    }
/*
    @RequestMapping(method = RequestMethod.POST)
    public News showNews(@RequestParam Long id){
        return newsService.getNewsById(id);
    }*/


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
