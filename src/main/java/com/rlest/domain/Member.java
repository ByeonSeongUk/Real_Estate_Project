package com.rlest.domain;

import org.apache.ibatis.type.Alias;
import lombok.*;

@Getter
@Setter
@Alias("Member")
public class Member {
	private String email;
	private String mmbr_pw;
	private String mmbr_name;
	private String crt_id;
	private String crt_dttm;
	private String upd_id;
	private String upd_dttm;
	
	public Member(String email, String mmbr_pw, String mmbr_name, String crt_id, String crt_dttm, String upd_id,
			String upd_dttm) {

		this.email = email;
		this.mmbr_pw = mmbr_pw;
		this.mmbr_name = mmbr_name;
		this.crt_id = crt_id;
		this.crt_dttm = crt_dttm;
		this.upd_id = upd_id;
		this.upd_dttm = upd_dttm;
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", mmbr_pw=" + mmbr_pw + ", mmbr_name=" + mmbr_name + ", crt_id=" + crt_id
				+ ", crt_dttm=" + crt_dttm + ", upd_id=" + upd_id + ", upd_dttm=" + upd_dttm + "]";
	}
	
	
	
}
