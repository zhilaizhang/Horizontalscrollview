package com.example.horizontalscrollview;

import java.io.Serializable;
/**
 * 社刊 数据结构
 * @author zhangzhilai 2014.10.9 
 *
 */
public class ClubsItemModel implements Serializable {

	private static final long serialVersionUID = 1003407407297380214L;
	private String clubImagePath;
	private String clubID;
	private String clubTitle;
	private String clubNum;

	public String getClubImagePath() {
		return clubImagePath;
	}
	public void setClubImagePath(String clubImagePath) {
		this.clubImagePath = clubImagePath;
	}

	public String getClubID() {
		return clubID;
	}
	public void setClubID(String clubID) {
		this.clubID = clubID;
	}

	public String getClubTitle() {
		return clubTitle;
	}
	public void setClubTitle(String clubTitle) {
		this.clubTitle = clubTitle;
	}

	public String getClubNum() {
		return clubNum;
	}
	public void setClubNum(String clubNum) {
		this.clubNum = clubNum;
	}

}
