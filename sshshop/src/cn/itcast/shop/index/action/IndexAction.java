package cn.itcast.shop.index.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问首页的Action
 * @author xuhanchao
 *
 */
public class IndexAction extends ActionSupport{

	/**
	 *执行的访问首页的方法
	 */
	public String execute(){
		
		return "index";
	}
}
