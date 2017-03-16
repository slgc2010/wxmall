package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAgentRank<M extends BaseAgentRank<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setSellerId(java.lang.Long sellerId) {
		set("seller_id", sellerId);
	}

	public java.lang.Long getSellerId() {
		return get("seller_id");
	}

	public void setRankName(java.lang.String rankName) {
		set("rank_name", rankName);
	}

	public java.lang.String getRankName() {
		return get("rank_name");
	}

	public void setRankWeight(java.lang.Integer rankWeight) {
		set("rank_weight", rankWeight);
	}

	public java.lang.Integer getRankWeight() {
		return get("rank_weight");
	}

	public void setFirstRate(java.math.BigDecimal firstRate) {
		set("first_rate", firstRate);
	}

	public java.math.BigDecimal getFirstRate() {
		return get("first_rate");
	}

	public void setSecondRate(java.math.BigDecimal secondRate) {
		set("second_rate", secondRate);
	}

	public java.math.BigDecimal getSecondRate() {
		return get("second_rate");
	}

	public void setThirdRate(java.math.BigDecimal thirdRate) {
		set("third_rate", thirdRate);
	}

	public java.math.BigDecimal getThirdRate() {
		return get("third_rate");
	}

	public void setRewardValue(java.lang.Integer rewardValue) {
		set("reward_value", rewardValue);
	}

	public java.lang.Integer getRewardValue() {
		return get("reward_value");
	}

	public void setGetCashTime(java.lang.Integer getCashTime) {
		set("get_cash_time", getCashTime);
	}

	public java.lang.Integer getGetCashTime() {
		return get("get_cash_time");
	}

	public void setGetCashLimit(java.lang.Integer getCashLimit) {
		set("get_cash_limit", getCashLimit);
	}

	public java.lang.Integer getGetCashLimit() {
		return get("get_cash_limit");
	}

	public void setChildrenCount(java.lang.Integer childrenCount) {
		set("children_count", childrenCount);
	}

	public java.lang.Integer getChildrenCount() {
		return get("children_count");
	}

	public void setTotalCommission(java.math.BigDecimal totalCommission) {
		set("total_commission", totalCommission);
	}

	public java.math.BigDecimal getTotalCommission() {
		return get("total_commission");
	}

	public void setActive(java.lang.Boolean active) {
		set("active", active);
	}

	public java.lang.Boolean getActive() {
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
