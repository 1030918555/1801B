package com.hq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hq.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("/list")
	public String list(Model model,@RequestParam(value="cpage",defaultValue="1")Integer cpage,String mohu1) {
		Map map=new HashMap();
		map.put("mohu1", mohu1);
		
		PageHelper.startPage(cpage,3);
		List list=goodsService.list(map);
		PageInfo pi=new PageInfo(list);
		
		model.addAttribute("list",list);
		model.addAttribute("pi",pi);
		model.addAttribute("map",map);
		return "list";
	}
	
	@RequestMapping("/toadd")
	public String toadd() {
		return "add";
	}
	
}
