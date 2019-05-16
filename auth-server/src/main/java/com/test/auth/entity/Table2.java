package com.test.auth.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Table2 {
    /**
     * ID
     */
    private Long id;

    /**
     * 
     */
    private String table2Columna;

    /**
     * 
     */
    private String table2Columnb;

    /**
     * 
     */
    private String table2Columnc;

    /**
     * 记录版本
     */
    private Long recordVersion;
}