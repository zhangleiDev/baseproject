use my;

CREATE TABLE `phone_power` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `power` varchar(100) DEFAULT NULL COMMENT '电量',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `uid` varchar(100) DEFAULT NULL COMMENT '用户标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
