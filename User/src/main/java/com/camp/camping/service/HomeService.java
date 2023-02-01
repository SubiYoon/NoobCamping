package com.camp.camping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camp.camping.DTO.HomeDTO;
import com.camp.camping.frame.MyService;
import com.camp.camping.mapper.HomeMapper;

@Service
public class HomeService implements MyService<Integer, HomeDTO> {

	@Autowired
	HomeMapper mapper;
	
	@Override
	public void insert(HomeDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void update(HomeDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public HomeDTO select(Integer companycode) throws Exception {
		return mapper.select(companycode);
	}

	@Override
	public List<HomeDTO> selectAll() throws Exception {
		return mapper.selectAll();
	}
	
	//지도좌표불러오기
	public HomeDTO lnglat(Integer companycode) throws Exception{
		return mapper.lnglat(companycode);
	}
	
	//홈컨텐트(소개)불러오기
		public HomeDTO homeCont(Integer companycode) throws Exception{
			return mapper.homeCont(companycode);
		}
	
	
}
