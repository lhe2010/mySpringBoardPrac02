package com.spring.BoardPrac02.service;

import java.util.List;

import com.spring.BoardPrac02.dto.BoardDTO;

public interface BoardService {
	
	public List<BoardDTO> listAll() throws Exception;

}
