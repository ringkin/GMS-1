package com.gms.dao;

import com.gms.po.Competitionresult;

public interface ICompetitionResultDao {
	Competitionresult get(Long id);
	void update(Competitionresult result);
}
