package com.test.client.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Table1 {
    /**
     * ID
     */
    private Long id;

    /**
     * 
     */
    private String table1Columna;

    /**
     * 
     */
    private String table1Columnb;

    /**
     * 
     */
    private String table1Columnc;

    /**
     * 记录版本
     */
    private Long recordVersion;
}