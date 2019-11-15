DROP TABLE IF EXISTS `wx_User`;
CREATE TABLE `wx_User` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(25) DEFAULT NULL COMMENT '姓名',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

BEGIN;
INSERT INTO `wx_User` VALUES ('1', 'wx', '他在学习springboot'), ('2', 'cz', '他在复习mysql');
COMMIT;