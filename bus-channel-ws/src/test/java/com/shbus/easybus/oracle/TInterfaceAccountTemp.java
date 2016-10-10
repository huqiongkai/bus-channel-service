package com.shbus.easybus.oracle;

public class TInterfaceAccountTemp {
    private String userId;

    private String supplierinfoId;

    private String pwd;

    private String ipList;

    private String userInfo;

    private Long channelId;

    private Long id;

    private String valid;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSupplierinfoId() {
        return supplierinfoId;
    }

    public void setSupplierinfoId(String supplierinfoId) {
        this.supplierinfoId = supplierinfoId == null ? null : supplierinfoId.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getIpList() {
        return ipList;
    }

    public void setIpList(String ipList) {
        this.ipList = ipList == null ? null : ipList.trim();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}