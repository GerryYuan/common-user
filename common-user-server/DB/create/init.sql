CREATE TABLE `common_user` (
  `id` bigint(64) unsigned NOT NULL,
  `name` varchar(45) NOT NULL DEFAULT '',
  `phone` varchar(45) NOT NULL DEFAULT '',
  `nick_name` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL DEFAULT '',
  `gender` tinyint(2) NOT NULL DEFAULT '0' COMMENT '0：男，1：女',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '0：正常，1：删除',
  `create_time` bigint(40) NOT NULL,
  `update_time` bigint(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;