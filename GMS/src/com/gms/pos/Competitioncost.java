package com.gms.pos;
// Generated 2017-5-21 12:46:56 by Hibernate Tools 5.2.0.Beta1

/**
 * Competitioncost generated by hbm2java
 */
public class Competitioncost implements java.io.Serializable {

	private long bcompetitionId;
	private Competition competition;
	private Float fcost;

	public Competitioncost() {
	}

	public Competitioncost(Competition competition) {
		this.competition = competition;
	}

	public Competitioncost(Competition competition, Float fcost) {
		this.competition = competition;
		this.fcost = fcost;
	}

	public long getBcompetitionId() {
		return this.bcompetitionId;
	}

	public void setBcompetitionId(long bcompetitionId) {
		this.bcompetitionId = bcompetitionId;
	}

	public Competition getCompetition() {
		return this.competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public Float getFcost() {
		return this.fcost;
	}

	public void setFcost(Float fcost) {
		this.fcost = fcost;
	}

}