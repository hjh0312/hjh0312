package com.f4.main.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f4.main.dto.SangkwonDTO;

@Service
public class SangkwonMapper {
   
   @Autowired
   private SqlSession sqlSession;

	public List<SangkwonDTO> search(Map<String, String> params) {		
		List<SangkwonDTO> list = sqlSession.selectList("search", params); 
		
		return list;
	}
	
	public List<SangkwonDTO> search1(String tablename, String storeName) {	
		 Map<String, String> params = new HashMap<>();
		 params.put("tablename", tablename);
		 params.put("storeName", storeName);
		 List<SangkwonDTO> list = sqlSession.selectList("search1", params); 

		return list;
	}
	
	public int countByValueT(String tablename, String storeAddress, String storeName) {
	    Map<String, String> params = new HashMap<>();
	    params.put("tablename", tablename);
	    params.put("storeAddress", storeAddress);
	    params.put("storeName", storeName);

	    int count = sqlSession.selectOne("countByValueT", params);
	    return count;
	}
	
	public int count(String tableName, String storeName) {
	    Map<String, String> params = new HashMap<>();
	    params.put("tableName", tableName);
	    params.put("storeName", storeName);

	    int count = sqlSession.selectOne("count", params);
	    return count;
	}
	
	public List<SangkwonDTO> getCoordinate(String tablename, String storeAddress, String storeName){
		Map<String, String> params = new HashMap<>();
	    params.put("tablename", tablename);
	    params.put("storeAddress", storeAddress);
	    params.put("storeName", storeName);
		List<SangkwonDTO> list = sqlSession.selectList("search", params);
		
		return list;
	}
	
	public List<SangkwonDTO> SelectRegion(Map<String, Object> paramMap) {
	    return sqlSession.selectList("SelectRegion", paramMap);
	}
	
	
	public List<SangkwonDTO> Search(Map<String, Object> map) {
	    return sqlSession.selectList("Search", map);
	}
	
	
	public List<SangkwonDTO> selectAll(String tableName, String storeName) {
		 	Map<String, String> params = new HashMap<>();
		    params.put("tableName", tableName);
		    params.put("storeName", storeName);
	    return sqlSession.selectList("selectAll", params);
	}
	
	

	

}
