/**
 * 이메일 인증
 * params: email, authNum, emailCheck, crtId, crtDttm, updId, updDttm
 */
package com.rlest.domain;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Alias("AuthMail")
public class AuthMail {

	private String	email;			// varchar(30)	'이메일'
	private String	authNum;		// varchar(6)	'인증번호'
	private boolean	emailCheck;		// boolean		'인증유무'
	private String 	crtId;			// varchar(30)	'생성자ID'
	private String 	crtDttm;		// datetime	 	'생성일시'
	private String 	updId;			// varchar(30) 	'수정자 ID'
	private String 	updDttm;		// datetime 	'수정일시'

}
