package ykk.common.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ykk.common.domain.Dict;
import ykk.common.mapper.DictMapper;
import ykk.common.service.DictService;

@Service("dictService")
@Transactional
public class DictServiceImpl implements DictService {
	
	@Resource
	private DictMapper dictMapper; 
	
	public Dict getDict(Long dictId) {
		
		return dictMapper.selectByPrimaryKey(dictId);
	}

	public List<Dict> listDicts(Map<String, Object> map) {
		
		return null;
	}
	
}
