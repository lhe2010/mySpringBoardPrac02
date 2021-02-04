package com.spring.BoardPrac02.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.BoardPrac02.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;

	@Override
	public List<BoardDTO> getAllBoard() throws Exception {
		return session.selectList("com.spring.mapper.BoardMapper.getAllBoard");
	}

}
