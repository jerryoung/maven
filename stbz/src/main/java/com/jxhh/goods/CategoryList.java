package com.jxhh.goods;

/**
 * 分类列表接口
 */
public class CategoryList {


    /**
     * id : 9795
     * third_id : 15126
     * parent_id : 0
     * title : 艺术品
     * level : 0
     * state : 1
     * create_time : 1577510900
     * sort : 1
     * source : 2
     */

    private Long id;
    private Integer third_id;
    private Integer parent_id;
    private String title;
    private Integer level;
    private Integer state;
    private Integer create_time;
    private Integer sort;
    private Integer source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getThird_id() {
        return third_id;
    }

    public void setThird_id(Integer third_id) {
        this.third_id = third_id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}
