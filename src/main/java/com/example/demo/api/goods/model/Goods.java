package com.example.demo.api.goods.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ludonglue
 * @date 2018/3/30
 */
public class Goods {
    private Long id;

    private String desc;

    private Date createTime;

    private Date updateTime;

    private Integer index;

    private String pic;

    private String name;

    private BigDecimal price;

    private String buyCount;

    private String commCount;

    private Long category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount == null ? null : buyCount.trim();
    }

    public String getCommCount() {
        return commCount;
    }

    public void setCommCount(String commCount) {
        this.commCount = commCount == null ? null : commCount.trim();
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", index=" + index +
                ", pic='" + pic + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", buyCount='" + buyCount + '\'' +
                ", commCount='" + commCount + '\'' +
                ", category=" + category +
                '}';
    }
}
