package com.bts.appbts.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "default_values")
public class DefaultValues {
	  @Id
	    private String id;
	private String activity_flag;
    private int send_count;
    private int delay_time;
    private int chunk_delay;
    private String response_flag;
    private String reversal_flag;
    private String onl_de_017;
    private String onl_de_018;
    
    private String onl_de_024;
    private String onl_de_027;
    private String onl_de_032;
    private String onl_de_039;
    private String onl_de_043;
    private String onl_de_048;
    private String onl_de_049;
    private String onl_de_057;
    private String onl_de_061;
    private String onl_de_100;
    private String user_create;
    private String user_modif;
    
	
	public Integer getChunk_delay() {
		return chunk_delay;
	}
	public void setChunk_delay(Integer chunk_delay) {
		this.chunk_delay = chunk_delay;
	}
	public Integer getDelay_time() {
		return delay_time;
	}
	public void setDelay_time(Integer delay_time) {
		this.delay_time = delay_time;
	}
	public Integer getSend_count() {
		return send_count;
	}
	public void setSend_count(Integer send_count) {
		this.send_count = send_count;
	}
	
	public String getOnl_de_017() {
		return onl_de_017;
	}
	public void setOnl_de_017(String onl_de_017) {
		this.onl_de_017 = onl_de_017;
	}
	public String getOnl_de_018() {
		return onl_de_018;
	}
	public void setOnl_de_018(String onl_de_018) {
		this.onl_de_018 = onl_de_018;
	}

	public String getOnl_de_024() {
		return onl_de_024;
	}
	public void setOnl_de_024(String onl_de_024) {
		this.onl_de_024 = onl_de_024;
	}
	public String getOnl_de_027() {
		return onl_de_027;
	}
	public void setOnl_de_027(String onl_de_027) {
		this.onl_de_027 = onl_de_027;
	}
	public String getOnl_de_032() {
		return onl_de_032;
	}
	public void setOnl_de_032(String onl_de_032) {
		this.onl_de_032 = onl_de_032;
	}
	public String getOnl_de_039() {
		return onl_de_039;
	}
	public void setOnl_de_039(String onl_de_039) {
		this.onl_de_039 = onl_de_039;
	}
	public String getOnl_de_043() {
		return onl_de_043;
	}
	public void setOnl_de_043(String onl_de_043) {
		this.onl_de_043 = onl_de_043;
	}
	public String getOnl_de_048() {
		return onl_de_048;
	}
	public void setOnl_de_048(String onl_de_048) {
		this.onl_de_048 = onl_de_048;
	}
	public String getOnl_de_049() {
		return onl_de_049;
	}
	public void setOnl_de_049(String onl_de_049) {
		this.onl_de_049 = onl_de_049;
	}
	public String getOnl_de_057() {
		return onl_de_057;
	}
	public void setOnl_de_057(String onl_de_057) {
		this.onl_de_057 = onl_de_057;
	}
	public String getOnl_de_061() {
		return onl_de_061;
	}
	public void setOnl_de_061(String onl_de_061) {
		this.onl_de_061 = onl_de_061;
	}
	
	
	public String getOnl_de_100() {
		return onl_de_100;
	}
	public void setOnl_de_100(String onl_de_100) {
		this.onl_de_100 = onl_de_100;
	}
	public String getUser_create() {
		return user_create;
	}
	public void setUser_create(String user_create) {
		this.user_create = user_create;
	}
	public String getUser_modif() {
		return user_modif;
	}
	public void setUser_modif(String user_modif) {
		this.user_modif = user_modif;
	}
	public String getActivity_flag() {
		return activity_flag;
	}
	public void setActivity_flag(String activity_flag) {
		this.activity_flag = activity_flag;
	}
	public String getResponse_flag() {
		return response_flag;
	}
	public void setResponse_flag(String response_flag) {
		this.response_flag = response_flag;
	}
	public String getReversal_flag() {
		return reversal_flag;
	}
	public void setReversal_flag(String reversal_flag) {
		this.reversal_flag = reversal_flag;
	}
}
