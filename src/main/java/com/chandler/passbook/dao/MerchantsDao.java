package com.chandler.passbook.dao;

import com.chandler.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: Merchants Dao 接口
 */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {

    /**
     * 通过 id 获取商户信息
     * @param id 商户 id
     * @return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * 根据名称获取商户信息
     * @param name 商户名称
     * @return {@link Merchants}
     */
    Merchants findByName(String name);

    /**
     * 根据商户 ids 获取商户对象
     * @param ids 商户 ids
     * @return {@link Merchants}
     */
    List<Merchants> findByIdIn(List<Integer> ids);
}
