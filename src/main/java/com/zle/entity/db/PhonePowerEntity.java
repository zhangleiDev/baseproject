package com.zle.entity.db;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("phone_power")
public class PhonePowerEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * power
     *   电量
     */
    private String power;

    /**
     * create_time
     *   创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * uid
     *   用户标识
     */
    private String uid;

    public static void main(String[] args) {
        PhonePowerEntity entity = new PhonePowerEntity();
        entity.setId(1);
        entity.setPower("11");
        entity.setCreateTime(new Date());
        ObjectMapper mapper = new ObjectMapper();

        try {
            System.out.println(mapper.writeValueAsString(entity));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}