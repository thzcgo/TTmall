package com.thzc.ttmall.search.controller;

import com.thzc.ttmall.search.service.MallSearchService;
import com.thzc.ttmall.search.vo.SearchParam;
import com.thzc.ttmall.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    MallSearchService mallSearchService;

    @GetMapping("/list.html")
    public String listPage(SearchParam searchParam, Model model){

        SearchResult result = mallSearchService.search(searchParam);
        model.addAttribute("result",result);

        return "list";
    }

    @GetMapping({"/"})
    public String indexPage(Model model) {

        return "list";
    }
}
