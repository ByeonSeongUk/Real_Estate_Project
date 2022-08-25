package com.rlest.domain;

import org.apache.ibatis.type.Alias;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Alias("Member")
public class Member {
	private String email;
	private String mmbrPw;
	private String mmbrName;
	private String crtId;
	private String crtDttm;
	private String updId;
	private String updDttm;
}
