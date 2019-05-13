package com.chandler.passbook.mapper;

import com.chandler.passbook.vo.Pass;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.client.Result;

/**
 * @Date: 19-5-10
 * @version： V1.0
 * @Author: Chandler
 * @Description: HBase Pass Row To Pass Object
 */
public class PassRowMapper implements RowMapper<Pass> {


    @Override
    public Pass mapRow(Result result, int i) throws Exception {
        return null;
    }
}
