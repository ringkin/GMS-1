package com.gms.dao;

import com.gms.po.Fieldrentinfo;

public interface IFieldrentinfoDao {
	Long save(Fieldrentinfo fieldrentinfo);
	void delete(Fieldrentinfo fieldrentinfo);
	void update(Fieldrentinfo fieldrentinfo);
	Fieldrentinfo get(long id);
	
}
