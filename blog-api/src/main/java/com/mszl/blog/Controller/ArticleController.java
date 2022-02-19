package com.mszl.blog.Controller;

import com.mszl.blog.service.ArticleService;
import com.mszl.blog.vo.Result;
import com.mszl.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping
    public Result listArticles(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }
    @PostMapping("hot")
    public Result hot(){
        int limit = 5;
        int a = 8;
        return articleService.hotArticles(limit);

    }

}

