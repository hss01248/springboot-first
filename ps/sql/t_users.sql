# Host: localhost  (Version 5.5.36)
# Date: 2017-07-13 22:38:47
# Generator: MySQL-Front 6.0  (Build 1.195)


#
# Structure for table "t_users"
#

DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_users"
#

INSERT INTO `t_users` VALUES (1,'ytuu',67,'yyy@qq.com');
