CREATE TABLE `portal`.`student` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `rollno` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `portal`.`subject` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `portal`.`score` (
  `id` INT NOT NULL,
  `student_id` INT NULL,
  `subject_id` INT NULL,
  `score` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `subject_fk_idx` (`subject_id` ASC) VISIBLE,
  INDEX `student_fk_idx` (`student_id` ASC) VISIBLE,
  CONSTRAINT `subject_fk`
    FOREIGN KEY (`subject_id`)
    REFERENCES `portal`.`subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `student_fk`
    FOREIGN KEY (`student_id`)
    REFERENCES `portal`.`student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
  
CREATE TABLE `portal`.`departments` (
  `id` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`));
  
  
-- data scripts
-- STUDENT Table
INSERT INTO `portal`.`student`(`id`,`name`,`rollno`) VALUES('1' ,'N Pratik','22CSE567');

--SUBJECT table
INSERT INTO `portal`.`subject`(`id`,`name`) VALUES('1','Programming in C');
INSERT INTO `portal`.`subject`(`id`,`name`) VALUES('2','Programming in C++');
INSERT INTO `portal`.`subject`(`id`,`name`) VALUES('3','Programming in Java');
INSERT INTO `portal`.`subject`(`id`,`name`) VALUES('4','Engineering Mathematics-1');
INSERT INTO `portal`.`subject`(`id`,`name`) VALUES('5','Professional Communication');

--SCORE table
INSERT INTO `portal`.`score` (`id`,`student_id`,`subject_id`,`score`) VALUES('1','1','1','98');
INSERT INTO `portal`.`score` (`id`,`student_id`,`subject_id`,`score`) VALUES('2','1','2','87');
INSERT INTO `portal`.`score` (`id`,`student_id`,`subject_id`,`score`) VALUES('3','1','3','97');
INSERT INTO `portal`.`score` (`id`,`student_id`,`subject_id`,`score`) VALUES('4','1','4','92');
INSERT INTO `portal`.`score` (`id`,`student_id`,`subject_id`,`score`) VALUES('5','1','5','86');