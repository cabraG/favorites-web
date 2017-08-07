package com.favorites.domain.view;

public interface CollectView{
	Long getId();
	Long getUserId();
	String getProfilePicture();
	String getTitle();
	String getType();
	String getUrl();
	String getLogoUrl();
	String getRemark();
	String getDescription();
	Long getLastModifyTime();
	Long getCreateTime();
	String getUserName();
	Long getFavoriteId();
	String getFavoriteName();
	String getOperId();
}