package cn.crap.inter.service;

import java.util.List;

import cn.crap.model.DataCenter;
import cn.crap.model.Setting;

public interface ICacheService{

	boolean delObj(String key);

	Setting getSetting(String key);

	List<Setting> getSetting();

	String getModuleName(String moduleId);

	DataCenter getModule(String moduleId);

	boolean delObj(String key, String field);

	Object getObj(String key);

	Object setObj(String key, Object value, int expireTime);

}
