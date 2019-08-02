package com.biz.progamer.mapper;

import org.apache.ibatis.jdbc.SQL;

public class FileSQL {
	
	
	
	public String file_insert_sql() {
		SQL sql = new SQL() {{
			INSERT_INTO("tbl_file");
			INTO_COLUMNS("file_seq").INTO_VALUES("SEQ_FILE.NEXTVAL");
			INTO_COLUMNS("board_file_seq").INTO_VALUES("#{board_file_seq}");
			INTO_COLUMNS("file_origin_name").INTO_VALUES("#{file_origin_name}");
			INTO_COLUMNS("file_name").INTO_VALUES("#{file_name}");
		}};
		
		
		return sql.toString();
				
	}

}
