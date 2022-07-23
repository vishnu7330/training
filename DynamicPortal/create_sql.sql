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
