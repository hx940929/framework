package com.gfyt.core.service;

import com.gfyt.core.bean.entity.core.BaseEntity;
import com.gfyt.core.bean.entity.core.BaseResult;

/**
 * <b>功能说明:</b><p>
 * 一些说明写这里
 * </p></br> <b>设计思想、目的:</b><p>
 * 一些说明写这里
 * </p></br><b>设计缺陷: </b>
 * <p>
 * 一些说明写这里
 * </p>
 *
 * @author hanxu
 * @CreateDate 2018-09-21 下午3:54
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * @WebSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public interface BaseService<T extends BaseEntity>
{
	public BaseResult save(T entity);

	public BaseResult update(T entity);

	public BaseResult delete(T entity);

	public BaseResult query(T entity);
}
