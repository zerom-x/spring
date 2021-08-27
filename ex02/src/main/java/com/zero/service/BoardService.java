package com.zero.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zero.domain.BoardVO;

import lombok.extern.log4j.Log4j;


public interface BoardService {
	
	public List<BoardVO> getList();
	
	public BoardVO get(Long bno);
	

}
