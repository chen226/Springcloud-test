
package com.test.auth.service.impl;

import com.chj.common.Interface.DataFilterInterface;
import com.chj.common.mybatis.DataPermission;
import com.chj.common.sys.ColumnInfo;
import com.chj.common.sys.TableInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: $
 * @author chenhj
 * describe: 实现DataFilterInterface接口
 **/
@Slf4j
@Service
public class DataFilterInterfaceImpl implements DataFilterInterface {
    /**
     * @author chenhj
     * describe: 实现queryDataPermission接口，定义数据具体用户的数据权限
     * @return DataPermission 封装好的刷选对象
     **/
    @Override
    public DataPermission queryDataPermission() {
        DataPermission dataPermission = new DataPermission();
        List<TableInfo> tables=new ArrayList<>();
        for(int i=1;i<4;i++){
            TableInfo t=new TableInfo();
            List<ColumnInfo> columnInfoList=new ArrayList<>();
            ColumnInfo c=new ColumnInfo();
            c.setColumnName("table"+i+"_columnA");
            c.setColumnValue(String.valueOf(i));
            c.setColumnType("varchar");
            c.setColumnRule("=");
            ColumnInfo c1=new ColumnInfo();
            c1.setColumnName("table"+i+"_columnB");
            c1.setColumnValue(String.valueOf(i));
            c1.setColumnType("varchar");
            c1.setColumnRule("=");
            columnInfoList.add(c);
            columnInfoList.add(c1);
            t.setColumnInfoList(columnInfoList);
            t.setTableName("table"+i);
            tables.add(t);
        }
        dataPermission.setTables(tables);
        log.info("dataPermission={}",dataPermission);
        return dataPermission;
    }

}
