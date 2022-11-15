package com.hims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ward {
    private Integer id;

    private Integer wardno;

    private Integer departmentno;

    private String type;

    private String space;

    private String state;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWardno() {
        return wardno;
    }

    public void setWardno(Integer wardno) {
        this.wardno = wardno;
    }

    public Integer getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(Integer departmentno) {
        this.departmentno = departmentno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space == null ? null : space.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}