
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `client_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_ids` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_secret` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `scope` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorized_grant_types` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorities` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `access_token_validity_seconds` int(11) NULL DEFAULT NULL,
  `refresh_token_validity_seconds` int(11) NULL DEFAULT NULL,
  `additional_information` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `autoapprove` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oauth_client_details
-- ----------------------------
INSERT INTO `oauth_client_details`(`client_id`, `resource_ids`, `client_secret`, `scope`, `authorized_grant_types`, `web_server_redirect_uri`, `authorities`, `access_token_validity_seconds`, `refresh_token_validity_seconds`, `additional_information`, `autoapprove`) VALUES ('test', NULL, 'test', 'select,write', 'password,authorization_code,client_credentials,implicit,refresh_token', NULL, NULL, 7200, 72000, '后台管理系统', NULL);

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `nick_name` varchar(50) NOT NULL COMMENT '用户姓名',
  `user_name` varchar(255) DEFAULT '' COMMENT '用户编号（作为用户登录的账号）',
  `password` varchar(1024) NOT NULL DEFAULT '1' COMMENT '密码',
  `phone_num` varchar(50) NOT NULL DEFAULT '' COMMENT '手机号码',
  `birthday` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tel_phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `sex` char(1) DEFAULT 'S' COMMENT '''F''-女，''M''-男，''S''-保密',
  `is_first_login` varchar(10) NOT NULL DEFAULT '0',
  `enabled` tinyint(3) DEFAULT '1' COMMENT '是否可用,1表示可用，0表示不可用',
  `remark` varchar(1024) DEFAULT '' COMMENT '备注',
  `record_version` bigint(19) unsigned NOT NULL DEFAULT '0' COMMENT '记录版本',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `sys_ucode` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=346 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';