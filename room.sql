/*
Navicat MySQL Data Transfer

Source Server         : fxy
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : room

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-07-10 13:15:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for room_mess
-- ----------------------------
DROP TABLE IF EXISTS `room_mess`;
CREATE TABLE `room_mess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mess_time` datetime DEFAULT NULL,
  `mess_info` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room_mess
-- ----------------------------

-- ----------------------------
-- Table structure for room_user
-- ----------------------------
DROP TABLE IF EXISTS `room_user`;
CREATE TABLE `room_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_photo` varchar(255) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `last_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room_user
-- ----------------------------
