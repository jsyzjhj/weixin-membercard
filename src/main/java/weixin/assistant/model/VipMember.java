package weixin.assistant.model;

import java.util.Date;

public class VipMember {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.open_id
     *
     * @mbggenerated
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.business_id
     *
     * @mbggenerated
     */
    private Integer businessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.addr_province
     *
     * @mbggenerated
     */
    private String addrProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.addr_city
     *
     * @mbggenerated
     */
    private String addrCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.addr_area
     *
     * @mbggenerated
     */
    private String addrArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.addr_detail
     *
     * @mbggenerated
     */
    private String addrDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.tel
     *
     * @mbggenerated
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.account
     *
     * @mbggenerated
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.pwd
     *
     * @mbggenerated
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.sex
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.birthday
     *
     * @mbggenerated
     */
    private String birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.money_input
     *
     * @mbggenerated
     */
    private Integer moneyInput;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.money_output
     *
     * @mbggenerated
     */
    private Integer moneyOutput;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.money_lock
     *
     * @mbggenerated
     */
    private Integer moneyLock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vip_member.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_member
     *
     * @mbggenerated
     */
    public VipMember(Integer id, String openId, Integer businessId, String name, String addrProvince, String addrCity, String addrArea, String addrDetail, String tel, String account, String pwd, Integer type, Integer sex, String birthday, Integer moneyInput, Integer moneyOutput, Integer moneyLock, Short status, Date createTime) {
        this.id = id;
        this.openId = openId;
        this.businessId = businessId;
        this.name = name;
        this.addrProvince = addrProvince;
        this.addrCity = addrCity;
        this.addrArea = addrArea;
        this.addrDetail = addrDetail;
        this.tel = tel;
        this.account = account;
        this.pwd = pwd;
        this.type = type;
        this.sex = sex;
        this.birthday = birthday;
        this.moneyInput = moneyInput;
        this.moneyOutput = moneyOutput;
        this.moneyLock = moneyLock;
        this.status = status;
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_member
     *
     * @mbggenerated
     */
    public VipMember() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.id
     *
     * @return the value of vip_member.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.id
     *
     * @param id the value for vip_member.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.open_id
     *
     * @return the value of vip_member.open_id
     *
     * @mbggenerated
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.open_id
     *
     * @param openId the value for vip_member.open_id
     *
     * @mbggenerated
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.business_id
     *
     * @return the value of vip_member.business_id
     *
     * @mbggenerated
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.business_id
     *
     * @param businessId the value for vip_member.business_id
     *
     * @mbggenerated
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.name
     *
     * @return the value of vip_member.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.name
     *
     * @param name the value for vip_member.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.addr_province
     *
     * @return the value of vip_member.addr_province
     *
     * @mbggenerated
     */
    public String getAddrProvince() {
        return addrProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.addr_province
     *
     * @param addrProvince the value for vip_member.addr_province
     *
     * @mbggenerated
     */
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince == null ? null : addrProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.addr_city
     *
     * @return the value of vip_member.addr_city
     *
     * @mbggenerated
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.addr_city
     *
     * @param addrCity the value for vip_member.addr_city
     *
     * @mbggenerated
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.addr_area
     *
     * @return the value of vip_member.addr_area
     *
     * @mbggenerated
     */
    public String getAddrArea() {
        return addrArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.addr_area
     *
     * @param addrArea the value for vip_member.addr_area
     *
     * @mbggenerated
     */
    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea == null ? null : addrArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.addr_detail
     *
     * @return the value of vip_member.addr_detail
     *
     * @mbggenerated
     */
    public String getAddrDetail() {
        return addrDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.addr_detail
     *
     * @param addrDetail the value for vip_member.addr_detail
     *
     * @mbggenerated
     */
    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail == null ? null : addrDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.tel
     *
     * @return the value of vip_member.tel
     *
     * @mbggenerated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.tel
     *
     * @param tel the value for vip_member.tel
     *
     * @mbggenerated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.account
     *
     * @return the value of vip_member.account
     *
     * @mbggenerated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.account
     *
     * @param account the value for vip_member.account
     *
     * @mbggenerated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.pwd
     *
     * @return the value of vip_member.pwd
     *
     * @mbggenerated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.pwd
     *
     * @param pwd the value for vip_member.pwd
     *
     * @mbggenerated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.type
     *
     * @return the value of vip_member.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.type
     *
     * @param type the value for vip_member.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.sex
     *
     * @return the value of vip_member.sex
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.sex
     *
     * @param sex the value for vip_member.sex
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.birthday
     *
     * @return the value of vip_member.birthday
     *
     * @mbggenerated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.birthday
     *
     * @param birthday the value for vip_member.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.money_input
     *
     * @return the value of vip_member.money_input
     *
     * @mbggenerated
     */
    public Integer getMoneyInput() {
        return moneyInput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.money_input
     *
     * @param moneyInput the value for vip_member.money_input
     *
     * @mbggenerated
     */
    public void setMoneyInput(Integer moneyInput) {
        this.moneyInput = moneyInput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.money_output
     *
     * @return the value of vip_member.money_output
     *
     * @mbggenerated
     */
    public Integer getMoneyOutput() {
        return moneyOutput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.money_output
     *
     * @param moneyOutput the value for vip_member.money_output
     *
     * @mbggenerated
     */
    public void setMoneyOutput(Integer moneyOutput) {
        this.moneyOutput = moneyOutput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.money_lock
     *
     * @return the value of vip_member.money_lock
     *
     * @mbggenerated
     */
    public Integer getMoneyLock() {
        return moneyLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.money_lock
     *
     * @param moneyLock the value for vip_member.money_lock
     *
     * @mbggenerated
     */
    public void setMoneyLock(Integer moneyLock) {
        this.moneyLock = moneyLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.status
     *
     * @return the value of vip_member.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.status
     *
     * @param status the value for vip_member.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vip_member.create_time
     *
     * @return the value of vip_member.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vip_member.create_time
     *
     * @param createTime the value for vip_member.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}