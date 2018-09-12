/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 12/09/2018 11:11:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_price` float DEFAULT NULL,
  `book_author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (2, '红楼梦', 99, '曹雪芹');
INSERT INTO `book` VALUES (5, 'Java核心技术', 99, '迈克尔.杰克逊');
INSERT INTO `book` VALUES (6, '斗破苍穹', 1231, 'xuzilou');
INSERT INTO `book` VALUES (7, '武动乾坤', 12321, 'xuzilou');
INSERT INTO `book` VALUES (8, '大主宰', 123, 'xuzilou');
INSERT INTO `book` VALUES (9, '斗罗大陆', 123, 'xuzilou');
INSERT INTO `book` VALUES (12, 'javaweb技术内幕', 123, 'xuzilou');
INSERT INTO `book` VALUES (13, 'javaee', 123, 'xuzilou');
INSERT INTO `book` VALUES (14, 'javase', 123, 'xuzilou');
INSERT INTO `book` VALUES (15, 'java技术强化', 123, 'xuzilou');
INSERT INTO `book` VALUES (16, 'think in java', 99, 'xuzilou');
INSERT INTO `book` VALUES (19, '123', 123, '123');
INSERT INTO `book` VALUES (20, '123', 123, '132');
INSERT INTO `book` VALUES (23, '123', 123, '123');
INSERT INTO `book` VALUES (24, '123', 123, '123');
INSERT INTO `book` VALUES (26, '123', 1, '徐子楼');
INSERT INTO `book` VALUES (27, '12312312', 1231320, '12312');

-- ----------------------------
-- Table structure for book_1
-- ----------------------------
DROP TABLE IF EXISTS `book_1`;
CREATE TABLE `book_1`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `book_price` float DEFAULT NULL,
  `book` int(11) NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book_2
-- ----------------------------
DROP TABLE IF EXISTS `book_2`;
CREATE TABLE `book_2`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `book_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE,
  INDEX `FKh1psnx9hy1f09eowx3jmxobgo`(`book_type_id`) USING BTREE,
  CONSTRAINT `FKh1psnx9hy1f09eowx3jmxobgo` FOREIGN KEY (`book_type_id`) REFERENCES `book_type_2` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book_type_2
-- ----------------------------
DROP TABLE IF EXISTS `book_type_2`;
CREATE TABLE `book_type_2`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '123');

SET FOREIGN_KEY_CHECKS = 1;
