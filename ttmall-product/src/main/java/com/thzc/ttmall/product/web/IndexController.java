package com.thzc.ttmall.product.web;

import com.thzc.ttmall.product.entity.CategoryEntity;
import com.thzc.ttmall.product.service.CategoryService;
import com.thzc.ttmall.product.vo.Catelog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @GetMapping({"/","/index.html"})
    public String indexPage(Model model) {

        // 查出所有的1级分类
        List<CategoryEntity> categoryEntityList = categoryService.getLevel1Categorys();

        //视图解析器进行拼串
        // classpath:/templates/ + 返回值 + .html
        model.addAttribute("categorys",categoryEntityList);
        System.out.println(categoryEntityList);
        return "index";
    }


    @ResponseBody
    @GetMapping("index/catalog.json")
    public Map<String, List<Catelog2Vo>> getCatelogJsonFromDbWithLocaLock(){

        Map<String, List<Catelog2Vo>> catelogJson = categoryService.getCatelogJsonFromDbWithLocaLock();
        return catelogJson;
    }
}
