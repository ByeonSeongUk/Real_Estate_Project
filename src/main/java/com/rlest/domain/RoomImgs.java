/**
 * 방의 사진 목록
 * params: imgNum, rlestNum, fileType, fileRealName, fileName, filePath, crtId, crtDttm, updId, updDttm
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
@Alias("RoomImgs")
public class RoomImgs {
	
	private int     imgNum;         // int	 		 '사진 번호'                                   
	private int     rlestNum;       // int(8)	 	 '매물 번호'                                   
	private String  fileRealName;   // text	         '사진의 진짜 이름(올릴때의 이름)'         
	private String  fileName;       // text 		 '파일의 가상 이름(저장되는 이름)'                               
	private String  flExt;          // varchar(10)	 '파일 확장자명'                      
	private int     flSize;         // bigint(20) 	 '파일의 크기'                               
	private String  ctrId;          // varchar(30)	 '생성자 ID'                                   
	private String  ctrDttm;        // datetime	     '생성일시'                                    
	private String  updId;          // varchar(30)   '수정자 ID'                                  
	private String  updDttm;        // datetime 	 '수정일시'                                    
                    
}
