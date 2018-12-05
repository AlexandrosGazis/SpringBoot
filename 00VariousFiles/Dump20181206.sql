CREATE DATABASE  IF NOT EXISTS `projectdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `projectdb`;
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
-- Table structure for table `owneruser`
--

DROP TABLE IF EXISTS `owneruser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `owneruser` (
  `id` int(11) NOT NULL,
  `afm` varchar(20) DEFAULT NULL,
  `onoma` varchar(20) DEFAULT NULL,
  `epitheto` varchar(20) DEFAULT NULL,
  `dieuthinsi` varchar(20) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  `kwdikoXristi` varchar(20) DEFAULT NULL,
  `markaOximatos` varchar(20) DEFAULT NULL,
  `pinakidaOximatos` varchar(20) DEFAULT NULL,
  `tipoXristi` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owneruser`
--

LOCK TABLES `owneruser` WRITE;
/*!40000 ALTER TABLE `owneruser` DISABLE KEYS */;
INSERT INTO `owneruser` VALUES (1,'ASD-124','Alexandros','gazis','Stamata','alexandrosgazis.ee@gmail.com','qwerty','Mercedes','HMMY-2345','Administrator'),(2,'SDE-234','Katerina','Laskari','Aigalew','katerina@ee.duth.gr','qwerty1','BMW','AIEK-2345','User'),(3,'ERq-234','Giwrtos','Papadopoylos','Kesariani','giwrgaras@yahoo.gr','qwerty2','Toyota','SFE-3452','User'),(4,'BHU-678','Kwstas','Balanikas','Agio Stefano','kwstakis@ee.aueb.rb','qwerty3','Pegeuot','ERT-2345','User');
/*!40000 ALTER TABLE `owneruser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-06  0:22:21
