package prognosis.model;

public class UserAccount {
    private Byte id;

    private String nickname;

    private String mobile;

    private Integer sex;

    private Integer age;

    private String remark;

    private String relatedqq;

    private String relatedwechat;

    private String relatedalipay;

    private String relatedweibo;

    private Integer faceid;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRelatedqq() {
        return relatedqq;
    }

    public void setRelatedqq(String relatedqq) {
        this.relatedqq = relatedqq == null ? null : relatedqq.trim();
    }

    public String getRelatedwechat() {
        return relatedwechat;
    }

    public void setRelatedwechat(String relatedwechat) {
        this.relatedwechat = relatedwechat == null ? null : relatedwechat.trim();
    }

    public String getRelatedalipay() {
        return relatedalipay;
    }

    public void setRelatedalipay(String relatedalipay) {
        this.relatedalipay = relatedalipay == null ? null : relatedalipay.trim();
    }

    public String getRelatedweibo() {
        return relatedweibo;
    }

    public void setRelatedweibo(String relatedweibo) {
        this.relatedweibo = relatedweibo == null ? null : relatedweibo.trim();
    }

    public Integer getFaceid() {
        return faceid;
    }

    public void setFaceid(Integer faceid) {
        this.faceid = faceid;
    }
}