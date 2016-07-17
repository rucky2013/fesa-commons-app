package com.fs.commons.crawler.repository;

import java.util.List;
import com.fs.commons.app.pojo.NewsPojo;

public interface INewsRepository {

	public abstract boolean saveNews(NewsPojo paramNewsPojo);

	public abstract List<NewsPojo> getNewsForPage(Long paramLong,
			String paramString);

	public abstract NewsPojo getNewsById(int paramInt);
}
