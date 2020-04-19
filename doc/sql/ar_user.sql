
--创建数据库
CREATE DATABASE /*!32312 IF NOT EXISTS*/`allround` /*!40100 DEFAULT CHARACTER SET utf8 */;

--创建用户表
DROP TABLE IF EXISTS `ar_user`;

CREATE TABLE `ar_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_code` varchar(8) NOT NULL COMMENT '用户账号',
  `user_name` varchar(20) NOT NULL COMMENT '用户姓名',
  `user_password` varchar(20) NOT NULL COMMENT '用户密码',
  `user_flag` char(1) NOT NULL COMMENT '是否启用：0启用，1不启用',
  `user_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--用户信息插入
insert  into `ar_user`(`id`,`user_code`,`user_name`,`user_password`,`user_flag`,`user_remark`) values (1,'55500001','李径宇','123','0',NULL),(2,'55500002','宗滔','123','0',NULL);
