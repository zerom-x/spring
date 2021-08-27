package com.zero.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zero.domain.BoardVO;
import com.zero.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	//Spring 4.3 이상에서 자동처리
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList......");
		return mapper.getList();
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		log.info("get......" + bno);
		return mapper.read(bno) ;
	}

}
