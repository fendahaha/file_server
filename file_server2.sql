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

 Date: 13/12/2023 00:56:38
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
  `anchor_sanwei` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_height` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_wieght` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `anchor_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `anchor_config` json NULL,
  `anchor_create_at` datetime(0) NOT NULL,
  `room_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of anchor
-- ----------------------------
INSERT INTO `anchor` VALUES (3, '6652cb4f-e6ef-4a78-b303-a85fe025f761', '9a40ed42-1181-4622-976a-d4b77b7fe399', 'anchor1', 'anchor1', 'anchor1', NULL, NULL, '2023-12-13 00:33:24', '93e42e53-14e2-40a9-9c2c-4900fc2e97d0');
INSERT INTO `anchor` VALUES (4, 'a16ca147-100c-4f1f-a5a0-4a61d42feac8', '1ca0c535-764c-42e4-89e9-cba4fdc90299', 'anchor2', 'anchor2', 'anchor2', NULL, NULL, '2023-12-13 00:34:24', '49ebb24c-5942-4843-9cbb-ea6608a9ed7f');

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_leavel` int(11) NOT NULL,
  `client_money` double NOT NULL,
  `client_money_sended` double NOT NULL,
  `client_money_recharged` double NOT NULL,
  `create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (2, '9971c9bf-8bad-49da-86d3-cbd21a8ee4a1', '6f2fcff4-5b00-4e88-811b-01ef7619bde4', 1, 1000, 0, 1000, '2023-12-12 16:44:17');

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` int(11) NOT NULL,
  `uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `config` json NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of config
-- ----------------------------

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
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of gift
-- ----------------------------
INSERT INTO `gift` VALUES (30, '5ea3a961-9822-11ee-8365-6045cba3b98c', 'Gift Name 1', 100, 'image1.jpg', 1, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (31, '5ea3ab1d-9822-11ee-8365-6045cba3b98c', 'Gift Name 2', 200, 'image2.jpg', 2, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (32, '5ea3aba2-9822-11ee-8365-6045cba3b98c', 'Gift Name 3', 300, 'image3.jpg', 3, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (33, '5ea3ac14-9822-11ee-8365-6045cba3b98c', 'Gift Name 4', 400, 'image4.jpg', 4, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (34, '5ea3ac83-9822-11ee-8365-6045cba3b98c', 'Gift Name 5', 500, 'image5.jpg', 5, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (35, '5ea3acf4-9822-11ee-8365-6045cba3b98c', 'Gift Name 6', 600, 'image6.jpg', 6, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (36, '5ea3ad64-9822-11ee-8365-6045cba3b98c', 'Gift Name 7', 700, 'image7.jpg', 7, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (37, '5ea3add2-9822-11ee-8365-6045cba3b98c', 'Gift Name 8', 800, 'image8.jpg', 8, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (38, '5ea3ae41-9822-11ee-8365-6045cba3b98c', 'Gift Name 9', 900, 'image9.jpg', 9, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (39, '5ea3aeb0-9822-11ee-8365-6045cba3b98c', 'Gift Name 10', 1000, 'image10.jpg', 10, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (40, '5ea3af20-9822-11ee-8365-6045cba3b98c', 'Gift Name 11', 1100, 'image11.jpg', 11, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (41, '5ea3af8f-9822-11ee-8365-6045cba3b98c', 'Gift Name 12', 1200, 'image12.jpg', 12, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (42, '5ea3affe-9822-11ee-8365-6045cba3b98c', 'Gift Name 13', 1300, 'image13.jpg', 13, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (43, '5ea3b06d-9822-11ee-8365-6045cba3b98c', 'Gift Name 14', 1400, 'image14.jpg', 14, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (44, '5ea3b0db-9822-11ee-8365-6045cba3b98c', 'Gift Name 15', 1500, 'image15.jpg', 15, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (45, '5ea3b149-9822-11ee-8365-6045cba3b98c', 'Gift Name 16', 1600, 'image16.jpg', 16, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (46, '5ea3b1b8-9822-11ee-8365-6045cba3b98c', 'Gift Name 17', 1700, 'image17.jpg', 17, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (47, '5ea3b22b-9822-11ee-8365-6045cba3b98c', 'Gift Name 18', 1800, 'image18.jpg', 18, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (48, '5ea3b29c-9822-11ee-8365-6045cba3b98c', 'Gift Name 19', 1900, 'image19.jpg', 19, '2023-12-11 20:39:44');
INSERT INTO `gift` VALUES (49, '5ea3b2b1-9822-11ee-8365-6045cba3b98c', 'Gift Name 20', 2000, 'image20.jpg', 20, '2023-12-11 20:39:44');

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of gift_send_record
-- ----------------------------

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_uuid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_app` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stream_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `room_create_at` datetime(0) NOT NULL,
  `stream_online` int(11) NOT NULL,
  `stream_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (1, '93e42e53-14e2-40a9-9c2c-4900fc2e97d0', 'rtmp://localhost/live/livestream', 'live', 'livestream', '2023-12-13 00:33:24', 0, NULL);
INSERT INTO `room` VALUES (2, '49ebb24c-5942-4843-9cbb-ea6608a9ed7f', 'rtmp://localhost/live/livestream', 'live', 'livestream', '2023-12-13 00:34:24', 0, NULL);

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
  `param` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
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
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

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
  `param` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pageUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

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
  `param` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stream_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB AUTO_INCREMENT = 195 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of upload_file
-- ----------------------------
INSERT INTO `upload_file` VALUES (152, 'd8e143458b7d73bd9babdaff0e8ba7ed590ee369c0a53972ff74cd04ccabb641.png', 'zb3.png', 103042, 'image/png', 'd8e143458b7d73bd9babdaff0e8ba7ed590ee369c0a53972ff74cd04ccabb641.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (153, 'f1f4eee40377ccd61db6b669e3be06b66f1c0208d7b742e79951785b2716e0d1.png', 'zb4.png', 62329, 'image/png', 'f1f4eee40377ccd61db6b669e3be06b66f1c0208d7b742e79951785b2716e0d1.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (154, '13ab5339af6e4fa8e7f69c5a6eec33ac81b96c2c680e14f7b435f1092aa8ec41.png', 'zb5.png', 22793, 'image/png', '13ab5339af6e4fa8e7f69c5a6eec33ac81b96c2c680e14f7b435f1092aa8ec41.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (155, '50ba622f170272a414da01d36756a5ffd43e627387813b6718b1f4c60ad46a8e.png', 'zb1.png', 93498, 'image/png', '50ba622f170272a414da01d36756a5ffd43e627387813b6718b1f4c60ad46a8e.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (156, 'fa55ad6d21017a4b3c59f6ea16cd4343f09eb3377197e17dbff8718022ed946f.png', 'zb2.png', 12134, 'image/png', 'fa55ad6d21017a4b3c59f6ea16cd4343f09eb3377197e17dbff8718022ed946f.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (157, 'e0b9d13801d6be9dbd6abfb72eb9f3a4d209e795d2936f39b494a80e6a99ab0e.png', 'zb6.png', 13331, 'image/png', 'e0b9d13801d6be9dbd6abfb72eb9f3a4d209e795d2936f39b494a80e6a99ab0e.png', NULL, NULL, '2023-12-06 17:21:39');
INSERT INTO `upload_file` VALUES (158, 'f8600bf905a0fdf36c6b9a01846a3b2d6a258e3453c7df9f34ec4c58a4589ba4.png', 'zb9.png', 14026, 'image/png', 'f8600bf905a0fdf36c6b9a01846a3b2d6a258e3453c7df9f34ec4c58a4589ba4.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (159, '060af433bd0e45278e75741d0f6782854da49dae618bc4aabe58050028bf357b.png', 'zb10.png', 106391, 'image/png', '060af433bd0e45278e75741d0f6782854da49dae618bc4aabe58050028bf357b.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (160, 'a372567cfe02e90d49551e1fd0b3b3fc9b20932b8466e73b165758e3bf85c41b.png', 'zb7.png', 55939, 'image/png', 'a372567cfe02e90d49551e1fd0b3b3fc9b20932b8466e73b165758e3bf85c41b.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (161, 'a06b270cd7ccbddac81a55a40b94be1383ec4a89f288571ecf8a3c737825d77b.png', 'zb8.png', 92843, 'image/png', 'a06b270cd7ccbddac81a55a40b94be1383ec4a89f288571ecf8a3c737825d77b.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (162, '03f1b154b0a2705a92936b9db8bc61285e1dbcb25083f9281eea3ee88c73b3f6.png', 'zb12.png', 68730, 'image/png', '03f1b154b0a2705a92936b9db8bc61285e1dbcb25083f9281eea3ee88c73b3f6.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (163, '7c95360ab2707e2387bd9fbdd67aa02a022aa7a946ba46dd895fc621148f6c33.png', 'zb11.png', 93322, 'image/png', '7c95360ab2707e2387bd9fbdd67aa02a022aa7a946ba46dd895fc621148f6c33.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (164, '700c08759a70a0ac2ffab555a2a6a06ec8385a9e0f5051d4053ceb4f2589fe12.png', 'zb15.png', 12081, 'image/png', '700c08759a70a0ac2ffab555a2a6a06ec8385a9e0f5051d4053ceb4f2589fe12.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (165, '8e51ad7eabacf6a65f929700b493b9b02bc1a338c1c47b6085422577b44195b6.png', 'zb16.png', 11816, 'image/png', '8e51ad7eabacf6a65f929700b493b9b02bc1a338c1c47b6085422577b44195b6.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (166, 'fc8c7a5302323801874bb79578f85575e3486084f717de0e45df192eb5e74359.png', 'zb14.png', 16472, 'image/png', 'fc8c7a5302323801874bb79578f85575e3486084f717de0e45df192eb5e74359.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (167, 'a1fe0e0718c42beb35e4b68f7829f2a1c43b84ac556226cfd6a1473e7028da7e.png', 'zb13.png', 70590, 'image/png', 'a1fe0e0718c42beb35e4b68f7829f2a1c43b84ac556226cfd6a1473e7028da7e.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (168, 'f60b20d4fc08e10f6f071d613ee2f946ae6653a18c057513c9f5d84be670c647.png', 'zb17.png', 12959, 'image/png', 'f60b20d4fc08e10f6f071d613ee2f946ae6653a18c057513c9f5d84be670c647.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (169, 'da0851371e9f48710b2adf8db9daa03eb80e900953dec8e93f6d470c25fa217e.png', 'zb18.png', 7585, 'image/png', 'da0851371e9f48710b2adf8db9daa03eb80e900953dec8e93f6d470c25fa217e.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (170, 'd88f1dacf286c863067130bdeda3b521279be9bd99b834d90b1f409e5a2ad3be.png', 'zb19.png', 81440, 'image/png', 'd88f1dacf286c863067130bdeda3b521279be9bd99b834d90b1f409e5a2ad3be.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (171, '57a09f94ae1dec65904d4ee31fee33b8ec09f593260da7aeee1bf68a9050c4d5.png', 'zb20.png', 105586, 'image/png', '57a09f94ae1dec65904d4ee31fee33b8ec09f593260da7aeee1bf68a9050c4d5.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (172, '9b34f2aa536131a15a97003e492563db0d39552c43fd99f432b74b5b031cf685.png', 'zb21.png', 60768, 'image/png', '9b34f2aa536131a15a97003e492563db0d39552c43fd99f432b74b5b031cf685.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (173, 'cc5092c045b77b89be0d3acae78a4671ef61838c33724a99d9c5411805a90675.png', 'zb22.png', 52024, 'image/png', 'cc5092c045b77b89be0d3acae78a4671ef61838c33724a99d9c5411805a90675.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (174, '303df82f474b6479709323364e7c3ab6655133017c8e118396669e8ef5f173cc.png', 'zb24.png', 9642, 'image/png', '303df82f474b6479709323364e7c3ab6655133017c8e118396669e8ef5f173cc.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (175, '0b02b3f3e7decc27a030495b7cd56a7c50caf8ef242d29f78d8d59a2fe03406e.png', 'zb26.png', 75524, 'image/png', '0b02b3f3e7decc27a030495b7cd56a7c50caf8ef242d29f78d8d59a2fe03406e.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (176, '276f287ca8f5a6d735510d908a8ce07f2e10353470961c2a3463303eda463ea3.png', 'zb25.png', 40142, 'image/png', '276f287ca8f5a6d735510d908a8ce07f2e10353470961c2a3463303eda463ea3.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (177, 'dd2357dfeffb01b5cbc2a9309c2fd6de3b578c5e6591bcf3de210686e3f8f427.png', 'zb27.png', 58070, 'image/png', 'dd2357dfeffb01b5cbc2a9309c2fd6de3b578c5e6591bcf3de210686e3f8f427.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (178, 'b3557f4a54725eca3fc22f2561f250fb210eea03ba6043a83565378e9e631bac.png', 'zb23.png', 10844, 'image/png', 'b3557f4a54725eca3fc22f2561f250fb210eea03ba6043a83565378e9e631bac.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (179, '1603a3d93e93967c99ff4fd2e49bedcf7b83d60a9360b45485702f63b2c20ff9.png', 'zb28.png', 16537, 'image/png', '1603a3d93e93967c99ff4fd2e49bedcf7b83d60a9360b45485702f63b2c20ff9.png', NULL, NULL, '2023-12-06 17:21:40');
INSERT INTO `upload_file` VALUES (180, '561957029ce83c3fbc7559495e70c961842ba78213b9410ef63e2d074fc3a34f.png', '3.png', 54988, 'image/png', '561957029ce83c3fbc7559495e70c961842ba78213b9410ef63e2d074fc3a34f.png', NULL, NULL, '2023-12-08 14:49:46');
INSERT INTO `upload_file` VALUES (181, '1be5419d56790fe88a8fc42b03ca0b356a1ac9a4199f55539ad51005fb638413.png', '9.png', 69028, 'image/png', '1be5419d56790fe88a8fc42b03ca0b356a1ac9a4199f55539ad51005fb638413.png', NULL, NULL, '2023-12-08 15:05:59');
INSERT INTO `upload_file` VALUES (182, '21f5bbe5487fd84770197376c00bb8d2c0a32aa7a68c58ee6cc16500bcb12027.png', '10.png', 58523, 'image/png', 'avatar\\21f5bbe5487fd84770197376c00bb8d2c0a32aa7a68c58ee6cc16500bcb12027.png', NULL, 'avatar', '2023-12-08 15:07:17');
INSERT INTO `upload_file` VALUES (183, '2136c1339b0c8586c0df9dfd6a027b48f7e364886902278ee35af32351f6506a.png', '3.png', 54988, 'image/png', 'avatar\\2136c1339b0c8586c0df9dfd6a027b48f7e364886902278ee35af32351f6506a.png', NULL, 'avatar', '2023-12-08 15:15:26');
INSERT INTO `upload_file` VALUES (184, '54e6b4aa5c94e1b19f8a44697d433db0524c0eade2c80a18376b7b0d7428a80a.png', '11.png', 47771, 'image/png', 'avatar\\54e6b4aa5c94e1b19f8a44697d433db0524c0eade2c80a18376b7b0d7428a80a.png', NULL, 'avatar', '2023-12-08 15:48:43');
INSERT INTO `upload_file` VALUES (185, '924108c3d2377339fef493215c98730d062d0b6fc90627f03de71a9e9e9a67cd.png', '10.png', 58523, 'image/png', 'avatar\\924108c3d2377339fef493215c98730d062d0b6fc90627f03de71a9e9e9a67cd.png', NULL, 'avatar', '2023-12-08 15:56:47');
INSERT INTO `upload_file` VALUES (186, 'db89f153d394a04977db80e7ebe822dbb12b7e29fe29dcab1a12325271de91f6.png', '11.png', 47771, 'image/png', 'avatar\\db89f153d394a04977db80e7ebe822dbb12b7e29fe29dcab1a12325271de91f6.png', NULL, 'avatar', '2023-12-08 16:02:36');
INSERT INTO `upload_file` VALUES (187, '7ebe1e219abddaded4f61357b5047f4ad6120f4ff1b6d30b23bcb8cc83a3f3fc.png', '5.png', 65530, 'image/png', 'avatar\\7ebe1e219abddaded4f61357b5047f4ad6120f4ff1b6d30b23bcb8cc83a3f3fc.png', NULL, 'avatar', '2023-12-08 16:03:14');
INSERT INTO `upload_file` VALUES (188, 'e7a8dee55d58e94aeb8dd098ad2cbcf67ff297ed10842d2926c2976c1bfe9ec9.png', '4.png', 66026, 'image/png', 'avatar\\e7a8dee55d58e94aeb8dd098ad2cbcf67ff297ed10842d2926c2976c1bfe9ec9.png', NULL, 'avatar', '2023-12-08 16:13:22');
INSERT INTO `upload_file` VALUES (189, '67b347afc06c2e1cfdc8062fd9c00b1bbbc8597497b8e2965b4468a19159b49c.png', '1.png', 57837, 'image/png', 'avatar\\67b347afc06c2e1cfdc8062fd9c00b1bbbc8597497b8e2965b4468a19159b49c.png', NULL, 'avatar', '2023-12-08 16:23:35');
INSERT INTO `upload_file` VALUES (190, 'fd8541b31880bbc9bb23f1a5243e9085f10e5f2cf10acfb99c7b371412c55748.png', '1.png', 57837, 'image/png', 'avatar\\fd8541b31880bbc9bb23f1a5243e9085f10e5f2cf10acfb99c7b371412c55748.png', NULL, 'avatar', '2023-12-08 21:35:12');
INSERT INTO `upload_file` VALUES (191, 'e982dfc982486d0d2d55842d568915723df9ea0b027cd7d72b45fc1404d06f2b.png', '13.png', 51862, 'image/png', 'avatar\\e982dfc982486d0d2d55842d568915723df9ea0b027cd7d72b45fc1404d06f2b.png', NULL, 'avatar', '2023-12-10 13:59:27');
INSERT INTO `upload_file` VALUES (192, '8b2f2bf44fef7a5a3c2af1189ff25f900fd2907eb1e035f5aac96d820c097fb4.png', '10.png', 58523, 'image/png', 'avatar\\8b2f2bf44fef7a5a3c2af1189ff25f900fd2907eb1e035f5aac96d820c097fb4.png', NULL, 'avatar', '2023-12-10 13:59:40');
INSERT INTO `upload_file` VALUES (193, '64c1c8ce32f2b4dfc8baf72cf0d95be14ea450b774915666a609ed83b3cf5de7.png', '1.png', 57837, 'image/png', 'avatar\\64c1c8ce32f2b4dfc8baf72cf0d95be14ea450b774915666a609ed83b3cf5de7.png', NULL, 'avatar', '2023-12-10 14:10:52');
INSERT INTO `upload_file` VALUES (194, 'dc56bf0f017351891b5ddba9fb1d2b898ee5b89f3597338193efa38d73c6ff17.png', '3.png', 54988, 'image/png', 'avatar\\dc56bf0f017351891b5ddba9fb1d2b898ee5b89f3597338193efa38d73c6ff17.png', NULL, 'avatar', '2023-12-12 14:19:21');

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
  `user_type` int(11) NOT NULL COMMENT '1:管理员\r\n2.主播\r\n3.用户',
  `create_at` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'sadas', 'admin', '123456', 'admin', NULL, NULL, 'sdf', NULL, 1, '2023-12-06 17:56:29');
INSERT INTO `user` VALUES (8, '9971c9bf-8bad-49da-86d3-cbd21a8ee4a1', 'fenda', '123456', 'CleverLion22', 'a@gmail.com', '2342424', NULL, NULL, 3, '2023-12-12 16:44:17');
INSERT INTO `user` VALUES (13, '6652cb4f-e6ef-4a78-b303-a85fe025f761', 'anchor1', 'anchor1', 'QuickBear42', '', NULL, NULL, NULL, 2, '2023-12-13 00:33:24');
INSERT INTO `user` VALUES (14, 'a16ca147-100c-4f1f-a5a0-4a61d42feac8', 'anchor2', 'anchor2', 'RudeTiger77', '', '', '', '', 2, '2023-12-13 00:34:24');

SET FOREIGN_KEY_CHECKS = 1;
