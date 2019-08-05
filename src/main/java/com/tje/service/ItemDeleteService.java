package com.tje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tje.model.DetailBoardItemView;
import com.tje.repo.DetailBoardItemViewDAO;

@Service
public class ItemDeleteService {

	@Autowired
	private DetailBoardItemViewDAO detailBoardItemViewDAO;

	public Object service(Object args) {
		Object result = null;

		result = detailBoardItemViewDAO.delete((DetailBoardItemView)args);

		return result;
	}
}
