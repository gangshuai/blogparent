package com.mszl.blog.service;

import com.mszl.blog.vo.Result;
import com.mszl.blog.vo.params.PageParams;

public interface ArticleService {

    Result listArticle(PageParams pageParams);

    Result hotArticles(int limit);
}
