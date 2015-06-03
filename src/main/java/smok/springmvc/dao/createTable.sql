CREATE TABLE `t_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `comment` varchar(200) DEFAULT NULL,
  `addtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8


CREATE TABLE `t_news` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `url` varchar(300) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8


CREATE TABLE `t_love_picture` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `url` varchar(100) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  `sort` tinyint(4) DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `position` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8
