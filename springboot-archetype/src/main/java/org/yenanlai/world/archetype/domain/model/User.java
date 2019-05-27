package org.yenanlai.world.archetype.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("姓名")
    private String name;

    @Column(name = "create_id")
    @ApiModelProperty("创建人")
    private String createId;

    @Column(name = "create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    @Column(name = "update_id")
    @ApiModelProperty("更新人")
    private String updateId;

    @Column(name = "update_time")
    @ApiModelProperty("更新时间")
    private Date updateTime;
}