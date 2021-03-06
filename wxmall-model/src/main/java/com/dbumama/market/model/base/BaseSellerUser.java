package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSellerUser<M extends BaseSellerUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setNick(java.lang.String nick) {
		set("nick", nick);
	}

	public java.lang.String getNick() {
		return get("nick");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setUserLevel(java.lang.Integer userLevel) {
		set("user_level", userLevel);
	}

	public java.lang.Integer getUserLevel() {
		return get("user_level");
	}

	public void setLoginTime(java.util.Date loginTime) {
		set("login_time", loginTime);
	}

	public java.util.Date getLoginTime() {
		return get("login_time");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setStartDate(java.util.Date startDate) {
		set("start_date", startDate);
	}

	public java.util.Date getStartDate() {
		return get("start_date");
	}

	public void setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
	}

	public java.util.Date getEndDate() {
		return get("end_date");
	}

	public void setVersionNo(java.lang.Integer versionNo) {
		set("version_no", versionNo);
	}

	public java.lang.Integer getVersionNo() {
		return get("version_no");
	}

	public void setLoginIp(java.lang.String loginIp) {
		set("login_ip", loginIp);
	}

	public java.lang.String getLoginIp() {
		return get("login_ip");
	}

	public void setAdmiLoginFailureCount(java.lang.Integer admiLoginFailureCount) {
		set("admi_login_failure_count", admiLoginFailureCount);
	}

	public java.lang.Integer getAdmiLoginFailureCount() {
		return get("admi_login_failure_count");
	}

	public void setActive(java.lang.Integer active) {
		set("active", active);
	}

	public java.lang.Integer getActive() {
		return get("active");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setUpdated(java.util.Date updated) {
		set("updated", updated);
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}
