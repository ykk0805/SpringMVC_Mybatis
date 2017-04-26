package ykk.common.service;

import java.util.List;
import java.util.Map;

import ykk.common.domain.Dict;

public interface DictService {
	
	/**
	 * 根据Id获取对象
	 * @param dictId
	 * @return
	 */
	public Dict getDict(Long dictId);
	
	/**
	 * 根据条件过去列表
	 * @return
	 */
	public List<Dict> listDicts(Map<String, Object> map);
}
