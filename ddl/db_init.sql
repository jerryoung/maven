CREATE SCHEMA `oa` DEFAULT CHARACTER SET utf8mb4;

CREATE TABLE `employee`
(
    `id`   int NOT NULL AUTO_INCREMENT,
    `name` varchar(45) DEFAULT NULL,
    `age`  int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE `authorization`
(
    `id`          INT NOT NULL AUTO_INCREMENT,
    `employee_id` INT NULL,
    `role_id`     INT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `application`
(
    `id`          INT NOT NULL AUTO_INCREMENT,
    `employee_id` INT NULL,
    `days`        INT NULL,
    PRIMARY KEY (`id`)
);
