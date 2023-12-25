/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : file_server

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 25/12/2023 21:27:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for anchor
-- ----------------------------
DROP TABLE IF EXISTS `anchor`;
CREATE TABLE `anchor`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `anchor_config` json NULL,
  `anchor_money` int(11) NOT NULL,
  `anchor_create_at` datetime(0) NOT NULL,
  `room_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of anchor
-- ----------------------------
INSERT INTO `anchor` VALUES (34, 'b287203128d14937b1a984860e65d462', 'bfaa09ddbfc048d3b5149dbd6346d0e3', 'adadasdadsa', '{\"anchorHeight\": 1231, \"anchorSanwei\": 1212, \"anchorWieght\": 12312}', 0, '2023-12-15 16:42:39', 'e094b3807ff246a4b416e5210d7f88c5');
INSERT INTO `anchor` VALUES (35, '15a107a22d60427e827e4c7af90e369a', '3bafbbde8ab04dfdaf05895eb1e9e609', NULL, '{\"anchorHeight\": 1231, \"anchorSanwei\": 121, \"anchorWieght\": 1231}', 3300, '2023-12-15 16:42:48', '1efee7cf057540cfb97d4ab42304a7ce');
INSERT INTO `anchor` VALUES (36, 'bf03b2c3fe88412a84a52d18808e58c0', '6cda7ad7dde64894b91f38530514f53d', '小本蛋', '{\"anchorHeight\": 1231, \"anchorSanwei\": 121, \"anchorWieght\": 1231}', 4500, '2023-12-15 16:42:53', '52360f8449a149fab46739a890d65a6b');
INSERT INTO `anchor` VALUES (37, 'c10c4d8ec3cf43eaabe1da9d8188aaa4', '63fe49ad01d84fce83f9bde39ea81179', NULL, '{\"anchorHeight\": 1231, \"anchorSanwei\": 121, \"anchorWieght\": 1231}', 0, '2023-12-15 16:43:00', '75700f9713f14df09c290f39be48cdf7');
INSERT INTO `anchor` VALUES (38, 'c224ae4ff27f4e668b68d8f3b537f375', 'fe3dfd9d63ff4bc1b47d2ce041588068', NULL, '{\"anchorHeight\": 12312, \"anchorSanwei\": 1212, \"anchorWieght\": 12312}', 0, '2023-12-15 16:43:11', 'ef3491ce6ebb4e44b50b96395d3769a4');

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_leavel` int(11) NOT NULL,
  `client_money` int(11) NOT NULL,
  `client_money_sended` int(11) NOT NULL,
  `client_money_recharged` int(11) NOT NULL,
  `create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (3, '37a56a85f9be4e8e93b72f30cc6ddcca', '61e34f71204e40a4aa09b12fccd002d6', 1, 2200, 7800, 10000, '2023-12-14 18:14:09');

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` int(11) NOT NULL,
  `uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `config` json NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for gift
-- ----------------------------
DROP TABLE IF EXISTS `gift`;
CREATE TABLE `gift`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gift_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_value` int(11) NOT NULL,
  `gift_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_order` int(11) NOT NULL,
  `gift_create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 81 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gift
-- ----------------------------
INSERT INTO `gift` VALUES (78, 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100, 'gift\\27fa56a12d66a7326013da62f0fb16407494d7db1e044d95998526427f55eeb7.png', 1, '2023-12-16 21:48:22');
INSERT INTO `gift` VALUES (79, '4cf206531625437ca6abe7dbd568f895', 'gift2', 200, 'gift\\4ee672f1b946c253f8da7b3128e170f6f23459db57320785f3b1232c5e2db58d.png', 2, '2023-12-20 15:50:01');
INSERT INTO `gift` VALUES (80, 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300, 'gift\\5a5c4a71d5ca110d9e64b464146145bbaea5d7382f8b210018583bbf47f7e830.png', 3, '2023-12-20 15:50:10');

-- ----------------------------
-- Table structure for gift_send_record
-- ----------------------------
DROP TABLE IF EXISTS `gift_send_record`;
CREATE TABLE `gift_send_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gift_send_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_send_date` datetime(0) NOT NULL,
  `client_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gift_value` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 114 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gift_send_record
-- ----------------------------
INSERT INTO `gift_send_record` VALUES (26, '5920fa9c9d26408d912646b33c2326b4', '2023-12-20 16:35:28', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (27, '89f26fcc2f164885bc7b1ee04bbc089a', '2023-12-20 16:35:41', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', '4cf206531625437ca6abe7dbd568f895', 'gift2', 200);
INSERT INTO `gift_send_record` VALUES (28, '31078ba1ec2843aba1635b788ff17305', '2023-12-20 16:35:42', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (29, '4ff4f44e82424129adcec6ef16c8d66e', '2023-12-20 16:35:53', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', '4cf206531625437ca6abe7dbd568f895', 'gift2', 200);
INSERT INTO `gift_send_record` VALUES (30, 'a720e104efef483aa7326188f9c6d814', '2023-12-20 16:35:54', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (31, '3c46c42c3b3b4ff58abb3742f232e258', '2023-12-20 16:35:58', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (38, '82cfbca2c9654558a8416c11c75fa6e7', '2023-12-20 17:52:10', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (39, 'd477381328a04a7eb761a588e8586639', '2023-12-20 17:52:10', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (40, '3b6d95f0bb564cb8a385849f4a6cc19a', '2023-12-20 17:52:24', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (47, 'e88556ef126e4b34ae87652f97bc9844', '2023-12-20 17:57:12', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (51, '04e754484ef14bd9952141d6e94fa2e7', '2023-12-20 18:02:37', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (52, '73160cacc5a5431a85fcdf35dccf999e', '2023-12-20 18:02:39', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', '4cf206531625437ca6abe7dbd568f895', 'gift2', 200);
INSERT INTO `gift_send_record` VALUES (53, '18026cae70f24d2ba8eda8a5e059c90b', '2023-12-20 18:02:40', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (54, '41a7eee7bc8d456eb230dd04b062dc9a', '2023-12-20 18:02:40', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (61, '9ba9d87a197f4ce8bc6a8b10efc1f4a5', '2023-12-20 19:52:39', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (70, '880d72b7ff4c456295770c656522a1fd', '2023-12-20 20:50:10', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (71, '38788df4b6ca432b9cd93687ba0d3c0a', '2023-12-20 20:50:11', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (72, '204fd2ca02fc463cb32a409c43ccb1c5', '2023-12-20 20:50:11', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (73, '649f34a9a2874d55ab2a362817efb2aa', '2023-12-20 20:50:12', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (74, 'd4e1f897f4cc477490f45aa7891d4881', '2023-12-20 20:50:12', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (75, 'cbb5b1052c21495b84d066237adeafbd', '2023-12-20 20:50:13', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (76, '1d8652da68674215ad900d7eb573a8fe', '2023-12-20 20:50:13', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (77, '4268adcdb7154958b0f47eaf6257ed93', '2023-12-20 20:50:14', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (78, '009a069aac274cb3934413389a0d885a', '2023-12-20 20:50:27', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (79, '1a5a4dbb732a42f2ad0203604be00ff3', '2023-12-20 20:50:27', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (80, '90d503c2111e4026bfea4ad6c7fe4797', '2023-12-20 20:50:30', '37a56a85f9be4e8e93b72f30cc6ddcca', '3bafbbde8ab04dfdaf05895eb1e9e609', 'fenda', 'anchor2', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (81, 'd389c0e354b24c819015fdefe1a6dfe2', '2023-12-21 15:40:59', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (82, '3e6b821a5c4744f290aba8065a28baf0', '2023-12-21 15:41:08', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (83, '8f69570aef2c4170b9e59e1e331e232e', '2023-12-21 15:54:47', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (84, 'f69d3e6092bc4de0a5b784c8c594df6d', '2023-12-21 15:56:45', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (85, '908c527cf5834d76bf27866d2b0491ec', '2023-12-21 16:27:51', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (105, '50388ce19b2f460f994afb0170f3552c', '2023-12-21 16:47:49', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (106, '7443ce683878443f8c1796050696c9fe', '2023-12-21 16:56:27', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (107, '35603178b96b447990bca8c70136eb0d', '2023-12-21 17:40:25', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (108, 'b59ff460d354487da7e8a3aaac6a31a1', '2023-12-21 17:40:27', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (109, '99ef3abaea1d49bf92506fc4ed99d33e', '2023-12-21 17:47:38', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (110, 'ddbd802c37b6415f8605da932b2a21de', '2023-12-21 17:48:06', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (111, '2fc99803275c4918a0684a9e5485d128', '2023-12-21 17:48:14', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (112, '3fcb9f204c1c41c7921ba0853bf40c2b', '2023-12-21 17:48:20', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (113, 'e1641cf44c1f444db1e2aa27dd7116d2', '2023-12-23 17:43:04', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', '4cf206531625437ca6abe7dbd568f895', 'gift2', 200);

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `room_enable` int(11) NOT NULL,
  `room_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `room_create_at` datetime(0) NOT NULL,
  `stream_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'live static',
  `stream_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_app` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_param` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (33, 'e094b3807ff246a4b416e5210d7f88c5', 1, 'anchor', '2023-12-15 16:42:39', 'live', '/live/e1273b0dffe74c138071c045bba594e9', 'live', 'e1273b0dffe74c138071c045bba594e9', 'token=e094b3807ff246a4b416e5210d7f88c5');
INSERT INTO `room` VALUES (34, '1efee7cf057540cfb97d4ab42304a7ce', 1, 'anchor', '2023-12-15 16:42:48', 'live', '/live/99a3b2440f6c461da658973991a2de52', 'live', '99a3b2440f6c461da658973991a2de52', 'token=1efee7cf057540cfb97d4ab42304a7ce');
INSERT INTO `room` VALUES (35, '52360f8449a149fab46739a890d65a6b', 1, 'anchor', '2023-12-15 16:42:53', 'live', '/live/7ad3ab11857348ac9a0e9e1481a40085', 'live', '7ad3ab11857348ac9a0e9e1481a40085', 'token=52360f8449a149fab46739a890d65a6b');
INSERT INTO `room` VALUES (36, '75700f9713f14df09c290f39be48cdf7', 1, 'anchor', '2023-12-15 16:43:00', 'live', '/live/63d31b20aea7442495b1f18f46549fb2', 'live', '63d31b20aea7442495b1f18f46549fb2', 'token=75700f9713f14df09c290f39be48cdf7');
INSERT INTO `room` VALUES (37, 'ef3491ce6ebb4e44b50b96395d3769a4', 1, 'anchor', '2023-12-15 16:43:11', 'live', '/live/91c9fba15e5641e7996560958906eefe', 'live', '91c9fba15e5641e7996560958906eefe', 'token=ef3491ce6ebb4e44b50b96395d3769a4');

-- ----------------------------
-- Table structure for srs_hls
-- ----------------------------
DROP TABLE IF EXISTS `srs_hls`;
CREATE TABLE `srs_hls`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `action` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vhost` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `app` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tcUrl` varchar(255) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `stream` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `param` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `duration` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `file` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m3u8` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m3u8_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `seq_no` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of srs_hls
-- ----------------------------
INSERT INTO `srs_hls` VALUES (9, 'vid-dg1ml6t', 'on_hls', 'crjyv8k5', '127.0.0.1', '__defaultVhost__', 'live', 'rtmp://localhost:1935/live', 'livestream', '', '14.76', '/mnt/d/develop/wsl/ubuntu20.04/module/srs/trunk', './objs/nginx/html/live/livestream-11.ts', 'live/livestream-11.ts', './objs/nginx/html/live/livestream.m3u8', 'live/livestream.m3u8', '11', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:42');
INSERT INTO `srs_hls` VALUES (10, 'vid-dg1ml6t', 'on_hls', 'crjyv8k5', '127.0.0.1', '__defaultVhost__', 'live', 'rtmp://localhost:1935/live', 'livestream', '', '11.68', '/mnt/d/develop/wsl/ubuntu20.04/module/srs/trunk', './objs/nginx/html/live/livestream-12.ts', 'live/livestream-12.ts', './objs/nginx/html/live/livestream.m3u8', 'live/livestream.m3u8', '12', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:54');
INSERT INTO `srs_hls` VALUES (11, 'vid-dg1ml6t', 'on_hls', 'crjyv8k5', '127.0.0.1', '__defaultVhost__', 'live', 'rtmp://localhost:1935/live', 'livestream', '', '3.68', '/mnt/d/develop/wsl/ubuntu20.04/module/srs/trunk', './objs/nginx/html/live/livestream-13.ts', 'live/livestream-13.ts', './objs/nginx/html/live/livestream.m3u8', 'live/livestream.m3u8', '13', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:57');

-- ----------------------------
-- Table structure for srs_sessions
-- ----------------------------
DROP TABLE IF EXISTS `srs_sessions`;
CREATE TABLE `srs_sessions`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `service_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `action` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vhost` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `app` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tcUrl` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `param` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pageUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of srs_sessions
-- ----------------------------
INSERT INTO `srs_sessions` VALUES (3, 'vid-dg1ml6t', '69nb5181', 'on_play', '72n7b6t0', '127.0.0.1', '__defaultVhost__', 'live', 'livestream', 'rtmp://__defaultVhost__/live', '', 'http://localhost:8080/players/srs_player.html?autostart=true&stream=livestream.flv&port=8080&schema=http', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:40');
INSERT INTO `srs_sessions` VALUES (4, 'vid-dg1ml6t', '69nb5181', 'on_stop', '72n7b6t0', '127.0.0.1', '__defaultVhost__', 'live', 'livestream', 'rtmp://__defaultVhost__/live', '', NULL, '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:51');

-- ----------------------------
-- Table structure for srs_streams
-- ----------------------------
DROP TABLE IF EXISTS `srs_streams`;
CREATE TABLE `srs_streams`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `service_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `action` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vhost` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `app` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tcUrl` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `param` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of srs_streams
-- ----------------------------
INSERT INTO `srs_streams` VALUES (6, 'vid-dg1ml6t', '69nb5181', 'on_publish', 'crjyv8k5', '127.0.0.1', '__defaultVhost__', 'live', 'rtmp://localhost:1935/live', 'livestream', '', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:27');
INSERT INTO `srs_streams` VALUES (7, 'vid-dg1ml6t', '69nb5181', 'on_unpublish', 'crjyv8k5', '127.0.0.1', '__defaultVhost__', 'live', 'rtmp://localhost:1935/live', 'livestream', '', '/live/livestream', 'vid-209x4n3', '2023-11-28 17:24:57');

-- ----------------------------
-- Table structure for upload_file
-- ----------------------------
DROP TABLE IF EXISTS `upload_file`;
CREATE TABLE `upload_file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_unique_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `file_original_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `file_size` bigint(20) NOT NULL,
  `file_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `file_tags` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `file_category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `file_upload_date` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 286 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of upload_file
-- ----------------------------
INSERT INTO `upload_file` VALUES (215, 'ef781850b4cbe0ecbe19d462506cbca1f6d014b806ef6557bcc48ea676aaaf33.png', 'zb1.png', 93498, 'image/png', 'avatar\\ef781850b4cbe0ecbe19d462506cbca1f6d014b806ef6557bcc48ea676aaaf33.png', NULL, 'avatar', '2023-12-16 14:38:55');
INSERT INTO `upload_file` VALUES (216, '054c3c81e2ddfc52fb6afdf923ff31e22e8e5210129150db46baf80f8f58dd1f.png', 'zb2.png', 12134, 'image/png', 'avatar\\054c3c81e2ddfc52fb6afdf923ff31e22e8e5210129150db46baf80f8f58dd1f.png', NULL, 'avatar', '2023-12-16 14:39:13');
INSERT INTO `upload_file` VALUES (217, 'bc8c30f04b7fe04748b4f3233eb194e52bb06619aacc39b1de7a98f2a4be78a2.png', 'zb3.png', 103042, 'image/png', 'avatar\\bc8c30f04b7fe04748b4f3233eb194e52bb06619aacc39b1de7a98f2a4be78a2.png', NULL, 'avatar', '2023-12-16 14:39:33');
INSERT INTO `upload_file` VALUES (218, '3b336effafa163693e9b12aaee4f621ef076236d88564101da0c3ffe41ff4c63.png', 'zb4.png', 62329, 'image/png', 'avatar\\3b336effafa163693e9b12aaee4f621ef076236d88564101da0c3ffe41ff4c63.png', NULL, 'avatar', '2023-12-16 14:39:53');
INSERT INTO `upload_file` VALUES (219, 'f8df73fce0ffc14146a7ab1a1fb8e5c56fcbd4fd3fce7a840b68e2f1f5d57f92.png', 'zb5.png', 22793, 'image/png', 'avatar\\f8df73fce0ffc14146a7ab1a1fb8e5c56fcbd4fd3fce7a840b68e2f1f5d57f92.png', NULL, 'avatar', '2023-12-16 14:40:12');
INSERT INTO `upload_file` VALUES (220, 'bcdc004b1ec2057701e63b910e8819a82c65cd6cdccef20729f892ec287b17a3.png', 'zb6.png', 13331, 'image/png', 'avatar\\bcdc004b1ec2057701e63b910e8819a82c65cd6cdccef20729f892ec287b17a3.png', NULL, 'avatar', '2023-12-16 14:40:36');
INSERT INTO `upload_file` VALUES (221, 'c515c875814ee73aaaefa5fe42938129ba8d33d0e98b282da582e108eb82158e.png', 'zb14.png', 16472, 'image/png', 'media\\image\\c515c875814ee73aaaefa5fe42938129ba8d33d0e98b282da582e108eb82158e.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (222, 'aa17c81d4a8d4c91e87b0d5dc8db84733c9fc48f0e3cca998444d6b8fbd5468b.png', 'zb13.png', 70590, 'image/png', 'media\\image\\aa17c81d4a8d4c91e87b0d5dc8db84733c9fc48f0e3cca998444d6b8fbd5468b.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (223, 'a132bfe9eb86287e85ae43c8f09ddd29398ac2b002d4aa439b8ad6ef6be63683.png', 'zb15.png', 12081, 'image/png', 'media\\image\\a132bfe9eb86287e85ae43c8f09ddd29398ac2b002d4aa439b8ad6ef6be63683.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (224, 'cbbdea2ed884ac4c2ed3010a13b05df26815fa13a89dd8ac2c3b6c8fb768a3e4.png', 'zb18.png', 7585, 'image/png', 'media\\image\\cbbdea2ed884ac4c2ed3010a13b05df26815fa13a89dd8ac2c3b6c8fb768a3e4.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (225, '9f55e9b7b18a3c7ef1d125a52f4ca39e09b5192f46601fd719a0e93700842c50.png', 'zb17.png', 12959, 'image/png', 'media\\image\\9f55e9b7b18a3c7ef1d125a52f4ca39e09b5192f46601fd719a0e93700842c50.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (226, '76905da2f4476387551718dcc67b647db8c425a544ee1555990dfb4a1f5ab885.png', 'zb16.png', 11816, 'image/png', 'media\\image\\76905da2f4476387551718dcc67b647db8c425a544ee1555990dfb4a1f5ab885.png', NULL, 'media\\image', '2023-12-16 14:44:19');
INSERT INTO `upload_file` VALUES (227, '745b062aa05ec52a312ec4fb7159b900149dbe8db9341ed8fbb3397e5c2e58c2.png', 'zb28.png', 16537, 'image/png', 'media\\image\\745b062aa05ec52a312ec4fb7159b900149dbe8db9341ed8fbb3397e5c2e58c2.png', NULL, 'media\\image', '2023-12-16 15:30:29');
INSERT INTO `upload_file` VALUES (228, '251a36e307b3d234a8755604a213819651b6579783adba334cb2069e45e0ab0c.png', 'zb26.png', 75524, 'image/png', 'media\\image\\251a36e307b3d234a8755604a213819651b6579783adba334cb2069e45e0ab0c.png', NULL, 'media\\image', '2023-12-16 15:30:29');
INSERT INTO `upload_file` VALUES (229, 'fb38613ac20f5a2aca80e8afc6a20fa832c505030050c47004a3bbd4b3a25a4b.png', 'zb27.png', 58070, 'image/png', 'media\\image\\fb38613ac20f5a2aca80e8afc6a20fa832c505030050c47004a3bbd4b3a25a4b.png', NULL, 'media\\image', '2023-12-16 15:30:29');
INSERT INTO `upload_file` VALUES (230, 'cd55a54eb875e5443fb1bbae171e4d50cced9ad21c9ff636da579285d460e808.png', 'zb25.png', 40142, 'image/png', 'media\\image\\cd55a54eb875e5443fb1bbae171e4d50cced9ad21c9ff636da579285d460e808.png', NULL, 'media\\image', '2023-12-16 15:30:29');
INSERT INTO `upload_file` VALUES (231, '24a89d88bdce97f4dcd8d0eaed067325e3f1fdfe1ea4ec51820d0f22c8bc6bcf.png', 'zb3.png', 103042, 'image/png', 'avatar\\24a89d88bdce97f4dcd8d0eaed067325e3f1fdfe1ea4ec51820d0f22c8bc6bcf.png', NULL, 'avatar', '2023-12-16 17:01:38');
INSERT INTO `upload_file` VALUES (234, '88bff27a94b73aed183afeb679ec05c475db2fc26bed5661fe55567b865a606c.png', 'zb27.png', 58070, 'image/png', 'gift\\88bff27a94b73aed183afeb679ec05c475db2fc26bed5661fe55567b865a606c.png', NULL, 'gift', '2023-12-16 19:33:04');
INSERT INTO `upload_file` VALUES (235, '4a62170cd550a66b0b44b26e634f7086c6513f94f957a4dabf039b7940ea80f8.png', 'zb12.png', 68730, 'image/png', 'gift\\4a62170cd550a66b0b44b26e634f7086c6513f94f957a4dabf039b7940ea80f8.png', NULL, 'gift', '2023-12-16 19:43:10');
INSERT INTO `upload_file` VALUES (236, '52a149d44475643d1bccc4d3f2b53975ab81375ad65e35ec3d020edc2f1a89d1.png', 'zb18.png', 7585, 'image/png', 'gift\\52a149d44475643d1bccc4d3f2b53975ab81375ad65e35ec3d020edc2f1a89d1.png', NULL, 'gift', '2023-12-16 19:43:19');
INSERT INTO `upload_file` VALUES (237, '3fe505cebb0b45df70297ae695a21f8ac0dc82fcb6d46f88645d2ee676f512d2.png', 'zb12.png', 68730, 'image/png', 'gift\\3fe505cebb0b45df70297ae695a21f8ac0dc82fcb6d46f88645d2ee676f512d2.png', NULL, 'gift', '2023-12-16 19:43:54');
INSERT INTO `upload_file` VALUES (238, '3abda5112e01866719b9aa41e43fc8b343058bcf8b2ed71ea6d821662616f287.png', 'zb18.png', 7585, 'image/png', 'gift\\3abda5112e01866719b9aa41e43fc8b343058bcf8b2ed71ea6d821662616f287.png', NULL, 'gift', '2023-12-16 19:46:30');
INSERT INTO `upload_file` VALUES (239, 'a59c111b561b2d1bccc81255dcf42c0051e62029f0ecc94db582567279be10eb.png', 'zb18.png', 7585, 'image/png', 'gift\\a59c111b561b2d1bccc81255dcf42c0051e62029f0ecc94db582567279be10eb.png', NULL, 'gift', '2023-12-16 19:47:03');
INSERT INTO `upload_file` VALUES (240, '84df6f88a2f1f2723fafaa93d7e99924e8c80f3da243a08bb3bc511482fa00d4.png', 'zb11.png', 93322, 'image/png', 'gift\\84df6f88a2f1f2723fafaa93d7e99924e8c80f3da243a08bb3bc511482fa00d4.png', NULL, 'gift', '2023-12-16 19:50:44');
INSERT INTO `upload_file` VALUES (241, 'c4712d7bad6a9650a02338d6f4c9a4b90fc7b010a717c1f63aac0beccb02006b.png', 'zb12.png', 68730, 'image/png', 'gift\\c4712d7bad6a9650a02338d6f4c9a4b90fc7b010a717c1f63aac0beccb02006b.png', NULL, 'gift', '2023-12-16 20:07:43');
INSERT INTO `upload_file` VALUES (242, 'ad4c9e029e67339421ac32dfcf616b9dc3f3dff3cb4702eb3ec590e0193e8487.png', 'zb18.png', 7585, 'image/png', 'gift\\ad4c9e029e67339421ac32dfcf616b9dc3f3dff3cb4702eb3ec590e0193e8487.png', NULL, 'gift', '2023-12-16 20:08:10');
INSERT INTO `upload_file` VALUES (243, 'c2282836a1aec103905d05d33c5215856f78d8456f25399316da7369b2119602.png', 'zb18.png', 7585, 'image/png', 'gift\\c2282836a1aec103905d05d33c5215856f78d8456f25399316da7369b2119602.png', NULL, 'gift', '2023-12-16 20:09:06');
INSERT INTO `upload_file` VALUES (244, 'ad96b48098c983e2d7c8e160ccf564c5e447d09b3b86e620bfb39c210fb32f55.png', 'zb12.png', 68730, 'image/png', 'gift\\ad96b48098c983e2d7c8e160ccf564c5e447d09b3b86e620bfb39c210fb32f55.png', NULL, 'gift', '2023-12-16 20:10:38');
INSERT INTO `upload_file` VALUES (245, 'ede149d1c5d05f3d4217fc395eb9161d79e8bae9fd6b09c49e6a3888d0514a31.png', 'zb18.png', 7585, 'image/png', 'gift\\ede149d1c5d05f3d4217fc395eb9161d79e8bae9fd6b09c49e6a3888d0514a31.png', NULL, 'gift', '2023-12-16 20:15:40');
INSERT INTO `upload_file` VALUES (246, 'c3f0907c0e8a22c419c3ba505c509afc70fcf1ff808ecd818ae3f95733d9bdf7.png', 'zb12.png', 68730, 'image/png', 'gift\\c3f0907c0e8a22c419c3ba505c509afc70fcf1ff808ecd818ae3f95733d9bdf7.png', NULL, 'gift', '2023-12-16 20:15:45');
INSERT INTO `upload_file` VALUES (247, '70add9fe1ac623d304bc7abb99fb5f5a8bc3ab26285c2fb7345f95edac49b1ea.png', 'zb9.png', 14026, 'image/png', 'gift\\70add9fe1ac623d304bc7abb99fb5f5a8bc3ab26285c2fb7345f95edac49b1ea.png', NULL, 'gift', '2023-12-16 20:15:48');
INSERT INTO `upload_file` VALUES (248, '7a3b3aa36a6cb21374fe6c77bdee671cb0dab3115fd826fd953213c24d0f825c.png', 'zb14.png', 16472, 'image/png', 'gift\\7a3b3aa36a6cb21374fe6c77bdee671cb0dab3115fd826fd953213c24d0f825c.png', NULL, 'gift', '2023-12-16 20:15:51');
INSERT INTO `upload_file` VALUES (249, '03004ead662ce501c14e1cc26608009c87eea8ee2f3af404ffa1e82cce060a59.png', 'zb2.png', 12134, 'image/png', 'gift\\03004ead662ce501c14e1cc26608009c87eea8ee2f3af404ffa1e82cce060a59.png', NULL, 'gift', '2023-12-16 20:15:53');
INSERT INTO `upload_file` VALUES (250, 'f46bdcbae9add09f5ccde7bd282b2471e4130fd542166f4128cd2dcb3a405255.png', 'zb1.png', 93498, 'image/png', 'gift\\f46bdcbae9add09f5ccde7bd282b2471e4130fd542166f4128cd2dcb3a405255.png', NULL, 'gift', '2023-12-16 20:15:56');
INSERT INTO `upload_file` VALUES (251, 'a8a1a1dca67e8e71ed1ac20b3fd622ee4ea1fdecd0510e67243f191fe778ab1e.png', 'zb6.png', 13331, 'image/png', 'gift\\a8a1a1dca67e8e71ed1ac20b3fd622ee4ea1fdecd0510e67243f191fe778ab1e.png', NULL, 'gift', '2023-12-16 20:22:40');
INSERT INTO `upload_file` VALUES (252, 'b95a0a82f73ca930736706cb224be16da0f4d81941aee963449b32fb0fa34525.png', 'zb11.png', 93322, 'image/png', 'gift\\b95a0a82f73ca930736706cb224be16da0f4d81941aee963449b32fb0fa34525.png', NULL, 'gift', '2023-12-16 20:24:07');
INSERT INTO `upload_file` VALUES (253, 'd19d7e2d3986992b1894c43fe909964f8bdaf9ec3b06781c3914100c4c8b65cf.png', 'zb12.png', 68730, 'image/png', 'gift\\d19d7e2d3986992b1894c43fe909964f8bdaf9ec3b06781c3914100c4c8b65cf.png', NULL, 'gift', '2023-12-16 20:24:15');
INSERT INTO `upload_file` VALUES (254, 'f517208803c9e3f022c0294a291115fd0e1186f21aa1ff6e14292f66135dc2f1.png', 'zb11.png', 93322, 'image/png', 'gift\\f517208803c9e3f022c0294a291115fd0e1186f21aa1ff6e14292f66135dc2f1.png', NULL, 'gift', '2023-12-16 20:25:17');
INSERT INTO `upload_file` VALUES (255, 'dbd6ca79e809e67ad1dadc20cfb647a5c73ce8ccc192538cef5c7eb83924033c.png', 'zb12.png', 68730, 'image/png', 'gift\\dbd6ca79e809e67ad1dadc20cfb647a5c73ce8ccc192538cef5c7eb83924033c.png', NULL, 'gift', '2023-12-16 21:13:39');
INSERT INTO `upload_file` VALUES (256, '0d9e880e1ec14e9d24d867fd429ee7fd06318e8434b26e42b1924b6d2a818e70.png', 'zb10.png', 106391, 'image/png', 'gift\\0d9e880e1ec14e9d24d867fd429ee7fd06318e8434b26e42b1924b6d2a818e70.png', NULL, 'gift', '2023-12-16 21:14:25');
INSERT INTO `upload_file` VALUES (257, 'd525c5f1b834c1c4b8ddd9da5dc9bb100a6df2102378e4583038ecd99eb92f52.png', 'zb10.png', 106391, 'image/png', 'gift\\d525c5f1b834c1c4b8ddd9da5dc9bb100a6df2102378e4583038ecd99eb92f52.png', NULL, 'gift', '2023-12-16 21:21:48');
INSERT INTO `upload_file` VALUES (258, '9b7fd2ed7be1ce854bb56f4448e55ab3ca513c5cc2f08cccd19489f31793674c.png', 'zb2.png', 12134, 'image/png', 'gift\\9b7fd2ed7be1ce854bb56f4448e55ab3ca513c5cc2f08cccd19489f31793674c.png', NULL, 'gift', '2023-12-16 21:22:04');
INSERT INTO `upload_file` VALUES (259, '7496e4f347b122e82c0832792dbec10a71d67e4f7b19d6afb14c4438ff7c4426.png', 'zb3.png', 103042, 'image/png', 'gift\\7496e4f347b122e82c0832792dbec10a71d67e4f7b19d6afb14c4438ff7c4426.png', NULL, 'gift', '2023-12-16 21:26:49');
INSERT INTO `upload_file` VALUES (260, '99a6393ae44c2b807d98bdcc1dc4ca5e09619554a16fd1fbaf256d5a40996660.png', 'zb18.png', 7585, 'image/png', 'gift\\99a6393ae44c2b807d98bdcc1dc4ca5e09619554a16fd1fbaf256d5a40996660.png', NULL, 'gift', '2023-12-16 21:26:55');
INSERT INTO `upload_file` VALUES (261, 'c17e92611edf100a1720e1504289728788ceb686790d0a4f7cbe8cd61e5377a1.png', 'zb5.png', 22793, 'image/png', 'gift\\c17e92611edf100a1720e1504289728788ceb686790d0a4f7cbe8cd61e5377a1.png', NULL, 'gift', '2023-12-16 21:28:17');
INSERT INTO `upload_file` VALUES (262, 'b62c0fc5f8ef1fbee8ef6d622a80bfec88b60cb7486642819d9afe3ad7e36e50.png', 'zb4.png', 62329, 'image/png', 'gift\\b62c0fc5f8ef1fbee8ef6d622a80bfec88b60cb7486642819d9afe3ad7e36e50.png', NULL, 'gift', '2023-12-16 21:35:31');
INSERT INTO `upload_file` VALUES (263, '24f582d73e790311568cf0e4691c0a0d4cef158ee745f26d8cd1c07ea3f7cee6.png', 'zb6.png', 13331, 'image/png', 'gift\\24f582d73e790311568cf0e4691c0a0d4cef158ee745f26d8cd1c07ea3f7cee6.png', NULL, 'gift', '2023-12-16 21:36:19');
INSERT INTO `upload_file` VALUES (264, 'a8a10e9c9e5a450bfa009ca51ad900e58e6c85a1435d2fef70360067b5615392.png', 'zb21.png', 60768, 'image/png', 'gift\\a8a10e9c9e5a450bfa009ca51ad900e58e6c85a1435d2fef70360067b5615392.png', NULL, 'gift', '2023-12-16 21:36:35');
INSERT INTO `upload_file` VALUES (265, '807ee0b3809e8d26a4c502a6af74b5314e0c2fd1d8a8abe2340cb51ac0c1380e.png', 'zb15.png', 12081, 'image/png', 'gift\\807ee0b3809e8d26a4c502a6af74b5314e0c2fd1d8a8abe2340cb51ac0c1380e.png', NULL, 'gift', '2023-12-16 21:38:09');
INSERT INTO `upload_file` VALUES (266, 'c415e22546ffd49b73048c5d950733e066aca567b2a4c0ee8605514d7f8a8db9.png', 'zb19.png', 81440, 'image/png', 'gift\\c415e22546ffd49b73048c5d950733e066aca567b2a4c0ee8605514d7f8a8db9.png', NULL, 'gift', '2023-12-16 21:45:53');
INSERT INTO `upload_file` VALUES (267, '27fa56a12d66a7326013da62f0fb16407494d7db1e044d95998526427f55eeb7.png', 'zb1.png', 93498, 'image/png', 'gift\\27fa56a12d66a7326013da62f0fb16407494d7db1e044d95998526427f55eeb7.png', NULL, 'gift', '2023-12-16 21:48:21');
INSERT INTO `upload_file` VALUES (268, '68aa6291ddddbc81db48b8cfb979219f38082193b085240dabaab54bc5602a1f.png', 'zb28.png', 16537, 'image/png', 'avatar\\68aa6291ddddbc81db48b8cfb979219f38082193b085240dabaab54bc5602a1f.png', NULL, 'avatar', '2023-12-20 14:47:46');
INSERT INTO `upload_file` VALUES (269, 'f1a5988104c405229eb63dee7a8b873298bf57f32c6dca4d79c2fd859c1c4a81.png', 'zb14.png', 16472, 'image/png', 'avatar\\f1a5988104c405229eb63dee7a8b873298bf57f32c6dca4d79c2fd859c1c4a81.png', NULL, 'avatar', '2023-12-20 15:15:39');
INSERT INTO `upload_file` VALUES (270, '005039d6ef655d64f76023b6b9fff8c352dcb89a99feedcc95fd3b92ec80141e.png', 'zb10.png', 106391, 'image/png', 'avatar\\005039d6ef655d64f76023b6b9fff8c352dcb89a99feedcc95fd3b92ec80141e.png', NULL, 'avatar', '2023-12-20 15:21:54');
INSERT INTO `upload_file` VALUES (271, '9033f0a7812225df7abb0158508bd63b6c3421f86e4e082502cd60e6a58ae97f.png', 'zb7.png', 55939, 'image/png', 'avatar\\9033f0a7812225df7abb0158508bd63b6c3421f86e4e082502cd60e6a58ae97f.png', NULL, 'avatar', '2023-12-20 15:22:06');
INSERT INTO `upload_file` VALUES (272, 'c8a06a6f1b17376048eb23d58f37842b8e26efb5cd3fd3e74218d3a022fe041e.png', 'zb9.png', 14026, 'image/png', 'avatar\\c8a06a6f1b17376048eb23d58f37842b8e26efb5cd3fd3e74218d3a022fe041e.png', NULL, 'avatar', '2023-12-20 15:37:59');
INSERT INTO `upload_file` VALUES (273, '4ee672f1b946c253f8da7b3128e170f6f23459db57320785f3b1232c5e2db58d.png', 'zb3.png', 103042, 'image/png', 'gift\\4ee672f1b946c253f8da7b3128e170f6f23459db57320785f3b1232c5e2db58d.png', NULL, 'gift', '2023-12-20 15:50:00');
INSERT INTO `upload_file` VALUES (274, '5a5c4a71d5ca110d9e64b464146145bbaea5d7382f8b210018583bbf47f7e830.png', 'zb7.png', 55939, 'image/png', 'gift\\5a5c4a71d5ca110d9e64b464146145bbaea5d7382f8b210018583bbf47f7e830.png', NULL, 'gift', '2023-12-20 15:50:10');
INSERT INTO `upload_file` VALUES (275, '6da2bdd9bbd112b7e069aeeb72349149758cc0fd3732f25f2d91e9906edff9d2.png', 'zb9.png', 14026, 'image/png', 'avatar\\6da2bdd9bbd112b7e069aeeb72349149758cc0fd3732f25f2d91e9906edff9d2.png', NULL, 'avatar', '2023-12-23 17:35:29');
INSERT INTO `upload_file` VALUES (276, 'cc5f4a3ff269ea777fc617927052e2b77833c5ba9653bc772fc4f3974cbba0e8.png', 'zb7.png', 55939, 'image/png', 'avatar\\cc5f4a3ff269ea777fc617927052e2b77833c5ba9653bc772fc4f3974cbba0e8.png', NULL, 'avatar', '2023-12-23 18:55:03');
INSERT INTO `upload_file` VALUES (277, 'a68945af77a2db19cdad56adac4356663f8321afe289a5e984de523a640e134c.png', 'zb27.png', 58070, 'image/png', 'avatar\\a68945af77a2db19cdad56adac4356663f8321afe289a5e984de523a640e134c.png', NULL, 'avatar', '2023-12-25 17:06:15');
INSERT INTO `upload_file` VALUES (278, '7307d9441ce9306b05a1645437638feb4a7d94d05a78c0bc1ccc805241437bd1.png', 'zb2.png', 12134, 'image/png', 'avatar\\7307d9441ce9306b05a1645437638feb4a7d94d05a78c0bc1ccc805241437bd1.png', NULL, 'avatar', '2023-12-25 17:06:36');
INSERT INTO `upload_file` VALUES (279, 'd0ecd1cc263c63e10a9af16b52dd1948492c68383b1a9c9d8e36cc177cd07047.png', 'zb3.png', 103042, 'image/png', 'avatar\\d0ecd1cc263c63e10a9af16b52dd1948492c68383b1a9c9d8e36cc177cd07047.png', NULL, 'avatar', '2023-12-25 17:15:48');
INSERT INTO `upload_file` VALUES (280, '5326359b883ae8fa3013082e9d90f525b50fe5d3f9b9235b4b37420706da98cb.png', 'zb1.png', 93498, 'image/png', 'avatar\\5326359b883ae8fa3013082e9d90f525b50fe5d3f9b9235b4b37420706da98cb.png', NULL, 'avatar', '2023-12-25 17:20:14');
INSERT INTO `upload_file` VALUES (281, 'ae596ef39bf47521513d024d30fe9033a095434b2c4d4ed9aa70715166c00101.png', 'zb9.png', 14026, 'image/png', 'avatar\\ae596ef39bf47521513d024d30fe9033a095434b2c4d4ed9aa70715166c00101.png', NULL, 'avatar', '2023-12-25 17:20:24');
INSERT INTO `upload_file` VALUES (282, 'a0378249a628b7238582a722d4681dd23771fe62c2dcb4e509e1d0b65cf8937d.png', 'zb2.png', 12134, 'image/png', 'avatar\\a0378249a628b7238582a722d4681dd23771fe62c2dcb4e509e1d0b65cf8937d.png', NULL, 'avatar', '2023-12-25 17:28:55');
INSERT INTO `upload_file` VALUES (283, 'c10991c940ec6370c1fc4cb0e10e357e67a2be9ec632658bd8f565446b793e0c.png', 'zb9.png', 14026, 'image/png', 'avatar\\c10991c940ec6370c1fc4cb0e10e357e67a2be9ec632658bd8f565446b793e0c.png', NULL, 'avatar', '2023-12-25 17:28:58');
INSERT INTO `upload_file` VALUES (284, 'ba1068f2e28acb0cc0504d76612224c03c4e5963c203ad4909554d851aa4b365.png', 'zb28.png', 16537, 'image/png', 'avatar\\ba1068f2e28acb0cc0504d76612224c03c4e5963c203ad4909554d851aa4b365.png', NULL, 'avatar', '2023-12-25 21:00:00');
INSERT INTO `upload_file` VALUES (285, '9471b23ce774a0c865117c83abce20bcb625446c13c06844a1e07090ecd00ac0.png', 'zb6.png', 13331, 'image/png', 'image\\9471b23ce774a0c865117c83abce20bcb625446c13c06844a1e07090ecd00ac0.png', NULL, 'image', '2023-12-25 21:25:55');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_display_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_phone` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_country` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `user_type` int(11) NOT NULL COMMENT '1:管理员 2.主播 3.用户',
  `user_role` int(11) NOT NULL COMMENT '0:已登录 1:管理员 2.主播 3.用户',
  `create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (39, 'fenda', 'admin', '123456', 'admin', 'a@mail.com', '142342', 'china', 'avatar\\6da2bdd9bbd112b7e069aeeb72349149758cc0fd3732f25f2d91e9906edff9d2.png', 1, 1, '2023-12-14 18:13:29');
INSERT INTO `user` VALUES (40, '37a56a85f9be4e8e93b72f30cc6ddcca', 'fenda', '123456', 'SeriousWolf391', 'aa2dwe@gmail.com', '76543123123', 'china12', 'avatar\\c10991c940ec6370c1fc4cb0e10e357e67a2be9ec632658bd8f565446b793e0c.png', 3, 3, '2023-12-14 18:14:09');
INSERT INTO `user` VALUES (46, 'b287203128d14937b1a984860e65d462', 'anchor1', 'anchor1', 'RudeLion96', 'a12@gmail.com', '12431312313', 'china123', 'avatar\\ef781850b4cbe0ecbe19d462506cbca1f6d014b806ef6557bcc48ea676aaaf33.png', 2, 2, '2023-12-15 16:42:39');
INSERT INTO `user` VALUES (47, '15a107a22d60427e827e4c7af90e369a', 'anchor2', 'anchor2', 'LazyTiger35', NULL, NULL, 'philippine', 'avatar\\054c3c81e2ddfc52fb6afdf923ff31e22e8e5210129150db46baf80f8f58dd1f.png', 2, 2, '2023-12-15 16:42:48');
INSERT INTO `user` VALUES (48, 'bf03b2c3fe88412a84a52d18808e58c0', 'anchor3', 'anchor3', 'SeriousEagle82', NULL, NULL, NULL, 'avatar\\bc8c30f04b7fe04748b4f3233eb194e52bb06619aacc39b1de7a98f2a4be78a2.png', 2, 2, '2023-12-15 16:42:53');
INSERT INTO `user` VALUES (49, 'c10c4d8ec3cf43eaabe1da9d8188aaa4', 'anchor4', 'anchor4', 'SeriousLion71', NULL, NULL, NULL, 'avatar\\3b336effafa163693e9b12aaee4f621ef076236d88564101da0c3ffe41ff4c63.png', 2, 2, '2023-12-15 16:43:00');
INSERT INTO `user` VALUES (50, 'c224ae4ff27f4e668b68d8f3b537f375', 'anchor5', 'anchor5', 'QuickWolf51', NULL, NULL, NULL, 'avatar\\cc5f4a3ff269ea777fc617927052e2b77833c5ba9653bc772fc4f3974cbba0e8.png', 2, 2, '2023-12-15 16:43:11');

SET FOREIGN_KEY_CHECKS = 1;
