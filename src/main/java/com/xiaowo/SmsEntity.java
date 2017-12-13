package com.xiaowo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by WeiHong on 2017/6/23.
 */
public class SmsEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    public SmsEntity(String appId, String to, String templateId, String[] datas) {
        this.appId = appId;
        this.to = to;
        this.templateId = templateId;
        this.datas = datas;
    }

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 接收验证码手机号码
     */
    private String to;
    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 模板参数
     */
    private String[] datas;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String[] getDatas() {
        return datas;
    }

    public void setDatas(String[] datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "SmsVO{" +
                "appId='" + appId + '\'' +
                ", to='" + to + '\'' +
                ", templateId='" + templateId + '\'' +
                ", datas=" + Arrays.toString(datas) +
                '}';
    }

}
