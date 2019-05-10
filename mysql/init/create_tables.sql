create database if not exists template;
use template;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` varchar(36) NOT NULL COMMENT '账号',
  `name` varchar(36) NOT NULL COMMENT '用户名称',
  `email` varchar(128) COMMENT '邮箱',
  `mobile`  varchar(64)  COMMENT '手机号',
  `password`  varchar(128) NOT NULL COMMENT '密码',
  `create_date`  datetime NOT NULL COMMENT '创建时间',
  `update_date`  datetime NOT NULL COMMENT '修改时间',
  `create_user`  int NOT NULL COMMENT '创建人',
  `update_user`  int NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `sys_dict_item`;
CREATE TABLE `sys_dict_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(36) NOT NULL COMMENT '编码',
  `type_code` varchar(36) NOT NULL COMMENT '类型编码',
  `value`  int  COMMENT '值',
  `describe`  text COMMENT '描述',
  `create_date`  datetime NOT NULL COMMENT '创建时间',
  `update_date`  datetime NOT NULL COMMENT '修改时间',
  `create_user`  int NOT NULL COMMENT '创建人',
  `update_user`  int NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `sys_setting`;
CREATE TABLE `sys_setting` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logo` varchar(128)  COMMENT 'logo',
  `copyright` varchar(128) COMMENT '版权信息',
  `explain` text  COMMENT '平台图文',
  `create_date`  datetime NOT NULL COMMENT '创建时间',
  `update_date`  datetime NOT NULL COMMENT '修改时间',
  `create_user`  int NOT NULL COMMENT '创建人',
  `update_user`  int NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `sys_advert`;
CREATE TABLE `sys_advert` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL  COMMENT '名称',
  `address` varchar(256) NOT NULL  COMMENT '地址',
  `img`  varchar(128) NOT NULL    COMMENT '图片',
  `sort_number` int NOT NULL  COMMENT '排序',
  `type` int NOT NULL  COMMENT '类型',
  `create_date`  datetime NOT NULL COMMENT '创建时间',
  `update_date`  datetime NOT NULL COMMENT '修改时间',
  `create_user`  int NOT NULL COMMENT '创建人',
  `update_user`  int NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `provinces`;
CREATE TABLE `provinces` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `provinceid` int(11) NOT NULL,
   `province` varchar(100) NOT NULL DEFAULT '省份',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `cityid` char(6) NOT NULL COMMENT '城市编码',
   `city` varchar(40) NOT NULL COMMENT '城市名称',
   `provinceid` char(6) NOT NULL COMMENT '所属省份编码',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `areas`;
CREATE TABLE `areas` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `areaid` char(6) NOT NULL COMMENT '区县编码',
   `area` varchar(40) NOT NULL COMMENT '区县名称',
   `cityid` char(6) NOT NULL COMMENT '所属城市编码',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `experience_hall`;
CREATE TABLE experience_hall(
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL  COMMENT '名称',
  `address` varchar(256) NOT NULL  COMMENT '地址',
  `detail` text NOT NULL    COMMENT '图片及详情简介',
  `create_date`  datetime NOT NULL COMMENT '创建时间',
  `update_date`  datetime NOT NULL COMMENT '修改时间',
  `create_user`  int NOT NULL COMMENT '创建人',
  `update_user`  int NOT NULL COMMENT '修改人',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `cart`;
CREATE TABLE cart(
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`user_id` int(11) NOT NULL  COMMENT '用户id',
`goods_id` int(11) NOT NULL  COMMENT '商品id',
`quantity` int(11) NOT NULL    COMMENT '数量',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;