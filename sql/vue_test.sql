/*
SQLyog Professional v12.09 (64 bit)
MySQL - 8.0.20 : Database - vue_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vue_test` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `vue_test`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `author` varchar(10) DEFAULT NULL,
  `publish` varchar(10) DEFAULT NULL,
  `pages` int DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`id`,`name`,`author`,`publish`,`pages`,`price`) values (1,'西游记','吴承恩','三联出版社',300,12.1),(2,'水浒传','施耐庵','三联出版社',300,22.5),(3,'红楼梦','曹雪芹','三联出版社',300,42.8),(4,'三国演义','罗贯中','三联出版社',300,51.4),(5,'骆驼祥子','老舍','三联出版社',300,1.8),(6,'狂人日记','鲁迅','三联出版社',300,71.1),(7,'阿衰','猫小乐','三联出版社',300,91.2),(8,'爆笑校园','朱熹','三联出版社',300,4.21),(9,'知音漫客','知音漫客','三联出版社',300,5.01),(10,'漫天下','漫天下','三联出版社',300,10.21),(11,'悲惨世界','雨果','三联出版社',300,3.8);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
