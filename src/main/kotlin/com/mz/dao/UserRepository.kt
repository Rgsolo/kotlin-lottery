package com.mz.dao

import com.mz.kotlin_springboot.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @Description：
 * @author mz
 * @date 2018/6/28
 * @time 11:08
 */
interface UserRepository:JpaRepository<User,String> {
}