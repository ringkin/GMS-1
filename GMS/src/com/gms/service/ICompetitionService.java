package com.gms.service;

import java.util.List;

import com.gms.po.Competition;

public interface ICompetitionService {
	Competition getCompetitionById(Long competitionId);
	List getToVerifyCompetitions();
	List getAllCompetitionsByPage(int page);
	Long addCompetition(Competition competition);
	void cancelCompetition(Long competitionId);
	void verifyCompetition(Long competitionId);
	void startCompetition(Long competitionId);
	void endCoompetition(Long competitionId);
	void delCompetition(Long competitionId);
	void delForeCompetition(Long competitionId);
	void updateCompetition(Competition competition);
}
