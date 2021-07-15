package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private long borad_number;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
}
