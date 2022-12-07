CREATE TABLE `employee` (
  `PersonID` int NOT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `City` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PersonID`),
  UNIQUE KEY `PersonID_UNIQUE` (`PersonID`)
)