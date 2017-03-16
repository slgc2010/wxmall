package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLotteryTrade<M extends BaseLotteryTrade<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setLotteryId(java.lang.Long lotteryId) {
		set("lottery_id", lotteryId);
	}

	public java.lang.Long getLotteryId() {
		return get("lottery_id");
	}

	public void setTradeType(java.lang.Integer tradeType) {
		set("trade_type", tradeType);
	}

	public java.lang.Integer getTradeType() {
		return get("trade_type");
	}

	public void setConditionDay(java.lang.Integer conditionDay) {
		set("condition_day", conditionDay);
	}

	public java.lang.Integer getConditionDay() {
		return get("condition_day");
	}

	public void setConditionTradeStartdate(java.util.Date conditionTradeStartdate) {
		set("condition_trade_startdate", conditionTradeStartdate);
	}

	public java.util.Date getConditionTradeStartdate() {
		return get("condition_trade_startdate");
	}

	public void setConditionTradeEnddate(java.util.Date conditionTradeEnddate) {
		set("condition_trade_enddate", conditionTradeEnddate);
	}

	public java.util.Date getConditionTradeEnddate() {
		return get("condition_trade_enddate");
	}

	public void setTradeStatus(java.lang.Integer tradeStatus) {
		set("trade_status", tradeStatus);
	}

	public java.lang.Integer getTradeStatus() {
		return get("trade_status");
	}

	public void setTradeMoney(java.lang.Integer tradeMoney) {
		set("trade_money", tradeMoney);
	}

	public java.lang.Integer getTradeMoney() {
		return get("trade_money");
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
