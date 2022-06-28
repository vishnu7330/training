CREATE TABLE `training`.`customers` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `street` VARCHAR(45) NULL,
  `zipcode` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (1, 'John Joseph', 'CA', 'San Francisco', '155 4th St', '94103');

INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (2, 'Mike Sherrard', 'CA', 'Union City', '4934  Maplewood', '90004');

INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (3, 'Joe Spears', 'CA', 'Los Angeles', '626 N Normandie', '90004');

INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (4, 'Robert Heles', 'CA', 'Sacramento', '2435 Fair Oaks Blvd', '95825');

INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (5, 'Maria Hernandez', 'IA', 'Ames', '400 South Duff Ave', '50010');

INSERT INTO `training`.`customers` (`id`, `name`, `state`, `city`, `street`, `zipcode`) VALUES (6, 'David Smith', 'IA', 'Coralville', '2451 2nd Street', '52241');


CREATE TABLE `training`.`orders` (
  `id` INT NOT NULL,
  `customer_id` INT NULL,
  `order_date` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `customer_order_idx` (`customer_id` ASC) VISIBLE,
  CONSTRAINT `customer_order`
    FOREIGN KEY (`customer_id`)
    REFERENCES `training`.`customers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);

INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10308, 2, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10365, 3, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10383, 4, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10355, 2, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10465, 5, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10879, 6, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10235, 2, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10653, 2, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10426, 2, NOW());
INSERT INTO `training`.`orders` (`id`, `customer_id`, `order_date`) VALUES (10751, 2, NOW());

***** INNER JOIN *****
SELECT Orders.id, Customers.name, Orders.order_date
FROM Orders
INNER JOIN Customers ON Orders.customer_id=Customers.id;


***** LEFT (OUTER) JOIN *****
SELECT Orders.id, Customers.name, Orders.order_date
FROM Orders
LEFT JOIN Customers ON Orders.customer_id=Customers.id;

***** RIGHT (OUTER) JOIN *****
SELECT Orders.id, Customers.name, Orders.order_date
FROM Orders
RIGHT JOIN Customers ON Orders.customer_id=Customers.id;

***** FULL (OUTER) JOIN *****
SELECT Orders.id, Customers.name, Orders.order_date
FROM Orders
LEFT JOIN Customers ON Orders.customer_id=Customers.id
UNION
SELECT Orders.id, Customers.name, Orders.order_date
FROM Orders
RIGHT JOIN Customers ON Orders.customer_id=Customers.id;

