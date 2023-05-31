package com.drophair.jcqhttp.dao;

import javax.sql.rowset.serial.SerialStruct;
import java.util.List;

public class Bot {

    /**
     * QQ号
     */
    private Integer user_id;

    /**
     * QQ昵称
     */
    private String nickname;

    /**
     * 公司
     */
    private String company;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 学校
     */
    private String college;

    /**
     * 个人说明
     */
    private String personal_note;

    /**
     * https://github.com/Mrs4s/go-cqhttp/pull/872#issuecomment-831180149
     * 机型名称
     */
    private String model;

    /**
     * -
     */
    private String variants;

    /**
     * 机型显示
     */
    private String model_show;

    /**
     * -
     */
    private String need_pay;

    /**
     * 是否无视缓存
     */
    private Boolean no_cache;

    /**
     * 在线客户端列表
     */
    private List<Device> clients;

}
