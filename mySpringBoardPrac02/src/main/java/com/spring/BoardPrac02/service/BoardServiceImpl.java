package com.spring.BoardPrac02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.BoardPrac02.dao.BoardDAO;
import com.spring.BoardPrac02.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	public BoardDAO dao; 

	@Override
	public List<BoardDTO> listAll() throws Exception {
		return dao.getAllBoard();
	}

}
