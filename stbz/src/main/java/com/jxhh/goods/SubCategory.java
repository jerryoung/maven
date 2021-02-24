package com.jxhh.goods;


/**
 * 级分类
 *
 */
public class SubCategory {

    /**
     *
     *
     * "real_id":9795,"id":15126,"parent_id":0,"title":"艺术品","level":0,"state":1,"sort":1,"source":2
     *
     */

    private Integer real_id;

    private Integer id;

    private Integer parent_id;

    private String title;

    private Integer level;

    private Integer status;

    private Integer sort;

    private Integer source;

    public Integer getReal_id() {
        return real_id;
    }

    public void setReal_id(Integer real_id) {
        this.real_id = real_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
