package com.tje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tje.page.Criteria;
import com.tje.repo.*;

@Service
public class SimpleBoardReviewWeightListCountCriteriaService {
	@Autowired
	private SimpleBoardReviewViewDAO simpleBoardReviewViewDAO;
	
	public Object service() {
		Object result=null;
		result=simpleBoardReviewViewDAO.weightlistCountCriteria();
		return result;
	}
}
