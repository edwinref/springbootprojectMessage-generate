package com.bts.appbts.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pwr_cert_messages")
public class message {
    @Id
    private String msg_seq;
    private String sim_env; 
    private String onl_de_004;
    @Column(name = "onl_de_003", insertable = false, updatable = false)
    private String onl_de_003;
    private String onl_de_011;
    private String onl_de_035;
    private String onl_de_037;
    private String onl_de_038;
    private String onl_de_041;
    private String onl_de_042;
    private String onl_de_060;
    private String onl_de_125;
    private String wording;
    private String onl_de_012;
    private String onl_de_013;
    private String onl_de_007;
    private String logical_network;
    private String financial_constitution_id;
    private String message_type;
    private String activity_flag;
    private int send_count;
    private int delay_time;
    private int chunk_delay;
    private String response_flag;
    private String reversal_flag;
   
    private String onl_de_018;
    private String onl_de_021;
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
    // Constructors, getters, and setters
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "onl_de_003", referencedColumnName = "code")
    private ProcessingCode processingCode;

    public message() {
    }

    public message(String msg_seq, String sim_env, String onl_de_120, String message_type, String onl_de_004, String onl_de_003, String onl_de_011, String onl_de_035, String onl_de_037, String onl_de_038, String onl_de_041, String onl_de_042, String onl_de_060, String onl_de_125, String wording, String onl_de_012, String onl_de_013, String onl_de_007, String logical_network, String financial_constitution_id, String activity_flag, int send_count, int delay_time, int chunk_delay, String response_flag, String reversal_flag, String autho_code, String onl_de_017, String onl_de_018, String onl_de_021, String onl_de_024, String onl_de_027, String onl_de_032, String onl_de_039, String onl_de_043, String onl_de_048, String onl_de_049, String onl_de_057, String onl_de_061, String onl_de_090, String onl_de_100, String user_create, String user_modif) {
        this.msg_seq = msg_seq;
        this.sim_env = sim_env;
        this.onl_de_004 = onl_de_004;
        this.onl_de_003 = onl_de_003;
        this.onl_de_011 = onl_de_011;
        this.onl_de_035 = onl_de_035;
        this.onl_de_037 = onl_de_037;
        this.onl_de_038 = onl_de_038;
        this.onl_de_041 = onl_de_041;
        this.onl_de_042 = onl_de_042;
        this.onl_de_060 = onl_de_060;
        this.onl_de_125 = onl_de_125;
        this.wording = wording;
        this.onl_de_012 = onl_de_012;
        this.onl_de_013 = onl_de_013;
        this.onl_de_007 = onl_de_007;
        this.logical_network = logical_network;
        this.financial_constitution_id = financial_constitution_id;
        this.message_type= message_type;
        
        this.setActivity_flag(activity_flag);
        this.setSend_count(send_count);
        this.setDelay_time(delay_time);
        this.setChunk_delay(chunk_delay);
        this.setResponse_flag(response_flag);
        
        this.setReversal_flag(reversal_flag);
        this.onl_de_018= onl_de_018;
        this.onl_de_021= onl_de_021;
        this.onl_de_024= onl_de_024;
        this.onl_de_027= onl_de_027;
        this.onl_de_032= onl_de_032;
        this.onl_de_039= onl_de_039;
        this.onl_de_043= onl_de_043;
        this.onl_de_048= onl_de_048;
        this.onl_de_049= onl_de_049;
        this.onl_de_057= onl_de_057;
        this.onl_de_061= onl_de_061;
        this.onl_de_100= onl_de_100;
        this.user_create= user_create;
        this.user_modif= user_modif;
       
    }


    public String getMsg_seq() {
        return msg_seq;
    }

    public void setMsg_seq(String msg_seq) {
        this.msg_seq = msg_seq;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

	public String getSim_env() {
		return sim_env;
	}

	public void setSim_env(String sim_env) {
		this.sim_env = sim_env;
	}

	public String getOnl_de_004() {
		return onl_de_004;
	}

	public void setOnl_de_004(String onl_de_004) {
		this.onl_de_004 = onl_de_004;
	}

	public String getOnl_de_003() {
		return onl_de_003;
	}

	public void setOnl_de_003(String onl_de_003) {
		this.onl_de_003 = onl_de_003;
	}

	public String getOnl_de_011() {
		return onl_de_011;
	}

	public void setOnl_de_011(String onl_de_011) {
		this.onl_de_011 = onl_de_011;
	}

	public String getOnl_de_035() {
		return onl_de_035;
	}

	public void setOnl_de_035(String onl_de_035) {
		this.onl_de_035 = onl_de_035;
	}

	public String getOnl_de_037() {
		return onl_de_037;
	}

	public void setOnl_de_037(String onl_de_037) {
		this.onl_de_037 = onl_de_037;
	}

	public String getOnl_de_038() {
		return onl_de_038;
	}

	public void setOnl_de_038(String onl_de_038) {
		this.onl_de_038 = onl_de_038;
	}

	public String getOnl_de_041() {
		return onl_de_041;
	}

	public void setOnl_de_041(String onl_de_041) {
		this.onl_de_041 = onl_de_041;
	}

	public String getOnl_de_042() {
		return onl_de_042;
	}

	public void setOnl_de_042(String onl_de_042) {
		this.onl_de_042 = onl_de_042;
	}

	public String getOnl_de_060() {
		return onl_de_060;
	}

	public void setOnl_de_060(String onl_de_060) {
		this.onl_de_060 = onl_de_060;
	}

	public String getOnl_de_125() {
		return onl_de_125;
	}

	public void setOnl_de_125(String onl_de_125) {
		this.onl_de_125 = onl_de_125;
	}

	public String getOnl_de_012() {
		return onl_de_012;
	}

	public void setOnl_de_012(String onl_de_012) {
		this.onl_de_012 = onl_de_012;
	}

	public String getOnl_de_013() {
		return onl_de_013;
	}

	public void setOnl_de_013(String onl_de_013) {
		this.onl_de_013 = onl_de_013;
	}

	public String getOnl_de_007() {
		return onl_de_007;
	}

	public void setOnl_de_007(String onl_de_007) {
		this.onl_de_007 = onl_de_007;
	}

	public String getLogical_network() {
		return logical_network;
	}

	public void setLogical_network(String logical_network) {
		this.logical_network = logical_network;
	}

	public String getFinancial_constitution_id() {
		return financial_constitution_id;
	}

	public void setFinancial_constitution_id(String financial_constitution_id) {
		this.financial_constitution_id = financial_constitution_id;
	}

	

	public String getMessage_type() {
		return message_type;
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

    public void setProcessingCode(ProcessingCode processingCode) {
        this.processingCode = processingCode;
    }

    public ProcessingCode getProcessingCode() {
        return processingCode;
    }

	

	

	

	public void setChunk_delay(Integer chunk_delay) {
		this.chunk_delay = chunk_delay;
	}

	

	public String getOnl_de_018() {
		return onl_de_018;
	}

	public void setOnl_de_018(String onl_de_018) {
		this.onl_de_018 = onl_de_018;
	}

	public String getOnl_de_021() {
		return onl_de_021;
	}

	public void setOnl_de_021(String onl_de_021) {
		this.onl_de_021 = onl_de_021;
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

	public int getSend_count() {
		return send_count;
	}

	public void setSend_count(int send_count) {
		this.send_count = send_count;
	}

	public int getDelay_time() {
		return delay_time;
	}

	public void setDelay_time(int delay_time) {
		this.delay_time = delay_time;
	}

	public int getChunk_delay() {
		return chunk_delay;
	}

	public void setChunk_delay(int chunk_delay) {
		this.chunk_delay = chunk_delay;
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
