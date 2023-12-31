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

 Date: 31/12/2023 19:51:01
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
  `anchor_followers` int(11) NOT NULL,
  `anchor_create_at` datetime(0) NOT NULL,
  `room_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of anchor
-- ----------------------------
INSERT INTO `anchor` VALUES (34, 'b287203128d14937b1a984860e65d462', 'bfaa09ddbfc048d3b5149dbd6346d0e3', 'adadasdadsa', '{\"covers\": [\"anchor_avatar\\\\1ef86efad35a0e3ddd18e727b53fe7916604f7fbe456d565ad23aecc87c99446.png\", \"anchor_avatar\\\\7786ba2cd5023523f14c4a286078c8d7f17bab55637788c6d9f59aeca3b3ec00.png\", \"anchor_avatar\\\\c0c1a14d537786181f12e4e180b78306f7e9c28a4dadceefb857afd837c56c18.png\", \"anchor_avatar\\\\bf23aeae61bf3bf32b51a594efb2a41912eb078962091f0bed2cc6b5646c8f42.png\"], \"anchorHeight\": 1231, \"anchorSanwei\": 1212, \"anchorWieght\": 12312}', 0, 1, '2023-12-15 16:42:39', 'e094b3807ff246a4b416e5210d7f88c5');
INSERT INTO `anchor` VALUES (35, '15a107a22d60427e827e4c7af90e369a', '3bafbbde8ab04dfdaf05895eb1e9e609', 'hahah-boobs1', '{\"covers\": [\"anchor_avatar\\\\cccaba5f426738768385e454874e8cbf99817a3ef1ad6115aa062c410b022f90.png\", \"anchor_avatar\\\\fd2ac76e4a82518b5340300abe05e90c4b182d8440c7d591762f58a47c5f8dc4.png\", \"anchor_avatar\\\\5b886484a88b1330243ae3d4493d62aa7589ebbe48a9a1cc0332db88a8debc02.png\", \"anchor_avatar\\\\393cded99c74f6254dcd5bfa81d09053c335fcae0702db81c160e8754465c6f9.png\", \"anchor_avatar\\\\aab465bbcc91e4f54ef5a2fa838db9737595fa87547a08c9c0a39ec3445a4368.png\"], \"anchorHeight\": 1231, \"anchorSanwei\": \"123/234/112\", \"anchorWieght\": 50}', 3300, 1, '2023-12-15 16:42:48', '1efee7cf057540cfb97d4ab42304a7ce');
INSERT INTO `anchor` VALUES (36, 'bf03b2c3fe88412a84a52d18808e58c0', '6cda7ad7dde64894b91f38530514f53d', '小本蛋', '{\"covers\": [\"anchor_avatar\\\\2921e28855e77fd3106bda17cddf73b8cf5b197ca74dc29196aa82e1f2ba5650.png\", \"anchor_avatar\\\\cffb3f43980f5b4ac752c58810212ecb50c164a6d5e827168915fe2613c715db.png\", \"anchor_avatar\\\\c3ea20d79f02ce8829b89a9dae3765fb9da359998fba4506bf564332734dd327.png\", \"anchor_avatar\\\\0cb49868b78116466fd933ef8182d517245db26aefed074e184733ffa35c2398.png\", \"anchor_avatar\\\\91a0385becb1aa3811b86d3199ce021127a5d753e53613642138391bcb4018d6.png\", \"anchor_avatar\\\\64ea3395c236c3c73f8c8cfd7fb6d9b45cddb1f708b2bb43905b6d3b643a3539.png\"], \"anchorHeight\": 1231, \"anchorSanwei\": 121, \"anchorWieght\": 1231}', 7500, 1, '2023-12-15 16:42:53', '52360f8449a149fab46739a890d65a6b');
INSERT INTO `anchor` VALUES (37, 'c10c4d8ec3cf43eaabe1da9d8188aaa4', '63fe49ad01d84fce83f9bde39ea81179', NULL, '{\"covers\": [\"anchor_avatar\\\\f35b46f6d261faf6df6403fa25ffa17734c0a2d0cec96bc9172a064099880aa4.png\", \"anchor_avatar\\\\66d2a56e396a9f9aa20224ddba0d196831260713ec42a1966fc0c403b8e0026b.png\", \"anchor_avatar\\\\f03f7476ccc05abc1ab75b59acf465b0aafd5523384e20ebeb7553541f53134a.png\", \"anchor_avatar\\\\7fc7b67b961ca4f581c5955e855aee7cd61fc9512726d859d1262911676deb57.png\", \"anchor_avatar\\\\75c469704cb9d49137be8af055532b764d1e8aba760b40e142f9c4eb92cc4b01.png\"], \"anchorHeight\": 1231, \"anchorSanwei\": 121, \"anchorWieght\": 1231}', 0, 1, '2023-12-15 16:43:00', '75700f9713f14df09c290f39be48cdf7');
INSERT INTO `anchor` VALUES (38, 'c224ae4ff27f4e668b68d8f3b537f375', 'fe3dfd9d63ff4bc1b47d2ce041588068', NULL, '{\"covers\": [\"anchor_avatar\\\\f8767bad2e288147bb17c6ee9ff0d47c9c241948b6c28271002170361ac58ccc.png\", \"anchor_avatar\\\\9f5afe9840067f2ee24854fab5c56e78b4e2bce450a960f91853ecefd013d912.png\", \"anchor_avatar\\\\7cafaecec094db26c3817ac4ebd36d29ea7d5639f837afd63d4f2a59a117c6e0.png\", \"anchor_avatar\\\\8e0dc25148e5871d11fbf0f5d8c45b4acb248fb3edcd50d96a65403efd85af7a.png\", \"anchor_avatar\\\\00f113386ca196bdddbde850a8accb0a70592ced666bd2aadfa199e53c1587f7.png\", \"anchor_avatar\\\\a3f2bf9f39785b70786e2e8e14aadf2d67eed7db2c2463ce4341c60eeb57c443.png\"], \"anchorHeight\": 12312, \"anchorSanwei\": \"121211aaa\", \"anchorWieght\": 12312}', 0, 1, '2023-12-15 16:43:11', 'ef3491ce6ebb4e44b50b96395d3769a4');

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
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (3, '37a56a85f9be4e8e93b72f30cc6ddcca', '61e34f71204e40a4aa09b12fccd002d6', 1, 100, 9900, 10000, '2023-12-14 18:14:09');
INSERT INTO `client` VALUES (6, '9e90d2a14de84962a133a6c6bb78bbca', '4e3f18b14a664335aa5085c3abc6a18f', 1, 100, 900, 1000, '2023-12-26 16:26:37');

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
-- Table structure for follows
-- ----------------------------
DROP TABLE IF EXISTS `follows`;
CREATE TABLE `follows`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_user_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_user_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of follows
-- ----------------------------
INSERT INTO `follows` VALUES (3, '37a56a85f9be4e8e93b72f30cc6ddcca', '15a107a22d60427e827e4c7af90e369a', '2023-12-31 19:35:15');
INSERT INTO `follows` VALUES (4, '37a56a85f9be4e8e93b72f30cc6ddcca', 'c224ae4ff27f4e668b68d8f3b537f375', '2023-12-31 19:35:28');
INSERT INTO `follows` VALUES (5, '37a56a85f9be4e8e93b72f30cc6ddcca', 'c10c4d8ec3cf43eaabe1da9d8188aaa4', '2023-12-31 19:35:30');
INSERT INTO `follows` VALUES (6, '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', '2023-12-31 19:35:32');
INSERT INTO `follows` VALUES (7, '37a56a85f9be4e8e93b72f30cc6ddcca', 'b287203128d14937b1a984860e65d462', '2023-12-31 19:35:34');

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
) ENGINE = InnoDB AUTO_INCREMENT = 147 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
INSERT INTO `gift_send_record` VALUES (114, '72e34360a5c4445bae371b9693aaf442', '2023-12-26 14:02:33', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (116, '7cac2ee8ea0a48c5bfafe993ff986848', '2023-12-26 15:09:55', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (117, '1675ce7c9ee64c909da20de6f72469e4', '2023-12-26 15:30:11', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (118, '1f48710548c241cebe7f5725e534b7d5', '2023-12-26 15:30:33', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (119, '77967e6de0b4433aa2cac7d9d148d7ef', '2023-12-26 15:34:19', '37a56a85f9be4e8e93b72f30cc6ddcca', '6cda7ad7dde64894b91f38530514f53d', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (123, '41e5a20dceed4c18a3ca55ddc38329d5', '2023-12-26 16:26:19', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (124, 'cffc46b584c743c8a7d8f04bf296eb7a', '2023-12-26 16:26:46', '9e90d2a14de84962a133a6c6bb78bbca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda2', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (125, '698b7ed362e5438895e1c7ffe185b847', '2023-12-26 16:26:46', '9e90d2a14de84962a133a6c6bb78bbca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda2', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (126, '112e4d8272e04153ba1f11a957ac7b00', '2023-12-26 16:26:46', '9e90d2a14de84962a133a6c6bb78bbca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda2', 'anchor3', 'e3fbfc76ca6c46ae9e959db2f47f3540', 'gift3', 300);
INSERT INTO `gift_send_record` VALUES (131, '751e6e499c344c2fab2d202cd10d23e3', '2023-12-26 18:10:06', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (132, 'e602fcaf700b4f9c970593368ac511cd', '2023-12-28 16:38:34', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (133, '7e40fb6f638f4f428f5abbe09c6fe51e', '2023-12-28 16:39:03', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (134, 'e4996eadd08f4546a85e13c274eb31f5', '2023-12-28 16:40:52', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (135, '3bbe18442d1b434a83df18e1585c3a69', '2023-12-28 16:41:43', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (136, '9e40f8790ea4433ba68f725ea47ef8bd', '2023-12-28 16:41:56', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (137, '219390aa97ac4d71833fd31f9336959f', '2023-12-28 18:51:53', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (138, '0f4469ca2f0d4d13a152dbf9c2e1efdb', '2023-12-28 19:59:34', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (139, '94448525501e49789093f0a8599464cf', '2023-12-28 20:00:21', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (140, '9e12034889a340d2b1e9a3f8db2bc5f8', '2023-12-28 20:00:54', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (141, '42d44df566f14acd90f5b64b3f963106', '2023-12-28 20:02:08', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (142, 'b7e8ce23e39b4dba8f0f27b99890b9b6', '2023-12-28 20:15:39', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (143, '7ec33a9b9e724429b1219d7bce79bf3d', '2023-12-28 20:15:54', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (144, '7159de1e03c649478571ec7834a373b3', '2023-12-28 20:23:26', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);
INSERT INTO `gift_send_record` VALUES (146, 'e440be06a36b43529cfa6817b3c223b4', '2023-12-28 21:08:59', '37a56a85f9be4e8e93b72f30cc6ddcca', 'bf03b2c3fe88412a84a52d18808e58c0', 'fenda', 'anchor3', 'ed48631f50a04112b003a0f106f718ec', 'gift1', 100);

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
) ENGINE = InnoDB AUTO_INCREMENT = 328 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
INSERT INTO `upload_file` VALUES (286, '13a25016b95ac49cf00c715d3643aac125003d24117d393f6ee47a09eda23f6d.png', 'zb5.png', 22793, 'image/png', 'avatar\\13a25016b95ac49cf00c715d3643aac125003d24117d393f6ee47a09eda23f6d.png', NULL, 'avatar', '2023-12-26 16:27:09');
INSERT INTO `upload_file` VALUES (287, 'fcb19d32e6d3469d102a6df54fd2c5dab9c2f07fb2f4912276b866785dbc7571.png', 'zb17.png', 12959, 'image/png', 'avatar\\fcb19d32e6d3469d102a6df54fd2c5dab9c2f07fb2f4912276b866785dbc7571.png', NULL, 'avatar', '2023-12-26 16:28:33');
INSERT INTO `upload_file` VALUES (288, 'b458bf296cd106072b766ffebbec3fec73b23ec0ab88d4eb7f0359e83618f6c1.png', 'zb11.png', 93322, 'image/png', 'avatar\\b458bf296cd106072b766ffebbec3fec73b23ec0ab88d4eb7f0359e83618f6c1.png', NULL, 'avatar', '2023-12-26 16:40:28');
INSERT INTO `upload_file` VALUES (289, '47235b68c22437e9d57fa4ac1511fe954d1f3e840079422b8f81653f9f3438dd.png', 'zb4.png', 62329, 'image/png', 'anchor_avatar\\47235b68c22437e9d57fa4ac1511fe954d1f3e840079422b8f81653f9f3438dd.png', NULL, 'anchor_avatar', '2023-12-27 15:12:29');
INSERT INTO `upload_file` VALUES (290, 'd66854742d6613915e882e143e8f03d6182873ac8afa3b1f517b583be962acb8.png', 'zb9.png', 14026, 'image/png', 'anchor_avatar\\d66854742d6613915e882e143e8f03d6182873ac8afa3b1f517b583be962acb8.png', NULL, 'anchor_avatar', '2023-12-27 15:17:36');
INSERT INTO `upload_file` VALUES (291, 'd1eb751661a37536736709bfcfef40c0b2ae99e5dc6714bb2e241a930acd26c7.png', 'zb3.png', 103042, 'image/png', 'anchor_avatar\\d1eb751661a37536736709bfcfef40c0b2ae99e5dc6714bb2e241a930acd26c7.png', NULL, 'anchor_avatar', '2023-12-27 15:18:45');
INSERT INTO `upload_file` VALUES (292, 'a7fda941b58395a083ad3615186737e36a92c16217b889fab59f8ad4ca712a8c.png', 'zb4.png', 62329, 'image/png', 'anchor_avatar\\a7fda941b58395a083ad3615186737e36a92c16217b889fab59f8ad4ca712a8c.png', NULL, 'anchor_avatar', '2023-12-27 15:18:45');
INSERT INTO `upload_file` VALUES (293, 'ca1ba4853690c3efbfdae62f55505a89902f297a4e337fcb58f5880ae1792ed5.png', 'zb9.png', 14026, 'image/png', 'anchor_avatar\\ca1ba4853690c3efbfdae62f55505a89902f297a4e337fcb58f5880ae1792ed5.png', NULL, 'anchor_avatar', '2023-12-27 15:46:47');
INSERT INTO `upload_file` VALUES (294, '38268947acafe8520d0b430c9530d2e50517cce048b701f3867aea6c6a1a1c7b.png', 'zb9.png', 14026, 'image/png', 'anchor_avatar\\38268947acafe8520d0b430c9530d2e50517cce048b701f3867aea6c6a1a1c7b.png', NULL, 'anchor_avatar', '2023-12-27 15:47:45');
INSERT INTO `upload_file` VALUES (295, 'c2073637506dfadc5411437b1816166869c2ffb6d5db91c39ffdda17065040bb.png', 'zb10.png', 106391, 'image/png', 'anchor_avatar\\c2073637506dfadc5411437b1816166869c2ffb6d5db91c39ffdda17065040bb.png', NULL, 'anchor_avatar', '2023-12-27 15:49:42');
INSERT INTO `upload_file` VALUES (296, 'cbc159d064c576230b9677bce2855243f71babbf7479ab13aa583657b7ffe5b6.png', 'zb9.png', 14026, 'image/png', 'anchor_avatar\\cbc159d064c576230b9677bce2855243f71babbf7479ab13aa583657b7ffe5b6.png', NULL, 'anchor_avatar', '2023-12-27 15:59:12');
INSERT INTO `upload_file` VALUES (297, 'cccaba5f426738768385e454874e8cbf99817a3ef1ad6115aa062c410b022f90.png', 'zb10.png', 106391, 'image/png', 'anchor_avatar\\cccaba5f426738768385e454874e8cbf99817a3ef1ad6115aa062c410b022f90.png', NULL, 'anchor_avatar', '2023-12-27 15:59:12');
INSERT INTO `upload_file` VALUES (298, 'bc67380acd6d2aa29444ef4bf94406a55fe8ff3852e37bcffeec1a83ad5068a0.png', 'zb11.png', 93322, 'image/png', 'anchor_avatar\\bc67380acd6d2aa29444ef4bf94406a55fe8ff3852e37bcffeec1a83ad5068a0.png', NULL, 'anchor_avatar', '2023-12-27 15:59:26');
INSERT INTO `upload_file` VALUES (299, 'fd2ac76e4a82518b5340300abe05e90c4b182d8440c7d591762f58a47c5f8dc4.png', 'zb15.png', 12081, 'image/png', 'anchor_avatar\\fd2ac76e4a82518b5340300abe05e90c4b182d8440c7d591762f58a47c5f8dc4.png', NULL, 'anchor_avatar', '2023-12-27 15:59:29');
INSERT INTO `upload_file` VALUES (300, '5b886484a88b1330243ae3d4493d62aa7589ebbe48a9a1cc0332db88a8debc02.png', 'zb7.png', 55939, 'image/png', 'anchor_avatar\\5b886484a88b1330243ae3d4493d62aa7589ebbe48a9a1cc0332db88a8debc02.png', NULL, 'anchor_avatar', '2023-12-27 15:59:32');
INSERT INTO `upload_file` VALUES (301, 'b087c0af093711d7fe6c014c787059f01ab1620dcd13663cb722db026d32c990.png', 'zb16.png', 11816, 'image/png', 'anchor_avatar\\b087c0af093711d7fe6c014c787059f01ab1620dcd13663cb722db026d32c990.png', NULL, 'anchor_avatar', '2023-12-27 15:59:43');
INSERT INTO `upload_file` VALUES (302, '647f88a9e8e41ebdb53b902df3d70843e3ff9d9fa49800f1218f0a7fb9c0be72.png', 'zb17.png', 12959, 'image/png', 'anchor_avatar\\647f88a9e8e41ebdb53b902df3d70843e3ff9d9fa49800f1218f0a7fb9c0be72.png', NULL, 'anchor_avatar', '2023-12-27 15:59:43');
INSERT INTO `upload_file` VALUES (303, 'bfd882daea54b87f3305c44d4fbcb0326609f7f62a7b5bed9934361637fc8ce9.png', 'zb18.png', 7585, 'image/png', 'anchor_avatar\\bfd882daea54b87f3305c44d4fbcb0326609f7f62a7b5bed9934361637fc8ce9.png', NULL, 'anchor_avatar', '2023-12-27 16:00:35');
INSERT INTO `upload_file` VALUES (304, '6465cc2ba4f1630a86253c8fff4104fdb72f4ae4491283ca2358448fc93b65b0.png', 'zb26.png', 75524, 'image/png', 'anchor_avatar\\6465cc2ba4f1630a86253c8fff4104fdb72f4ae4491283ca2358448fc93b65b0.png', NULL, 'anchor_avatar', '2023-12-27 16:00:39');
INSERT INTO `upload_file` VALUES (305, '393cded99c74f6254dcd5bfa81d09053c335fcae0702db81c160e8754465c6f9.png', 'zb3.png', 103042, 'image/png', 'anchor_avatar\\393cded99c74f6254dcd5bfa81d09053c335fcae0702db81c160e8754465c6f9.png', NULL, 'anchor_avatar', '2023-12-27 16:11:09');
INSERT INTO `upload_file` VALUES (306, 'aab465bbcc91e4f54ef5a2fa838db9737595fa87547a08c9c0a39ec3445a4368.png', 'zb27.png', 58070, 'image/png', 'anchor_avatar\\aab465bbcc91e4f54ef5a2fa838db9737595fa87547a08c9c0a39ec3445a4368.png', NULL, 'anchor_avatar', '2023-12-27 18:05:29');
INSERT INTO `upload_file` VALUES (307, '2921e28855e77fd3106bda17cddf73b8cf5b197ca74dc29196aa82e1f2ba5650.png', 'zb28.png', 16537, 'image/png', 'anchor_avatar\\2921e28855e77fd3106bda17cddf73b8cf5b197ca74dc29196aa82e1f2ba5650.png', NULL, 'anchor_avatar', '2023-12-31 19:36:18');
INSERT INTO `upload_file` VALUES (308, 'cffb3f43980f5b4ac752c58810212ecb50c164a6d5e827168915fe2613c715db.png', 'zb27.png', 58070, 'image/png', 'anchor_avatar\\cffb3f43980f5b4ac752c58810212ecb50c164a6d5e827168915fe2613c715db.png', NULL, 'anchor_avatar', '2023-12-31 19:36:22');
INSERT INTO `upload_file` VALUES (309, 'c3ea20d79f02ce8829b89a9dae3765fb9da359998fba4506bf564332734dd327.png', 'zb26.png', 75524, 'image/png', 'anchor_avatar\\c3ea20d79f02ce8829b89a9dae3765fb9da359998fba4506bf564332734dd327.png', NULL, 'anchor_avatar', '2023-12-31 19:36:26');
INSERT INTO `upload_file` VALUES (310, '0cb49868b78116466fd933ef8182d517245db26aefed074e184733ffa35c2398.png', 'zb25.png', 40142, 'image/png', 'anchor_avatar\\0cb49868b78116466fd933ef8182d517245db26aefed074e184733ffa35c2398.png', NULL, 'anchor_avatar', '2023-12-31 19:36:29');
INSERT INTO `upload_file` VALUES (311, '91a0385becb1aa3811b86d3199ce021127a5d753e53613642138391bcb4018d6.png', 'zb24.png', 9642, 'image/png', 'anchor_avatar\\91a0385becb1aa3811b86d3199ce021127a5d753e53613642138391bcb4018d6.png', NULL, 'anchor_avatar', '2023-12-31 19:36:33');
INSERT INTO `upload_file` VALUES (312, '64ea3395c236c3c73f8c8cfd7fb6d9b45cddb1f708b2bb43905b6d3b643a3539.png', 'zb23.png', 10844, 'image/png', 'anchor_avatar\\64ea3395c236c3c73f8c8cfd7fb6d9b45cddb1f708b2bb43905b6d3b643a3539.png', NULL, 'anchor_avatar', '2023-12-31 19:36:37');
INSERT INTO `upload_file` VALUES (313, '1ef86efad35a0e3ddd18e727b53fe7916604f7fbe456d565ad23aecc87c99446.png', 'zb7.png', 55939, 'image/png', 'anchor_avatar\\1ef86efad35a0e3ddd18e727b53fe7916604f7fbe456d565ad23aecc87c99446.png', NULL, 'anchor_avatar', '2023-12-31 19:45:26');
INSERT INTO `upload_file` VALUES (314, '7786ba2cd5023523f14c4a286078c8d7f17bab55637788c6d9f59aeca3b3ec00.png', 'zb8.png', 92843, 'image/png', 'anchor_avatar\\7786ba2cd5023523f14c4a286078c8d7f17bab55637788c6d9f59aeca3b3ec00.png', NULL, 'anchor_avatar', '2023-12-31 19:45:29');
INSERT INTO `upload_file` VALUES (315, 'c0c1a14d537786181f12e4e180b78306f7e9c28a4dadceefb857afd837c56c18.png', 'zb9.png', 14026, 'image/png', 'anchor_avatar\\c0c1a14d537786181f12e4e180b78306f7e9c28a4dadceefb857afd837c56c18.png', NULL, 'anchor_avatar', '2023-12-31 19:45:32');
INSERT INTO `upload_file` VALUES (316, 'bf23aeae61bf3bf32b51a594efb2a41912eb078962091f0bed2cc6b5646c8f42.png', 'zb10.png', 106391, 'image/png', 'anchor_avatar\\bf23aeae61bf3bf32b51a594efb2a41912eb078962091f0bed2cc6b5646c8f42.png', NULL, 'anchor_avatar', '2023-12-31 19:45:36');
INSERT INTO `upload_file` VALUES (317, 'f35b46f6d261faf6df6403fa25ffa17734c0a2d0cec96bc9172a064099880aa4.png', 'zb13.png', 70590, 'image/png', 'anchor_avatar\\f35b46f6d261faf6df6403fa25ffa17734c0a2d0cec96bc9172a064099880aa4.png', NULL, 'anchor_avatar', '2023-12-31 19:45:55');
INSERT INTO `upload_file` VALUES (318, '66d2a56e396a9f9aa20224ddba0d196831260713ec42a1966fc0c403b8e0026b.png', 'zb14.png', 16472, 'image/png', 'anchor_avatar\\66d2a56e396a9f9aa20224ddba0d196831260713ec42a1966fc0c403b8e0026b.png', NULL, 'anchor_avatar', '2023-12-31 19:45:57');
INSERT INTO `upload_file` VALUES (319, 'f03f7476ccc05abc1ab75b59acf465b0aafd5523384e20ebeb7553541f53134a.png', 'zb15.png', 12081, 'image/png', 'anchor_avatar\\f03f7476ccc05abc1ab75b59acf465b0aafd5523384e20ebeb7553541f53134a.png', NULL, 'anchor_avatar', '2023-12-31 19:46:00');
INSERT INTO `upload_file` VALUES (320, '7fc7b67b961ca4f581c5955e855aee7cd61fc9512726d859d1262911676deb57.png', 'zb16.png', 11816, 'image/png', 'anchor_avatar\\7fc7b67b961ca4f581c5955e855aee7cd61fc9512726d859d1262911676deb57.png', NULL, 'anchor_avatar', '2023-12-31 19:46:02');
INSERT INTO `upload_file` VALUES (321, '75c469704cb9d49137be8af055532b764d1e8aba760b40e142f9c4eb92cc4b01.png', 'zb17.png', 12959, 'image/png', 'anchor_avatar\\75c469704cb9d49137be8af055532b764d1e8aba760b40e142f9c4eb92cc4b01.png', NULL, 'anchor_avatar', '2023-12-31 19:46:06');
INSERT INTO `upload_file` VALUES (322, 'f8767bad2e288147bb17c6ee9ff0d47c9c241948b6c28271002170361ac58ccc.png', 'zb19.png', 81440, 'image/png', 'anchor_avatar\\f8767bad2e288147bb17c6ee9ff0d47c9c241948b6c28271002170361ac58ccc.png', NULL, 'anchor_avatar', '2023-12-31 19:46:34');
INSERT INTO `upload_file` VALUES (323, '9f5afe9840067f2ee24854fab5c56e78b4e2bce450a960f91853ecefd013d912.png', 'zb20.png', 105586, 'image/png', 'anchor_avatar\\9f5afe9840067f2ee24854fab5c56e78b4e2bce450a960f91853ecefd013d912.png', NULL, 'anchor_avatar', '2023-12-31 19:46:37');
INSERT INTO `upload_file` VALUES (324, '7cafaecec094db26c3817ac4ebd36d29ea7d5639f837afd63d4f2a59a117c6e0.png', 'zb21.png', 60768, 'image/png', 'anchor_avatar\\7cafaecec094db26c3817ac4ebd36d29ea7d5639f837afd63d4f2a59a117c6e0.png', NULL, 'anchor_avatar', '2023-12-31 19:46:41');
INSERT INTO `upload_file` VALUES (325, '8e0dc25148e5871d11fbf0f5d8c45b4acb248fb3edcd50d96a65403efd85af7a.png', 'zb22.png', 52024, 'image/png', 'anchor_avatar\\8e0dc25148e5871d11fbf0f5d8c45b4acb248fb3edcd50d96a65403efd85af7a.png', NULL, 'anchor_avatar', '2023-12-31 19:46:44');
INSERT INTO `upload_file` VALUES (326, '00f113386ca196bdddbde850a8accb0a70592ced666bd2aadfa199e53c1587f7.png', 'zb23.png', 10844, 'image/png', 'anchor_avatar\\00f113386ca196bdddbde850a8accb0a70592ced666bd2aadfa199e53c1587f7.png', NULL, 'anchor_avatar', '2023-12-31 19:46:47');
INSERT INTO `upload_file` VALUES (327, 'a3f2bf9f39785b70786e2e8e14aadf2d67eed7db2c2463ce4341c60eeb57c443.png', 'zb24.png', 9642, 'image/png', 'anchor_avatar\\a3f2bf9f39785b70786e2e8e14aadf2d67eed7db2c2463ce4341c60eeb57c443.png', NULL, 'anchor_avatar', '2023-12-31 19:46:50');

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
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (39, 'fenda', 'admin', '123456', 'admin', 'a@mail.com', '142342', 'china', 'avatar\\6da2bdd9bbd112b7e069aeeb72349149758cc0fd3732f25f2d91e9906edff9d2.png', 1, 1, '2023-12-14 18:13:29');
INSERT INTO `user` VALUES (40, '37a56a85f9be4e8e93b72f30cc6ddcca', 'fenda', '123456', 'SeriousWolf391', 'aa2dwe@gmail.com', '76543123123', 'china12345', 'avatar\\b458bf296cd106072b766ffebbec3fec73b23ec0ab88d4eb7f0359e83618f6c1.png', 3, 3, '2023-12-14 18:14:09');
INSERT INTO `user` VALUES (46, 'b287203128d14937b1a984860e65d462', 'anchor1', 'anchor1', 'RudeLion96', 'a12@gmail.com', '12431312313', 'china123', 'avatar\\ef781850b4cbe0ecbe19d462506cbca1f6d014b806ef6557bcc48ea676aaaf33.png', 2, 2, '2023-12-15 16:42:39');
INSERT INTO `user` VALUES (47, '15a107a22d60427e827e4c7af90e369a', 'anchor2', 'anchor2', 'LazyTiger35', 'adasd', '12131312313', 'philippine1', 'avatar\\054c3c81e2ddfc52fb6afdf923ff31e22e8e5210129150db46baf80f8f58dd1f.png', 2, 2, '2023-12-15 16:42:48');
INSERT INTO `user` VALUES (48, 'bf03b2c3fe88412a84a52d18808e58c0', 'anchor3', 'anchor3', 'SeriousEagle82', NULL, NULL, NULL, 'avatar\\bc8c30f04b7fe04748b4f3233eb194e52bb06619aacc39b1de7a98f2a4be78a2.png', 2, 2, '2023-12-15 16:42:53');
INSERT INTO `user` VALUES (49, 'c10c4d8ec3cf43eaabe1da9d8188aaa4', 'anchor4', 'anchor4', 'SeriousLion71', NULL, NULL, NULL, 'avatar\\3b336effafa163693e9b12aaee4f621ef076236d88564101da0c3ffe41ff4c63.png', 2, 2, '2023-12-15 16:43:00');
INSERT INTO `user` VALUES (50, 'c224ae4ff27f4e668b68d8f3b537f375', 'anchor5', 'anchor5', 'QuickWolf51', NULL, NULL, NULL, 'avatar\\cc5f4a3ff269ea777fc617927052e2b77833c5ba9653bc772fc4f3974cbba0e8.png', 2, 2, '2023-12-15 16:43:11');
INSERT INTO `user` VALUES (53, '9e90d2a14de84962a133a6c6bb78bbca', 'fenda2', '123456', 'RudeWolf87', 'ad', 'asdasd', NULL, 'avatar\\fcb19d32e6d3469d102a6df54fd2c5dab9c2f07fb2f4912276b866785dbc7571.png', 3, 3, '2023-12-26 16:26:37');

SET FOREIGN_KEY_CHECKS = 1;
