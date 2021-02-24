package com.jxhh.goods;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultList;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 商品列表请求类
 * @author Administrator
 *
 */
public class GoodsListRequest implements InterFaceRequest{



	private Integer page;
	
	private Integer limit;
	
	private Integer source;
	
	private Integer category_id;
	
	private String range_type;
	
	private Double range_from;
	
	private Double range_to;
	
	private String search_words;
	
	private Integer is_free_shipping;


	/**
	 * 区间筛选类型
	 * @author Administrator
	 *
	 */
	public static final class RangeType{
		
		/**
		 * 协议价格
		 */
		public static final String AGREEMENT_PRICE = "agreement_price";
		
		/**
		 * 活动价格
		 */
		public static final String ACTIVITY_PRICE = "activity_price";
		
		/**
		 * 指导价格
		 */
		public static final String GUIDE_PRICE = "guide_price";
		
		/**
		 * 利润率
		 */
		public static final String PROMOTION_RATE = "promotion_rate";
		
		/**
		 * 活动利润率
		 */
		public static final String ACTIVITY_RATE = "activity_rate";
		
	}
	
	public Integer getPage() {
		return page;
	}
	
	
	/**
	 * 设置页码
	 * @param page
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}
	
	
	/**
	 * 设置分页条数
	 * 最多不超过500条
	 * @param limit
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getSource() {
		return source;
	}

	/**
	 * 设置来源
	 * 0 全部
	 * 1 云仓
	 * 2 京东
	 * 6 阿里
	 * 7 天猫
	 * @param source
	 */
	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	/**
	 * 设置分类id
	 * 全部分类可以不传，也可以传0
	 * @param category_id
	 */
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	/**
	 * 
	 * @return
	 */
	public String getRange_type() {
		return range_type;
	}
	
	/**
	 * 区间筛选类型 
	 * 可选的值：
	 * agreement_price 协议价格
	 * activity_price 活动价格
	 * guide_price 指导价格
	 * promotion_rate 利润率 
	 * activity_rate 活动利润率
	 * @param range_type
	 */
	public void setRange_type(String range_type) {
		this.range_type = range_type;
	}

	
	public Double getRange_from() {
		return range_from;
	}

	/**
	 * 区间开始，promotion_rate百分比
	 * @param range_from
	 */
	public void setRange_from(Double range_from) {
		this.range_from = range_from;
	}

	
	public Double getRange_to() {
		return range_to;
	}

	/**
	 * 区间结束，promotion_rate单位元，支持2位小数点
	 * @param range_to
	 */
	public void setRange_to(Double range_to) {
		this.range_to = range_to;
	}
	
	

	public String getSearch_words() {
		return search_words;
	}
	
	
	/**
	 * 搜索关键字
	 * @param search_words
	 */
	public void setSearch_words(String search_words) {
		this.search_words = search_words;
	}

	public Integer getIs_free_shipping() {
		return is_free_shipping;
	}

	/**
	 * 邮费选择
	 * 1包邮 0不包邮
	 * @param is_free_shipping
	 */
	public void setIs_free_shipping(Integer is_free_shipping) {
		this.is_free_shipping = is_free_shipping;
	}

	@Override
	public RequestMethod getMethed() {
		// TODO Auto-generated method stub
		return RequestMethod.GET;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "/v2/Goods/Lists";
	}

	@Override
	public TreeMap<String, Object> getParams() throws MustParamsException {
		// TODO Auto-generated method stub
		TreeMap<String, Object> paramsMap = new TreeMap<String, Object>();
		if(null == getPage()) throw new MustParamsException("对象GoodsList: page不能为空");
		if(null == getLimit()) throw new MustParamsException("对象GoodsList: limit不能为空");
		if(null == getSource()) throw new MustParamsException("对象GoodsList: source不能为空");
		paramsMap.put("page", getPage());
		paramsMap.put("limit", getLimit());
		paramsMap.put("source", getSource());
		if(null != getCategory_id()) paramsMap.put("category_id", getCategory_id());
		if(null != getRange_type()) paramsMap.put("range_type", getRange_type());
		if(null != getRange_from()) paramsMap.put("range_from", getRange_from());
		if(null != getRange_to()) paramsMap.put("range_to", getRange_to());
		if(null != getSearch_words()) paramsMap.put("search_words", getSearch_words());
		if(null != getIs_free_shipping()) paramsMap.put("is_free_shipping", getIs_free_shipping());
		return paramsMap;
		
	}

	@Override
	public Integer getResponseType() {
		return 1;
	}

	@Override
	public Type getJsonClassType() {

		return new TypeToken<ApiResultList<GoodsList>>() {}.getType();
	}


}
