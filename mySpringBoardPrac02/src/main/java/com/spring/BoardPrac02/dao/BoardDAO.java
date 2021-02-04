package com.spring.BoardPrac02.dao;

import java.util.List;

import com.spring.BoardPrac02.dto.BoardDTO;

public interface BoardDAO {
	
	public List<BoardDTO> getAllBoard() throws Exception;

}
