package com.hq.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hq.dao.GoodsDAO;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsDAO goodsDAO;
	
	@Override
	public List list(Map map) {
		// TODO Auto-generated method stub
		return goodsDAO.list(map);
	}

}
