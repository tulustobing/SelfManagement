/*
SQLyog Community v12.2.1 (64 bit)
MySQL - 10.1.9-MariaDB : Database - self_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`self_management` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `self_management`;

/*Table structure for table `colour_level` */

DROP TABLE IF EXISTS `colour_level`;

CREATE TABLE `colour_level` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `COLOUR` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `colour_level` */

insert  into `colour_level`(`ID`,`COLOUR`) values 
(1,'green'),
(2,'yellow'),
(3,'red'),
(4,'string'),
(6,'string');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IMANGE_PATH` varchar(500) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `item` */

insert  into `item`(`ID`,`IMANGE_PATH`,`DESCRIPTION`,`image_path`) values 
(1,'IMANGE_PATH','DESCRIPTION',NULL),
(5,'IMANGE_PATH','DESCRIPTION',NULL);

/*Table structure for table `reminder` */

DROP TABLE IF EXISTS `reminder`;

CREATE TABLE `reminder` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(500) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `START_DATE` date DEFAULT NULL,
  `DUE_DATE` date DEFAULT NULL,
  `LEVEL_ID` int(11) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `reminder` */

insert  into `reminder`(`ID`,`TITLE`,`DESCRIPTION`,`START_DATE`,`DUE_DATE`,`LEVEL_ID`,`image_path`) values 
(1,'Project','Please review your project','2016-05-10','2016-05-10',1,NULL),
(2,'Projects','Please review your project','2016-05-10','2016-05-10',2,NULL),
(4,'string','string','2016-05-10','2016-05-10',6,NULL);

/*Table structure for table `to_do` */

DROP TABLE IF EXISTS `to_do`;

CREATE TABLE `to_do` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(100) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `IS_DONE` tinyint(1) DEFAULT NULL,
  `DUE_DATE` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `to_do` */

insert  into `to_do`(`ID`,`TITLE`,`DESCRIPTION`,`IS_DONE`,`DUE_DATE`) values 
(2,'string','Gstring',1,'2016-05-10'),
(3,'test','test',0,NULL),
(4,'string','string',1,'2016-04-20'),
(5,'string','string',1,'2016-04-20'),
(6,'string','string',1,'2016-04-20'),
(7,'string','string',1,'2016-04-20'),
(8,'string','string',1,'2016-04-20'),
(9,'string','string',1,'2016-04-20'),
(10,'string','string',1,'2016-04-20'),
(11,'string','string',1,'2016-04-20'),
(12,'string','string',1,'2016-04-20'),
(13,'string','string',1,'2016-04-20'),
(14,'string','string',1,'2016-04-20');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(256) DEFAULT NULL,
  `DISABLE` tinyint(1) DEFAULT NULL,
  `LOGIN_FAILURES` int(11) DEFAULT NULL,
  `LAST_LOGGED_IN` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`ID`,`NAME`,`PASSWORD`,`DISABLE`,`LOGIN_FAILURES`,`LAST_LOGGED_IN`) values 
(1,'Jaka','tarub',0,0,'2016-04-11');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
