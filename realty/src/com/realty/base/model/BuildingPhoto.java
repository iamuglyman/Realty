package com.realty.base.model;

// Generated 2014-4-28 13:33:40 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * BuildingPhoto generated by hbm2java
 */
public class BuildingPhoto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int buildingPhotoId;
	private Integer buildingId;
	private String buildingPhoto;

	public BuildingPhoto() {
	}

	public BuildingPhoto(int buildingPhotoId) {
		this.buildingPhotoId = buildingPhotoId;
	}

	public BuildingPhoto(int buildingPhotoId, Integer buildingId,
			String buildingPhoto) {
		this.buildingPhotoId = buildingPhotoId;
		this.buildingId = buildingId;
		this.buildingPhoto = buildingPhoto;
	}

	public int getBuildingPhotoId() {
		return this.buildingPhotoId;
	}

	public void setBuildingPhotoId(int buildingPhotoId) {
		this.buildingPhotoId = buildingPhotoId;
	}

	public Integer getBuildingId() {
		return this.buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingPhoto() {
		return this.buildingPhoto;
	}

	public void setBuildingPhoto(String buildingPhoto) {
		this.buildingPhoto = buildingPhoto;
	}

}
