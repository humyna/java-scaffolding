SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user_info_demo`
-- ----------------------------
DROP TABLE IF EXISTS `user_info_demo`;
CREATE TABLE `user_info_demo` (
  `demo_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `gender` varchar(1) DEFAULT NULL COMMENT '性别 0 女 1 男 2 保密 ',
  `birth_day` datetime DEFAULT NULL COMMENT '出生日期',
  `commets` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`demo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
