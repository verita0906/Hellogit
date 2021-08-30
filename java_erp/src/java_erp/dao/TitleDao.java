package java_erp.dao;

import java.util.ArrayList;

public interface TitleDao {
	ArrayList<Title> selectTitleByAll();
	Title selectTitleByNo(Title title);
	
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(Title title);
	
}