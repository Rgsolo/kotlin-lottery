package com.mz.kotlin_springboot.entity

import lombok.Data
import javax.persistence.*

/**
 * @Description：
 * @author mz
 * @date 2018/6/28
 * @time 9:19
 */
@Entity
@Table(name = "user")
@Data
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var uid: String = ""
    /**
     * 邮箱
     */
    var email: String? = null
    /**
     * 用户密码
     */
    var password: String? = null
    /**
     * 用户名
     */
    var username: String? = null
    /**
     * 手机号码
     */
    var mobile: String? = null
    /**
     * 用户的头像
     */
    var headimg: String? = null
    /**
     * 用户的状态:0 未激活, 1,已激活, 2: 已封号
     */
    var state: Int? = null
    /**
     * 账户余额
     */
    var money: Double = 0.toDouble()

    override fun toString(): String {
        return "User(uid='$uid', email=$email, password=$password, username=$username, mobile=$mobile, headimg=$headimg, state=$state, money=$money)"
    }


}