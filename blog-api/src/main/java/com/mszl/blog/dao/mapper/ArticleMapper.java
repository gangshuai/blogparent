package com.mszl.blog.dao.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszl.blog.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {


//    List<Archives> listArchives();


//    IPage<Article> listArticle(Page<Article> page,
//                               Long categoryId,
//                               Long tagId,
//                               String year,
//                               String month);
}
