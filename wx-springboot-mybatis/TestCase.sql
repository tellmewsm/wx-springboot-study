DROP TABLE IF EXISTS `TestCase`;
CREATE TABLE `TestCase` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(25) DEFAULT NULL COMMENT '姓名',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

BEGIN;
INSERT INTO `TestCase ` VALUES ('1', 'wuxi', '他在学习springboot'), ('2', 'cz', '他在复习mysql');
COMMIT;


 @ExcelField(title = "类型")
    private String  type;

    @ExcelField(title = "地址")
    private String  url;

    @ExcelField(title = "参数")
    private String  params;

    @ExcelField(title = "头部")
    private String  header;

    @ExcelField(title = "检查点")
    private String  check;

    @ExcelField(title = "关联")
    private String  correlation;

    @ExcelField(title = "开启",order = 1,readConverter = IsRunCovert.class,writeConverter = BooleanWriteConvert.class)
    private boolean run;

    @ExcelField(title = "测试结果",order = 2)
    private String  result;