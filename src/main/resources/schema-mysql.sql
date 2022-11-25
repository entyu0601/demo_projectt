CREATE TABLE IF NOT EXISTS `to_do` (
  `id` varchar(36) NOT NULL,
  `name` varchar(50) NOT NULL,
  `is_checked` tinyint NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
);