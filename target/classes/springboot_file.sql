/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : springboot_file

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2021-04-25 10:17:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(4) NOT NULL auto_increment,
  `name` varchar(120) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('1', 'car.jpg');
INSERT INTO `file` VALUES ('3', 'IMG_20180213_131119.jpg');
INSERT INTO `file` VALUES ('4', 'IMG_20180203_153259.jpg');
INSERT INTO `file` VALUES ('5', '1502947809441.jpg');
INSERT INTO `file` VALUES ('6', 'Snipaste_2020-02-26_16-01-57.png');
INSERT INTO `file` VALUES ('7', 'Snipaste_2020-03-03_09-54-00.png');
INSERT INTO `file` VALUES ('8', 'Snipaste_2020-03-03_10-01-24.png');
INSERT INTO `file` VALUES ('10', 'Snipaste_2020-03-03_10-02-52.png');
INSERT INTO `file` VALUES ('11', 'Snipaste_2020-02-26_16-01-57.png');
INSERT INTO `file` VALUES ('12', 'Snipaste_2020-03-03_10-02-52.png');
INSERT INTO `file` VALUES ('13', '微信截图_20210316112240.png');
INSERT INTO `file` VALUES ('14', 'xstream-1.4.7.jar');
INSERT INTO `file` VALUES ('15', 'xstream-1.4.7.jar');
INSERT INTO `file` VALUES ('16', 'xstream-1.4.7.jar');
INSERT INTO `file` VALUES ('17', 'xstream-1.4.7.jar');
INSERT INTO `file` VALUES ('18', 'xmlpull_1_0_5.jar');
INSERT INTO `file` VALUES ('19', 'xstream-1.4.7.jar');
INSERT INTO `file` VALUES ('20', '微信截图_20210421140248.png');
INSERT INTO `file` VALUES ('21', '微信截图_20210421140248.png');
