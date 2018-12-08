-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: projectdb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `owneruser`
--

LOCK TABLES `owneruser` WRITE;
/*!40000 ALTER TABLE `owneruser` DISABLE KEYS */;
INSERT INTO `owneruser` VALUES (1,'fgfasd','asd',NULL,'/asd','/das','/addasdas','/sad','sad','Administrator'),(2,'SDE-234','Katerina','Laskari','Aigalew','katerina@ee.duth.gr','qwerty1','BMW','AIEK-2345','User'),(3,'ERq-234','Giwrtos','Papadopoylos','Kesariani','giwrgaras@yahoo.gr','qwerty2','Toyota','SFE-3452','User'),(4,'BHU-678','Kwstas','Balanikas','Agio Stefano','kwstakis@ee.aueb.rb','qwerty3','Pegeuot','ERT-2345','User'),(5,'ASE-2334','xRISTOS','GIanνακοπουλος','Περιστερη','giannakos@aol.com','qwerty5','Toytota','HMY-4467','Administrator'),(7,'ASE-2934','Akis ','Papakis','Περιστερη','akis@aol.com','qwerty2009','Renaut','HMY-4997','User'),(8,'ASE-2934','xRISTaras','Τζανακοπουλος','Κηφισια','xristaakos@aol.com','awehgd2@!4dD','Toytota','HMY-4497','User'),(9,'gdfgdgfdgdg','dg','dgdfgfd','dfgdfg','fdgdfg','dfgdfg','dfgdf','gdfgdfgf','Administrator');
/*!40000 ALTER TABLE `owneruser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `repair`
--

LOCK TABLES `repair` WRITE;
/*!40000 ALTER TABLE `repair` DISABLE KEYS */;
INSERT INTO `repair` VALUES (1,'2019-01-22','καλη','Μικρη',22.5,'Αλεξανδρος','πισω δεξια φαναρι'),(2,'2018-01-22','πολυ καλη','Μικρη',12.5,'Ιασωνας','προβλημα στα λαστιχα'),(3,'2014-01-22','μετρια','Μικρη',150.4,'Γιαννης','θελει λαδια+service η μηχανη'),(5,'2018-01-22','πολυ καλη','Μικρη',12.5,'Ιασωνας','προβλημα στα λαστιχα');
/*!40000 ALTER TABLE `repair` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-08 16:51:35
