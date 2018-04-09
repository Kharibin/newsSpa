DROP TABLE `News`.`news_table`;

CREATE TABLE `News`.`news_table` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(100) NULL,
  `short_description` TEXT NULL,
  `content` TEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));


INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('1', 'cats', 'me and my cat', '<h1> me and my cat <h1> <br> I love my cat');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('2', 'science', 'british scientist', 'British scientist love my cat too');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('3', 'cats', 'Cats in science', 'We should not use any cats in science, use mice!');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('4', 'polytics', 'Ovalniy wants revolution!', 'ololo we need to improve everything, the only way is revolution, ololo');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('5', 'science', 'British scientists', 'British scientists dont like Ovalniy');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('6', 'science', 'British scientists', 'British scientists dont like revolution');
INSERT INTO `News`.`news_table` (`id`, `category`, `short_description`, `content`) VALUES ('7', 'polytics', 'Ovalniy and my cat', 'Ovalniy dont even know about my cat');
INSERT INTO `News`.`news_table` (`category`, `short_description`, `content`) VALUES ('cats', 'My cat and revolution', 'Looks like my cat feels good enough without any revolution');