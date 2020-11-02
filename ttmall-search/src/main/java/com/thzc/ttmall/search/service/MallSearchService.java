package com.thzc.ttmall.search.service;

import com.thzc.ttmall.search.vo.SearchParam;
import com.thzc.ttmall.search.vo.SearchResult;

public interface MallSearchService {

    SearchResult search(SearchParam searchParam);
}
