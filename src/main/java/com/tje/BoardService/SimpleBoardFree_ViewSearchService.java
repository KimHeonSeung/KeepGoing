package com.tje.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tje.repo.*;
import com.tje.page.*;
import java.util.*;

@Service
public class SimpleBoardFree_ViewSearchService {
	@Autowired
	private SimpleBoardFreeViewDAO simpleBoardFreeViewDAO;
	
	public Object service(int search_Type, int category_Num, String keyword, Criteria criteria) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		if(search_Type == 1) {
			// 전체에서 검색 서비스
			if(category_Num == 1) {
				result.put("list", simpleBoardFreeViewDAO.searchReviewAll(category_Num, keyword, criteria.getPageStart(), criteria.getPerPageNum()));
				result.put("count", simpleBoardFreeViewDAO.searchReviewAllCount(category_Num, keyword));
			} else {
				
			}
		} else if(search_Type == 2) {
			// 제목 검색 서비스
			result.put("list", simpleBoardFreeViewDAO.searchReviewTitle(category_Num, keyword, criteria.getPageStart(), criteria.getPerPageNum()));
			result.put("count", simpleBoardFreeViewDAO.searchReviewTitleCount(category_Num, keyword));
		} else if(search_Type == 3) {
			// 내용 검색 서비스
			result.put("list", simpleBoardFreeViewDAO.searchReviewContent(category_Num, keyword, criteria.getPageStart(), criteria.getPerPageNum()));
			result.put("count", simpleBoardFreeViewDAO.searchReviewContentCount(category_Num, keyword));
			//;
		} else if(search_Type == 4) {
			// 제목+내용 검색 서비스
			result.put("list", simpleBoardFreeViewDAO.searchReviewTitleAndContent(category_Num, keyword, criteria.getPageStart(), criteria.getPerPageNum()));
			result.put("count", simpleBoardFreeViewDAO.searchReviewTitleAndContentCount(category_Num, keyword));
		} else if(search_Type == 5) {
			// 글쓴이 검색 서비스
			result.put("list", simpleBoardFreeViewDAO.searchReviewWriter(category_Num, keyword, criteria.getPageStart(), criteria.getPerPageNum()));
			result.put("count", simpleBoardFreeViewDAO.searchReviewWriterCount(category_Num, keyword));
		}
		return result;
	}
}
