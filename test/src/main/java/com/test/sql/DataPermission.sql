DROP TABLE IF EXISTS `table1`;
CREATE TABLE `table1`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `table1_columnA` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table1_columnB` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table1_columnC` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `record_version` bigint(19) UNSIGNED NOT NULL DEFAULT 1 COMMENT '记录版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'tableA' ROW_FORMAT = Dynamic;
DROP TABLE IF EXISTS `table2`;
CREATE TABLE `table2`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `table2_columnA` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table2_columnB` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table2_columnC` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `record_version` bigint(19) UNSIGNED NOT NULL DEFAULT 1 COMMENT '记录版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'tableA' ROW_FORMAT = Dynamic;
DROP TABLE IF EXISTS `table3`;
CREATE TABLE `table3`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `table3_columnA` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table3_columnB` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `table3_columnC` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '',
  `record_version` bigint(19) UNSIGNED NOT NULL DEFAULT 1 COMMENT '记录版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'tableA' ROW_FORMAT = Dynamic;

INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('1', '1', '1', 1);
INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('2', '2', '2', 1);
INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('3', '3', '3', 1);
INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('4', '4', '4', 1);
INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('2', '3', '4', 1);
INSERT INTO `table1`( `table1_columnA`, `table1_columnB`, `table1_columnC`, `record_version`) VALUES ('1', '2', '3', 1);


INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('2', '2', '2', 2);
INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('2', '2', '2', 2);
INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('3', '3', '3', 2);
INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('4', '4', '4', 2);
INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('2', '3', '4', 2);
INSERT INTO `table2`( `table2_columnA`, `table2_columnB`, `table2_columnC`, `record_version`) VALUES ('2', '2', '3', 1);

INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('3', '3', '3', 3);
INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('2', '3', '3', 3);
INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('1', '3', '3', 3);
INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('4', '4', '41', 3);
INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('5', '3', '8', 3);
INSERT INTO `table3`( `table3_columnA`, `table3_columnB`, `table3_columnC`, `record_version`) VALUES ('6', '2', '3', 1);