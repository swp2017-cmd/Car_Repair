/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.24 : Database - car_manage
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`car_manage` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `car_manage`;

/*Table structure for table `car_info` */

DROP TABLE IF EXISTS `car_info`;

CREATE TABLE `car_info` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `plate` varchar(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `model` varchar(255) NOT NULL,
  `color` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `remark` varchar(224) DEFAULT NULL,
  `user_name` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `car_info` */

insert  into `car_info`(`id`,`plate`,`user_id`,`brand`,`model`,`color`,`price`,`date`,`remark`,`user_name`) values (1,'京A WS123','111','奔驰','c500','黑色','66万','2016-12-21','','swp'),(2,'京A WP456','111','宝马','x5','白色','60万','2016-12-19','','swp'),(3,'沪A WW123','112','宝马','X5','黑色','60万','2016-12-20','','rose'),(4,'辽A QQ123','113','奥迪','A6','黑色','42万','2016—02-02',NULL,'sean'),(5,'辽B AA888','114','保时捷','911','白色','99万','2017-08-09',NULL,'jack');

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `plate` varchar(255) NOT NULL,
  `trouble_name` varchar(255) NOT NULL,
  `trouble_code` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `contact_way` varchar(255) NOT NULL,
  `remark` varchar(255) NOT NULL,
  `long_time` bigint(20) NOT NULL,
  `creart_time` varchar(255) NOT NULL,
  `status` int(11) NOT NULL COMMENT '0未处理1已处理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2024 DEFAULT CHARSET=utf8;

/*Data for the table `order_info` */

insert  into `order_info`(`id`,`user_id`,`user_name`,`plate`,`trouble_name`,`trouble_code`,`contact`,`contact_way`,`remark`,`long_time`,`creart_time`,`status`) values (2020,'111','user1','京A WP456','燃油温度感知器','P0189','swp','13112344321','',1482306027659,'2016年12月21日   15:40:27',1),(2021,'111','user1','京A WS123','空气流量计线路不良','P0100','swp','13112344321','',1482306071146,'2016年12月21日   15:41:11',1),(2022,'112','user4','沪A WW123','节气门位置感知器线路不良','P0120','jose','15603889479','',1482306857176,'2016年12月21日   15:54:17',1),(2023,'113','user5','辽A QQ123','空气流量计线路不良','P0100','sean','118640897196','',1482306857177,'2016年12月21日   16:54:17',1);

/*Table structure for table `personal_info` */

DROP TABLE IF EXISTS `personal_info`;

CREATE TABLE `personal_info` (
  `user_id` varchar(255) CHARACTER SET utf8 NOT NULL,
  `real_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `birthday` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tel_num` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `personal_info` */

insert  into `personal_info`(`user_id`,`real_name`,`sex`,`birthday`,`email`,`address`,`tel_num`,`remark`) values ('111','swp','男','1995-03-26','13112344321@sina.com','北京','13112344321',''),('112','rose','女','2002-02-21','1504088767@sina.com','北京','15603889479',''),('113','sean','男','2008-02-12','1423232423@sina.com','北京','118640897196',''),('114','jack','男','2000-02-21','13234238767@sina.com','大连','15668651125',NULL);

/*Table structure for table `trouble_info` */

DROP TABLE IF EXISTS `trouble_info`;

CREATE TABLE `trouble_info` (
  `id` int(25) NOT NULL AUTO_INCREMENT,
  `trouble_code` varchar(255) NOT NULL,
  `trouble_name` varchar(255) DEFAULT NULL,
  `trouble_remark` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT '0' COMMENT '0启用，1禁用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=250 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `trouble_info` */

insert  into `trouble_info`(`id`,`trouble_code`,`trouble_name`,`trouble_remark`,`status`) values (220,'P0100','空气流量计线路不良','空气流量计线路不良',0),(221,'P0106','进气压力感知器线路不良','进气压力感知器线路不良',0),(223,'P0120','节气门位置感知器线路不良','节气门位置感知器线路不良',0),(224,'P0176','燃料含水量感知器线路故障','燃料含水量感知器线路故障',0),(225,'P0189','燃油温度感知器','燃油温度感知器',1),(226,'P0227','节气门感知器或节气门开关','节气门感知器或节气门开关',0),(227,'P0234','引擎增压系统故障','引擎增压系统故障',1),(228,'P0189','燃油电子阀感应失灵','燃油电子阀感应失灵',0),(248,'P0227','节气门感知器或节气门开关',NULL,0),(249,'P0100','空气流量计线路不良',NULL,0);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) CHARACTER SET latin1 NOT NULL,
  `password` varchar(200) CHARACTER SET latin1 NOT NULL,
  `type` int(5) NOT NULL COMMENT '''0管理员，1普通用户'',',
  `status` int(5) NOT NULL COMMENT '''0启用，1禁用''',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`type`,`status`) values (1,'admin','java',0,0),(111,'user1','abcd',1,0),(112,'user4','java',1,0),(113,'user5','aaaa',1,0),(114,'user6','aaaa',1,0);

/*Table structure for table `visitor` */

DROP TABLE IF EXISTS `visitor`;

CREATE TABLE `visitor` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(255) NOT NULL,
  `v_time` varchar(255) NOT NULL,
  `long_time` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `visitor` */

insert  into `visitor`(`id`,`v_name`,`v_time`,`long_time`) values (11,'admin','2016年12月21日   15:33:08','1482305588602'),(12,'admin','2016年12月21日   15:38:38','1482305918092'),(13,'admin','2016年12月21日   15:51:09','1482306669135'),(14,'admin','2016年12月21日   15:53:30','1482306810137');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
